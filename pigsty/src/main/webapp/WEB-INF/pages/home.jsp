<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Home page</title>
    <link rel="stylesheet" href="//netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css">
        <!-- <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet"> -->
</head>
<body>
    <h1>Home page</h1>
    <div class="navbar">
      <div class="navbar-inner">
        <a class="brand" href="#">Pigsty</a>
        <ul class="nav">
          <li class="active"><a href="${pageContext.request.contextPath}/index.html">Home</a></li>
          <li><a href="#">Link</a></li>
          <li><a href="#">Link</a></li>
        </ul>
      </div>
    </div>
    <p>
        ${message}<br/><br><br>
        <a href="${pageContext.request.contextPath}/home/add.html">Add new home</a><br/>
        <a href="${pageContext.request.contextPath}/home/list.html">home list</a><br/>
    </p>
    

</body>
</html>