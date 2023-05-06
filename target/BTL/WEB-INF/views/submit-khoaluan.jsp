<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/login" var="action" />
<div class="container fluid">
    <div class="row w-100 ml-0 justify-content-center">
        <div class="col col-6 p-5 bg-white" style="border-radius: 28px !important; border: 2px solid blue !important">
            <div class="mb-2">
                <p class="email-title">Gửi Khóa Luận</p>
                <!-- <c:if test="${param.error != null}">
                    <p class="text-danger">Tài khoản hoặc mật khẩu của bạn không chính xác!</p>
                </c:if> -->
            </div>
            <form action="${action}" method="POST" class="form" id="form-2">
                <div class="form-group">
                    <label for="file" class="form-label">Khóa Luận</label>
                    <input id="file" type="file" class="form-control">
                    <span class="form-message"></span>
                </div>
                <div class="d-flex justify-content-end">
                    <button type="submit" class="rounded-4 rounded form-btn text-white border-0 px-4 py-2">
                       Nộp khóa luận
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>