<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>


          Winning Numbers:
	<c:forEach items="${listOfNums}" var="ball">
		${ball.number}<br />
	</c:forEach>
	




	<%-- <table border="0">
		<tr>
			<th>numBalls</th>
			<th>maxNum</th>
			<th>Lottery Numbers</th>
	
		</tr>
		<tr>
			<td>${ball.number}</td>
			<td>${ball.range}</td>
			<td>
				<fmt:formatNumber value="${stock.price}" 
				                  type="currency" />
			</td>


		</tr>
	</table> --%>
</body>
</html>