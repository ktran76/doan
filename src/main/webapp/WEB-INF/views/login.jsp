<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/login" var="action" />
<div class="">
    <div class="">
        <div class="">
            <div class="">
                <div class="">
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
            <div class="">
                <div class="">
                    <div class="">
                        <p>Dấu <span class="">*</span> là thông tin bắt buộc</p>
                    </div>
                    <form action="${action}" method="POST" class="form" id="form-2">
                        <c:if test="${param.error != null}">
                            <div class="form-group">
                                <span class="form-message-login">Tài khoản hoặc mật khẩu của bạn không chính xác!</span>
                            </div>
                        </c:if>
                        <div class="form-group">
                          <label for="username" class="form-label">Tài khoản</label>
                          <input id="username" name="username" path="username" type="text" placeholder="VD: minhkhoi123" class="form-control">
                          <span class="form-message"></span>
                        </div>

                        <div class="form-group">
                          <label for="password" class="form-label">Mật khẩu</label>
                          <input id="password" name="password" path="password"  type="password" placeholder="Nhập mật khẩu" class="form-control">
                          <span class="form-message"></span>
                        </div>
                        <div class="forgot-password">
                          <a href="./management.html">Quên mật khẩu?</a>
                        </div>
                        <button type="submit" class="form-submit">Đăng nhập</button>
                        <div class="form-extends">
                            <p>Bạn chưa có tài khoản? Hãy <a href="<c:url value="/register" />">đăng ký</a> ngay!</p>
                        </div>
                      </form>
                </div>
            </div>
        </div>
    </div>
</div>