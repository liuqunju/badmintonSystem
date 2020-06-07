<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextParam" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="${contextParam}/static/assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="${contextParam}/static/assets/css/ace.min.css"/>
    <link rel="stylesheet" href="${contextParam}/static/css/style.css"/>
    <script language="javascript" type="text/javascript" src="${contextParam}/static/My97DatePicker/WdatePicker.js"></script>
    <title>权限用户</title>
</head>

<body>
<div class="page-content">
    <div class="user_Manager_style">
        <form action="${contextParam}/tPlace/selecPlaceList?pageNo=${pageData.pageCount}">
            <div class=" Manager_style">
                <span class="title_name">场地预定</span>
                <div class="add_user_style clearfix">
                    <div class="xinxi-xs clearfix">
                        <label class="label_name lf">场地名称：</label><span class="lf">${place.placeName}</span>
                        <input type="hidden" name="plaaceId" value="${place.id}"/>
                        <input type="hidden" name="plaaceId" value="${place.id}"/>
                        <label class="label_name lf">场地介绍：</label><span class="lf">${place.content }</span>
                        <label class="label_name lf">容纳人数：</label><span class="lf">${place.galleryful }</span>
                    </div>
                    <%--预约时间
                    提交时间--%>
                    <ul>
                        <li style="width: 270px;"><label class="label_name" style="width: 80px;">
                            <i style="color:#F60; ">*</i>用户姓名：</label>
                            <input name="用户姓名" type="text" class="text_add" placeholder="请输入用户姓名">
                        </li>
                        <li style="width: 270px;"><label class="label_name" style="width: 80px;">
                            会员号：</label>
                            <input name="会员号" type="text" class="text_add" placeholder="请输入会员号">
                        </li>
                        <li style="width: 270px;"><label class="label_name" style="width: 80px;">人数：</label> <input
                                name="人数" type="text" class="text_add" placeholder="请输入人数"></li>
                        <li style="width: 270px;"><label class="label_name" style="width: 80px;"><i
                                style="color:#F60; ">*</i>手机号：</label> <input name="手机号" type="text" class="text_add"
                                                                              placeholder="请输入手机号"></li>
                        <li style="width: 270px;"><label class="label_name" style="width: 80px;"><i
                                style="color:#F60; ">*</i>联系地址：</label> <input name="" type="text" class=""
                                                                               placeholder="请输入联系地址"></li>
                        <li style="width: 270px;"><label class="label_name" style="width: 80px;"><i
                                style="color:#F60; ">*</i>预定时间：</label>
                            <input type="text" class="Wdate" style="height: 29px;" id="d412" onclick="WdatePicker({skin:'whyGreen',dateFmt:'yyyy-MM-dd HH:mm:ss',minDate:'1970-03-08 11:30:00',maxDate:'2099-12-30 20:59:30'})" value=""/>
                        </li>
                        <li style="width: 270px;"><label class="label_name" style="width: 80px;"><i
                                style="color:#F60; ">*</i>预定时长：</label> <input name="" type="text" class=""
                                                                               placeholder="请输入预定时长"></li>
                    </ul>
                </div>
                <div class="">
                    <button id="submit" type="submit" class="btn btn-primary">确定</button>
                    <button type="button" class="btn btn-warning" id="change_Password">
                        <a href="${contextParam}/tPlace/selecPlaceList?pageNo=1">返回</a>
                    </button>
                </div>
            </div>
        </form>
    </div>
</div>
<script src="${contextParam}/static/assets/js/jquery-2.0.3.min.js"></script>
<script src="${contextParam}/static/assets/js/bootstrap.min.js"></script>
<script src="${contextParam}/static/assets/layer/layer.js" type="text/javascript"></script>
<script>
    //执行一个laydate实例
    laydate.render({
        elem: '#preTime' //指定元素
    });
</script>
</body>
</html>
