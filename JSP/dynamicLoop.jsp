<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Welcome Webpage</title>
</head>

<body>
<h1>Admin webpage</h1>

<p>Hello, there is ${fn:length(usernames)} users</p>

<c:forEach items="${ usernames }" var="item">
    <p>user name : <c:out value="${ item }" /></p>
</c:forEach>

</body>
</html>