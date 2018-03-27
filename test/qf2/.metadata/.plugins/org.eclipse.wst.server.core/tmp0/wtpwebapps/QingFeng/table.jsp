<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>&nbsp;清风教育网 - 表格</title>
<link href="css/table.css" rel="stylesheet" type="text/css" />
<style type="text/css">
.pageForm {
	display: block;
	margin-top: 14px;
}

.pageInput, .pageButton {
	padding: 0px 10px;
	height: 30px;
	line-height: 30px;
	border-radius: 3px;
	border: 1px solid #bbb;
	display: inline-block;
	vertical-align: middle;
}

.pageInput {
	width: 28px;
	height: 28px;
	box-shadow: inset 1px 2px 1px rgba(0, 0, 0, 0.1);
}

.pageLabel {
	position: absolute;
	left: -9999em;
}

.pageButton {
	background: linear-gradient(#f46652 0%, #dd5846 100%);
	border-color: #dd5846;
	color: white;
}

.pageSkip {
	display: inline-block;
	background: transparent url('images/monotone_arrow_left_small.png')
		no-repeat -10px -10px;
	text-indent: -999em;
	background-size: 40px;
	opacity: 0.7;
	vertical-align: middle;
	width: 20px;
	height: 20px;
}

.pageNext {
	background-image: url('images/monotone_arrow_right.png');
}

.pageNumber {
	position: relative;
/*  relative：相对的    radius：半径 */
     
	top: -38px;
	left: 50%;
	font-size: 12px;
	color: #333;
	width: 60px;
	display: block;
	text-align: center;
	margin-left: -17px;
	background: white;
	padding: 5px 10px;
	border-radius: 3px;
	box-shadow: 0 0 5px rgba(151, 38, 20, 0.15);
}

.pageNumber:after {
	content: " ";
	display: block;
	position: absolute;
	width: 0;
	height: 0;
	top: 24px;
	border: 6px solid transparent;
	border-top-color: white;
}

.pagePip {
	width: 1px;
	height: 3px;
	background: black;
	position: absolute;
	bottom: -10px;
	opacity: 0.4;
	box-shadow: -1px 0 0 #ffffff;
}

.pageMaxPip, .pageMinPip {
	font-size: 12px;
	color: #777;
	position: absolute;
	bottom: -30px;
	width: 20px;
}

.pageMaxPip {
	right: -10px;
}

.pageMinPip {
	left: -10px;
}

.pagination {
	width: 95%;
	margin: 50px auto;
	margin-top: 47px;
	text-align: center;
}

.pageSlider {
	display: inline-block;
}

.ui-slider-horizontal {
	width: 60%;
	height: 6px;
	top: 0px;
	margin: 0px 10px 2px;
	border-radius: 6px;
	position: relative;
	display: inline-block;
	background: #e0d8d7;
	background-image: repeating-linear-gradient(28deg, transparent, transparent 10px, #dd5846
		10px, #dd5846 20px);
	box-shadow: inset 0 2px 5px rgba(0, 0, 0, 0.4);
}

.ui-slider-horizontal:before {
	content: " ";
	position: absolute;
	width: auto;
	height: 16px;
	top: -5px;
	left: -4px;
	right: -4px;
	border-radius: 10px;
	z-index: -1;
	background: linear-gradient(rgba(0, 0, 0, 0.1) 0%,
		rgba(255, 255, 255, 0.8) 90%);
}

.ui-slider.long .ui-slider-handle {
	height: 12px;
	width: 30px;
	background: #f1f1f1;
	display: block;
	position: absolute;
	border-radius: 50px;
	margin-top: -3px;
	margin-left: -15px;
	text-decoration: none;
	background: #f5f5f5;
	background: linear-gradient(#f5f5f5 0%, #cccccc 100%);
	box-shadow: 0 0 10px 0px rgba(0, 0, 0, 0.35), 0 0 2px 1px
		rgba(0, 0, 0, 0.15), 0 3px 3px rgba(0, 0, 0, 0.2), 0 7px 5px
		rgba(0, 0, 0, 0.1), 0 11px 10px rgba(0, 0, 0, 0.1);
}

.ui-slider.long .ui-slider-handle::before, .ui-slider.long .ui-slider-handle::after
	{
	content: " ";
	width: 2px;
	height: 40%;
	position: absolute;
	background: transparent;
	border-radius: 0px;
	box-shadow: -1px 0px 0px rgba(255, 255, 255, 0.8), 1px 0px 0px
		rgba(255, 255, 255, 0.8), 2px 0 0 rgba(0, 0, 0, 0.3), 1px 0 0
		rgba(0, 0, 0, 0.3) inset;
}

.ui-slider.long .ui-slider-handle::before {
	left: 10px;
	top: 30%;
}

.ui-slider.long .ui-slider-handle::after {
	right: 12px;
	top: 30%;
}

@media ( max-width : 550px) {
	.pagination {
		width: auto;
	}
	.pageForm {
		display: block;
		margin-top: 20px;
	}
	.pageInput {
		margin: 0;
	}
	.pageSlider {
		width: 260px;
		margin: 0 15px;
	}
}

#pageSliderDescription {
	position: absolute;
	left: -999em;
	display: inline-block;
	width: 0;
	height: 0;
}
</style>
</head>
<body>
	<h1>表格</h1>
	<table>
		<tr>
			<th id="StudentID">学生编号</th>
			<th id="StudentName">学生姓名</th>
			<th id="SenSanName">老师姓名</th>
			<th id="StudentPhone">手机号码</th>
			<th id="BeanGouLex">报名类型</th>
			<th id="BeanGouNa">学习内容</th>
			<th id="BeanBirthday">报名日期</th>

			<th id="StudentSex">性别</th>
			<th id="StudentBirthday">出生日期</th>
			<th id="StudentAddress">籍贯</th>
			<th id="SetUp">操作</th>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st1"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st1" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st2"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st2" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st3"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st3" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st4"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st4" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st5"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st5" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st6"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st6" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st7"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st7" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st8"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st8" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st9"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st9" value="删除" />删除</label></td>
		</tr>
		<tr>
			<td>20170621001</td>
			<td>小强</td>
			<td>老王</td>
			<td>13779776547</td>
			<td>艺考</td>
			<td>室内设计与绘画</td>
			<td>2016-08-18</td>
			<td>男</td>
			<td>1998-10-18</td>
			<td id="StuAddress">江西省赣州市</td>

			<td><label title="修改信息"><input type="radio" name="st10"
					value="修改" />修改</label> <label title="删除此条"><input type="radio"
					name="st10" value="删除" />删除</label></td>
		</tr>

	</table>
	<!-- <span style="height:50px;width:100%;"></span> -->
	<section class="pagination" role="navigation">

	<div class="pageSlider long"></div>
	<div class="dc">
		<button id="ld">导出</button>
	</div>
	<form class="pageForm" action="#">

		<a class="pagePrev pageSkip" href="#?page=6" title="Previous Page (6)">Previous
			Page</a> <input id="pageInput" class="pageInput" type="text"
			maxlength="3" placeholder="#"> <a class="pageNext pageSkip"
			href="#?page=8" title="Next Page (8)">Next Page</a>

		<button class="pageButton" title="Go to chosen page of results">Go</button>

	</form>

	</section>

	<script src="script/fyjquery.js"></script>
	<script src="script/fyjquery-ui.js"></script>


	<script>
		$(document).ready( function() {
  var pagesMax = 30;
  var pagesMin = 1;
  var startPage = 1;
  var url = "已经是最后一页了";
  
  $('.pagination .pageSlider').slider({

    value: startPage, max: pagesMax, min: pagesMin,
    animate: true,
    
    create: function( event, ui ) {
      
      $('.pagination .pageSlider .ui-slider-handle').attr({
        "aria-valuenow": startPage,
        "aria-valuetext": "Page " + startPage,
        "role": "slider",
        "aria-valuemin": pagesMin,
        "aria-valuemax": pagesMax,
        "aria-describedby": "pageSliderDescription" 
      });
       
      $('.pagination .pageInput').val( startPage );

    }
  
  }).on( 'slide', function(event,ui) {
      
      // let user skip 10 pages with keyboard ;)
      if( event.metaKey || event.ctrlKey ) {
        
        if( ui.value > $(this).slider('value') ) {
          
          if( ui.value+9 < pagesMax ) { ui.value+=9; } 
          else { ui.value=pagesMax }
          $(this).slider('value',ui.value);
        
        } else {
          
          if( ui.value-9 > pagesMin ) { ui.value-=9; } 
          else { ui.value=pagesMin }
          $(this).slider('value',ui.value);
          
        }
        
        event.preventDefault();
        
      }
      
      $('.pagination .pageNumber span').text( ui.value );
      $('.pagination .pageInput').val( ui.value );
      
  }).on('slidechange', function(event, ui) {
    
      $('.pagination .pageNumber')
        .attr('role','alert')
        .find('span')
        .text( ui.value );
    
      $('.pagination .pageInput').val( ui.value );
      
      $('.pagination .pageSlider .ui-slider-handle').attr({
        "aria-valuenow": ui.value,
        "aria-valuetext": "Page " + ui.value 
      });
    
  });

$('.pagination .pageSlider .ui-slider-handle').on( 'keyup' , function(e) {
  
  if( e.which == 13 ) {
    var curPage = $('.pagination .pageSlider').slider('value');
    alert( 'we would now send you to: ' + url.replace( /{{.}}/ , curPage ));
  }
  
});

$('.pagination .pageInput').on( 'change' , function(e) {
  $('.pagination .pageSlider').slider( 'value', $(this).val() );
});
  
  var tmr;
  $('.pageSkip').on('click', function(e) {
    
    e.preventDefault();
    
    var $this = $(this);
    
    if( $this.hasClass('pageNext') ) {
      var curPage = $('.pagination .pageSlider').slider('value')+1;
    } else if( $this.hasClass('pagePrev') ) {
      var curPage = $('.pagination .pageSlider').slider('value')-1;
    }
    
    $('.pagination .pageSlider').slider('value',curPage);
    
    clearTimeout(tmr);
    tmr = setTimeout( function() {
      alert( 'we would now send you to: ' + url.replace( /{{.}}/ , curPage ));
    },1000);
    
  }); 

function sliderPips( min, max ) {
  
  var pips = max-min;
  var $pagination = $('.pagination .pageSlider');
 
  for( i=0; i<=pips; i++ ) {

    var s = $('<span class="pagePip"/>').css({ 
      left: '' + (100/pips)*i + '%' 
    });
    
    $pagination.append( s );

  }
  
  var minPip = $('<span class="pageMinPip">'+min+'</span>');
  var maxPip = $('<span class="pageMaxPip">'+max+'</span>');
  $pagination.prepend( minPip, maxPip );
  
};sliderPips( pagesMin, pagesMax );
 

function sliderLabel() {
  $('.pagination .ui-slider-handle').append(
    '<span class="pageNumber">Page <span>' + 
    $('.pagination .pageSlider').slider('value') + 
    '</span></span>');
};sliderLabel();  
  
  $('.pagination .pageButton').on('click', function(e) {

    e.preventDefault();
    var curPage = $('.pagination .pageSlider').slider('value');
    alert( "温馨提示: " + 
          url.replace( /{{.}}/ , curPage ));
  
  });
  
});
	</script>

</body>
</html>