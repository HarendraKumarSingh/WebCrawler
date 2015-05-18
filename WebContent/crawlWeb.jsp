<%@ page contentType="text/html; charset=UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<title>Email Scraper</title>
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