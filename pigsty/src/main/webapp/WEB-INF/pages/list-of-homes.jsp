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
        
		<p>Here you can see the list of the homes, edit them, remove or update.</p>
        
        <br><h1>num of homes: ${homes.size()}</h1><br>
		
        <table border="1px" cellpadding="0" cellspacing="0" >
			<thead>
				<tr>
					<th width="10%">id</th>
                    <th width="15%">address</th>
                    <th width="10%">action</th>
				</tr>
			</thead>
			
			<tbody>
				<c:forEach var="home" items="${homes}">
				<tr>
					<td>${home.getId()}</td>
					<td>${home.getAddress()}</td>
					<td>
					<a href="${pageContext.request.contextPath}/home/edit/${home.id}.html">Edit</a><br/>
					<a href="${pageContext.request.contextPath}/home/delete/${home.id}.html">Delete</a><br/>
					</td>
				</tr>
				</c:forEach>
			</tbody>
		</table>

	</body>
</html>