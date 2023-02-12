<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@page import="userModel.Product"%>
    <%@page import="userController.ProductController" %>
    <%@page import="java.util.List" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Product List</title>
</head>
<body>
   
	<table border="1">
		<tr>
			<th>productId</th>
			<th>name</th>
			<th>price</th>
			<th>brand</th>
			<th>description</th>
			<th>specification</th>
			<th>ratingAndReview</th>
			<th>quantity</th>
			<th>images</th>
			<th>seller</th>
			<th>Add to Cart</th>
		</tr>
    <%
      List<Product> productList = (List<Product>)request.getAttribute("productList");
      for (Product product : productList) {
    %>
    <tr>
      <td><%= product.getProductId()%></td>
      <td><%= product.getName()%></td>
      <td><%= product.getPrice()%></td>
      <td><%= product.getBrand()%></td>
      <td><%= product.getDescription()%></td>
      <td><%= product.getSpecification()%></td>
      <td><%= product.getRatingAndReview()%></td>
      <td><%= product.getQuantity()%></td>
      <td><%= product.getImages()%></td>
      <td><%= product.getSeller()%></td>
      <td><form action="AddToCartController" method="post">
          <input type="text" name="productId" value="<%= product.getProductId()%>" value="hiddenValue">
          <input type="text" name="price" value="<%= product.getPrice()%>" value="hiddenValue">
          <input type="text" name="quantity" value="<%= product.getQuantity() %>" value="hiddenValue">
          <input type="submit" value="AddToCart">
         </form>
      </td>
    </tr>
    <%
      }
    %>
   
  </table>
</body>
</html>



<%--<title>Product List</title>
</head>
<body>
	<table border="1">
		<tr>
			<th>Product Name</th>
			<th>Price</th>
			<th>Add to Cart</th>
		</tr>
		<%
			ArrayList<Product> productList = new ArrayList<Product>();
			productList.add(new Product("Product 1", 10));
			productList.add(new Product("Product 2", 20));
			productList.add(new Product("Product 3", 30));
			productList.add(new Product("Product 4", 40));
			productList.add(new Product("Product 5", 50));
</body>
</html> --%>