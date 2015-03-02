<%@ include file="/WEB-INF/tags/taglibs.jsp" %>

<script type="text/javascript">

	function submitForm() {
		$("#btnSubmit").attr("disabled", "disabled");
		$("#loadGif").show();
		$("#newsForm").submit();
	}

</script>

<form:form id="newsForm" action="${contextPage}/news/save" method="POST" modelAttribute="newsForm">

	Título <br />	<input type="text" name="title" size="50"> <br />
	Notífica <br /> <textarea cols="50" rows="5" name="description"></textarea> <br />

	<br />
	
	<img id="loadGif" src="${context}/resources/images/ajax-loader.gif" style="display: none">
	
	<input id="btnSubmit" type="button" value="Postar" onclick="submitForm();">
	
	<br /> <br />
	
	<c:forEach items="${news}" var="news">
		<a href="${contextPage}/comment/news/${news.id}">${news.title}</a> <br/>
	</c:forEach>
	
	<ensalamento:paginator pageCount="${pageCount}" action="${contextPage}/news/" />	
	
</form:form>