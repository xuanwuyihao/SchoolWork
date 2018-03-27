/**
 * Created by pc on 2016/4/29.
 */
//娴幇浜岀淮鐮佷簨浠�
function   bindhovers() {
    $(".topBarR li").hover(function () {
        $(this).find("div.wxCont").show()
    }, function () {
        $(this).find("div.wxCont").hide()
    });
    $(".wx li").hover(function () {
        $(this).children("a").addClass("current" + $(this).index());
        $(this).find("div.wxCont").show()
    }, function () {
        $(this).children("a").removeClass("current" + $(this).index());
        $(this).find("div.wxCont").hide()
    });
    $(".tencentQQ").hover(function () {
        $("#wxCont").toggle()
    });
}
//鑿滃崟涓嬫媺鍒楄〃浜嬩欢
function menuEventbind(){
    $(".menu li").hover(function () {
        $(this).addClass("sel");
        $(this).children(".subNav").css("visibility", "visible");
        $(this).children().first().children("span").addClass("arrow-up")
    }, function () {
        $(this).removeClass("sel");
        $(this).children(".subNav").css("visibility", "hidden");
        $(this).children().first().children("span").removeClass("arrow-up")
    });
}
$(function() {
    //鍘婚櫎a鏍囩鐨勭劍鐐硅櫄绾挎
    $("a").focus(function(){this.blur();});
    bindhovers();
    menuEventbind();
});
//鐧婚檰鏂规硶,瀛愮郴缁熻嚜宸卞疄鐜� login()

//鍔犺浇鐢ㄦ埛淇℃伅\

//閫€鍑虹櫥闄�