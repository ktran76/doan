<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/login" var="action" />
<div class="container fluid">
  <div class="row w-100 ml-0 justify-content-center">
    <div class="col col-6 p-5 bg-white" style="border-radius: 28px !important; border: 2px solid blue !important">
      <div class="mb-2">
        <p class="text-danger">Dấu * là thông tin bắt buộc</p>
        <c:if test="${param.error != null}">
          <p class="text-danger">Tài khoản hoặc mật khẩu của bạn không chính xác!</p>
        </c:if>
      </div>
      <form action="${action}" method="POST" class="form" id="form-2">
        <div class="form-group">
          <label for="username" class="form-label">Tài khoản</label>
          <input id="username" name="username" path="username" type="text" placeholder="VD: minhkhoi123"
            class="form-control">
          <span class="form-message"></span>
        </div>

        <div class="form-group">
          <label for="password" class="form-label">Mật khẩu</label>
          <input id="password" name="password" path="password" type="password" placeholder="Nhập mật khẩu"
            class="form-control">
          <span class="form-message"></span>
        </div>
        <div class="d-flex justify-content-end">
          <button type="submit" class="rounded-4 rounded form-btn text-white border-0 px-4 py-2">Đăng nhập</button>
        </div>
        <div class="mt-2">
          <p>Bạn chưa có tài khoản? Hãy <a href="<c:url value="/register" />">đăng ký</a> ngay!</p>
          <c:if test="${param.error != null}">
            <a href="/reset-password" class="text-danger text-decoration-none">
              Quên mật khẩu?
            </a>
          </c:if>
        </div>
      </form>
    </div>
  </div>
</div>