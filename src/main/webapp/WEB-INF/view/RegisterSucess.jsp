<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Registration successful</h1>
<ul>

<li>UserName: ${userInfo.userName }</li>
<li>Password: ${userInfo.password }</li>
<li>Country: ${userInfo.countryName }</li>
<li>Hobbies: ${userInfo.userHobbies }</li>
<li>Gender: ${userInfo.userGender }</li>
<li>email: ${userInfo.communicationDTO.email }</li>
<li>phoneNo: ${userInfo.communicationDTO.phone}</li>
</ul>
</body>
</html>