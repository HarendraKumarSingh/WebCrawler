<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
"http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>Email Extractor</title>
<style>
table,th,td {
	border: 1px solid black;
	border-collapse: collapse;
}

th,td {
	padding: 5px;
}

th {
	text-align: left;
}
</style>
</head>
<body>
	<h1>Email Extractor</h1>

	<form action="doCrawl">
		<label for="name">Enter the site url to be scrapped (for
			multiple inputs provide it with comma ',' separated)</label><br />
		<!-- <input type="text" name="urls" style="height: 25px; width: 400px" /> -->
		<textarea name="urls" rows="3" cols="80"> </textarea>
		<input type="submit" value="Start Crawling"
			width="117" height="78" />
	</form>

	<table style="width: 100%">
		<tr>
			<th>URL</th>
			<th>Email List</th>
		</tr>
		<s:iterator value="mailResponseArray">
			<tr>
				<td><s:property value="url" /></td>
				<td><s:property value="emailList" /></td>


			</tr>
		</s:iterator>
	</table>

</body>
</html>