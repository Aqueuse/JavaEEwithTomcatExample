<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<html>
<head>
    <title>Admin Webpage</title>
</head>

<body>
<h1>Admin webpage</h1>

<p>Hello, there is ${fn:length(usernames)} users</p>
</body>
</html>