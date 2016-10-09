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
				<li><a href="index">用户：${user.username}</a></li>
				<li class="current"><a href="toorderlist">我的订单</a></li>
				<li><a href="hou/totoorderlist">购物车</a></li>
				<li><a href="logout">注销</a></li>
			</ul>
		</div>
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="list orderList">
			<table>
				<tr class="title">
					<th class="orderId">订单编号</th>
					<th>订单商品</th>
					<th class="userName">收货人</th>
					<th class="price">订单金额</th>
					<th class="createTime">下单时间</th>
					<th class="status">订单状态</th>
				</tr>
			<c:forEach items="${olist}" var="order">
				<tr>
					<td style="text-align: left">${order.orderid}</td>
					<td class="thumb">
						<c:forEach items="${order.bookjihe}" var="bookurl">
					<img height="100px" src="${bookurl.bookurl}" alt=""/>
						</c:forEach>
					</td>
					<td>${sessionScope.user.username}</td>
					<td>￥${order.orderprice}</td>
					<td>${order.ordertime}</td>
					<td>${order.orderstatu}</td>
				</tr>
			</c:forEach>
			</table>
		<%-- 分页--%>
		<div class="page-spliter">
			<a href="toorderlist?page=${currpage-1}">&lt;&lt;</a>
			<a href="toorderlist">首页</a>
			<c:forEach var="p" begin="0" end="${pages.totalPages-1}">
				<a href="toorderlist?page=${p}">${p+1}</a>
			</c:forEach>
			<a href="toorderlist?page=${pages.totalPages-1}">尾页</a>
			<a href="toorderlist?page=${currpage+1}">&gt;&gt;</a>
		</div>
		<%--<div class="page-spliter">
			<a href="#">&lt;&lt;</a>
			<a href="#">首页</a>
			<c:forEach var="p" begin="0" end="5">
			<a href="#">p</a>
			</c:forEach>
			<span>...</span>
			<a href="#">尾页</a>
			<a href="#">&gt;&gt;</a>
		</div>--%>
			<div class="button"><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /><input class="input-gray" type="submit" name="submit" value="查看一个月前的订单" /></div>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
</html>
