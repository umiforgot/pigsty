<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Add home page</title>
</head>
<body>
    <h1>Add your home</h1>
    <form:form method="POST" commandName="home" action="${pageContext.request.contextPath}/home/add.html">
        <table>
            <tbody>
                <tr>
                    <td>Address:</td>
                    <td><form:input path="address" /></td>
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