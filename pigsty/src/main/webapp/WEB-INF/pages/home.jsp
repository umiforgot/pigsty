<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
    <title>Home page</title>
</head>
<body>
    <h1>Home page</h1>
    <p>
    ${message}<br/>
    <a href="${pageContext.request.contextPath}/home/add.html">Add new home</a><br/>
    <a href="${pageContext.request.contextPath}/home/list.html">home list</a><br/>
    </p>
    
    <form:form method="POST" commandName="home" action="${pageContext.request.contextPath}/home/add.html">
        <table>
        <tbody>
            <tr>
                <td>Name:</td>
                <td><form:input path="name" /></td>
            </tr>
            <tr>
                <td>Rating:</td>
                <td><form:input path="rating" /></td>
            </tr>
            <tr>
                <td><input type="submit" value="Add" /></td>
                <td></td>
            </tr>
        </tbody>
        </table>
    </form:form>
</body>
</html>