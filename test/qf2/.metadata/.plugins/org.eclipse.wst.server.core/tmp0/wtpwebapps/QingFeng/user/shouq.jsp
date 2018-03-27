<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

 
<script type="text/javascript">
	<%String aa="5555558"; 
		int aid = Integer.parseInt(request.getParameter("id"));
	%>
  $('#r_id').val(<%=aid %>); 
	 	$('#qq').tree({
	 		lines : true,
			url: 'shou_list',
			checkbox : true,
			check:true,
			loadFilter: function(rows){
				return convert(rows);
			}
		});
	 function convert(rows){
			function exists(rows, child_id){
				for(var i=0; i<rows.length; i++){
					if (rows[i].qx_id == child_id) return true;  //遍历出全部父亲节点
				}
				return false;
			}
			
			var nodes = [];
			// get the top level nodes
			for(var i=0; i<rows.length; i++){
				var row = rows[i];
				if (!exists(rows, row.child_id)){
					nodes.push({
						id:row.qx_id,
						text:row.max_name
					});
				}
			}
			
			var toDo = [];
			for(var i=0; i<nodes.length; i++){
				toDo.push(nodes[i]);
			}
			while(toDo.length){
				var node = toDo.shift();	// the parent node
				// get the children nodes
				for(var i=0; i<rows.length; i++){
					var row = rows[i];
					if (row.child_id == node.id){
						var child = {id:row.qx_id,text:row.max_name};
						if (node.children){
							node.children.push(child);
						} else {
							node.children = [child];
						}
						toDo.push(child);
					}
				}
			}
			return nodes;
		}
	 
	    $(document).ready(function(){
	        $('#qq').tree({
	        	onClick: function(node){
	        	
	        	alert(node.text); 
	        	alert(node.id); 
	        	},
	        	onSelect:function(node){
	        		
	        	}
	        });
	        
	     
	      
	        });
	 
	 $(function(){
			oneTree =$('#qq').tree({
	            url : 'shou_list.action',
	            //parentField : 'j_id',
	            lines : true,
	            checkbox : true,
	            //onlyLeafCheck: true,
	            loadFilter: function(rows){	
					return convert(rows);				
				},
	            onLoadSuccess : function(node, data) {
	                //progressLoad();
	                $.post( 'cha_id.action', {
	                	id : <%=aid %>,// ,
	                }, function(data) {
	                    var ids = data;
	                   // alert(ids);
	                    /* if (data != undefined) {
	                    	  alert("55");
	                        ids = $.stringToList(data + '');
	                    } */
	                    var del=[15,17,22,26];
	                    if (ids.length > 0) {
	                        for ( var i = 0; i < ids.length; i++) {
	                            if (oneTree.tree('find', ids[i])) {
	                                oneTree.tree('remove', oneTree.tree('find', ids[i]).target);
	                            }
	                           
	                        }
	                        for(var n=0;n<del.length;n++){
	                        	 if(oneTree.tree('find', del[n])){
		                            	alert("?"+oneTree.tree('find', del[n]).text);
		                            	 oneTree.tree('remove', oneTree.tree('find', del[n]).target);
		                            }
	                        }
	                       
	                    }
	                }, 'json');
	                progressClose();
	            },
	            cascadeCheck : false
	        });
		});
	
	 
	 	function checkAll() {
	        var nodes = $('#qq').tree('getChecked', 'unchecked');
	        if (nodes && nodes.length > 0) {
	            for ( var i = 0; i < nodes.length; i++) {
	            
	            	$('#qq').tree('check', nodes[i].target);
	            }
	        }
	    }
	    function uncheckAll() {
	        var unchecknodes = $('#qq').tree('getChecked', 'unchecked');
	        var checknodes = $('#qq').tree('getChecked');
	        if (unchecknodes && unchecknodes.length > 0) {
	            for ( var i = 0; i < unchecknodes.length; i++) {
	            	$('#qq').tree('check', unchecknodes[i].target);
	            }
	        }
	        if (checknodes && checknodes.length > 0) {
	            for ( var i = 0; i < checknodes.length; i++) {
	            	$('#qq').tree('uncheck', checknodes[i].target);
	            }
	        }
	    }
	    function checkInverse() {
			var nodes = $('#qq').tree('getChecked');
	        if (nodes && nodes.length > 0) {
	            for ( var i = 0; i < nodes.length; i++) {
	            	$('#qq').tree('uncheck', nodes[i].target);
	            }
	        }
	    }
	    
	    //测试
	        
            function getChildren2(){  
                var node = $('#qq').tree('getSelected');  
                alert("查询："+$('#qq').tree('find', 14).text);
                var nodes = $('#qq').tree('find', 12);
                alert(nodes.text);
                $('#qq').tree('remove', nodes.target);
               	var ns= $('#qq').tree('select', nodes.target);
                alert("开s始s："+ns.text);
                
                if (node) {  
                    var children = $('#qq').tree('getChildren', node.target);  
                }  
                else {  
                    var children = $('#qq').tree('getChildren');  
                }  
                var s = '';  
                for (var i = 0; i < children.length; i++) {
				alert(children[i].text); 
				alert("查询："+node.tree('find', 14));
                node.tree('remove', $('#qq').tree('find',  i).target);
                  
                }  
                
               
                
            }  
	    
            function getChildren3(){  
            	alert('ssn');
            	var noe =$('#qq').tree('find', 658);
            	if(noe){
            		$('#qq').tree('remove', noe.target);
            	}else{
            		alert('空的啦');
            	}
            	
            	for(var i = 9; i < 20; i++){
            		var node =$('#qq').tree('find', i);
            		alert("要删除的"+node.text);
            		$('#qq').tree('remove', node.target);
            	}
            	for(var j=1;j<9;j++){
            		var node =$('#qq').tree('find', j);
            		var children = $('#qq').tree('getChildren', node.target);
            		if(children.length<1){
            			alert(node.text+"..这个父节点是空的要删除调");
            			$('#qq').tree('remove', node.target);
            		}
            	}
            	
            	
            }  
	    
            
</script>
<script type="text/javascript">
function upd(){
	
	 var checknodes = $('#qq').tree('getChecked');
	 var ids = [];
     if (checknodes && checknodes.length > 0) {
         for ( var i = 0; i < checknodes.length; i++) {
             ids.push(checknodes[i].id);
         }
        
         $('#resourceIds0').val(ids);
     }
    
		$('#m').submit();
}
</script>
<div id="cc" class="easyui-layout" style="width:100%;height:400px">
	<div data-options="region:'north'" style="height:350px;">
	
		<div class="easyui-layout" data-options="fit:true">
		<form action="shouquan_upd" method="post" id="m">
			<div data-options="region:'west',title:'资源管理',split:true" style="width:70%">
					<ul id="qq" class="easyui-tree" ></ul>
				 <input id="resourceIds0" name="resourceId" type="hidden" />
				 <input id="r_id" name="id" type="hidden" />
					
			</div>
		</form>
			<div data-options="region:'center'">
			<button class="btn btn-success" onclick="checkAll();">全选</button>
            <br /> <br />
            <button class="btn btn-warning" onclick="uncheckAll();">反选</button>
            <br /> <br />
            <button class="btn btn-inverse" onclick="checkInverse();">取消s</button>
            <br/>
            <button  onclick="getChildren2();">测试</button>
            
            <button  onclick="getChildren3();">哈哈</button>
			</div>
		</div>
		
	</div>
	 <div data-options="region:'center'" style="padding:5px;background:#eee;height:50px">
		<div align="right">
			 <a class="easyui-linkbutton" onclick="upd();" >保存</a>
		</div>
	</div> 
	
</div>

