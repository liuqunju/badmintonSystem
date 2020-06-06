<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextParam" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
 <link href="assets/css/bootstrap.min.css" rel="stylesheet" />
  <link rel="stylesheet" href="${contextParam}/static/assets/css/ace.min.css" />
  <link rel="stylesheet" href="${contextParam}/static/css/style.css"/>
<title>权限用户</title>
</head>

<body>
<div class="page-content">
 <div class="user_Manager_style">
 <div class=" Manager_style">
  <span class="title_name">场地预定</span>
  <div class="add_user_style clearfix">
   <div class="xinxi-xs clearfix">
   <label class="label_name lf">场地名称：</label><span class="lf">${place.placeName}</span>
    <input type="hidden" name="plaaceId" value="${place.id}" />
    <input type="hidden" name="plaaceId" value="${place.id}" />
   <label class="label_name lf">场地介绍：</label ><span class="lf">${place.content }</span>
   <label class="label_name lf">容纳人数：</label ><span class="lf">${place.galleryful }</span>
   </div>
   人数
   预约时间
   联系地址
   联系人
   联系电话
   提交时间
   预定时长
   订单编号
   预定会员
   <ul>
    <li><label class="label_name">用户姓名：</label> <input name="用户姓名" type="text" class="text_add" placeholder="刘怀帮"><i style="color:#F60; ">*</i></li>
    <li><label class="label_name">手&nbsp;&nbsp;机&nbsp;号：</label> <input name="手机号" type="text" class="text_add" placeholder="1356787654"><i style="color:#F60; ">*</i></li>
    <li><label class="label_name">邮箱：</label> <input name="" type="text" class="" placeholder="654767@qq.com"></li>
   </ul>
  </div>
  <div class=""><button id="submit" type="button" class="btn btn-primary">确定</button> <button type="button" class="btn btn-warning" id="change_Password">修改密码</button></div>
 </div>
</div>
</div>
 <div class="change_Pass_style" id="change_Pass">
            <ul class="xg_style">
             <li><label class="label_name">原&nbsp;&nbsp;密&nbsp;码</label><input name="原密码" type="password" class="" id="password"></li>
             <li><label class="label_name">新&nbsp;&nbsp;密&nbsp;码</label><input name="新密码" type="password" class="" id="Nes_pas"></li>
             <li><label class="label_name">确认密码</label><input name="再次确认密码" type="password" class="" id="c_mew_pas"></li>
              
            </ul>
         </div>
<script src="assets/js/jquery.min.js"></script>
<script src="http://ajax.googleapis.com/ajax/libs/jquery/1.10.2/jquery.min.js"></script>
<![endif]-->
    <script type="text/javascript">
        window.jQuery || document.write("<script src='${contextParam}/static/assets/js/jquery-2.0.3.min.js'>"+"<"+"/script>");
    </script>
<script type="text/javascript">
 window.jQuery || document.write("<script src='${contextParam}/static/assets/js/jquery-1.10.2.min.js'>"+"<"+"/script>");
</script>
<script src="${contextParam}/static/assets/js/bootstrap.min.js"></script>
 <script src="${contextParam}/static/assets/layer/layer.js" type="text/javascript"></script>
<script type="text/javascript">
 /***判断用户添加文本**/
 jQuery(document).ready(function(){  
  $("#submit").click(function(){
	// var num=0;
     var str="";
     $(".text_add").each(function(n){
          if($(this).val()=="")
          {
              // num++;
			   layer.alert(str+=""+$(this).attr("name")+"不能为空！\r\n",{
                title: '提示框',				
				icon:0,				
          });		
             // layer.msg(str+=""+$(this).attr("name")+"不能为空！\r\n");
             layer.close(index);
          }else{
			  
			  layer.alert('添加成功！',{
               title: '提示框',				
			icon:1,		
			  });
		  }
     });
    
})
 });
 //修改密码
$('#change_Password').on('click', function(){
    layer.open({
    type: 1,
	title:'修改密码',
	area: ['300px','300px'],
	shadeClose: true,
	content: $('#change_Pass'),
	btn:['确认修改'],
	yes:function(index, layero){		
		   if ($("#password").val()==""){
			  layer.alert('原密码不能为空!',{
              title: '提示框',				
				icon:0,
			    
			 });
			return false;
          } 
		  if ($("#Nes_pas").val()==""){
			  layer.alert('新密码不能为空!',{
              title: '提示框',				
				icon:0,
			    
			 });
			return false;
          } 
		   
		  if ($("#c_mew_pas").val()==""){
			  layer.alert('确认新密码不能为空!',{
              title: '提示框',				
				icon:0,
			    
			 });
			return false;
          }
		    if(!$("#c_mew_pas").val || $("#c_mew_pas").val() != $("#Nes_pas").val() )
        {
            layer.alert('密码不一致!',{
              title: '提示框',				
				icon:0,
			    
			 });
			 return false;
        }   
		 else{			  
			  layer.alert('修改成功！',{
               title: '提示框',				
			icon:1,		
			  }); 
			  layer.close(index);      
		  }	 
	}
    });
});
 </script>
</body>
</html>
