<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>User Manager</title>
</head>
<body>
<div align="center">
    <h2>Chi tiet khoa luan</h2>

    <c:forEach items="${list}" var="list">
        <div>Mã khoá luận: ${list.khoaLuanId}</div>
        <div>Tên khoá luận: ${list.tenKhoaLuan}</div>
        <div>Tên sinh viên: ${list.userId}</div>
        <div>Tên sinh viên: ${list.fullname}</div>
    </c:forEach>
</div>
</body>
</html>