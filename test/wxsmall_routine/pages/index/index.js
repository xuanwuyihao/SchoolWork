//index.js
//获取应用实例
const app = getApp()

Page({
  data: {
    canIUse: wx.canIUse('button.open-type.getUserInfo'),
    imgUrls: [
      '../../image/0004.jpg',
      '../../image/0008.jpg',
      '../../image/0011.jpg'
    ],
    indicatorDots: true,
    autoplay: true,
    interval: 5000,
    duration: 1000,
    products: []
  },
  //事件处理函数
  bindViewTap: function() {
    wx.navigateTo({
      url: '../logs/logs'
    })
  },
  onLoad: function () {
    let self = this;// 让当// 让当前 页面赋值给另外一个变量前 页面赋值给另外一个变量
    if (app.globalData.userInfo) {
      this.setData({
        userInfo: app.globalData.userInfo,
        hasUserInfo: true
      })
    } else if (this.data.canIUse){
      // 由于 getUserInfo 是网络请求，可能会在 Page.onLoad 之后才返回
      // 所以此处加入 callback 以防止这种情况
      app.userInfoReadyCallback = res => {
       
      }
    } else {
      // 在没有 open-type=getUserInfo 版本的兼容处理
      wx.getUserInfo({
        success: res => {
          app.globalData.userInfo = res.userInfo
          
        }
      })
   
    }

    //读取商品信息
    wx.request({
      url: 'http://localhost:8080/product/all',//仅为示例，并非真实的接口地址
      method:'get',
      header:{
        'content-type':'appliction/json'//默认值
      },
      success:function(res){
          console.log(res.data)
          self.setData({// 由于在回调函数中，this并不是当前页面，所以使用之前定义的self变量
            products:res.data
          })
      }
    })
  }
  
})
