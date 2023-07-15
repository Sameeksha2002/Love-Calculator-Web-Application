<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<style>
@import url('https://fonts.googleapis.com/css2?family=Abril+Fatface&family=Quicksand&display=swap');

*{
magin:0;
padding:0;
}
body{
background: rgb(255,194,209);
background: radial-gradient(circle, rgba(255,194,209,1) 0%, rgba(255,179,198,1) 22%, rgba(255,132,214,1) 100%);
}
h1{
font-family: 'Abril Fatface', cursive;
letter-spacing: 0.2rem;
margin-top:7rem;
font-size:5rem;
text-align: center;
color: #fcfffa;
}
a{
font-size: 1.5rem;
}
form{
color: #fcfffa;
font-size:2rem;
font-family: 'Quicksand', sans-serif;
}
input{
color: #fcfffa;
font-size:1rem;
padding:0.5rem;
background-color:rgba(190, 190, 190, 0.2);
border: 2px solid #fcfffa;
 -webkit-transition: 0.5s;
  transition: 0.5s;
border-radius: 8px;
}
input:focus{
broder:2px solid green;
}
#submitButton{
 padding: 1rem 1.5rem;
font-size: 2rem;
color: #ff007f;
background-color:rgba(256, 256, 256, 0.2);
border: 0.15rem solid #ff007f;
border-radius: 4px; 
cursor:pointer;
transition: 0.7s;

}
#submitButton:hover{
background-color : yellow;
}
</style>
<!--  THIS IS CLIENT SIDE FORM VALIDATION
<script type="text/javascript">
function userValid(){
	var user = document.getElementById("yn").value;
	if(user.length <= 1){
		return false;
	}else{
		return true;
	}
}
</script>
 -->
<body>
<h1>Love Calculator</h1>

<!-- ADDING onSubmit="return userValid()"  ATTRIBUTE TO CLIENT SIDE VALIDATION-->

<form:form action="ResultPage" method="get" modelAttribute="userInfo" >
<div align="center">
<p>
<label for="yn">Your Name: </label> 
<form:input  id="yn" path="userName"/>
<form:errors path="userName"/>
</p>

<p>
<label for="cn" >Crush Name: </label> 
<form:input  id="cn"  path="crushName"/>
</p>
<br/>
<input type="submit" value="Calculate" id="submitButton"/>
</div>
</form:form>

<br>
<br>
<p align="center">
<a href="/Spring-loveCalculator/register">Register Yourself </a>
</p>


</body>
</html>