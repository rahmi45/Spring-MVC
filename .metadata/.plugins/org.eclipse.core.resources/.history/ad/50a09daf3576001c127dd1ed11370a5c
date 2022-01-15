<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Show data student</title>
</head>
<body>
<p>FirstName :  ${student.firstName}</p>
<p>LastName  :  ${student.lastName}</p>
<p>Age       :  ${student.age}</p>
<p>Email     :  ${student.email}</p>
<p>Code      :  ${student.code}</p>
<p>Country   :  ${student.country}</p>
<p>Language  :  ${student.language}</p>
<c:forEach var="profs" items="${student.professors}"></c:forEach>
<p>Professors:  
	<c:forEach var="profs" items="${student.professors}">${profs}</c:forEach>
</p>
</html>