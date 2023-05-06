<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<div class="container fluid">
    <div class="d-flex back-icon">
        <a href="/giangvien/submit">
            <i class="fa-solid fa-arrow-left"></i>
        </a>
    </div>
    <div class="d-flex align-items-center justify-content-end mb-2">
        <h5 class="mb-0 kl-title">Mã khóa luận</h5>
        <p class="mb-0">123</p>
    </div>
    <div class="d-flex align-items-center justify-content-end mb-2">
        <h5 class="mb-0 kl-title">Tên khóa luận</h5>
        <p class="mb-0">123</p>
    </div>
    <table>
        <tr>
            <th>Tiêu chí</th>
            <th>Điểm</th>
        </tr>
        <tr>
            <td>Alfreds Futterkiste</td>
            <td>
                <input type="text" name="" id="">
            </td>
        </tr>
    </table>

    <h5 class="my-2">Đánh giá</h5>
    <textarea id="w3review" name="w3review"
        style="max-width: 100%;width: 100%;">At w3schools.com you will learn how to make a website. They offer free tutorials in all web development technologies.</textarea>
    <div class="d-flex justify-content-end mt-2">
        <button type="submit" class="rounded-4 rounded form-btn text-white border-0 px-4 py-2">
            Gửi
        </button>
    </div>
</div>