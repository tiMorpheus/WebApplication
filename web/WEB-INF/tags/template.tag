<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/security/tags"  prefix="sec"%>
<%@ taglib uri="http://www.springframework.org/tags"  prefix="locale"%>
\

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transition//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="CONTENT-TYPE" content="text/html; charset=UTF-8">

    <link rel="stylesheet" href='<c:url value="/web/css/main.css" />'>
    <script src="<c:url value="/web/js/main.js" />"></script>
    <title>Document</title>
</head>
<body>
    <div class="" style="height: 100px; background-color: #abb231" ></div>
    <jsp:doBody />
</body>
</html>