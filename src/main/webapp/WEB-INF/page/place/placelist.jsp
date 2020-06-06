<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextParam" value="${pageContext.request.contextPath }"/>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8"/>
    <link href="${contextParam}/static/assets/css/bootstrap.min.css" rel="stylesheet"/>
    <link rel="stylesheet" href="${contextParam}/static/assets/css/font-awesome.min.css"/>
    <link rel="stylesheet" href="${contextParam}/static/assets/css/font-awesome-ie7.min.css"/>
    <link rel="stylesheet" href="${contextParam}/static/assets/css/ace.min.css"/>
    <link rel="stylesheet" href="${contextParam}/static/css/style.css"/>
    <link rel="stylesheet" href="${contextParam}/static/css/fix.css"/>
    <title>场地列表</title>
</head>

<body>
<div class="page-content">
    <div class="row">
        <div class="col-xs-12">
            <h3 class="header smaller lighter blue">场地列表</h3>
            <form action="${contextParam}/tPlace/selecPlaceList?pageNo=${pageData.pageCount}">
            <div class="search_style" style="margin-bottom: 10px; padding: 25px 19px;" >
                <div class="title_names">搜索查询</div>
                <ul class="search_content clearfix">
                    <li><label class="lf">场地名称</label>
                        <input name="placeName" type="text" value="${place.placeName == null ? "" : place.placeName}" class="text_add"/>
                    </li>
                    <li><label class="lf">场地状态</label>
                        <select name="placeStatus" style="width: 170px" size="1">
                            <option value="">请选择</option>
                            <option value="free" <c:if test="${place.placeStatus=='free' }"> selected="selected"</c:if>>空闲</option>
                            <option value="booked" <c:if test="${place.placeStatus=='booked' }"> selected="selected"</c:if>>已预定</option>
                            <option value="inuse" <c:if test="${place.placeStatus=='inuse' }"> selected="selected"</c:if>>使用中</option>
                        </select>
                    </li>
                    <li style="width:90px;">
                        <button name="searchBt" id="searchBt" type="submit" class="btn_search">查询</button>
                    </li>
                </ul>
            </div>
            </form>
            <!--内容列表样式-->
            <div class="table-responsive">
                <table class="table table-striped table-bordered table-hover" id="">
                    <thead>
                    <tr class="thead_tr the">
                        <th rowspan="1">场地识别号</th>
                        <th rowspan="1">场地名称</th>
                        <th rowspan="1">场地价格</th>
                        <th rowspan="1">场地介绍</th>
                        <th rowspan="1">场地状态</th>
                        <th rowspan="1">容纳人数</th>
                        <th rowspan="1">场地负责人</th>
                        <th colspan="1">联系电话</th>
                        <th rowspan="2">操作</th>
                    </tr>
                    </thead>
                    <tbody>
                    <c:forEach var="place" items="${pageData.smallList}">
                        <tr>
                            <td>${place.id}</td>
                            <td>${place.placeName}</td>
                            <td><a href="javascript:void(0)" class="Numberings">${place.price}/元/小时</a></td>
                            <td>${place.content}</td>
                            <td>${place.placeStatus}</td>
                            <td>${place.galleryful}</td>
                            <td>${place.principal}</td>
                            <td>${place.consultingTelephone}</td>
                            <td>
                                <a type="button" class="operation btn-info Order_form" href="${contextParam}/tPlace/reservePlace?placeId=${place.id}"
                                   title="预定">&nbsp;预&nbsp;&nbsp;&nbsp;&nbsp;定&nbsp;</a>
                                <a type="button" class="operation btn-warning cx_Inquiry" href="项目立项.html">下架场地</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
                <div class="page_style">
                    <%--<select name="" size="1">
                        <option value="1">10</option>
                        <option value="2">20</option>
                        <option value="3">30</option>
                    </select>--%>
                    <a href="${contextParam}/tPlace/selecPlaceList?pageNo=1" class="icon-step-backward page_btn"></a>
                    <a href="${contextParam}/tPlace/selecPlaceList?pageNo=${pageData.prePageIndex < 1? 1 : pageData.prePageIndex}"
                       class="icon-caret-left page_btn"></a>
                    第
                    ${pageData.curentPageIndex}
                    页，
                    共 ${pageData.pageCount} 页
                    <a href="${contextParam}/tPlace/selecPlaceList?pageNo=${pageData.nextPageIndex > pageData.pageCount ? pageData.pageCount : pageData.nextPageIndex}"
                       class=" icon-caret-right page_btn"></a>
                    <a href="${contextParam}/tPlace/selecPlaceList?pageNo=${pageData.pageCount}"
                       class="icon-step-forward page_btn"></a>
                </div>
            </div>
        </div>
    </div>
</div>
<script src="${contextParam}/static/assets/js/jquery.min.js"></script>
<script type="text/javascript">
    window.jQuery || document.write("<script src='${contextParam}/static/assets/js/jquery-2.0.3.min.js'>" + "<" + "/script>");
</script>
<script type="text/javascript">
    window.jQuery || document.write("<script src='${contextParam}/static/assets/js/jquery-1.10.2.min.js'>" + "<" + "/script>");
</script>
<![endif]-->
<script src="${contextParam}/static/assets/layer/layer.js" type="text/javascript"></script>
<script src="${contextParam}/static/assets/laydate/laydate.js" type="text/javascript"></script>
<script type="text/javascript">
    //弹出一个iframe层
    $('.Numberings').on('click', function () {
        layer.open({
            type: 2,
            title: '项目订单详细',
            maxmin: true,
            shadeClose: true, //点击遮罩关闭层
            area: ['900px', '400px'],
            content: '到期项目订单详细.html'
        });
    });
    //面包屑返回值
    var index = parent.layer.getFrameIndex(window.name);
    parent.layer.iframeAuto(index);
    $('.Order_form').on('click', function () {
        var cname = $(this).attr("title");
        parent.$('#parentIframe').html(cname);
        parent.$('#parentIframe').css("display", "inline-block");
        //parent.$('.Current_page').html("<a href=''>" +  + "</a>");
        parent.layer.close(index);
    });

</script>

</body>
</html>
