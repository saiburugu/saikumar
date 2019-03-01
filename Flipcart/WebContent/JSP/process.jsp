<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Continue to checkout</title>
</head>
<body>
<table cellpadding="10" cellspacing="10" border="10">
		<tr>
			
			<th>Name</th>
			<th>Price</th>
			<th>Buy</th>
		</tr>
		<c:forEach var="product" items="${products }">
			<tr>
				
				<td>${product.name }</td>
				<td>
					<img src="${pageContext.request.contextPath }${product.photo }" width="200">
				</td>
				<td>${product.price }</td>
				<td align="center">
					<a href="../Checkout.jsp">Continue</a>
				</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>