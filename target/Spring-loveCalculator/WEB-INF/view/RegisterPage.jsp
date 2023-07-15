<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
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
font-size:4rem;
color: #33000d;
letter-spacing: 0.2rem;
text-align: center;
margin-top: 3rem;
}
#formBox{
display:flex;
justify-content:center;
margin-bottom: 2rem;
align-items:center;
}
form{
color: #fcfffa;
font-size:1.5rem;
font-family: 'Quicksand', sans-serif;
}
input, select, checkbox, radiobutton{

color: #fcfffa;
font-size:1rem;
padding:0.5rem;
background-color:rgba(190, 190, 190, 0.2);
border: 2px solid #fcfffa;
border-radius: 8px;
}
input[type=submit]:hover{
background-color: blue;

}
.fields1{
width:100%;
}
#formBox  div{
margin: 1rem 0;
}

</style>
</head>
<body>
<h1>Please Register Here</h1>

<div id="formBox" >
<form:form method="get" action="registerSucess" modelAttribute="userInfo" >
<div >
User 
<br><form:input path="user" class="fields1"/>
</div>
<div >
UserName
<br><form:input path="userName" class="fields1"/>
<!--<form:errors path="userName" /> -->
</div>
<div >
Password
<br><form:password path="password" class="fields1"/>
</div>
<div >
Country
<br> 
<form:select path="countryName">
<form:option value="India" label="India"/>
<form:option value="USA" label="USA"/>
<form:option value="Canada" label="Canada"/>
<form:option value="Nepal" label="Nepal"/>
<form:option value="UK" label="UK"/>
</form:select>
</div>
<div >
Hobbies<br>
 <form:checkbox value="cricket" path="userHobbies"/>Cricket
<form:checkbox value="reading" path="userHobbies"/>Reading
<form:checkbox value="traveling" path="userHobbies"/>Traveling
<form:checkbox value="programming" path="userHobbies"/>Programming
</div>
<div >
Gender
Male: <form:radiobutton value="male" path="userGender"/>
Female: <form:radiobutton value="female" path="userGender"/>
</div>


 <input type="submit" value="Register" class="fields1"/> 

</form:form>
</div>
</body>
</html>