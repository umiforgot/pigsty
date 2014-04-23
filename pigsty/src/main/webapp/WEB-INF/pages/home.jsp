<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Home page</title>
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"
        rel="stylesheet"  type="text/css" />
    <!-- <link href="/pigsty/resources/css/main.css" rel="stylesheet">-->
</head>
<body>
    <h1>Pigsty</h1>
    <ul class="nav nav-tabs">
      <li class="active"><a href="#">Home</a></li>
      <li><a href="${pageContext.request.contextPath}/home/add.html">
        Add your home!</a></li>
      <li><a href="${pageContext.request.contextPath}/home/list.html">
        Home List</a></li>
    </ul>
    

</body>
</html>