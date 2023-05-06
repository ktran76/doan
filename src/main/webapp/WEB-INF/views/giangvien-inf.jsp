<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/register" var="action" />
<div class="container">
    <div class="d-flex back-icon">
        <a href="/giangvien">
            <i class="fa-solid fa-arrow-left back-icon"></i>
        </a>
    </div>
    <div class="col col-6 p-5 bg-white mx-auto"
        style="border-radius: 28px !important; border: 2px solid blue !important">
        <div class="form_register">
            <h2>Thông tin giảng viên </h2>
            <form:form method="POST" action="${action}" modelAttribute="user" class="form" id="form-2"
                enctype="multipart/form-data">
                <c:if test="${errMsg != null}">
                    <div class="form-group">
                        <span cssClass="alert alert-danger" class="text-danger">Tạo tài khoản không thành công!</span>
                    </div>
                </c:if>

                <form:errors path="fullname" cssClass="alert alert-danger" element="div" />
                <div class="form-group">
                    <label for="fullname" class="form-label">Họ và tên</label>
                    <input id="fullname" name="fullname" path="fullname" type="text" placeholder="Hãy nhập họ và tên"
                        class="form-control">
                    <span class="form-message"></span>
                </div>

                <form:errors path="username" cssClass="alert alert-danger" element="div" />
                <div class="form-group">
                    <label for="username" class="form-label">Tài khoản</label>
                    <input id="username" name="username" path="username" type="text" placeholder="VD: minhkhoi123"
                        class="form-control">
                    <span class="form-message"></span>
                </div>

                <form:errors path="password" cssClass="alert alert-danger" element="div" />
                <div class="form-group">
                    <label for="password" class="form-label">Mật khẩu</label>
                    <input id="password" name="password" path="password" type="password" placeholder="Nhập mật khẩu"
                        class="form-control">
                    <span class="form-message"></span>
                </div>

                <form:errors path="confirm" cssClass="alert alert-danger" element="div" />
                <div cssClass="alert alert-danger">${errMsg}</div>
                <div class="form-group">
                    <label for="confirm" class="form-label">Nhập lại mật khẩu</label>
                    <input id="confirm" name="confirm" path="confirm" type="password" placeholder="Nhập lại mật khẩu"
                        class="form-control">
                    <span class="form-message"></span>
                </div>

                <form:errors path="email" cssClass="alert alert-danger" element="div" />
                <div class="form-group">
                    <label for="email" class="form-label">Email</label>
                    <input id="email" name="email" path="email" type="email" placeholder="Nhập Email"
                        class="form-control">
                    <span class="form-message"></span>
                </div>

                <form:errors path="phoneNumber" cssClass="alert alert-danger" element="div" />
                <div class="form-group">
                    <label for="phoneNumber" class="form-label">Số điện thoại</label>
                    <input id="phoneNumber" name="phoneNumber" path="text" type="phoneNumber"
                        placeholder="Nhập số điện thoại" class="form-control">
                    <span class="form-message"></span>
                </div>

                <form:errors path="avatar" cssClass="alert alert-danger" element="div" />
                <div class="form-group">
                    <label for="avatar" class="form-label">avatar</label>
                    <input id="avatar" name="avatar" path="avatar" type="file" class="form-control">
                    <span class="form-message"></span>
                </div>
                <div class="avatar-img mb-2">
                    <img class="" src="https://picsum.photos/id/237/200/300" alt="" draggable="false">
                </div>
                <div class="form-group">
                    <input type="submit" value="Lưu" disabled class="btn btn-danger" />
                </div>
                <!-- <div class="form-group">
                    <input type="submit" value="Lưu" class="btn btn-danger" />
                </div> -->
            </form:form>
        </div>
    </div>
</div>