<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
	<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Account</title>
<style type="text/css">
	.error 
	{
		color: red;
		font-weight: bold;
	}
</style>
</head>
<body>
	<f:form action="processMvcTags" modelAttribute="student">
		FirstName : <f:input path="firstName"/>
		<f:errors path="firstName" cssClass="error"/>
		<br>
		LastName  : <f:input path="lastName"/>
		<br>
		Age       : <f:input path="age"/>
		<f:errors path="age" cssClass="error"/>
		<br>
		Email     : <f:input path="email"/>
		<f:errors path="email" cssClass="error"/>
		<br>
		Code     : <f:input path="code"/>
		<f:errors path="code" cssClass="error"/>
		<br>
		Index Country     : <f:input path="indexCountry"/>
		<f:errors path="indexCountry" cssClass="error"/>
		<br>
		Country   :
		<f:select path="country">
			<f:options items="${student.countryOptions}"/>
<%-- 			<f:option value="Maroc" label="MAR"/> --%>
<%-- 			<f:option value="France" label="FRA"/> --%>
<%-- 			<f:option value="Tunisie" label="TUN"/> --%>
		</f:select>
		<br>
		Choose your language :
		<f:radiobutton path="language" value="Java"/>Java
		<f:radiobutton path="language" value="Php"/>Php
		<f:radiobutton path="language" value="C#"/>C#
		<f:radiobutton path="language" value="C++"/>C++
		<br>
		Professors : 
		<f:checkbox path="professors" value="PrfMaths"/>Prof.MATHS
		<f:checkbox path="professors" value="PrfAngl"/>Prof.ANGL
		<f:checkbox path="professors" value="PrfScience"/>Prof.SVT
		<br>
		<input type="submit" value="Done"/>
	</f:form>
</body>
</html>