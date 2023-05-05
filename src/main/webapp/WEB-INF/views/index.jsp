<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>User Manager</title>
</head>
<body>
<div align="center">
    <h2>Customer Manager</h2>
    <form method="get" action="search">
        <input type="text" name="keyword" />
        <input type="submit" value="Search" />
    </form>
    <h3><a href="/quanlykhoaluan/register">New User</a></h3>
    <table border="1" cell-padding="5">
        <tr>
            <th>UserId</th>
            <th>Full Name</th>
            <th>Username</th>
            <th>Password</th>
            <th>E-mail</th>
            <th>Address</th>
            <th>User-role</th>
            <th>Created Date</th>
            <th>Action</th>
        </tr>
        <c:forEach items="${listUser}" var="user">
        <tr>
            <td>${user.userId}</td>
            <td>${user.fullname}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.email}</td>
            <td>${user.phoneNumber}</td>
            <td>${user.role}</td>
            <td>${user.createdDate}</td>
            <td>
                <a href="/quanlykhoaluan/update?id=${user.id}">Update</a>
                <a href="/quanlykhoaluan/delete?id=${user.id}">Delete</a>
            </td>
        </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>