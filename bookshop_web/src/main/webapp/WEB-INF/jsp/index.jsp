<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/10/6
  Time: 16:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
  <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  <title></title>
  <link type="text/css" rel="stylesheet" href="css/style.css" />

</head>
<body>
<div id="header" class="wrap">
  <div id="logo">合众艾特网上书城</div>
  <div id="navbar">
    <div class="userMenu">
      <ul>
        <li class="current"><a href="#">用户：${user.username}</a></li>
        <li><a href="toorderlist">我的订单</a></li>
        <li><a href="hou/shoppingcart">购物车</a></li>
        <li><a href="logout">注销</a></li>
      </ul>
    </div>
    <form method="get" name="search" action="">
      搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
    </form>
  </div>
</div>
<div id="content" class="wrap">
  <div class="list bookList">
    <form method="post" name="shoping" action="hou/shoppingcart">
      <table>
        <tr class="title">
          <th class="checker"></th>
          <th>书名</th>
          <th class="price">价格</th>
          <th class="store">库存</th>
          <th class="store">作者</th>
          <th class="store">出版时间</th>
          <th class="store">图书类型</th>
          <th class="view">图片预览</th>
        </tr>
        <%-- EL表达式的地方--%>
<c:forEach items="${list.content}" var="slist">
        <tr>
          <td><input type="checkbox" name="bookid" value="${slist.bookid}" /></td>
          <td class="title">${slist.bookname}</td>
          <td>${slist.bookprice}</td>
          <td>${slist.bookstore}</td>
          <td>${slist.bookauthor}</td>
          <td>${slist.booktime}</td>
          <td>${slist.typename}</td>
          <td class="thumb" ><img width="150px" src="${slist.bookurl}" /></td>
        </tr>
</c:forEach>
      </table>

<%-- 分页--%>
      <div class="page-spliter">
        <a href="bookindex?page=${currpage-1}">&lt;&lt;</a>
        <a href="bookindex">首页</a>
        <c:forEach var="p" begin="0" end="${list.totalPages-1}">
        <a href="bookindex?page=${p}">${p+1}</a>
        </c:forEach>
        <span>...</span>
        <a href="bookindex?page=${list.totalPages-1}">尾页</a>
        <a href="bookindex?page=${currpage+1}">&gt;&gt;</a>
      </div>
      <div class="button"><input class="input-btn" type="submit" name="submit" value="" /></div>
    </form>
  </div>
</div>
<div id="footer" class="wrap">
  合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
<script src="../../js/jquery-3.0.0.js" type="text/javascript"></script>
<script>
  $(document).ready(function() {
 /*   $("table").attr("bgColor", "#222222"); //设置表格的背景颜色*/
    $("tr").attr("bgColor", "#FFFFFF"); //为单数行表格设置背景颜色
    $("tr:even").css("background-color", "#F4FAEE"); //为双数行表格设置背颜色素
  /*  $("table").css("width", "300px"); //为表格添加样式，设置表格长度为300像素*/
  });

</script>

