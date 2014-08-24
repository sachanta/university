<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix='c' uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<head>
 <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
  
 <title>List of Students</title>
</head>
<html>
<body>
	<h1>List of Students:</h1>	

	 <c:forEach items="${studentList}" var="item" varStatus="loop">
        ${item} ${!loop.last ? '<BR> ' : ''}
    </c:forEach>
    
   <BR>    <BR>   <BR>   <BR><a href="/University/welcome">Home</a>
</body>
</html>