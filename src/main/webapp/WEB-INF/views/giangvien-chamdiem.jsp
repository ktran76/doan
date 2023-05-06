<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<c:url value="/submit" var="action" />
<div class="container fluid">
    <div class="d-flex back-icon">
        <a href="/giangvien">
            <i class="fa-solid fa-arrow-left back-icon"></i>
        </a>
    </div>
    <table>
        <tr>
            <th>Mã khóa luận</th>
            <th>Tên khóa luận</th>
            <th>Ngày nộp</th>
            <th></th>
        </tr>
        <tr>
            <td>Alfreds Futterkiste</td>
            <td>Maria Anders</td>
            <td>Germany</td>
            <td>
                <a style="color: black;" href="/giangvien/chamdiem">...</a>
            </td>
        </tr>
    </table>
</div>