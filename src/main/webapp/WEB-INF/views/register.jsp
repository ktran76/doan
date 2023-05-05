
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/register" var="action" />
    <div class="main">
        <div class="contact">
            <div class="">
                <div class="">
                    <h2>Đăng ký thành viên</h2>
                </div>
                <ul class="">
                    <li>
                        <a href="mailto:minhkhoi.tran30@gmail.com"><i class="fas fa-envelope"></i>minhkhoi.tran30@gmail.com</a>
                    </li>
                    <li>
                        <a href="tel:+0966552906"><i class="fas fa-phone-square-alt"></i>0966552906</a>
                    </li>
                </ul>
            </div>
        </div>
        
        <div class="form_register">
            <div class="">
                <p>Dấu <span class="">*</span> là thông tin bắt buộc</p>
            </div>
            <form:form method="POST" action="${action}" modelAttribute="user" class="form" id="form-2" enctype="multipart/form-data">
                <c:if test="${errMsg != null}">
                    <div class="form-group">
                        <span cssClass="alert alert-danger">Tạo tài khoản không thành công!</span>
                    </div>
                </c:if>

                <form:errors path="fullname" cssClass="alert alert-danger" element="div"/>
                <div class="form-group">
                  <label for="fullname" class="form-label">Họ và tên</label>
                  <input id="fullname" name="fullname" path="fullname" type="text" placeholder="Hãy nhập họ và tên" class="form-control">
                  <span class="form-message"></span>
                </div>

                <form:errors path="username" cssClass="alert alert-danger" element="div"/>
                <div class="form-group">
                  <label for="username" class="form-label">Tài khoản</label>
                  <input id="username" name="username" path="username" type="text" placeholder="VD: minhkhoi123" class="form-control">
                  <span class="form-message"></span>
                </div>

                <form:errors path="password" cssClass="alert alert-danger" element="div"/>
                <div class="form-group">
                  <label for="password" class="form-label">Mật khẩu</label>
                  <input id="password" name="password" path="password"  type="password" placeholder="Nhập mật khẩu" class="form-control">
                  <span class="form-message"></span>
                </div>

                <form:errors path="confirm" cssClass="alert alert-danger" element="div"/>
                <div cssClass="alert alert-danger">${errMsg}</div>
                <div class="form-group">
                  <label for="confirm" class="form-label">Nhập lại mật khẩu</label>
                  <input id="confirm" name="confirm" path="confirm" type="password" placeholder="Nhập lại mật khẩu" class="form-control">
                  <span class="form-message"></span>
                </div>
                
                <form:errors path="email" cssClass="alert alert-danger" element="div"/> 
                <div class="form-group">
                  <label for="email" class="form-label">Email</label>
                  <input id="email" name="email" path="email"  type="email" placeholder="Nhập Email" class="form-control">
                  <span class="form-message"></span>
                </div>

                <form:errors path="phoneNumber" cssClass="alert alert-danger" element="div"/>
                <div class="form-group">
                  <label for="phoneNumber" class="form-label">Số điện thoại</label>
                  <input id="phoneNumber" name="phoneNumber" path="text"  type="phoneNumber" placeholder="Nhập số điện thoại" class="form-control">
                  <span class="form-message"></span>
                </div>

                <form:errors path="avatar" cssClass="alert alert-danger" element="div"/>
                <div class="form-group">
                  <label for="avatar" class="form-label">avatar</label>
                  <input id="avatar" name="avatar" path="avatar"  type="text" placeholder="avatar" class="form-control">
                  <span class="form-message"></span>
                </div>
    
                <div class="form-group">
                    <input type="submit" value="Đăng Ký" class="btn btn-danger"/>
                </div>
            </form:form>
        </div>
        
    </div>
