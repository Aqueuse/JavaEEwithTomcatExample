<!DOCTYPE html>
<head>
    <title>Welcome page</title>
</head>
<body>
<h1>Welcome page</h1>
<p>
    Hello, this is a simple JavaEE servlet example
</p>
<p>
    your backend (the WelcomeServlet class) send me <i>${text}</i><br>
    because you give it as a get parameter :
    <a href="http://localhost:8080/simpleExample/hello?message=${text}">http://localhost:8080/simpleExample/hello?message=${text})</a>.
</p>
</body>
</html>