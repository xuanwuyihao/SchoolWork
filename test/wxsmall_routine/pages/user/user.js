var app = getApp()
Page({
  data: {
    userInfo: {},
    userListInfo: [{
      icon: '../../image/money.png',
      text: '钱包'
    },
    {
      icon: '../../image/orders-icon.png',
      text: '我的订单'
    },
       {
         icon: '../../image/adress-icon.png',
         text: '待收货'
       }, 
       {
         icon: '../../image/set.png',
         text: '设置'
       }
    ]
  },

  onLoad: function () {
    var that = this
    //调用应用实例的方法获取全局数据
    app.getUserInfo(function (userInfo) {
      //更新数据
      that.setData({
        userInfo: userInfo
      })
    })
  }
})