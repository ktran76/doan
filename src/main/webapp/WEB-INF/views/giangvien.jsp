<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/login" var="action" />
<div class="container fluid">
    <p class="mb-3 text-title-sv">TIện ích sinh viên</p>
    <div class="row w-100 ml-0 justify-content-center">
        <div class="col col-4">
            <a class="text-decoration-none" href="/giangvien/submit">
                <div class="boxs justify-content-center p-4 align-items-center bg-white d-flex"
                    style="border-radius: 28px !important; border: 2px solid blue !important">
                    <div class="img-home mr-3">
                        <img src="https://ou.edu.vn/wp-content/uploads/2016/10/Dien-dan-hoc-tap.gif" alt="">
                    </div>
                    <h5 class="mb-0">Nộp khóa luận</h5>
                </div>
            </a>
        </div>
        <div class="col col-4">
            <a class="text-decoration-none" href="/giangvien/thongtin">
                <div class="boxs justify-content-center p-4 align-items-center bg-white d-flex"
                    style="border-radius: 28px !important; border: 2px solid blue !important">
                    <div class="img-home mr-3">
                        <img src="https://ou.edu.vn/wp-content/uploads/2016/10/Dich-vu-Sinh-vien-Online.gif" alt="">
                    </div>
                    <h5 class="mb-0">Thông tin sinh viên</h5>
                </div>
            </a>
        </div>
        <div class="col col-4">
            <a class="text-decoration-none" href="/giangvien/hoidong">
                <div class="boxs justify-content-center p-4 align-items-center bg-white d-flex"
                    style="border-radius: 28px !important; border: 2px solid blue !important">
                    <div class="img-home mr-3">
                        <img src="https://ou.edu.vn/wp-content/uploads/2016/10/Tham-tra-bang.gif" alt="">
                    </div>
                    <h5 class="mb-0">Thông tin khóa luận</h5>
                </div>
            </a>
        </div>
    </div>
</div>