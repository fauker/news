<%@ include file="/WEB-INF/tags/taglibs.jsp" %>

<form:form action="${contextPage}/comment/save/news/${news.id}" method="POST" modelAttribute="comment">

 	Autor: ${news.author}, ${news.dateCreated}
 	
 	<br /> <br /> ${news.description} <br /> <br />
 	
 	<textarea cols="50" rows="5" name="content"></textarea> <br />
 	
 	<input type="submit" value="Comentar">
 	
 	<br /> <br />
 	
 	Comentários 
 	
 	<hr />
 	
 	<c:forEach items="${comments}" var="comment">
 		<span style="color: blue">${comment.dateCreated}</span> - ${comment.content} <br />
 	</c:forEach>

</form:form>