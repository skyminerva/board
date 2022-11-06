<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html>
<html>
<head> 
<meta charset="UTF-8">
<meta http-equiv="X-UA-Compatible" content="ie=edge">
<title>게시판리스트</title>

<style>
table {
	width: 80%;
	border: 1px solid #444444;
	border-collapse: collapse;
}
th {
	border: 1px solid #444444;
	background-color: #eee;
}
td {
	border: 1px solid #444444;
	padding: 10px;
}
</style>

</head>
<body>  
	<div style="text-align:center">
		<h1>내맘대로 게시판</h1>
		<br/><br/><br/>
		
		<table align="center">
		<div style="text-align:right; width: 89.5%;">
			<input type="button" value="게시물 등록" onclick="location.href='/board/insert'">
			<br/><br/>
		</div>
		<thead>
			<tr>
				<th >게시판ID</th>
				<th>제목</th>
				<th>작성자</th>
				<th>생년월일</th>
				<th>성별</th>
				<th>등록일</th>
				<th>수정일</th>
			</tr>
			</thead>
			<!-- 게시글 리스트 -->
			<c:forEach var="board" items="${boardList}">
				<tr >
					<td width="10%">${boardVo.boardId}</td>
					<td width="30%">${boardVo.boardId}">${boardVo.title}</td>
					<td width="10%">${boardVo.userName}</td>
					<td width="9%"><fmt:formatDate pattern="yyyy-MM-dd" value="${boardVo.birth}"/></td>
					<td width="9%">${boardVo.gender}</td>
					<td width="15%"><fmt:formatDate pattern="yyyy-MM-dd" value="${boardVo.createDate}" /></td>
					<td width="15%"><fmt:formatDate pattern="yyyy-MM-dd" value="${boardVo.updateDate }" /></td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>