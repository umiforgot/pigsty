<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<?xml version="1.0" encoding="ISO-8859-1" ?>

<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<title>List of homes</title>
    <link href="http://netdna.bootstrapcdn.com/bootstrap/3.1.1/css/bootstrap.min.css"
        rel="stylesheet"  type="text/css" />
	</head>

	<body>
		<h1>Pigsty</h1>
        
        <ul class="nav nav-tabs">
            <li><a href="${pageContext.request.contextPath}/index.html">Home</a></li>
            <li><a href="${pageContext.request.contextPath}/home/add.html">
                Add your home!</a></li>
            <li class="active"><a href="${pageContext.request.contextPath}/home/list.html">
                Home List</a></li>
        </ul>
        
        
        <br>

        <ul class="list-groups">
            <c:forEach var="roommate" items="${roommates}">
                <li class="list-group-item">${roommate.firstName} ${roommate.lastName}</li>
            </c:forEach>
        </ul>
                
        
                