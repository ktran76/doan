<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>New Customer</title>
</head>
<body>
    <div align="center">
        <h2>New Customer</h2>
        <form:form action="save" method="post" modelAttribute="user">
            <table border="0" cellpadding="5">
                <tr>
                    <td>UserId: </td>
                    <td><form:input path="userId" /></td>
                </tr>
                <tr>
                    <td>UserName: </td>
                    <td><form:input path="userName" /></td>
                </tr>
                <tr>
                    <td>UserPassword: </td>
                    <td><form:input path="userPassword" /></td>
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
                    <td colspan="3" cell-padding="2"><input type="submit" value="Save"></td>
                </tr>
            </table>
        </form:form>
    </div>
</body>
</html>