<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container fluid">
    <div class="d-flex back-icon">
        <a href="/giangvien/submit">
            <i class="fa-solid fa-arrow-left"></i>
        </a>
    </div>
    <div class="d-flex align-items-center justify-content-end mb-2">
        <h5 class="mb-0 kl-title">Mã hội đồng</h5>
        <input type="text" placeholder="Nhập mã hội đồng">
    </div>
    <div class="row">
        <div class="col col-sm-6">
            <table>
                <tr>
                    <th>Mã giảng viên</th>
                </tr>
                <tr>
                    <td>
                        <textarea class="w-100" type="text" name="" id=""> </textarea>
                    </td>
                </tr>
            </table>
        </div>
        <div class="col col-sm-6">
            <h5 class="mb-2">
                Thông tin giảng viên
            </h5>
            <div class="mb-2">
                <p>12313</p>
            </div>
        </div>
    </div>
    <div class="row mt-5">
        <div class="col col-sm-6">
            <table>
                <tr>
                    <th>Mã khóa luận</th>
                </tr>
                <tr>
                    <td>
                        <textarea class="w-100" type="text" name="" id=""> </textarea>
                    </td>
                </tr>
            </table>
        </div>
        <div class="col col-sm-6">
            <h5 class="mb-2">
                Thông tin Khóa luận
            </h5>
            <div class="mb-2">
                <p>12313</p>
            </div>
        </div>
    </div>
    <div class="d-flex justify-content-end">
        <button class="btn btn-primary">Lưu</button>
    </div>
</div>