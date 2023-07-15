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
margin: 1.4rem 0;
}

#formBox{
display:flex;
justify-content:center;
margin-bottom: 2rem;
align-items:center;
}

form{
width: 50%;
color: #fcfffa;
font-size:1.5rem;
font-family: 'Quicksand', sans-serif;
display: flex;
flex-direction: column;

}
input, select, checkbox, radiobutton{

color: #fcfffa;
font-size:1rem;
padding:0.5rem;
background-color:rgba(190, 190, 190, 0.2);
border: 2px solid #fcfffa;
border-radius: 8px;
}

.fields1{
width:96%;
}
#formBox  div{
margin: 0.5rem 0;
}
#sub{
background-color: #ca5cdd;
transition: 0.8s;
border:none;
font-size:1.4rem;
width:100%;
margin-top: 1.5rem;
}

#sub:hover{
background-color: #a000c8;

}
.opt{
float:right;
width: 48%;
margin:0;
text-align: center;
}
.errors{
color: red;
position: fixed;
font-size: 1.5rem;
margin: 0rem 0 0 1.5rem;
}
option{
background-color:rgba(190, 190, 190, 0.2);
}
.hobbies , .gender , .communication{
display: flex;
justify-content: space-around;
padding: 0.5rem;
}
fieldset {
border:1px dotted #fcfffa;
border-radius: 8px;
}
</style>
</head>
<body>
<h1>Please Register Here</h1>

<div id="formBox" >  
  <form:form method="get" action="registerSucess" modelAttribute="userInfo" >
    <div>
        <label>UserName</label>
        <br>
        <form:input path="userName" class="fields1"/>
              <form:errors path="userName" class="errors"/>
    </div>
    <div>
        <label>Password</label>
        <br>
        <form:password path="password" class="fields1"/>
              <form:errors path="password" class="errors"/>
	</div>
	<div>
	<label>Country</label>
		<form:select path="countryName" class="opt" >
			<form:option value="India" label="India"/>
			<form:option value="USA" label="USA"/>
			<form:option value="Canada" label="Canada"/>
			<form:option value="Nepal" label="Nepal"/>
			<form:option value="UK" label="UK"/>
		</form:select>
	</div>
	<fieldset class="hobbies">
		<legend>Hobbies</legend>
			<label><form:checkbox value="cricket" path="userHobbies" />Cricket</label>
			<label><form:checkbox value="reading" path="userHobbies"/>Reading</label>
			<label><form:checkbox value="traveling" path="userHobbies" />Traveling</label>
			<label><form:checkbox value="programming" path="userHobbies"/>Programming</label>
	</fieldset>
	<fieldset class="gender">
		<legend>Gender</legend>			
				<label>Male: <form:radiobutton value="male" path="userGender" style="margin-right :2rem"/></label>
				<label>Female: <form:radiobutton value="female" path="userGender"/></label>
	</fieldset>
	<fieldset class="communication">
		<legend>Communication</legend>
			<label>Email  <form:input path="communicationDTO.email"/></label>
			<label>phone  <form:input path="communicationDTO.phone"/></label>
	</fieldset>

 	<input type="submit" value="Register" id="sub"/> 

 </form:form>
</div> 

</body>
</html>