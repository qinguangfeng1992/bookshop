<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title></title>
<link type="text/css" rel="stylesheet" href="../../css/style.css" />
	<script language="JavaScript" src="../../js/jquery-3.0.0.js"></script>
</head>
<body>
<div id="header" class="wrap">
	<div id="logo">合众艾特网上书城</div>
	<div id="navbar">
		<div class="userMenu">
			<ul>
				<li><a href="../bookindex">User首页</a></li>
				<li><a href="../toorderlist">我的订单</a></li>
				<li class="current"><a href="../hou/totoorderlist">购物车</a></li>
				<li><a href="#">注销</a></li>
			</ul>
		</div>
		<form method="get" name="search" action="">
			搜索：<input class="input-text" type="text" name="keywords" /><input class="input-btn" type="submit" name="submit" value="" />
		</form>
	</div>
</div>
<div id="content" class="wrap">
	<div class="list bookList">
		<form method="post" name="shoping" action="orderinr">
			<table>
				<tr class="title">
					<th class="view">图片预览</th>
					<th>书名</th>
					<th class="nums">数量</th>
					<th class="price">价格</th>
				</tr>
				<c:forEach items="${bookvohou}" var="ord">
				<tr>
					<td class="thumb"><img width="150px" src="${ord.bookurl}" /></td>
					<td class="title">${ord.bookname}<input type="hidden" name="bookid" value="${ord.bookid}"></td>
					<td>
						<input class="input-text suan" type="text" name="nums" title="${ord.bookprice}" value="${ord.count}"/>
					</td>
					<td>￥<span class="moylin" id="${ord.bookprice}${ord.count}">${ord.bookprice*ord.count}</span></td>
				</tr>
				</c:forEach>
			</table>
			<div class="button">
				<h4>总价：￥<span id="num">65.00</span>元</h4>
				<input type="hidden" id="num1" name="num" value=""/>
				<input class="input-chart" type="submit" name="submit" value="" />
			</div>
		</form>
	</div>
</div>
<div id="footer" class="wrap">
	合众艾特网上书城 &copy; 版权所有

</div>
</body>
<script>
	$(function () {
		mo();
	})
	function suan(date) {
		var i=$(date).parent();
		var td=$(i).next();
		var span= $(td).has('span')[0].lastChild;
		var value=date.value;
		var title=date.title;
		var s =title+value;
		var moylin=parseInt(value)*title;
		span.innerText=moylin;
		mo();
	}
	function mo() {
		var num=0;
		var a=$(".moylin")
		for(var i=0;i<a.length;i++){
			var int=a[i].innerText
			num+=parseInt(int);
		}
		$("#num").text(num);
		$("#num1").val(num);
		$(".suan").focusout(function () {
			suan(this);
		})
	}

</script>
</html>
