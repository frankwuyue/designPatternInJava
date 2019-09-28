<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>

<html>
<head>
	<title>Customer Confirmation</title>
</head>

<body>
	
	The customer is confirmed: ${ customer.firstName } ${ customer.lastName }
	
	<br><br>
	
	The free passes: ${ customer.freePasses }
	
	<br><br>

	The postal code: ${ customer.postCode }

	<br><br>
	
	The course code: ${ customer.courseCode }

	<br><br>
	
</body>


</html>