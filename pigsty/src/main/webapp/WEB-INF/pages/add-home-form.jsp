<html>
<head>
<title>Add home page</title>
</head>
<body>
    <h1>Add your home</h1>
    <form:form method="POST" commandName="team" action="${pageContext.request.contextPath}/team/add.html">
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

    <p><a href="${pageContext.request.contextPath}/index.html">Home page</a></p>
</body>
</html>