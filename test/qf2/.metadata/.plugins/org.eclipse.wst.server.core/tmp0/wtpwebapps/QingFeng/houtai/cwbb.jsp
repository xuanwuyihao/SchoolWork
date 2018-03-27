<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 财务报表管理</title>
<link type="text/css" href="../css/finance/style.css" />

<script type="text/javascript" src="../script/finance/modernizr.js"></script>

<style type="text/css">
html, body {
	margin: 0 auto;
	padding: 0 auto;
	font-family: "Times New Roman", arial, Verdana;
	color: #817a53;
	background: #d8d6cb;
}

p {
	margin: 0;
	padding: 4px;
}

div {
	margin: 0;
	padding: 0;
}

#wrapper {
	position: absolute;
	top: 40px;
	left: 46%;
	width: 740px;
	height: 550px;
	margin: 0 0 0 -370px;
	padding: 0;
}

/* Header start */
#header {
	text-align: center;
	margin: 0 0 30px 0;
	padding: 15px 0 15px 0;
}

#txt_title {
	color: #3d381b;
	font-size: 34px;
	text-align: center;
	text-shadow: 0 -1px 2px rgba(255, 255, 255, .5);
}

#txt_subtitle {
	font-size: 17px;
	text-align: center;
}
/* Header end */

/* Label and percentage data start */
#labels {
	position: absolute;
	left: 560px;
	top: 20px;
	width: 120px;
}

#percentage_wrapper {
	position: absolute;
	left: 685px;
	top: 21px;
	width: 50px;
	height: 124px;
	overflow: hidden;
}

#percentage {
	position: absolute;
	clip: rect(0px, 50px, 125px, 0px);
}

#labels ul, #percentage ul {
	list-style-type: none;
	margin: 0;
	padding: 0;
	font-size: 14px;
	color: #333333;
}

#labels li, #percentage li {
	display: block;
	margin: 0;
	padding: 0 0 8px 0;
}

#labels span {
	display: block;
	float: left;
	width: 8px;
	height: 8px;
	margin: 5px 5px 0 0;
	background: #FFFFFF;
}

#labels ul :nth-child(1) span {
	background: #0092B9;
}

#labels ul :nth-child(2) span {
	background: #86AD00;
}

#labels ul :nth-child(3) span {
	background: #F2B705;
}

#labels ul :nth-child(4) span {
	background: #D97904;
}

#labels ul :nth-child(5) span {
	background: #BC3603;
}

#percentage p {
	display: block;
	width: 50px;
	margin: 0;
	padding: 0 0 8px 0;
	float: left;
}

#percentage ul {
	position: absolute;
	width: 300px;
}

#q2_2010:target #percentage ul {
	left: -0px;
}

#q1_2010:target #percentage ul {
	left: -50px;
}

#q4_2009:target #percentage ul {
	left: -100px;
}

#q3_2009:target #percentage ul {
	left: -150px;
}

#q2_2009:target #percentage ul {
	left: -200px;
}

#q1_2005:target #percentage ul {
	left: -250px;
}
/* Label and percentage data end */

/* Slider (contains two chart div) start */
#slider {
	width: 300px;
	height: 350px;
	margin: 0 auto;
	padding: 0 auto;
	overflow-y: hidden;
	overflow-x: auto;
}

#slider::-webkit-scrollbar { /* webkit only */
	height: 12px;
	background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#beb8a1),
		to(#cfcab9));
	-webkit-border-radius: 6px;
}

#slider::-webkit-scrollbar-thumb { /* webkit only */
	background: -webkit-gradient(linear, 0% 0%, 0% 100%, from(#8c8775),
		to(#7f7a6a));
	-webkit-border-radius: 6px;
}

#pie_ico, #pyr_ico {
	position: absolute;
	width: 80px;
	height: 26px;
	top: 335px;
	text-align: center;
}

#pie_ico {
	left: 137px
}

#pyr_ico {
	left: 535px
}
/* Slider end */

/* Charts start */
#chart_holder {
	width: 600px;
	height: 350px;
	margin: 0;
	padding: 0;
}

#pyr_chart, #pie_chart {
	position: relative;
	float: left;
	width: 300px;
	height: 300px;
	margin: 0;
	padding: 0;
	-webkit-box-reflect: below 0px
		-webkit-gradient(linear, left top, left bottom, from(transparent),
		color-stop(0.5, transparent), to(rgba(255, 255, 255, 0.2)));
}

#pyr_chart ul, #pie_chart ul {
	list-style-type: none;
	width: 300px;
	height: 300px;
	padding: 0;
	margin: 0;
}

#pyr_chart li, #pie_chart li {
	position: absolute;
	top: 0px;
	width: 300px;
	height: 300px;
	padding: 0;
	margin: 0;
}

#pie_chart p {
	width: 300px;
	height: 300px;
	padding: 0;
	margin: 0;
}

#pie_chart li p {
	-webkit-transition: all .7s ease-out;
}

#pie_chart span {
	display: block;
	width: 150px;
	height: 300px;
}

#pie_chart ul :nth-child(odd) {
	clip: rect(0px, 300px, 300px, 150px);
}

#pie_chart ul :nth-child(even) {
	clip: rect(0px, 150px, 300px, 0px);
}

.pie_left {
	-moz-border-radius-topleft: 150px;
	-moz-border-radius-bottomleft: 150px;
	-webkit-border-top-left-radius: 150px;
	-webkit-border-bottom-left-radius: 150px;
	border-top-left-radius: 150px;
	border-bottom-left-radius: 150px;
}

.pie_right {
	margin-left: 150px;
	-moz-border-radius-topright: 150px;
	-moz-border-radius-bottomright: 150px;
	-webkit-border-top-right-radius: 150px;
	-webkit-border-bottom-right-radius: 150px;
	border-top-right-radius: 150px;
	border-bottom-right-radius: 150px;
}

#c1_l span {
	background: #BC3603;
	background-image: -moz-radial-gradient(left 45deg, circle closest-corner, #de3d00 10%,
		#BC3603 100%);
	background-image: -webkit-gradient(radial, left center, 10, left center, 150, from(#de3d00
		), to(#BC3603));
}

#c1_r span {
	background: #BC3603;
	background-image: -moz-radial-gradient(right 45deg, circle closest-corner, #de3d00 10%,
		#BC3603 100%);
	background-image: -webkit-gradient(radial, right center, 10, right center, 150, from(#de3d00
		), to(#BC3603));
}

#c2_l span {
	background: #D97904;
	background-image: -moz-radial-gradient(left 45deg, circle closest-corner, #fb8a00 10%,
		#D97904 100%);
	background-image: -webkit-gradient(radial, left center, 10, left center, 150, from(#fb8a00
		), to(#D97904));
}

#c2_r span {
	background: #D97904;
	background-image: -moz-radial-gradient(right 45deg, circle closest-corner, #fb8a00 10%,
		#D97904 100%);
	background-image: -webkit-gradient(radial, right center, 10, right center, 150, from(#fb8a00
		), to(#D97904));
}

#c3_l span {
	background: #F2B705;
	background-image: -moz-radial-gradient(left 45deg, circle closest-corner, #ffc517 10%,
		#F2B705 100%);
	background-image: -webkit-gradient(radial, left center, 10, left center, 150, from(#ffc517
		), to(#F2B705));
}

#c3_r span {
	background: #F2B705;
	background-image: -moz-radial-gradient(right 45deg, circle closest-corner, #ffc517 10%,
		#F2B705 100%);
	background-image: -webkit-gradient(radial, right center, 10, right center, 150, from(#ffc517
		), to(#F2B705));
}

#c4_l span {
	background: #86AD00;
	background-image: -moz-radial-gradient(left 45deg, circle closest-corner, #9bc800 10%,
		#86AD00 100%);
	background-image: -webkit-gradient(radial, left center, 10, left center, 150, from(#9bc800
		), to(#86AD00));
}

#c4_r span {
	background: #86AD00;
	background-image: -moz-radial-gradient(right 45deg, circle closest-corner, #9bc800 10%,
		#86AD00 100%);
	background-image: -webkit-gradient(radial, right center, 10, right center, 150, from(#9bc800
		), to(#86AD00));
}

#c5_l span {
	background: #0092B9;
	background-image: -moz-radial-gradient(left 45deg, circle closest-corner, #00addb 10%,
		#0092B9 100%);
	background-image: -webkit-gradient(radial, left center, 10, left center, 150, from(#00addb
		), to(#0092B9));
}

#c5_r span {
	background: #0092B9;
	background-image: -moz-radial-gradient(right 45deg, circle closest-corner, #00addb 10%,
		#0092B9 100%);
	background-image: -webkit-gradient(radial, right center, 10, right center, 150, from(#00addb
		), to(#0092B9));
}

/*Pie chart data (degree value) */
#pie_chart ul :nth-child(1) p, #q2_2010:target #pie_chart ul :nth-child(1) p
	{
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#pie_chart ul :nth-child(2) p, #q2_2010:target #pie_chart ul :nth-child(2) p
	{
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#pie_chart ul :nth-child(3) p, #q2_2010:target #pie_chart ul :nth-child(3) p
	{
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#pie_chart ul :nth-child(4) p, #q2_2010:target #pie_chart ul :nth-child(4) p
	{
	-moz-transform: rotate(170deg);
	-webkit-transform: rotate(170deg);
	-o-transform: rotate(170deg);
}

#pie_chart ul :nth-child(5) p, #q2_2010:target #pie_chart ul :nth-child(5) p
	{
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#pie_chart ul :nth-child(6) p, #q2_2010:target #pie_chart ul :nth-child(6) p
	{
	-moz-transform: rotate(152deg);
	-webkit-transform: rotate(152deg);
	-o-transform: rotate(152deg);
}

#pie_chart ul :nth-child(7) p, #q2_2010:target #pie_chart ul :nth-child(7) p
	{
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#pie_chart ul :nth-child(8) p, #q2_2010:target #pie_chart ul :nth-child(8) p
	{
	-moz-transform: rotate(126deg);
	-webkit-transform: rotate(126deg);
	-o-transform: rotate(126deg);
}

#pie_chart ul :nth-child(9) p, #q2_2010:target #pie_chart ul :nth-child(9) p
	{
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#pie_chart ul :nth-child(10) p, #q2_2010:target #pie_chart ul :nth-child(10) p
	{
	-moz-transform: rotate(36deg);
	-webkit-transform: rotate(36deg);
	-o-transform: rotate(36deg);
}

#q1_2010:target #pie_chart ul :nth-child(1) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2010:target #pie_chart ul :nth-child(2) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2010:target #pie_chart ul :nth-child(3) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2010:target #pie_chart ul :nth-child(4) p {
	-moz-transform: rotate(170deg);
	-webkit-transform: rotate(170deg);
	-o-transform: rotate(170deg);
}

#q1_2010:target #pie_chart ul :nth-child(5) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2010:target #pie_chart ul :nth-child(6) p {
	-moz-transform: rotate(153deg);
	-webkit-transform: rotate(153deg);
	-o-transform: rotate(153deg);
}

#q1_2010:target #pie_chart ul :nth-child(7) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2010:target #pie_chart ul :nth-child(8) p {
	-moz-transform: rotate(131deg);
	-webkit-transform: rotate(131deg);
	-o-transform: rotate(131deg);
}

#q1_2010:target #pie_chart ul :nth-child(9) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2010:target #pie_chart ul :nth-child(10) p {
	-moz-transform: rotate(42deg);
	-webkit-transform: rotate(42deg);
	-o-transform: rotate(42deg);
}

#q4_2009:target #pie_chart ul :nth-child(1) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q4_2009:target #pie_chart ul :nth-child(2) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q4_2009:target #pie_chart ul :nth-child(3) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q4_2009:target #pie_chart ul :nth-child(4) p {
	-moz-transform: rotate(171deg);
	-webkit-transform: rotate(171deg);
	-o-transform: rotate(171deg);
}

#q4_2009:target #pie_chart ul :nth-child(5) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q4_2009:target #pie_chart ul :nth-child(6) p {
	-moz-transform: rotate(154deg);
	-webkit-transform: rotate(154deg);
	-o-transform: rotate(154deg);
}

#q4_2009:target #pie_chart ul :nth-child(7) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q4_2009:target #pie_chart ul :nth-child(8) p {
	-moz-transform: rotate(139deg);
	-webkit-transform: rotate(139deg);
	-o-transform: rotate(139deg);
}

#q4_2009:target #pie_chart ul :nth-child(9) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q4_2009:target #pie_chart ul :nth-child(10) p {
	-moz-transform: rotate(50deg);
	-webkit-transform: rotate(50deg);
	-o-transform: rotate(50deg);
}

#q3_2009:target #pie_chart ul :nth-child(1) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q3_2009:target #pie_chart ul :nth-child(2) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q3_2009:target #pie_chart ul :nth-child(3) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q3_2009:target #pie_chart ul :nth-child(4) p {
	-moz-transform: rotate(172deg);
	-webkit-transform: rotate(172deg);
	-o-transform: rotate(172deg);
}

#q3_2009:target #pie_chart ul :nth-child(5) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q3_2009:target #pie_chart ul :nth-child(6) p {
	-moz-transform: rotate(156deg);
	-webkit-transform: rotate(156deg);
	-o-transform: rotate(156deg);
}

#q3_2009:target #pie_chart ul :nth-child(7) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q3_2009:target #pie_chart ul :nth-child(8) p {
	-moz-transform: rotate(145deg);
	-webkit-transform: rotate(145deg);
	-o-transform: rotate(145deg);
}

#q3_2009:target #pie_chart ul :nth-child(9) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q3_2009:target #pie_chart ul :nth-child(10) p {
	-moz-transform: rotate(61deg);
	-webkit-transform: rotate(61deg);
	-o-transform: rotate(61deg);
}

#q2_2009:target #pie_chart ul :nth-child(1) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q2_2009:target #pie_chart ul :nth-child(2) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q2_2009:target #pie_chart ul :nth-child(3) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q2_2009:target #pie_chart ul :nth-child(4) p {
	-moz-transform: rotate(172deg);
	-webkit-transform: rotate(172deg);
	-o-transform: rotate(172deg);
}

#q2_2009:target #pie_chart ul :nth-child(5) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q2_2009:target #pie_chart ul :nth-child(6) p {
	-moz-transform: rotate(158deg);
	-webkit-transform: rotate(158deg);
	-o-transform: rotate(158deg);
}

#q2_2009:target #pie_chart ul :nth-child(7) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q2_2009:target #pie_chart ul :nth-child(8) p {
	-moz-transform: rotate(149deg);
	-webkit-transform: rotate(149deg);
	-o-transform: rotate(149deg);
}

#q2_2009:target #pie_chart ul :nth-child(9) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q2_2009:target #pie_chart ul :nth-child(10) p {
	-moz-transform: rotate(66deg);
	-webkit-transform: rotate(66deg);
	-o-transform: rotate(66deg);
}

#q1_2005:target #pie_chart ul :nth-child(1) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2005:target #pie_chart ul :nth-child(2) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2005:target #pie_chart ul :nth-child(3) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2005:target #pie_chart ul :nth-child(4) p {
	-moz-transform: rotate(176deg);
	-webkit-transform: rotate(176deg);
	-o-transform: rotate(176deg);
}

#q1_2005:target #pie_chart ul :nth-child(5) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2005:target #pie_chart ul :nth-child(6) p {
	-moz-transform: rotate(167deg);
	-webkit-transform: rotate(167deg);
	-o-transform: rotate(167deg);
}

#q1_2005:target #pie_chart ul :nth-child(7) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2005:target #pie_chart ul :nth-child(8) p {
	-moz-transform: rotate(167deg);
	-webkit-transform: rotate(167deg);
	-o-transform: rotate(167deg);
}

#q1_2005:target #pie_chart ul :nth-child(9) p {
	-moz-transform: rotate(180deg);
	-webkit-transform: rotate(180deg);
	-o-transform: rotate(180deg);
}

#q1_2005:target #pie_chart ul :nth-child(10) p {
	-moz-transform: rotate(143deg);
	-webkit-transform: rotate(143deg);
	-o-transform: rotate(143deg);
}

#pyr_chart li {
	-webkit-transition: all .5s;
}

#pyr_chart ul :nth-child(1) {
	background: #BC3603;
	background-image: -moz-radial-gradient(center 0deg, circle closest-corner, #de3d00 10%,
		#BC3603 100%);
	background-image: -webkit-gradient(radial, center center, 10, center center, 150, from(#de3d00
		), to(#BC3603));
}

#pyr_chart ul :nth-child(2) {
	background: #D97904;
	background-image: -moz-radial-gradient(center 0deg, circle closest-corner, #fb8a00 10%,
		#D97904 100%);
	background-image: -webkit-gradient(radial, center center, 10, center center, 150, from(#fb8a00
		), to(#D97904));
	height: 292px;
}

#pyr_chart ul :nth-child(3) {
	background: #F2B705;
	background-image: -moz-radial-gradient(center 0deg, circle closest-corner, #ffc517 10%,
		#F2B705 100%);
	background-image: -webkit-gradient(radial, center center, 10, center center, 150, from(#ffc517
		), to(#F2B705));
	height: 277px;
}

#pyr_chart ul :nth-child(4) {
	background: #86AD00;
	background-image: -moz-radial-gradient(center 0deg, circle closest-corner, #9bc800 10%,
		#86AD00 100%);
	background-image: -webkit-gradient(radial, center center, 10, center center, 150, from(#9bc800
		), to(#86AD00));
	height: 255px;
}

#pyr_chart ul :nth-child(5) {
	background: #0092B9;
	background-image: -moz-radial-gradient(center 0deg, circle closest-corner, #00addb 10%,
		#0092B9 100%);
	background-image: -webkit-gradient(radial, center center, 10, center center, 150, from(#00addb
		), to(#0092B9));
	height: 180px;
}

#pyr_chart ul :nth-child(6) {
	width: 0;
	height: 0;
	border-color: transparent #d8d6cb transparent #d8d6cb;
	border-width: 0px 150px 300px 150px;
	border-style: solid;
}

/*Pyramid chart data (height value) */
#q1_2010:target #pyr_chart ul :nth-child(2) {
	height: 292px;
}

#q1_2010:target #pyr_chart ul :nth-child(3) {
	height: 277px;
}

#q1_2010:target #pyr_chart ul :nth-child(4) {
	height: 259px;
}

#q1_2010:target #pyr_chart ul :nth-child(5) {
	height: 185px;
}

#q4_2009:target #pyr_chart ul :nth-child(2) {
	height: 292px;
}

#q4_2009:target #pyr_chart ul :nth-child(3) {
	height: 279px;
}

#q4_2009:target #pyr_chart ul :nth-child(4) {
	height: 266px;
}

#q4_2009:target #pyr_chart ul :nth-child(5) {
	height: 192px;
}

#q3_2009:target #pyr_chart ul :nth-child(2) {
	height: 293px;
}

#q3_2009:target #pyr_chart ul :nth-child(3) {
	height: 280px;
}

#q3_2009:target #pyr_chart ul :nth-child(4) {
	height: 271px;
}

#q3_2009:target #pyr_chart ul :nth-child(5) {
	height: 201px;
}

#q2_2009:target #pyr_chart ul :nth-child(2) {
	height: 293px;
}

#q2_2009:target #pyr_chart ul :nth-child(3) {
	height: 282px;
}

#q2_2009:target #pyr_chart ul :nth-child(4) {
	height: 274px;
}

#q2_2009:target #pyr_chart ul :nth-child(5) {
	height: 205px;
}

#q1_2005:target #pyr_chart ul :nth-child(2) {
	height: 297px;
}

#q1_2005:target #pyr_chart ul :nth-child(3) {
	height: 290px;
}

#q1_2005:target #pyr_chart ul :nth-child(4) {
	height: 290px;
}

#q1_2005:target #pyr_chart ul :nth-child(5) {
	height: 269px;
}
/* Charts end */

/* button panel start */
#btn_panel {
	position: relative;
	margin-left: auto;
	margin-right: auto;
	width: 420px;
	padding-top: 35px;
}

#btn_panel ul {
	list-style-type: none;
	display: inline;
	padding: 0;
	margin: 0;
}

#btn_panel li {
	float: left;
	padding: 5px;
}

#btn_panel span:first-child {
	display: block;
	font-size: 22px;
	padding: 5px 0 0 0
}

#btn_panel span:last-child {
	display: block;
	font-size: 16px;
	padding: 7px 0 0 0;
}

#btn_panel li a {
	display: block;
	width: 60px;
	height: 65px;
	text-decoration: none;
	text-align: center;
	color: #565446;
	background: #fcfcfc;
	background-image: -moz-linear-gradient(100% 40% 270deg, #FFFFFF, #eaeaea, #f5f5f5 100%);
	background-image: -webkit-gradient(linear, 0% 45%, 0% 69%, from(#FFFFFF),
		to(#EDEDED), color-stop(.4, #F7F7F7));
	-moz-border-radius: 4px;
	-webkit-border-radius: 4px;
	border-radius: 4px;
	-moz-box-shadow: #c0bca7 0px 1px 0px;
	-webkit-box-shadow: #c0bca7 0px 1px 0px;
	box-shadow: #c0bca7 0px 1px 0px;
	-webkit-transition: all .3s ease-out;
	opacity: .5;
}

#btn_panel li:last-child a {
	color: #c33702;
	-moz-transform: scale(1.1);
	-webkit-transform: scale(1.1);
	-o-transform: scale(1.1);
	opacity: 1;
}

#q1_2005:target #btn_panel li:last-child a, #q2_2009:target #btn_panel li:last-child a,
	#q3_2009:target #btn_panel li:last-child a, #q4_2009:target #btn_panel li:last-child a,
	#q1_2010:target #btn_panel li:last-child a {
	color: #565446;
	-moz-transform: scale(1);
	-webkit-transform: scale(1);
	-o-transform: scale(1);
	opacity: .5;
}

#q1_2005:target #btn_panel li:nth-child(1) a {
	color: #c33702;
	-moz-transform: scale(1.1);
	-webkit-transform: scale(1.1);
	-o-transform: scale(1.1);
	opacity: 1;
}

#q2_2009:target #btn_panel li:nth-child(2) a {
	color: #c33702;
	-moz-transform: scale(1.1);
	-webkit-transform: scale(1.1);
	-o-transform: scale(1.1);
	opacity: 1;
}

#q3_2009:target #btn_panel li:nth-child(3) a {
	color: #c33702;
	-moz-transform: scale(1.1);
	-webkit-transform: scale(1.1);
	-o-transform: scale(1.1);
	opacity: 1;
}

#q4_2009:target #btn_panel li:nth-child(4) a {
	color: #c33702;
	-moz-transform: scale(1.1);
	-webkit-transform: scale(1.1);
	-o-transform: scale(1.1);
	opacity: 1;
}

#q1_2010:target #btn_panel li:nth-child(5) a {
	color: #c33702;
	-moz-transform: scale(1.1);
	-webkit-transform: scale(1.1);
	-o-transform: scale(1.1);
	opacity: 1;
}
/* button panel end */
</style>

</head>
<body>
	<div id="wrapper">
		<div id="q2_2010">
			<div id="q1_2010">
				<div id="q4_2009">
					<div id="q3_2009">
						<div id="q2_2009">
							<div id="q1_2005">
								<div id="labels">
									<ul>
										<li><span></span>Internet Explorer</li>
										<li><span></span>Mozilla Firefox</li>
										<li><span></span>Google Chrome</li>
										<li><span></span>Safari</li>
										<li><span></span>Opera</li>
									</ul>
								</div>
								<div id="pie_ico" title="查看饼状图">Pie &raquo;</div>
								<div id="pyr_ico" title="查看金字塔图">&laquo; Pyramid</div>
								<div id="percentage_wrapper">
									<div id="percentage">
										<ul>
											<li><p>60.14%</p>
												<p>61.79%</p>
												<p>63.90%</p>
												<p>67.02%</p>
												<p>68.28%</p>
												<p>89.68%</p></li>
											<li><p>24.98%</p>
												<p>24.56%</p>
												<p>24.39%</p>
												<p>23.28%</p>
												<p>23.22%</p>
												<p>6.83%</p></li>
											<li><p>7.14%</p>
												<p>6.03%</p>
												<p>4.27%</p>
												<p>3.08%</p>
												<p>2.35%</p>
												<p>0%</p></li>
											<li><p>5.10%</p>
												<p>4.91%</p>
												<p>4.64%</p>
												<p>4.35%</p>
												<p>3.89%</p>
												<p>2.36%</p></li>
											<li><p>2.66%</p>
												<p>2.73%</p>
												<p>2.52%</p>
												<p>2.29%</p>
												<p>2.27%</p>
												<p>1.15%</p></li>
										</ul>
									</div>
								</div>
								<div id="slider">
									<div id="chart_holder">
										<div id="pie_chart">
											<ul>
												<li id="c1_r"><p>
														<span class="pie_left"></span>
													</p></li>
												<li id="c1_l"><p>
														<span class="pie_right"></span>
													</p></li>
												<li id="c2_r"><p>
														<span class="pie_left"></span>
													</p></li>
												<li id="c2_l"><p>
														<span class="pie_right"></span>
													</p></li>
												<li id="c3_r"><p>
														<span class="pie_left"></span>
													</p></li>
												<li id="c3_l"><p>
														<span class="pie_right"></span>
													</p></li>
												<li id="c4_r"><p>
														<span class="pie_left"></span>
													</p></li>
												<li id="c4_l"><p>
														<span class="pie_right"></span>
													</p></li>
												<li id="c5_r"><p>
														<span class="pie_left"></span>
													</p></li>
												<li id="c5_l"><p>
														<span class="pie_right"></span>
													</p></li>
											</ul>
										</div>
										<div id="pyr_chart">
											<ul>
												<li></li>
												<li></li>
												<li></li>
												<li></li>
												<li></li>
												<li></li>
												<li></li>
											</ul>
										</div>
									</div>
								</div>
								<div id="btn_panel">
									<ul>
										<li><a href="#q1_2005"><span>Q1</span><span>2005</span></a></li>
										<li><a href="#q2_2009"><span>Q2</span><span>2009</span></a></li>
										<li><a href="#q3_2009"><span>Q3</span><span>2009</span></a></li>
										<li><a href="#q4_2009"><span>Q4</span><span>2009</span></a></li>
										<li><a href="#q1_2010"><span>Q1</span><span>2010</span></a></li>
										<li><a href="#q2_2010"><span>Q2</span><span>2010</span></a></li>
									</ul>
								</div>
							</div>
							<!--q1_2005-->
						</div>
						<!--q2_2009-->
					</div>
					<!--q3_2009-->
				</div>
				<!--q4_2009-->
			</div>
			<!--q1_2010-->
		</div>
		<!--q2_2010-->
	</div>
	<script type="text/javascript" src="../script/finance/index.js"></script>
</body>
</html>