<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/tags/taglibs.jsp"%>

<!DOCTYPE html>

<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
		<meta http-equiv="Content-Language" content="pt-br" />
		<meta http-equiv="Cache-Control" content="no-cache, no-store" />
		<meta http-equiv="Pragma" content="no-cache, no-store" />
		<meta http-equiv="expires" content="Mon, 06 Jan 1990 00:00:01 GMT" />
		<meta name="ROBOTS" content="NOINDEX, NOFOLLOW" />
		<meta name="Author" content="fauker" />
		
		<title><fmt:message key="system.name" /></title>
		
		<script src="${context}/resources/js/jquery-2.1.3.min.js"></script>
	</head>
	
	<body>
		<div>
                        <a href="${context}/j_spring_security_logout"> << Sair </a> <br />
                        <a href="${contextPage}/home">Home</a>
                        <br/>
                        
			<decorator:body />
		</div>
	</body>
</html>