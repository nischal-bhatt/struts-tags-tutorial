<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>registration form</title>
<s:head />
</head>
<body bgcolor="blue">
	<h2>registation form</h2>
	<s:form action="registerAction">

		<s:textfield name="firstName" label="First Name" />
		<s:textfield name="lastName" label="Last Name" />
		<s:radio name="gender" list="{'Male','Female'}" label="Gender" />
		<s:textfield name="age" label="Age" />
		<s:textfield name="email" label="Email" />
		<s:textarea name="address" cols="30" rows="7" label="Address" />
		<!--   <s:select multiple="true" list="{'blue','red','green','white'}" name= "selectedColor" headerKey="None" headerValue="Select a color" label="Favourite Color"/> -->
		<s:select list="colors" name="selectedColor" headerKey="None"
			headerValue="Select a color" label="Favourite Color" />
		<s:checkbox name="subscription" value="true"
			label="subscribe to our newsletter" />
		<s:checkboxlist list="hobbies" name="selectedHobbies" label="hobbiez" />
		<s:reset value="Reset" />
		<s:submit value="Register" />
		<!--  <s:property value="#user.firstName"/> -->
		<!--  if user is an object  -->

	</s:form>

	<table border="1" width="300">

		<tr>
			<th>id</th>
			<th>name</th>
			<th>price</th>
		</tr>

		<s:iterator value="products" var="product">
			<tr>
				<td><s:property value="#product.productId" /></td>
				<td><s:property value="#product.productName" /></td>
				<td><s:property value="#product.productPrice" /></td>
			</tr>
		</s:iterator>

	</table>


</body>
</html>