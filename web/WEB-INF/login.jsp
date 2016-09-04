<%@ taglib tagdir="/web/WEB-INF/tags" prefix="t" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="locale"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<t:template>
    <form action="/auth.htm" method="post">
        <input type="hidden" name="_spring_security_remember_me" value="true" />
        <div>
            <label>username</label>
            <input type="text" name="username" value="" placeholder="Your name" />
        </div>
        <div>
            <label>password</label>
            <input type="password" name="password" value="" />
        </div>
        <div>
            <input type="submit" name="login" value="Log in"/>
        </div>
    </form>
    <p>
        <c:if test="${param.error == 'invalidLoginPassword'}">
            Invalid login or password. Please check and try again.
        </c:if>
    </p>
    <p>
        <c:if test="${param.error == 'loginRequired'}">
            You are currently logged off. Please log in.
        </c:if>
    </p>

</t:template>