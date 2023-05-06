<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>

<header id="header" class="main-header">
    <div class="d-flex align-items-center justify-content-between">
        <a href="#">
            <div class="image-header">
                <img src="<c:url value="/img/Logo.png" />" alt="OU">
            </div>
        </a>
        <a href="/logout" class="mr-5"><i class="fa-solid fa-white fa-right-from-bracket fa-2xl" color="white"></i></a>
    </div>

</header>