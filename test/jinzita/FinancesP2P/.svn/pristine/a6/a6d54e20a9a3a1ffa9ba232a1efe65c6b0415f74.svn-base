$(function(){

  /********************
   *  寮€鎴烽〉 reginfo
   ********************/

  // 鍒囨崲touchend/click  pc鏃剁敤click,鎵嬫満鏃剁敤touchend
  var clickTouch = ('ontouchstart' in document.documentElement) ? 'touchend' : 'click';

  //click to touch
  try{ FastClick.attach(document.body); }catch(e){}

  //璋冩暣甯愬彿鍓嶇紑鎵€鍗犵敤鐨勯暱搴�
  $( window ).resize(function() {
    resetPrefixInput();
  });
  function resetPrefixInput(){
    $(".form-text-prefix").show();
    $(".form-text-prefix").next().width($('.form-unit-full').width()-$(".form-text-prefix").width()-5)
  }
  resetPrefixInput();


  function checkPhoneByAjax(){
      var $form = $('#quickPayBindingForm');
      //鏈€鍚庣偣鎻愪氦鎸夐挳鏃�, 璺宠繃ajax鏌ヨ
      checkAllInput($form,undefined,true);
      var checkNum = $form.find(".error.active").length;

      if(checkNum===0){
        //$(form).find(".btn-primary").removeClass('btn-primary').addClass('btn-disabled');
      }else{
        return;
      }
      var sendData = $form.serialize();
      $.ajax({
        url: phoneCheckUrl,
        type:"post",
        data: sendData,
        dataType: 'json',
        success:function(re){
          if(re.result==='success'){
            if(re.desc){
              if($("#modal-3").is(':visible')===false){
                modalShow('modal-3');
              }
              refreshQR(re.desc, re.uuid,re.faceVerifyCheckValue,$form);
            }else{
              $form.removeClass('checkAjaxForm').submit();
            }
          }else if(re.result==='error'){
            if(re.code==='236'){
              window.location.href = failPage;
            }else{
              alert(re.desc);
            }
          }
        }
      });
    }

  window.checkPhoneByAjax = checkPhoneByAjax;

  // 琛ㄥ崟鎻愪氦
  $('.serverActive').addClass("active");
  $(document).on('submit','form.validate-form',function(e){
    e.preventDefault();
    formSubmit(this);
  })
  $(document).on('click','form.validate-form .form-btns .btn-primary',function(e){
      formSubmit($(this).closest("form"));
  })
  function formSubmit(form){
    if($("#isPbcMoneyLimit").val()==='Y'){
      try {
        TCA.config(config);
        if(!$("#signStr").val()){
          alert("鏁板瓧璇佷功鍔╂墜瀹夎鎴愬姛鍚庨渶閲嶅惎娴忚鍣ㄥ悗缁х画浜ゆ槗銆�");
          return;
        }
      } catch (e) {
        if (e instanceof TCACErr) {
          if (confirm('璇风偣鍑荤‘瀹氫笅杞芥暟瀛楄瘉涔﹀姪鎵嬶紝寰呬笅杞藉苟瀹夎瀹屾垚鍚庨噸鍚祻瑙堝櫒缁х画杩涜浜ゆ槗銆�')) {
            window.location.href = "http://vnetcdn-download.chinapnr.com/itrusweb/statics/download/澶╄瘹瀹変俊鏁板瓧璇佷功鍔╂墜-3.2.0.2-20160706.exe";
          }
        }
        return;
      }
    }
    if(checkingNum>0){
      alert("姝ｅ湪鏍￠獙璇风◢鍚庨噸鏂扮偣鍑荤‘瀹氭寜閽�");
      return;
    }

    //鏈€鍚庣偣鎻愪氦鎸夐挳鏃�, 璺宠繃ajax鏌ヨ
    checkAllInput(form,undefined,true);
    var checkNum = $(form).find(".error.active").length;

    if(checkNum===0){
      $(form).find(".btn-primary").removeClass('btn-primary').addClass('btn-disabled');
      var usrId = $("input[name=usrId]");
      if(usrId.length>0){
        $(form).find("input[name=loginId]").val(usrPrefix+$(form).find("input[name=usrId]").val());
      }
      form.submit();
    }else{
      //alert("澶辫触锛�"+checkNum);
    }
  }

  //鍚庡彴楠岃瘉鍑洪敊鏄剧ず
  //$(".dalayActive").addClass("active");

  //妫€鏌ユ墍鏈塮orm閲岀殑瀛楁鏄惁鍚堟硶锛岄〉闈㈠垰鎵撳紑鏃讹紝require瀛楁闇€瑕佸拷鐣�
  checkAllInput($(".validate-form"),true);

  $(document).on('focus','input.form-unit',function(e){
    var form  = $(this).closest(".form");
    var group = $(this).closest('.form-group');
    //褰搃nput寰楀埌鐒︾偣鏃讹紝鍏堝幓闄ゅ師鏈夋墦寮€鐨勬爣绛撅紝鐒跺悗鏄剧ず tip 
    $(group).find(".active").removeClass("active");
    $(group).find(".tip").addClass("active");

    //鐒︾偣鑷充竴缁勭浉褰撻」鐨勭涓€涓猧nput鏃讹紝绗簩涓殑鎻愮ず灏嗛殣钘忥紙ie6灞傜殑BUG锛�
    if($(this).attr("equal")!==undefined){
      var equal       = $(form).find("input[name="+$(this).attr("equal")+"]"); 
      var thisTip     = $(group).find(".equal");
      var equalGroup  = $(equal).closest('.form-group');
      var equalTip    = $(equalGroup).find(".active");
      var equalOkay   = $(equalGroup).find(".okay");

      if(thisTip.length === 0){
        equalTip.removeClass("active");
      }
    }
  })
  // 澶辩劍鏃舵鏌�
  $(document).on('blur','input.form-unit',function(e){
    //鍏堝叧闂墍鏈夋墦寮€鐨勬爣绛撅紝鍙栨秷鍑洪敊绾㈡
    $(this).removeClass("form-unit-error");
    $(this).closest('.form-group').find(".active").removeClass("active");

    setSingleInputAfterCheck(this)
  })
  //濡傛灉checkbox鏄繀濉�
  $(document).on('click','input[type=checkbox]',function(e){
    if ($(this).attr('required')==="required" && $(this).attr('checked')!=="checked"){
      $(this).addClass("form-unit-error");
      $(this).closest('.form-group').find(".required").addClass("active");
    }else{
      $(this).removeClass("form-unit-error");
      $(this).closest('.form-group').find(".active").removeClass("active");
    }
  })

  $(document).on('change','select',function(e){
    if ($(this).attr('required')==="required" && $(this).val()==="plasechoose"){
      $(this).addClass("form-unit-error");
      $(this).closest('.form-group').find(".required").addClass("active");
    }else{
      $(this).removeClass("form-unit-error");
      $(this).closest('.form-group').find(".active").removeClass("active");
    }
  })

  //妫€鏌ユ墍鏈変笉鏄痟idden鐨刬nput
  function checkAllInput(form,skipRequire,skipAjax){
    $(form).find("input, textarea, select").each(function () {
      if ($(this).closest('.form-group').length===0 || $(this).closest('.form-group').is(':hidden')) return;
      setSingleInputAfterCheck(this, skipRequire, skipAjax);
    })
    //$(".form-unit-error").first().focus();
    if(!skipRequire){
      goToError();
    }
  }

  window.checkAllInput = checkAllInput;

  function setSingleInputAfterCheck(input,skipRequire,skipAjax){

    if($(input).closest('.form-group').find(".active").length>0) return;

    var checkReturn = checkSingleInput(input,skipRequire,skipAjax);
    if (checkReturn==="skip") return;
    if (checkReturn!==undefined){
      markTip(checkReturn,input);
    }else{
      $(input).closest('.form-group').find(".okay").addClass("active"); 
    }
  }

  var checkingNum = 0;
  function getSingleCheckByAjax(url,data,input,inputExt){
    //url = url.substr(1);
    checkingNum++;
    $.ajax({
      url: url,
      type: 'post',
      dataType: 'json',
      data: data
    })
    .done(function(resp) {
      if(resp.error){
        var err = ["errorInfo",resp.error];
        markTip(err,input);
      }else{
        if(!$(input).is(":focus")){
          markTip("okay",input);
        }
        if(!$(inputExt).is(":focus")){
          markTip("okay",inputExt);
        }
        if(resp.isNeedPicCode){
          if(resp.isNeedPicCode==="Y"){
            if(!$(".form-group-imgCode").is(":visible")){
              $(".form-group-imgCode").find(".active").removeClass("active");
              $(".form-group-imgCode").find(".form-unit-error").removeClass("form-unit-error");
              $(".form-group-imgCode").slideDown();
            }
          }else{
            $(".form-group-imgCode").find(".active").removeClass("active");
            $(".form-group-imgCode").find(".form-unit-error").removeClass("form-unit-error");
            $(".form-group-imgCode").slideUp();
          }
        }
      }
    }).always(function(resp) {
      //alert(resp);
      $(input).closest('.form-group').find(".checking").removeClass("active");
      checkingNum--;
    })
  }

  function checkSingleInput(input,skipRequire,skipAjax){

    var re = $(input).val();
    var form = $(input).closest(".form");
    var group = $(input).closest(".form-group");

    // 鐪佷唤鍩庡競锛屾墍鍦ㄩ摱琛� 鐗规畩鎯呭喌
    if(group.find("input:hidden").length > 0){
      if(skipRequire){
        return "skip";
      }
      var temp=0;

      group.find("input").each(function(){
        if($(this).attr("required") && this.value===''){
          temp++;
        }
      })

      if(temp===0){
        group.find(".form-tips.okay").addClass('active');
      }else{
        group.find(".form-tips.required").addClass('active');
        group.find(".form-unit").addClass('form-unit-error');
      }
      return "skip";
    }

    //

    //涓嶅寘鎷换浣曟潯浠跺垯璺宠繃
    if ( $(input).attr("required")===undefined &&
         $(input).attr("match")===undefined &&
         $(input).attr("equal")===undefined &&
         $(input).attr("diff")===undefined
    ) return "skip";
    //纭蹇呭～椤�
    if($(input).attr("required")==="required" && 
      (re ==="" || ($(input).attr('type')==="checkbox" && $(input).attr('checked')!=="checked") || (input.tagName==="SELECT" && re === "plasechoose"))
    ){
      if(skipRequire){
        return "skip";
      }
      return "required";
    }

    //纭match鏉′欢
    // mobile:   1寮€澶寸殑11浣嶆暟瀛�;
    // email:    x@x.x
    // usrId:    甯愬彿闀垮害6-25浣�
    // userPw:   瀵嗙爜闀垮害6-16浣�
    // transPwd: 8-16浣嶏紝鍖呭惈鏁板瓧/瀛楁瘝/绗﹀彿鐨�2绉嶇粍鍚�
    // smsCode:  6浣嶆暟瀛�
    // captcha:  4浣嶆暟瀛楁垨瀛楁瘝
    // bankCard: 10-32浣嶆暟瀛�
    var match = $(input).attr("match");
    var name  = $(input).attr("name");

    if(match!==undefined){
      if (re==="") return "skip";
      var matchs=[];
      matchs["usrMp"]  = new RegExp(/^1[0-9]{10}$/);
      matchs["cardMp"]  = new RegExp(/^1[0-9]{10}$/);
      matchs["email"]   = new RegExp(/^([a-zA-Z0-9_\.\-]+)(@{1})([a-zA-Z0-9_\.\-]+)(\.[a-zA-Z0-9]{1,3})$/);
      matchs["usrId"]  = new RegExp(/^[0-9a-zA-Z_.@-]{6,25}$/);
      matchs["userPw"]  = new RegExp(/^.{6,16}$/);
      matchs["transPwd"]  = new RegExp(/^(?![A-Z]+$)(?![a-z]+$)(?!\d+$)(?![\W_]+$)\S{8,16}$/);
      matchs["smsCode"]  = new RegExp(/^0?\d{6}$/);
      matchs["captcha"]  = new RegExp(/^.{4}$/);
      matchs["bankCard"]  = new RegExp(/^[0-9]{10,32}$/);

      //鍒ゆ柇瀵嗙爜寮哄害
      if (match==="userPw"){
        setPwdStr(input);
      }

      if (!re.match(matchs[match]) || (match==="certId" && name==="certId" && !getIdCardInfo(re).isTrue)) { 
        return "match";
      }

      var merCustId = $("#merCustId").val();
      if(!skipAjax){
        if (match==="usrId"){
          getSingleCheckByAjax(checkLoginIdURL,{
            loginId: $("#usrPrefix").val()+re,
            merCustId: merCustId
          },input)
          return "checking";
        }else if (match==="certId"){
          var usrName = $("input[name=usrName]").val(),
              certId  = $("input[name=certId]").val()
          $("input[name=certId]").closest(".form-group").removeClass("active");
          $("input[name=usrName]").closest(".form-group").removeClass("active");
          if(usrName!=="" && certId!==""){
            getSingleCheckByAjax(checkCertIdURL,{
              usrName: usrName,
              certId: certId,
              merCustId: merCustId,
              certType: $("#certType").val()
            },$("input[name=certId]"),$("input[name=usrName]"))
            markTip("checking",$("input[name=certId]"))
            return "skip";
          }else{
            if(usrName===""){
              markTip("required",$("input[name=usrName]"))
            }
            return "skip";
          }
        }else if (match==="usrMp"){
          getSingleCheckByAjax(checkUsrMpURL,{
            usrMp: re,
            merCustId: merCustId
          },input)
          return "checking";
        }
      }
    }
    //蹇呴』鐩稿悓
    if($(input).attr("equal")!==undefined){
      //闇€瑕佷笌鍏剁浉鍚岀殑input
      var equal     = $(form).find("input[name="+$(input).attr("equal")+"]"); 

      //濡傛灉鏄瘑鐮佹鍙� pname(post name) JIRA: PTPBC-1524 
      if(equal.length===0 && $(input).attr("type")==="password"){
        equal       = $(form).find("input[pname="+$(input).attr("equal")+"]");
      }

      var reEqual   = $(equal).val();
      var thisTip   = $(input).closest('.form-group').find(".equal");
      var equalTip  = $(form).find(equal).closest('.form-group').find(".equal");
      var thisOkay  = $(input).closest('.form-group').find(".okay");
      var equalOkay = $(equal).closest('.form-group').find(".okay");

      //濡傛灉涓や釜浠绘剰涓€涓负绌猴紝鍒欏拷鐣�;
      if(reEqual!=="" && re!=="" ){
        if(re!==reEqual){
          if(thisTip.length === 0){
            equalOkay.removeClass("active");
            markTip("equal",equal);
          }else{
            thisOkay.removeClass("active");
            return "equal";
          }
        }else{
          if(thisTip.length === 0){
            equalTip.removeClass("active");
            equal.removeClass("form-unit-error");
            equalOkay.addClass("active");
          }
        }
      }else{
        if(thisTip.length === 1){
          //褰撶涓€椤逛负绌�,绗簩椤硅緭鍏ヤ换浣曢兘涓嶆墦鍕�
          return "skip";
        }
      }
    }

    //蹇呴』涓嶅悓
    if($(input).attr("diff")!==undefined){
      var diff = $(form).find("input[name="+$(input).attr("diff")+"]");
      var reDiff = $(diff).val();
      var thisTip = $(input).closest('.form-group').find(".diff");
      var diffTip = $(form).find(diff).closest('.form-group').find(".diff");
      var thisOkay = $(input).closest('.form-group').find(".okay");
      var diffOkay = $(diff).closest('.form-group').find(".okay");

      //濡傛灉涓や釜浠绘剰涓€涓负绌猴紝鍒欏拷鐣�;
      if(reDiff!=="" && re!==""){
        if(re===reDiff){
          if(thisTip.length === 0){
            diffOkay.removeClass("active");
            markTip("diff",diff);
          }else{
            thisOkay.removeClass("active");
            return "diff";
          }
        }else{
          if(thisTip.length === 0){
            $(diffTip).removeClass("active");
            $(diff).removeClass("form-unit-error");
            diffOkay.addClass("active");
          }
        }
      }
    }
  }

  //鏍囪閿欒
  function markTip(type,input){
    if($(input).closest('.form-group').find('.serverActive.active').length>0) return;
    var tip;
    if(typeof type==="object"){
      tip = type[0];
      $(input).closest('.form-group').find("."+tip+" p").text(type[1]);
    }else{
      tip = type;
    }
    if(tip!=='checking' && tip!=='okay'){
      $(input).addClass("form-unit-error");
    }else{
      $(input).removeClass("form-unit-error");
    }
    //鍏堟竻闄ゅ師鏈夌殑
    $(input).closest('.form-group').find(".form-tips").removeClass("active");
    $(input).closest('.form-group').find("."+tip).addClass("active");
  }
  function goToError(){
    //绉诲姩鑷冲嚭閿欐彁绀烘爣绛句綅缃�
    var focusInput = $(".errFocus .form-unit-error").first();
    if(focusInput.length>0 ){
      $('html,body').animate({scrollTop: $(focusInput).offset().top-50},'medium', function(){
        //$(focusInput).focus();
      });
    }
  }

  // 瀵嗙爜瀹夊叏绛夌骇
  $(document).on('keyup','.form-unit-pwdStr',function(e){
    setPwdStr(this);
  })
  function setPwdStr(input){
    var re = $(input).val();
    var w = pwdStrength(re);
    var g = $(input).closest(".form-group");
    var pwi = $(g).find(".pw-secure i");
    var pwb = $(g).find(".pw-secure b");
    pwb.css("background-color","#e4e7ea");
    if (w===0){
      $(pwi).removeClass().addClass("pw-secure-none");
      $(g).find(".pw-secure-text").text('鏃�').css("color","#666");

    }else if (w===1){
      $(pwi).removeClass().addClass("pw-secure-low");
      $(g).find(".pw-secure-text").text('浣�').css("color","#dc7018");
      $(pwb).last().css("background-color","#dc7018");
    }else if (w===2){
      $(pwi).removeClass().addClass("pw-secure-med");
      $(g).find(".pw-secure-text").text('涓�').css("color","#ff9c00");
      $(pwb).parent().find("b:gt(1)").css("background-color","#ff9c00");
    }else if (w===3){
      $(pwi).removeClass().addClass("pw-secure-high");
      $(g).find(".pw-secure-text").text('楂�').css("color","#009900");
      $(pwb).css("background-color","#009900");
    }
  }
  function pwdStrength(str){
    var characters     = 0;
    var capitalletters = 0;
    var loweletters    = 0;
    var number         = 0;
    //var special = 0;

    var upperCase = new RegExp('[A-Z]');
    var lowerCase = new RegExp('[a-z]');
    var numbers   = new RegExp('[0-9]');
    //var specialchars = new RegExp('([!,%,&,@,#,$,^,*,?,_,~])');

    if (str.match(upperCase)) { capitalletters = 1} else { capitalletters = 0; };
    if (str.match(lowerCase)) { loweletters = 1}    else { loweletters = 0; };
    if (str.match(numbers))   { number = 1}         else { number = 0; };
    //if (str.match(specialchars)) { special = 1}  else { special = 0; };

    var weight = 0;
    if (str.length>=6){
      weight = capitalletters + loweletters + number;// + special;
    }
    return weight;
  }

  //妫€楠岃韩浠借瘉
  //http://leeyee.github.io/blog/2013/07/31/javascript-idcard-validate/
  function getIdCardInfo(cardNo) {

    var info = {
        isTrue : false,
        year : null,
        month : null,
        day : null,
        isMale : false,
        isFemale : false
    };

    //璺宠繃韬唤璇侀獙璇�
    info.isTrue = true;
    return info;
    //璺宠繃韬唤璇侀獙璇�

    if (!cardNo && 15 != cardNo.length && 18 != cardNo.length) {
        info.isTrue = false;
        return info;
    }
    if (15 == cardNo.length) {
        var year = cardNo.substring(6, 8);
        var month = cardNo.substring(8, 10);
        var day = cardNo.substring(10, 12);
        var p = cardNo.substring(14, 15); //鎬у埆浣�
        var birthday = new Date(year, parseFloat(month) - 1,
                parseFloat(day));
        // 瀵逛簬鑰佽韩浠借瘉涓殑骞撮緞鍒欎笉闇€鑰冭檻鍗冨勾铏棶棰樿€屼娇鐢╣etYear()鏂规硶
        if (birthday.getYear() != parseFloat(year)
                || birthday.getMonth() != parseFloat(month) - 1
                || birthday.getDate() != parseFloat(day)) {
            info.isTrue = false;
        } else {
            info.isTrue = true;
            info.year = birthday.getFullYear();
            info.month = birthday.getMonth() + 1;
            info.day = birthday.getDate();
            if (p % 2 == 0) {
                info.isFemale = true;
                info.isMale = false;
            } else {
                info.isFemale = false;
                info.isMale = true
            }
        }
        return info;
    }
    if (18 == cardNo.length) {
        var year = cardNo.substring(6, 10);
        var month = cardNo.substring(10, 12);
        var day = cardNo.substring(12, 14);
        var p = cardNo.substring(14, 17)
        var birthday = new Date(year, parseFloat(month) - 1,
                parseFloat(day));
        // 杩欓噷鐢╣etFullYear()鑾峰彇骞翠唤锛岄伩鍏嶅崈骞磋櫕闂
        if (birthday.getFullYear() != parseFloat(year)
                || birthday.getMonth() != parseFloat(month) - 1
                || birthday.getDate() != parseFloat(day)) {
            info.isTrue = false;
            return info;
        }
        var Wi = [ 7, 9, 10, 5, 8, 4, 2, 1, 6, 3, 7, 9, 10, 5, 8, 4, 2, 1 ];// 鍔犳潈鍥犲瓙
        var Y = [ 1, 0, 10, 9, 8, 7, 6, 5, 4, 3, 2 ];// 韬唤璇侀獙璇佷綅鍊�.10浠ｈ〃X
        // 楠岃瘉鏍￠獙浣�
        var sum = 0; // 澹版槑鍔犳潈姹傚拰鍙橀噺
        var _cardNo = cardNo.split("");
        if (_cardNo[17].toLowerCase() == 'x') {
            _cardNo[17] = 10;// 灏嗘渶鍚庝綅涓簒鐨勯獙璇佺爜鏇挎崲涓�10鏂逛究鍚庣画鎿嶄綔
        }
        for ( var i = 0; i < 17; i++) {
            sum += Wi[i] * _cardNo[i];// 鍔犳潈姹傚拰
        }
        var i = sum % 11;// 寰楀埌楠岃瘉鐮佹墍浣嶇疆
        if (_cardNo[17] != Y[i]) {
            return info.isTrue = false;
        }
        info.isTrue = true;
        info.year = birthday.getFullYear();
        info.month = birthday.getMonth() + 1;
        info.day = birthday.getDate();
        if (p % 2 == 0) {
            info.isFemale = true;
            info.isMale = false;
        } else {
            info.isFemale = false;
            info.isMale = true
        }
        return info;
    }
    return info;
  }

  //鎵嬫満鐭俊楠岃瘉
  var sendInt;
  var sendedSms = false;
  $(document).on('click', "#sms-submit-btn.btn-secondary" ,function(){
    var self = $(this);
    var form = $(this).closest("form");
    var inputUsrMp   = $("input[name=usrMp]");
    var inputCardMp  = $("input[name=cardMp]");
    var inputCaptcha = $("input[name=captcha]");
    var inputBankId  = $("input[name=bankId]");
    var inputCardId  = $("input[name=cardId]");

    var inputUsrMpGroup   = $(inputUsrMp).closest('.form-group');
    var inputCardMpGroup  = $(inputCardMp).closest('.form-group');
    var inputCaptchaGroup = $(inputCaptcha).closest('.form-group');
    var inputBankIdGroup  = $(inputBankId).closest('.form-group');
    var inputCardIdGroup  = $(inputCardId).closest('.form-group');

    //
    if(self.data('url').indexOf("ajax/cardSigning") > 0){
      setSingleInputAfterCheck(inputBankId);
      setSingleInputAfterCheck(inputCardId);
    }

    // 鏌ョ湅鎵嬫満鍙锋槸鍚﹀悎娉�
    setSingleInputAfterCheck(inputUsrMp);
    setSingleInputAfterCheck(inputCardMp);
    if(inputCaptcha.is(":visible")) setSingleInputAfterCheck(inputCaptcha);

    if(inputUsrMpGroup.find(".error.active:visible").length   ===0 &&
       inputCardMpGroup.find(".error.active:visible").length  ===0 &&
       inputCaptchaGroup.find(".error.active:visible").length ===0 &&
       inputBankIdGroup.find(".error.active:visible").length  ===0 &&
       inputCardIdGroup.find(".error.active:visible").length  ===0 ){

      self.addClass("btn-disabled").removeClass("btn-secondary");

      try{
        var checkUsrMpURL = window.checkUsrMpURL;
      }catch(e){
        var checkUsrMpURL = undefined;
      }

      if(self.data('url').indexOf("ajax/sendQPSmsCode") > 0 || self.data('parameter')){
        checkSmsCode(self.data('url'), self.data('parameter'));
      }else{
        if(checkUsrMpURL){
          if (inputCaptcha.is(":visible") && sendedSms){
            sendedSms = false;
            var err = ["errorInfo","鍥剧墖宸茶繃鏈燂紝璇烽噸鏂拌緭鍏�"];
            markTip(err,inputCaptcha);
            resetImgCode();
            self.removeClass("btn-disabled").addClass("btn-secondary");
            return;
          }
          $.ajax({
            url: checkUsrMpURL,
            type: 'post',
            dataType: 'json',
            data: {
              'usrMp'    : inputUsrMp.val(),
              'merCustId': $("#merCustId").val()
            }
          })
          .done(function(re) {
            if(re.error){
              var err = ["errorInfo",re.error];
              markTip(err,inputUsrMp);
            }else{
              if(re.isNeedPicCode==="Y"){
                if(!$(".form-group-imgCode").is(":visible")){
                  $(".form-group-imgCode").find(".active").removeClass("active");
                  $(".form-group-imgCode").find(".form-unit-error").removeClass("form-unit-error");
                  $(".form-group-imgCode").slideDown();
                  self.removeClass("btn-disabled").addClass("btn-secondary");
                }else{
                  checkSmsCode();
                }
              }else{
                $(".form-group-imgCode").find(".active").removeClass("active");
                $(".form-group-imgCode").find(".form-unit-error").removeClass("form-unit-error");
                $(".form-group-imgCode").slideUp();
                checkSmsCode();
              }
            }
          })
        }
        if(inputCardMp.length===1){
          checkSmsCode(self.data('url'));
        }
      }
    }
  });

  var codeImgCount = [];
  var sendInt = [];
  //var imgSessionId;
  function checkSmsCode(url, parameter){
    var btn = $('#sms-submit-btn');
    if(parameter){
      var dataArr = parameter;
    }else{
      if(url && url.indexOf("ajax/sendQPSmsCode") > 0){
        var dataArr = btn.closest('form').serialize();
      }else{
        var usrMpData;
        if($("input[name=usrMp]").attr('type')==='hidden'){
          usrMpData = $("input[name=cardMp]").val() || $("input[name=divUsrMp]").val();
        }else{
          usrMpData = $("input[name=usrMp]").val() || $("input[name=cardMp]").val() || $("input[name=divUsrMp]").val();
        }
        var dataArr = {
          'usrMp' : usrMpData,
          'divUsrMp':$("input[name=divUsrMp]").val(),
          'encrptMP':$("input[name=encryptUsrMp]").val()
        }
      }
    }

    if($("input[name=captcha]").length === 1){
      dataArr['imageUniqueId'] = $("input[name=imageUniqueId]").val();
      dataArr['verifyCode'] = $("input[name=captcha]").val();
    }
    if(url && url.indexOf("ajax/cardSigning") > 0){
      dataArr['bankId'] = $("input[name=bankId]").val();
      dataArr['cardId'] = $("input[name=cardId]").val();
      dataArr['custId'] = $("input[name=usrCustId]").val();
      dataArr['merCustId'] = $("input[name=merCustId]").val();
    }

    $.ajax({
      url: btn.data('url'),
      type: 'post',
      dataType: 'json',
      data: dataArr
    })
    .done(function(re) {
      if (re.result==="success"){
        //resetModal();
        //modalHide('modal-1');
        btn.addClass("btn-disabled").removeClass("btn-secondary");
        alert("鐭俊楠岃瘉鐮佸凡鍙戦€佽嚦鎮ㄧ殑鎵嬫満锛岃娉ㄦ剰鏌ユ敹锛�");
        btnColddown(btn);
        sendedSms = true;
        if( re.insertDate ){
          $("#insertDate").val(re.insertDate);
        }
        if( re.pnrpayTraceNo ){
          $("#pnrpayTraceNo").val(re.pnrpayTraceNo);
        }
        if( re.orderId ){
          $("#orderId").val(re.orderId);
        }
        if( re.smsSender ){
          $("#smsSender").val(re.smsSender);
        }
        if( re.smsMd5Str ){
          $("#smsMd5Str").val(re.smsMd5Str);
        }
      }else if (re.result==="smsVerifyCodeError"){
        var err = ["errorInfo", re.desc];
        markTip(err,$("input[name=captcha]"));
        resetImgCode();
        btn.removeClass('btn-disabled').addClass('btn-secondary');
      }else{
        if(re.result==="needVerifyCode"){
          $(".form-group-imgCode").find(".active").removeClass("active");
          $(".form-group-imgCode").find(".form-unit-error").removeClass("form-unit-error");
          $(".form-group-imgCode").slideDown();
          //imgSessionId = re.sessionId;
          //$("#imageUniqueId").val(re.sessionId);
          //resetModal();
          //modalShow('modal-1');
          resetImgCode();
        }else{
          alert(re.desc);
          resetImgCode();
        }
        btn.removeClass('btn-disabled').addClass('btn-secondary');
      }
      $("#modal-1").find(".btn-disabled").removeClass('btn-disabled').addClass('btn-primary');
    })
  }

  function btnColddown(btn){
    var action = btn.closest("form").attr('action');
    codeImgCount[action] = 60;
    btn.find("span").text("閲嶆柊鍙戦€�("+codeImgCount[action]+")");
    sendInt[action] = setInterval(function(){
      codeImgCount[action]--;
      btn.find("span").text('閲嶆柊鍙戦€�('+codeImgCount[action]+')');
      if(codeImgCount[action]<=0){
        btn.removeClass('btn-disabled').addClass('btn-secondary');
        btn.find("span").text('鍙戦€侀獙璇佺爜');
        clearInterval(sendInt[action]);
      }
    },1000);
  }

  function resetModal(){
    var input = $("input[name=captcha]");
    input.val('').removeClass("form-unit-error");
    input.closest('.form-group').find(".active").removeClass("active");
    input.closest('.form-group').find('img').hide();
  }

  $(document).on('click', ".btn-captcha" ,function(){
    sendedSms = false;
    resetImgCode();
  })

  /***** 鍙湁cashConfirm3.ftl 鏂囦欢鍦ㄧ敤锛� 寮瑰嚭妗嗙煭淇″凡涓嶇敤
  $(document).on('submit','.modal form',function(e){
    e.preventDefault();
    smsImgCodeSubmit(this);
  })
  $(document).on('click','.modal form .btn-primary',function(e){
    smsImgCodeSubmit($(this).closest("form"));
  })
  function smsImgCodeSubmit(form){
    if(checkingNum>0){
      alert("姝ｅ湪鏍￠獙璇风◢鍚庨噸鏂扮偣鍑荤‘瀹氭寜閽�");
      return;
    }

     //鏈€鍚庣偣鎻愪氦鎸夐挳鏃�, 璺宠繃ajax鏌ヨ
    checkAllInput(form,undefined,true);
    var checkNum = $(form).find(".error.active").length;

    if(checkNum>0){
      goToError();
      return;
    }
    if(checkNum===0){
      $(form).find(".btn-primary").removeClass('btn-primary').addClass('btn-disabled');
      checkSmsCode(true);
    }else{
      //alert("澶辫触锛�"+checkNum);
    }
  }
  *****/

  // 椤佃剼璇存槑
  $(document).on(clickTouch,'.secure-tips',function(e){
    var con = $(this).find(".content");
    con.toggle();
    $(this).find("i").css('-webkit-transform','scaleY('+(con.is(":visible")?'-1':'1')+')')
    $('html,body').animate({scrollTop: $(this).offset().top+150},'medium', function(){
        //$(focusInput).focus();
    });
  })


  /********************
   *  鍏呭€奸〉 chargeChannel
   ********************/

  setCharge(0);

  function setCharge(type){
    $(".recharge-type").removeClass("recharge-type-on");
    $(".recharge-type").eq(type).addClass("recharge-type-on");

    $(".recharge-type-div:visible").css("height","0");//.hide();
    $(".recharge-type-div").eq(type).css("height","auto");//.show();
  }

  $(document).on('click','.recharge-type',function(e){
    var idx = $(this).index();
    setCharge(idx);
  })

  $(document).on('click','.recharge-type-div .bank-list a',function(e){
    $(this).closest('.recharge-type-div').find(".on").removeClass('on');
    $(this).addClass("on");
  })

  /********************
   *  缁戝崱椤� quickPayConfirm
   ********************/

  //杩斿洖鏃跺～鍦板尯
  console.log($(".tips-list-prov a").length);
  if ($('input[name=provId]').val() && $(".tips-list-prov a").length>=1){
    $(".tips-list-prov a").each(function(){
      if($('input[name=provId]').val()===$(this).attr("rel")){
        $(this).addClass('on');
        $(".form-group-prov-city .form-unit-info span").text('');
        $(".form-group-prov-city .form-unit-info b").text($(this).find("span").text());
      }
    });
    $.ajax({
      url: queryAreaByProvUrl,
      type: 'post',
      dataType: 'json',
      data: {
        provId:$('input[name=provId]').val()
      }
    })
    .done(function(resp) {
      var re="";
      for (var i in resp){
        re += '<a href="javascript:void(0)" rel="'+resp[i].areaId+'"';
        if(resp[i].areaId===$('input[name=areaId]').val()){
          re += ' class="on"';
          if(resp.length===1) return;
          $(".form-group-prov-city .form-unit-info b").text($(".tips-list-prov .on").text()+ " " +resp[i].areaName);
        }
        re += '><span>'+resp[i].areaName+'</span></a>';
      }
      $(".tips-list-city").html(re);
    })
  }
  //杩斿洖鏃跺～閾惰
  if ($('.showBankId').val()){
    $(".tips-list-bank a").each(function(){
      if($('input[name=bankId]').val()===$(this).attr("rel")){
        $(this).addClass('on');
        var formGroup = $('input[name=bankId]').closest('.form-group');
        $(formGroup).find(".form-unit-info span").text('');
        $(formGroup).find(".form-unit-info b").text($(this).find("span").text()).addClass('form-unit-icon').css('background-image','url('+staticsRoot+'/common/images/bank/sml/'+$(this).attr('rel')+'.png)');
        $(formGroup).find(".okay").addClass('active');
      }
    })
    if($(".tips-list-bank a").length>0){
      showBankInfo($(".tips-list-bank .on"));
    }
    $("#link-check").text("鏌ョ湅闄愰");
  }

  if ($('.showGateBankId').val()){
    showBankInfo();
  }
  function showBankInfo(bank){
    var lvl = bank ? $(bank).data('elementlvl') : $("input[name=elementLevel]").val();
    var needsign = bank ? $(bank).data('needsign') : $("input[name=needSign]").val();

    var formGroup = $('input[name=bankId]').closest('.form-group');
    $(formGroup).find(".form-unit-info b").addClass('form-unit-icon').css('background-image','url('+staticsRoot+'/common/images/bank/sml/'+$('input[name=bankId]').val()+'.png)');

    //閾惰棰勭暀鎵嬫満
    checkBankPhone(lvl);

    //鏃犲崱鏀粯涓氬姟
    if(needsign===true || needsign==='true'){
      $("#link-needSign").show();
    }
  }

  //閾惰鍗℃樉绀烘斁澶�
  $(document).on('focus','input[name=cardId]',function(e){
      checkCardId(this,'focus');
  })
  $(document).on('blur','input[name=cardId]',function(e){
    checkCardId(this,'blur');
  })
  $(document).on('keyup','input[name=cardId]',function(e){
    checkCardId(this,'keyup');
  })

  if($('input[name=cardId]').length>=1){
    checkCardId($('input[name=cardId]'),'blur');
  }

  function checkCardId(input, action){
    var $t = $(input).parent().find('.tips-card-zoom');
    var v = $(input).val();
    //鏀惧ぇ鏄剧ず
    v!=="" ? $t.show() : $t.hide();
    $t.text(v.replace(/(\d{4})(?=\d)/g,"$1 "));

    try{
        var trytry = checkCardBankUrl;
    }catch(e){
        checkCardBankUrl = false;
    }

    if(checkCardBankUrl){
      if(v.length<10){
        $('.form-group-card').slideUp('fast');
      }else{
        if( action==='blur' ||  (action==='keyup' && $(input).data('value') !== v.substring(0,10)) ){
          $.ajax({
            url: checkCardBankUrl,
            type: 'post',
            dataType: 'json',
            data: {
              cardId: v,
              merCustId:$("input[name=merCustId]").val(),
              gateBusiId:$("input[name=gateBusiId]").val()
            },
            success:function(re){
              if(re.error){
                var err = ["errorInfo",re.error];
                markTip(err,input);
              }else{
                $('.form-group-card').slideDown('fast');
                if(re.bankId){
                  $('.form-group-card input[name=bankId]').val(re.bankId);
                  $('.form-group-card .form-unit-info b').text(re.bankName).addClass('form-unit-icon').css('background-image','url('+staticsRoot+'/common/images/bank/sml/'+re.bankId+'.png)');
                }
              }
            }
          })
        }
        //璁板綍杈撳叆鍗″彿鐨勫墠鍗佷綅, 閬垮厤棰戠箒寮傛璇诲彇
        $(input).data('value', v.substring(0,10));
      }
    }
  }

  $(document).on('click','.tip-card-city',function(e){
    e.stopPropagation();
  })
  var openSelect = null;
  $(document).on('click','.form-unit-action',function(e){
    e.stopPropagation();

    if(openSelect !== null && ( $(openSelect)[0] === $(this).closest('.form-group').find('.form-tips.tip')[0])){
      closeSelect();
    }else{
      closeSelect();
      $(this).addClass('form-unit-active');
      openSelect = $(this).closest('.form-group').find('.form-tips.tip').addClass("active");
    }

    var tw;
    if($(window).width()<=963){
      tw = $(this).outerWidth();
    }else{
      tw = 540;
    }

    $(openSelect).find(".form-tips-content").outerWidth(tw);
  })

  //鐪佷唤/鍩庡競/閾惰 鍒楄〃鍏敤鎿嶄綔
  $(document).on('click','.tips-list-bank a, .tips-list-prov a, .tips-list-city a',function(e){
    e.stopPropagation();
    $(this).addClass('on').siblings().removeClass('on');
  })

  //閾惰鍒楄〃閫夋嫨
  $(document).on('click','.tips-list-bank a',function(e){
    var root = $(this).closest('.tips-content-long');
    root.closest('.form-group').find(".form-unit span").text('');
    root.closest('.form-group').find(".form-unit b").text($(this).text()).addClass('form-unit-icon').css('background-image','url('+staticsRoot+'/common/images/bank/sml/'+$(this).attr('rel')+'.png)');

    $("input[name=bankId]").val($(this).attr('rel'));
    $("#link-needSign").hide();
    if($(this).data('needsign')===true){
      $("#link-needSign").show();
    }
    checkBankPhone($(this).data('elementlvl'));
    $("#link-check").text("鏌ョ湅闄愰");
    /*$(this).closest(".form-group").addClass("link-check-top");*/
    closeSelect();
  })

  function checkBankPhone(elvl){
    if(!$("#elementLevel").val() || parseInt($("#elementLevel").val()) !== parseInt(elvl)){
      $("#elementLevel").val(elvl)
    }

    if(parseInt(elvl)===4){
      $(".form-group-cardMp, .form-group-smsCode").show();
      $(".form-group-cardMp input[name=cardMp], .form-group-smsCode input[name=smsCode]").attr("required","required")
      .closest(".form-group").find(".active").not('.serverActive').removeClass("active");
    }else{
      removeBankPhone();
    }
  }
  function removeBankPhone(){
    $(".form-group-cardMp, .form-group-smsCode").hide();
    $(".form-group-cardMp input[name=cardMp], .form-group-smsCode input[name=smsCode]").removeAttr("required").val("")
        .closest(".form-group").find(".active").not('.serverActive').removeClass("active");
  }

  //鐪佷唤鍒楄〃閫夋嫨
  $(document).on('click','.tips-list-prov a',function(e){
    var root = $(this).closest('.tips-content-long');
    var provId = $(this).attr('rel');
    var self = $(this);
    //娓呯┖鍩庡競鍒楄〃
    $(".tips-list-city").html('');
    //澶勭悊閫夋嫨缁撴灉
    $("input[name=provId]").val(provId);
    $("input[name=areaId]").val('');
    $.ajax({
      url: queryAreaByProvUrl,
      type: 'post',
      dataType: 'json',
      data: {
        provId:provId
      }
    })
    .done(function(resp) {
      var re="";
      for (var i in resp){
        re += '<a href="javascript:;" rel="'+resp[i].areaId+'"><span>'+resp[i].areaName+'</span></a>';
      }
      //鏄剧ず閫夋嫨缁撴灉
      root.closest('.form-group').find(".form-unit span").text("");
      root.closest('.form-group').find(".form-unit b").text($(self).text());
      if(i==='0'){
        $("input[name=areaId]").val(resp[i].areaId);
        closeSelect();
      }else{
        $(".tips-list-city").html(re);
        //鐪佷唤鍒楄〃闅愯棌, 鍩庡競鍒楄〃鏄剧ず
        $(self).parent().hide();
        $(self).parent().next().show();
        //鍒囨崲鐪佷唤/鍩庡競 鏍囩椤�
        root.find(".tips-prov-city .on").removeClass("on");
        root.find(".tips-prov-city a:last-child").addClass("on");
      }
    })
  })

  //鍩庡競鍒楄〃閫夋嫨
  $(document).on('click','.tips-list-city a',function(e){
    var root = $(this).closest('.tips-content-long');
    var provTxt = root.find('.tips-list-prov .on').text();
    root.closest('.form-group').find(".form-unit b").text(provTxt+" "+$(this).text());
    $("input[name=areaId]").val($(this).attr('rel'));
    closeSelect();
  })

  //鐪佷唤/鍩庡競 鍒囨崲鏍囩鍔ㄤ綔
  $(document).on('click','.tips-prov-city a',function(e){
    e.stopPropagation();
    var idx = $(this).index();
    var root = $(this).closest('.tips-content-long');
    //濡傛灉鍩庡競鍒楄〃涓虹┖, 鏃犳硶鐐瑰嚮鍩庡競鏍囩杩涘幓鍒囨崲
    if( idx===0 || root.find(".tips-list").eq(1).html()!=="" ){
      $(this).addClass('on').siblings().removeClass('on');

      root.find(".tips-list").hide();
      root.find(".tips-list").eq(idx).show();
    }
  })

  /** 鍏抽棴宸插紑鍚殑娴眰 **/
  $(document).on('click','html',function(e){
    closeSelect();
  })
  function closeSelect(){
    if(openSelect !== null) {
      var sRoot = $(openSelect).closest('.form-group');
      $(sRoot).find(".form-tips").removeClass('active');
      $(sRoot).find(".form-unit").removeClass('form-unit-active').removeClass('form-unit-error');
      var temp=0;
      $(sRoot).find("input:hidden").each(function(){
        if($(this).attr("required") && this.value===''){
          temp++;
        }
      })
      if(temp===0){
        $(sRoot).find(".form-tips.okay").addClass('active');
      }else{
        $(sRoot).find(".form-tips.required").addClass('active');
        $(sRoot).find(".form-unit").addClass('form-unit-error');
      }

      openSelect = null;
    }
  }

  var paramDataType      = 'jsonp',
      paramJsonp         = 'callback',
      paramJsonpCallback = 'success_jsonpCallback';
      paramJsonpLink     = 'Json'
  try{
    console.log(rootServer);
  }catch(e){
    rootServer          = '';
    paramDataType       = 'json';
    paramJsonp          = '';
    paramJsonpCallback  = '';
    paramJsonpLink      = '';
  }

  $('.limit-pop-link').each(function(){
    var $self = $(this);
    $.ajax({
      url: rootServer+'/muser/ajax/queryUsrAvailablelimitAmt'+paramJsonpLink,//'http://192.168.25.142/muser/ajax/queryUsrAvailablelimitAmt',//,
      type:"post",
      data: {
        'UsrCustId': $('#UsrCustId').val() || $('#usrCustId').val() || $('#custId').val(),
        'MerCustId': $('#MerCustId').val() || $('#merCustId').val()
      },
      dataType: paramDataType,
      jsonp:paramJsonp,
      jsonpCallback:paramJsonpCallback,
      success:function(re){
        if(parseInt(re.totalAvailableAmt) >= 0 && parseInt(re.totalLimitAmt) >= 0){
          var tmp='\
            <style>\
              .limit-pop-link{position:relative;cursor:default;display:inline-block;padding:8px;padding-left:20px;margin-left:20px;background-position:0 3px;background-repeat:no-repeat;background-position:0 9px;background-image:url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAwAAAAMCAMAAABhq6zVAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoV2luZG93cykiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6MEI2NDc4QzhCMTY1MTFFNjkzMzM4RTRBQzhCNDYxMUEiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6MEI2NDc4QzlCMTY1MTFFNjkzMzM4RTRBQzhCNDYxMUEiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDowQjY0NzhDNkIxNjUxMUU2OTMzMzhFNEFDOEI0NjExQSIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDowQjY0NzhDN0IxNjUxMUU2OTMzMzhFNEFDOEI0NjExQSIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/PtmDS00AAAAGUExURf///4zN9Q5ungoAAAAcSURBVHjaYmBEAgyYHAYGXBwilRHJweYCgAADAChfAIO7JLp8AAAAAElFTkSuQmCC")}\
              .limit-pop-frame{background-color: #f3f8ff; border:1px solid #7ac;position: absolute; width: 450px; padding: 20px 30px; z-index:200; top:32px; display:none}\
              .limit-pop-frame h3{font-size: 16px; line-height: 16px;color: #000;margin-bottom: 7px}\
              .limit-pop-frame p{margin:auto;font-size: 14px!important;color: #666!important; margin-bottom:10px;}\
              .limit-pop-link .limit-pop-frame p b{color: #000;font-size: 24px; vertical-align: initial;}\
              .limit-pop-link .limit-pop-frame p span{color: #000;}\
              .limit-pop-link .limit-pop-frame p i{color: #c00;font-style: normal;}\
              .limit-pop-list {max-height: 130px;overflow: auto; margin-top: 5px;}\
              .limit-pop-list span{width: 215px; float: left; line-height: 25px; color: #000;}\
              .limit-pop-bottom{padding-top: 25px; border-top: 1px dashed #ccc;margin-top: 20px;}\
              .limit-pop-arrow{background-image: url("data:image/png;base64,iVBORw0KGgoAAAANSUhEUgAAAAkAAAAGCAYAAAARx7TFAAAAGXRFWHRTb2Z0d2FyZQBBZG9iZSBJbWFnZVJlYWR5ccllPAAAAyJpVFh0WE1MOmNvbS5hZG9iZS54bXAAAAAAADw/eHBhY2tldCBiZWdpbj0i77u/IiBpZD0iVzVNME1wQ2VoaUh6cmVTek5UY3prYzlkIj8+IDx4OnhtcG1ldGEgeG1sbnM6eD0iYWRvYmU6bnM6bWV0YS8iIHg6eG1wdGs9IkFkb2JlIFhNUCBDb3JlIDUuMy1jMDExIDY2LjE0NTY2MSwgMjAxMi8wMi8wNi0xNDo1NjoyNyAgICAgICAgIj4gPHJkZjpSREYgeG1sbnM6cmRmPSJodHRwOi8vd3d3LnczLm9yZy8xOTk5LzAyLzIyLXJkZi1zeW50YXgtbnMjIj4gPHJkZjpEZXNjcmlwdGlvbiByZGY6YWJvdXQ9IiIgeG1sbnM6eG1wPSJodHRwOi8vbnMuYWRvYmUuY29tL3hhcC8xLjAvIiB4bWxuczp4bXBNTT0iaHR0cDovL25zLmFkb2JlLmNvbS94YXAvMS4wL21tLyIgeG1sbnM6c3RSZWY9Imh0dHA6Ly9ucy5hZG9iZS5jb20veGFwLzEuMC9zVHlwZS9SZXNvdXJjZVJlZiMiIHhtcDpDcmVhdG9yVG9vbD0iQWRvYmUgUGhvdG9zaG9wIENTNiAoV2luZG93cykiIHhtcE1NOkluc3RhbmNlSUQ9InhtcC5paWQ6NjkwMDQ5QUNCMjFFMTFFNjhFNkZENkM2QTlCODgwNzQiIHhtcE1NOkRvY3VtZW50SUQ9InhtcC5kaWQ6NjkwMDQ5QURCMjFFMTFFNjhFNkZENkM2QTlCODgwNzQiPiA8eG1wTU06RGVyaXZlZEZyb20gc3RSZWY6aW5zdGFuY2VJRD0ieG1wLmlpZDo2OTAwNDlBQUIyMUUxMUU2OEU2RkQ2QzZBOUI4ODA3NCIgc3RSZWY6ZG9jdW1lbnRJRD0ieG1wLmRpZDo2OTAwNDlBQkIyMUUxMUU2OEU2RkQ2QzZBOUI4ODA3NCIvPiA8L3JkZjpEZXNjcmlwdGlvbj4gPC9yZGY6UkRGPiA8L3g6eG1wbWV0YT4gPD94cGFja2V0IGVuZD0iciI/Pu2hy2sAAABaSURBVHjaYvj//z8DMq5bfPI/uhgTAxKoX3Lqv4GyGJhGFmdCV+BqpMCAoRBmxbpj9/9//vEfjkF8mNXM/1W84CYgA2VJAYZvP38zrDh4q4EFmwIYgIkDBBgAFNtRhstiUf4AAAAASUVORK5CYII=");width: 9px; height: 6px; display: inline-block; position: absolute;top:-6px;left:16px;z-index: 2;}\
            </style>\
            <span>棰濆害璇存槑</span>\
            <div class="limit-pop-frame">\
              <div class="limit-pop-arrow"></div>\
              <h3>棰濆害璇存槑锛�</h3>\
              <p>骞村墿浣欓搴︼紙鍏冿級: <b></b></p>\
              <p>棰濆害锛�<span></span>鍏�/骞达紝閾惰鍗′粯娆炬柟寮忎笉鍙楄棰濆害闄愬埗</span></p>\
              <div class="limit-pop-bottom">\
                <h3>鎮ㄥ湪浠ヤ笅 <span></span> 涓钩鍙板紑閫氫簡姹囦粯鏈嶅姟</h3>\
                <p>鏍规嵁鐩稿叧瑙勫畾锛屾偍鍦ㄦ眹浠樻暟鎹紑璁剧殑璐︽埛椤逛笅鎵€鏈変笓鎴�<i>鍏变韩涓€涓搴�</i></p>\
                <div class="limit-pop-list">\
                </div>\
              </div>\
            </div>\
          ';
          $self.html(tmp);
          $('.limit-pop-link .limit-pop-frame p b').text(re.totalAvailableAmt);
          $('.limit-pop-link .limit-pop-frame p span').text(re.totalLimitAmt);
          var tmp='';
          for(var i in re.custMerStNmList){
            tmp+='<span>'+re.custMerStNmList[i]+'</span>'
          }
          $('.limit-pop-list').html(tmp);
          $('.limit-pop-bottom h3 span').text(re.custMerStNmList.length);
        }
      }
    })
  })
  $('.limit-pop-link').mouseenter(function(){
    $(this).find('.limit-pop-frame').show();
  })
  $('.limit-pop-link').mouseleave(function(){
    $(this).find('.limit-pop-frame').hide();
  })

  //閫夋嫨鏀粯鏂瑰紡
  $(document).on('click','.pay-type-btns > a',function(e){
    var $nextdd = $(this).closest('dd').next();
    $nextdd.find('.form-unit-error').removeClass('form-unit-error');
    $nextdd.find('.form-group .active').removeClass('active');
    if($(this).index()===1){
      $nextdd.hide();
      $(".form-content .form-btns").css('padding-left',0)
    }else if($(this).index()===0){
      $nextdd.show();
      $(".form-content .form-btns").css('padding-left','140px')
    }
    $(this).closest('form').attr('action',$(this).data('action'));
  })

  if($('.recharge-type').length===3){
    $('.recharge-type').css('width','228px');
  }
  $('.recharge-type').css('visibility','visible');
})

/********************
 *  寮瑰嚭妗�
 ********************/
var isIE6 = !!window.ActiveXObject && !window.XMLHttpRequest;
function modalShow(modal) {
  if ($('#' + modal + ':visible')[0]) return;
  if (!$('.modal-backdrop')[0] && $('#' + modal)[0]) {
      $('body').append("<div class='modal-backdrop'></div>");
      modalLayout();
  }
  $('#' + modal).show();
  try {
      afterModalShow($('#' + modal));
  } catch (e) {
  }
  modalCenter(modal);
}

$(document).on('click', '.modal .btn-close', function () {
    modalHide($(this).closest('.modal'))
});

function modalHide(modal) {
    $('.modal').hide();
    $('.modal-backdrop').remove();
    try { afterModalHide(modal); } catch (e) { }
}

//閬僵婊″睆
function modalLayout() {
  var bodyheight = window.innerHeight ? window.innerHeight:$(window).height();
  $('.modal-backdrop').css({
      'width': $('body').width(),
      'height': bodyheight
  });
}

//绐椾綋灞呬腑

function modalCenter() {
  $('.modal:visible').each(function () {
    if ($(this).data("height") === undefined) {
      $(this).data("height", $(this).height());
      $(this).data("dbHeight", $(this).find('.modal-bd').height());
    }
    var h = $(this).data("height");
    var dbh = $(this).data("dbHeight");
    var maxh = $(window).height() - 50;
    var db = $(this).find('.modal-bd');

    if (h > maxh) {
      $(db).css('height', maxh - (h - dbh));
    } else {
      $(db).css('height', "auto");
    }

    var t = isIE6 ? ($(window).height() / 2) + $(window).scrollTop() + "px" : ($(window).height() / 2) + "px";
    //$(this).css({'top': t, 'margin-top': -$(this).height() / 2});
    $(this).css({'top': '5%'});
  });

}

//鏀瑰彉绐椾綋閲嶆柊璋冩暣浣嶇疆
window.onresize = function () {
  modalLayout();
  modalCenter();
}

window.onscroll = function () {
  modalLayout();
  modalCenter();
}

document.onkeyup = function (event) {
  var evt = window.event || event;
  var code = evt.keyCode ? evt.keyCode : evt.which;
  if (code == 27) {
      modalHide();
  }
}

function queryPayQuota(){
  $.ajax({
    url: payQuotaUrl,
    type: 'post',
    dataType: 'json',
    data: {
      bankId: $("input[name=bankId]").val(),
      merCustId:$("input[name=merCustId]").val(),
      gateBusiId: "QP"
    }
  })
  .done(function(resp) {
    if(resp){
      if(resp.error!=="notsupport"){
        $('#singleTransQuota').html(resp.singleTransQuota);
        $('#cardDailyTransQuota').html(resp.cardDailyTransQuota);
        $('#usrDailyTransQuota').html(resp.usrDailyTransQuota);
        modalShow('modal-1');
      }
    }else{
      alert('璇烽€夋嫨鎵€灞為摱琛�')
    }
  })
  $('#singleTransQuota').html("&nbsp;");
  $('#cardDailyTransQuota').html("&nbsp;");
  $('#usrDailyTransQuota').html("&nbsp;");
}

function resetImgCode(){
  var imgCodeUrl = $('.btn-captcha img').data('address');
  if(imgCodeUrl && imgCodeUrl!==''){
    var s = Date.parse(new Date())+parseInt(100+Math.random()*900);
    $("input[name=imageUniqueId]").val(s);
    $("input[name=captcha]").val('');
    //$(".btn-captcha img").attr('src', imgCodeUrl+"?sessionID="+s).show();
    var imgCode = $(".btn-captcha img")[0];
    imgCode.src = imgCodeUrl+"?sessionID="+s;
  }
}