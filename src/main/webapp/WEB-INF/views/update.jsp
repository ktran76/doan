<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Update User</title>
</head>
<body>
    <div align="center">
        <h2>Update User</h2>
        <form:form action="update" method="post" modelAttribute="user">
            <table border="0" cellpadding="5">
                <tr>
                    <td>ID: </td>
                    <td>${user.id}
                        <form:hidden path="id"/>
                    </td>
                </tr>
                <tr>
                    <td>UserId: </td>
                    <td><form:input path="userId" /></td>
                </tr>
                <tr>
                    <td>Full Name: </td>
                    <td><form:input path="fullname" /></td>
                </tr>
                <tr>
                    <td>UserName: </td>
                    <td><form:input path="username" /></td>
                </tr>
                <tr>
                    <td>UserPassword: </td>
                    <td><form:input path="password" /></td>
                </tr>
                <tr>
                     <td>Email: </td>
                     <td><form:input path="email" /></td>
                </tr>
                <tr>
                     <td>PhoneNumber: </td>
                     <td><form:input path="phoneNumber" /></td>
                </tr>
                <tr>
                     <td>User-role: </td>
                     <td><form:input path="role" /></td>
                </tr>
                <tr>
                    <td colspan="2"><input type="submit" value="update"></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>
