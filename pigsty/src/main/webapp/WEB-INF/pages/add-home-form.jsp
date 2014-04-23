<%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html>
<head>
<title>Add home page</title>
<link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"
        rel="stylesheet"  type="text/css" />
</head>
<body>
    <h1>Pigsty</h1>
    <ul class="nav nav-tabs">
      <li><a href="${pageContext.request.contextPath}/index.html">Home</a></li>
      <li class="active"><a href="${pageContext.request.contextPath}/home/add.html">
        Add your home!</a></li>
      <li><a href="${pageContext.request.contextPath}/home/list.html">
        Home List</a></li>
    </ul>
    
    <br>
    <h3>Add your home</h3>
    <br>
    
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

</body>
</html>