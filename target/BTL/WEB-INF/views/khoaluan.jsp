<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>


<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01
    Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>User Manager</title>
</head>

<body>
    <div class="container">
        <div class="d-flex back-icon">
            <a href="/sinhvien">
                <i class="fa-solid fa-arrow-left back-icon"></i>
            </a>
        </div>
        <div class="d-flex align-items-center justify-content-center">
            <h2 style="border-bottom: 1.5px solid black;" class="pb-2 mb-4">Chi tiết khóa luận</h2>
        </div>
        <div class="d-flex mb-2 align-items-center">
            <h5 class="kl-title">Mã khóa luận: </h5>
            <p>123</p>
        </div>
        <div class="d-flex mb-2 align-items-center">
            <h5 class="kl-title">Tên khóa luận: </h5>
            <p>123</p>
        </div>
        <div class="d-flex mb-2 align-items-start">
            <h5 class="kl-title">Tên giảng viên: </h5>
            <div>
                <p>123</p>
                <p>123</p>
                <p>123</p>
            </div>
        </div>
        <table>
            <tr>
                <th>Tên sinh viên</th>
                <th>Email sinh viên</th>
                <th>SĐT sinh viên</th>
                <th>Ngày nộp</th>
            </tr>
            <tr>
                <td>Alfreds Futterkiste</td>
                <td>Maria Anders</td>
                <td>Germany</td>
                <td>Germany</td>
            </tr>
        </table>
        <div class="mt-5">
            <h2 class="text-center">Đánh giá giảng viên</h2>
            <div class="p-4 bg-white" style="border-radius: 4px !important; border: 2px solid #dddddd !important">
                <p class="mb-0" style="font-size: 16px; font-weight: 600; color: black;">Tên giảng viên</p>
                <p class="mb-0" style="font-size: 14px; font-weight: 600; color: gray;">Ngày đánh giá</p>
                <p class="mb-0">Nội dung</p>
            </div>
        </div>
    </div>
</body>

</html>