<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib prefix="s" uri="/struts-tags" %> 
<%
	String path = request.getContextPath();
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>金字塔 - 综合金融服务平台 - 抵押标服务协议书</title>	
	<!-- 引入页面Logo小图标 -->
	<link rel="icon" href="img/Logo.png" type="image/x-icon">
	<base href="<%=path%>/">
<style type="text/css">
.text{text-indent:2em;line-height:200%;}
.button{
border: 1px solid #8db0d3;
color: white;
width: 100px;
height: 30px;
background-color: #8db0d3;
}
.button:active {
	background-color: gray;
	border: 1px solid gray;
}

</style>
</head>
<body style="background-color: #c3c3c3">
	<div class="container">
	<div class="row clearfix">
		<div class="col-md-12 column" style="height: auto;width: 60%;margin-left: 270px;margin-top: 20px;">
		<div style="background-color: white; ">
		<div style="margin-left: 50px;width: 90%;height: auto;">
		<div style="height: 50px;"></div>
            <h3><center>抵押标服务协议</center></h3>
                <p class="text">甲方（用户）： ***</p>
                 <p class="text" style="margin-top: -20px;"> 乙方（服务方）： ***</p>
           <p class="text"> 为了向新用户提供高效及资金利用率更高的理财服务，现服务方在其网络平台（以下简称“金字塔|网贷投资”，网址：http://www.ruisi.shop ）推出抵押标新型智能投资工具，甲方同意加入本次抵押标项目，并自愿遵守金字塔|网贷投资现有的相关协议及规则。现甲乙双方本着平等自愿、诚实信用的原则，达成如下协议：
         <p class="text">   一、产品释义
          <p class="text">  1、“抵押标”是金字塔|网贷投资专为新注册用户推出的新型智能投资工具，用户委托并授权服务方系统自动投标、自动复投、到期转让。“抵押标”智能工具在本协议第二条约定的投标范围内对符合要求的标的进行优先自动投标，并在到期后自动转让退出。用户加入抵押标即进入持续服务期，持有期内系统自动复投，到期系统自动转让退出。
       <p class="text">     抵押标履行期间由服务方系统实现标的分散投资，且系统所投资的标的均 适用于金字塔|网贷投资安全保障抵押标。用户选择加入抵押标时，已深度理解并知悉服务方系统所设定的交易规则，系统仅会在符合用户授权之范围内代为行使甲方权利，所行使之权利均视为用户自身行为。
           <p class="text"> 2、持续服务期间：用户加入抵押标，且在新手专复投宝安排下成功投标后，其具体所投标的产生的回款及收益（以下统称“该款项”），抵押标针对该款项及该款项后续产生的收益继续提供服务。即抵押标持续服务期间系统代为用户投标所产生的本息回款，系统均会第一时间继续投标直至抵押标期限到期时启动债权转让机制。
          <p class="text">  3、投资方式：抵押标持续服务期间投出所有标的每月收回的部分本金及利息以及再复投标的回款的本金及利息，抵押标智能工具也会再进行复投。
           <p class="text"> 4、退出方式：用户本次参加的抵押标，在约定持续服务期间到期后，系统协助用户完成所有债权转让后一次性归还用户；
           <p class="text"> 5、预期综合年化利率：本次抵押标到期后综合产生的预期年化利率以本协议第二条约定详情为准（根据持有时间不同，故预期收益标准不同）。如退出时实际收益超过预期收益，超出部分作为平台管理费，由平台收取.
           <p class="text"> 6、投资具体标的借款期限：用户加入本次抵押标后，以服务方为用户提供自动匹配的具体标的约定的实际借款期限为准（本协议所指期限为抵押标持续服务期间，不应视为抵押标投出后的每个借款标的期限）。

          <p class="text">  二、本次抵押标详情
           <center> <table cellpadding="0" cellspacing="0" class="tab"border="1">
                <tbody><tr><td style="width:280px;">名称：</td><td> ***</td></tr>
                <tr><td>金额：</td><td> ***</td></tr>
                <tr><td>投资范围：</td><td> ***</td></tr>
                <tr><td>抵押标持续服务期限：</td><td> ***</td></tr>
                <tr><td>预期综合年化利率：</td><td> ***</td></tr>
                <tr><td>还款方式：</td><td> ***</td></tr>
                <tr><td>开放加入时间：</td><td> ***</td></tr>
                <tr><td>单位（元/份）：</td><td> ***</td></tr>
                <tr><td>加入份数：</td><td> ***</td></tr>
                <tr><td>加入资金：</td><td> ***</td></tr>
            </tbody></table></center>
                <p class="text">  注：上表中抵押标详情依据用户选择加入的具体项目所产生；投资范围所列的项目名称详细解释参见金字塔|网贷投资公布的相关产品介绍。
             <p class="text"> 三、抵押标的加入
             <p class="text"> 1、甲方在本次抵押标开放加入时间内根据自己的意愿选择加入份数，确认申请加入，并完成加入资金的全额支付后视为甲方已成功加入本次抵押标，一旦成功加入即不可撤销。
            <p class="text">  2、甲方在加入本次抵押标的同时，确认同意并接受本协议的所有条款。本协议以金字塔|网贷投资《注册服务协议》为前提，甲方参与本次抵押标的任何行为都应同时遵守金字塔|网贷投资《注册服务协议》和金字塔|网贷投资不时公示之交易规则、说明、公告等涉及甲、乙双方权利义务的法律文件及相关规则，如有违反，甲方应当自行承担相关法律后果。
             <p class="text"> 四、优先自动投标及复投规则
             <p class="text"> 1、自用户参加本次抵押标起，服务方系统即按照本协议之约定，依据用户加入抵押标的先后顺序为用户进行优先自动投标。
            <p class="text">  2、服务方系统自动协助用户进行合理投标，若系统自动投资后的某借款标发生提前还款的，且抵押标仍在持续服务期间，系统会自动将该笔款项进行再次复投。
           <p class="text">  3、抵押标持续服务期间系统投资的某个标的出现借款方逾期情况，则按照用户加入抵押标时会员等级为准进行分别处理。用户加入本次抵押标时为金字塔|网贷投资___会员，故按照下述标准享有相应的权利及义务。
                <p class="text">  (1)若用户加入本次抵押标时为金字塔|网贷投资超级会员，发生逾期担保方垫付本息后，系统继续将上述担保方垫付本息款进行复投；
                <p class="text">  (2)若用户加入本次抵押标时为金字塔|网贷投资普通会员，发生逾期担保方垫付本金后，系统将继续复投上述担保方垫付的本金；
            <!--<div class="content">
                (3)上述逾期发生且经担保方进行垫付还款后，借款方履行还款的，则还款资金（包括还款本金、还款利息、滞纳金等）由担保方所有，该资金不再参与复投。
            </div>-->

             <p class="text"> 五、抵押标的到期退出
             <p class="text"> 1、 到期退出：抵押标到期结束后，系统将为用户统计抵押标持续服务期间所投资的债权，并将期间系统代为投标或复投的所有标的自动进行债权转让。
            <p class="text">  2、提前退出：抵押标不支持提前退出，本次服务约定期限到期后自动启动到期退出模式。
             <p class="text"> 3、转让时效：抵押标的退出只能通过平台以债权转让的形式实现，所持债权转让完成的具体时间，视债权转让实际交易情况而定，即服务方及担保方不对用户转让所持有债权的时效进行兑付承诺。
             <p class="text"> 4、退出资金处理方式：抵押标到期退出，资金将根据债权转让完成情况陆续返还至用户在金字塔|网贷投资开设的个人存管账户，但到期退出时，债权转让成功后的回款先行被冻结，用户当次发起转让的债权全部转让完成后，系统再将回款解冻至用户可用余额，同时扣除平台服务费。
             <p class="text"> 六、甲方的权利和义务
            <p class="text">  1、甲方在此无条件且不可撤销地授权：自甲方加入本次抵押标起，即授权乙方通过服务方系统根据本次抵押标的详情对甲方的加入资金进行优先自动投标，并授权金字塔|网贷投资通过系统以甲方名义自动签署相关借款协议、债权转让协议、相关投资项目的服务协议等，甲方应提前查看并了解相关协议内容；甲方对此等自动投标和自动签署相关借款协议、债权转让协议、相关投资项目的服务协议之安排及内容已充分知悉并理解；该等自动签署的借款协议、债权转让协议、相关投资项目的服务协议均视为甲方真实意思的表示，甲方对该等法律文件的效力均予以认可且无任何异议，并无条件接受该等自动签署的法律文件之约束。
            <p class="text">  2、甲方的收益：甲方享有加入本次抵押标后成功实现优先自动投标而产生的收益。甲方的收益根据甲方的加入资金通过优先自动投标参加的具体投资项目而产生，以具体投资项目的投标成功之日起开始计算收益；甲方已经知悉、了解并同意：甲方加入本次新手专享抵押标所示预期年化利率为甲方最终实际年化利率，在实际年化利率未达到预期年化利率的情况下，即若甲方到期退出后所取得的实际收益低于预期收益则由乙方补足相应收益；若甲方提前退出或到期退出后所取得的实际收益高于预期收益则超出部分作为平台服务费由乙方收取；但甲方应当知道对具体投资项目的出借本金以及相应的利息存在不能够按期收回的风险。
             <p class="text"> 3、服务费：甲方到期退出或提前退出本次抵押标项目时，系统按照本协议第二条第二款约定的“预期年化综合利率”结算后，统计出用户当前实际收益利率高于上述系统取值标准，则超出部分作为乙方服务费，按照前述条款约定由系统结算时予以扣除。
            <p class="text">  4、税费问题：由甲方自行承担加入本次抵押标所获利息收益的应纳税费。
            <p class="text">  5、甲方保证加入抵押标所使用的资金为合法取得，且甲方对该资金拥有完全且无瑕疵的所有权及处分权。
            <p class="text">  6、甲方可通过其注册的金字塔|网贷投资账户查询、了解本次抵押标的相关信息及进度，如未及时查询，或由于通讯故障、系统故障以及其他不可抗力等因素影响使甲方无法及时了解相关信息，由此产生的责任和风险由甲方自行承担。
             <p class="text"> 7、甲方加入本次抵押标的资金所对应的具体投资项目，按照该投资项目的担保方式为其本金或者本息提供保障，乙方不向甲方对具体投资项目的出借本金以及相应的利息作任何承诺与保证。

             <p class="text"> 七、乙方的权利和义务
            <p class="text">  1、甲方通过服务方系统自动投标而签署之借款协议、债权转让协议、相关投资项目的服务协议等法律文件或其中的相关条款生效后，乙方即可依据上述法律文件和本协议相关约定，对甲方的加入资金进行划扣、支付、冻结以及行使其他权利，甲方对此均予以接受和认可。
            <p class="text">  2、甲方在加入本次抵押标后，服务方系统第一时间根据用户加入本次抵押标的先后顺序自动安排优先投标。
            <p class="text">  3、服务方系统根据本次抵押标的投资范围自动对甲方加入本次抵押标的资金优先自动投标，但乙方不保证甲方的加入资金能全部投标成功，且乙方不对甲方参加抵押标所对应的具体投资项目出借本金的收回、可获收益金额作出任何承诺、保证。
            <p class="text">  4、乙方接受甲方的委托行为所产生的法律后果由甲方承担。如因甲方或其他方（包括但不限于技术问题）造成的延误或错误，乙方不承担任何责任。
            <p class="text">  5、乙方仅在本协议明确规定的责任范围内承担相关责任。
             <p class="text"> 八、其他
            <p class="text">  1、如因司法机关或行政机关对甲方采取强制措施导致其本次抵押标对应的资金被全部或部分扣划，视为甲方提前退出本次抵押标，本协议自动终止。本协议因此而自动终止的，甲方将不再享有相应权利。
             <p class="text"> 2、由于金字塔|网贷投资及相关第三方的设备、系统故障或缺陷、黑客攻击、计算机病毒侵入或发作、电力中断、因政府管制而造成的暂时性关闭等影响网络正常经营的不可抗力而造成交易中断、延误的，甲、乙双方互不追究责任。甲、乙双方应在条件允许的情况下，采取一切必要的补救措施以减小不可抗力造成的损失。
             <p class="text"> 3、甲方确认：在签署本协议书以前，乙方已就本协议的全部条款和内容向甲方进行了详细的说明和解释，甲方已认真阅读本协议有关条款，对有关条款不存在任何疑问或异议，并对协议双方的权利、义务、责任与风险有清楚和准确的理解。
             <p class="text"> 九、争议解决
             <p class="text"> 因本协议所引起的纠纷，双方应协商解决，协商不成的，任何一方可向乙方所在地的人民法院提起诉讼。
             <p class="text"> 十、协议成立和生效
             <p class="text"> 本协议通过金字塔|网贷投资平台电子协议签署的要求签署，适用《中华人民共和国电子签名法》的规定，甲方确认本次抵押标的加入金额、期限和预期收益等内容无误，确认加入后，即视为甲方以电子签名的形式确认本协议成立。本协议自成立起生效，甲方同意接受本协议的全部约定及金字塔|网贷投资上与本协议相关的各项规则的规定。本协议一旦生效，即对甲、乙双方均具有法律约束力。
        <center><table cellpadding="0" cellspacing="0" border="1" style="margin-top: 20px; width: 100%;">
            <tbody><tr>
                <td style="font-size: 15px; width: 50%">甲方：******</td>
                <td style="font-size: 15px;">乙方：******************</td>
            </tr>
            <tr>
                <td style="font-size: 15px;">日期：<em>****</em> 年 <em>**</em> 月 <em>**</em> 日 </td>
                <td style="font-size: 15px;">日期：<em>****</em> 年 <em>**</em> 月 <em>**</em> 日 </td>
            </tr>
        </tbody></table></center>


    <!--风险揭示书>-->
    <!--第1页>-->
    <hr style="margin-top: 80px;"/>
        <h3 class="title"><center>
            风险揭示书</center>
        </h3>

             <p class="text"> <br><b>尊敬的投资人：</b></p>
             <p class="text"> 
                    感谢您参与/投资本抵押标/投资标的，在您签署本风险揭示书之前，请您认真、仔细阅读以下内容及本平台制定并发布的规则制度及其更新或修正的内容。本风险揭示书经您签署，即视为您已详细了解并理解本风险揭示书的全部内容，对其中揭示的风险均有足够的认识，并自愿承担参与/投资本抵押标/投资标的可能面临的风险及法律责任。
            </p>
            <p class="text"> 
                    您参与/投资本抵押标/投资标的，可能会面临以下风险，包括但不限于：
            </p>
             <p class="text"> 
                    1. 本平台仅作为网络借贷信息中介机构进行信息发布，不对您及/或您的任何交易提供任何担保，包括但不限于明示、默示或法定的担保。
            </p>
            <p class="text"> 
                    2. 本平台提供的各种信息及资料仅供参考，您应依其独立判断做出其决策，并承担可能的投资风险。
            </p>
             <p class="text"> 
                    3. 宏观经济变化可能使融资人的经营处于剧烈波动中，从而导致其价值产生不同程度的贬损，可能使您产生亏损的风险。
            </p>
            <p class="text"> 
                    4. 融资人所处行业或区域的法律、法规及政策可能发生变化，或本平台的交易规则发生变化，可能使融资人产生经营及信息披露的波动，而本平台仅能在法律、法规及本平台规则允许的范围内尽可能完整地向您进行信息披露，可能使您产生亏损的风险。
            </p>
             <p class="text"> 
                    5. 本平台的业务均通过电子通讯技术及电脑技术实现信息展现及交易处理，您需通过网络数据传输来进行查看及交易，如您或本平台的终端设备或软件系统可能会遭到非法攻击或病毒感染，可能会导致您的平台账号及密码信息泄露或身份被仿冒，本平台会尽力保障平台正常运行，但您应承担您的终端设备或软件系统及本平台以外因素导致系统故障而产生的风险。
            </p>
            <p class="text"> 
                    6. 如您投资的为无担保的投资标的，则可能会产生融资人经营失败等导致您难以收回投资的风险。
            </p>
            <p class="text"> 
                    7. 在投资过程中，您的利息所得或投资收益所得需要根据国家的财税政策缴纳相关税费，国家对该类收益的财税政策可能会发生变化，从而导致您的收入低于预期。
            </p>

             <p class="text"> 
                    8. 本抵押标/投资标的采用电子签名方式签署，所以在您投资过程中，由于网络数据传输原因，数据传输可能会出现中断、停顿、延迟，传输数据可能会出现错误，导致电子签名数据无法传输或传输失败的风险。
            </p>
            <p style="text-align:right"><br>风险揭示方：赣州金字塔互联网科技服务有限公司</p>

             <p class="text"> 
                <br><br><br>赣州金字塔互联网科技服务有限公司：
            </p>
            <p class="text"> 
                    本人已认真阅读并完全理解、接受本风险揭示书的全部内容，愿意依法承担投资本抵押标/投资标的可能产生的财产损失及法律责任。本人知悉本抵押标/投资标的的风险，了解贵司作为网络借贷信息中介机构在其中的责任，本人自愿参与/投资本抵押标/投资标的，自行享有其投资收益并承担其全部风险损失。
            </p>
            <p style="padding-left: 400px;">
                <br>投资人：<!--<br />（通过网页点击确认方式签署）-->
            </p>
		<div style="height: 80px;"></div>
</div>
</div>
</div>
</div>
<div style="margin-top: 30px;"><center><input id="btnClose" class="button" type="button" value="关闭本页" onClick="custom_close()" /></center></div>
	</div>
	</div>
</div>
<script language="javascript">
// 这个脚本是 ie6和ie7 通用的脚本
function custom_close(){
if 
(confirm("您确定要关闭本页吗？")){
window.opener=null;
window.open('','_self');
window.close();
}
else{}
}
</script>
</body>
</html>