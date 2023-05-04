<%--
    Document   : register
    Created on : Sep 24, 2021, 9:10:49 PM
    Author     : CaoNgocCuong
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/register" var="action" />


<div class="book-tour-wrap">
    <div class="container book-tour">
        <div class="row">
            <div class="col col-lg-5">
                <div class="book-tour__contact">
                    <div class="book-tour__title">
                        <h3>Cùng trải nghiệm với chúng tôi trong những hành trình tuyệt vời nhất ❤️</h3>
                    </div>
                    <div class="book-tour__type">
                        <h2>Đăng ký thành viên</h2>
                    </div>
                    <ul class="book-tour__list">
                        <li>
                            <a href="mailto:minhkhoi.tran30@gmail.com"><i class="fas fa-envelope"></i>minhkhoi.tran30@gmail.com</a>
                        </li>
                        <li>
                            <a href="tel:+0966552906"><i class="fas fa-phone-square-alt"></i>0966552906</a>
                        </li>
                    </ul>
                    <div class="book-tour__img">
                        <img src="<c:url value="/img/booktour-bg.jpg"/>" alt="book-tour">
                    </div>
                </div>
            </div>
            <div class="col col-lg-7">
                <div class="book-tour__content auth__content">
                    <div class="tour-required">
                        <p>Dấu <span class="book-required">*</span> là thông tin bắt buộc</p>
                    </div>
                    <c:if test="${errMsg != null}">
                        <div class="form-group">
                            <span class="form-message-login">Đăng ký không thành công ${errMsg}</span>
                        </div>
                    </c:if>
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
            </div>
        </div>
    </div>
</div>