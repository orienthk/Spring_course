<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/items/queryItems.action">查询测试</a><br><br>
<a href="${pageContext.request.contextPath }/items/editItems.action?id=1">正常测试</a><br><br>
<a href="${pageContext.request.contextPath }/items/editItems.action?id=8">异常测试</a><br><br>

</body>
</html>