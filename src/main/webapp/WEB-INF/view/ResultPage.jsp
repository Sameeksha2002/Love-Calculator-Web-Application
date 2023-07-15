<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
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
margin-bottom:0;
font-size:5rem;
text-align: center;
color: #fcfffa;
}
.heart{
font-size: 17rem;
margin:0 2rem;
padding:0; 

animation: pulse 1s ease infinite;
}
@keyframes pulse{
	0%{transform: scale(1);}
	50%{transform: scale(1.2);}
	100%{transform: scale(1);}
}

.container{
display: flex;
justify-content: center;
align-items: center;
}
.result{
position:relative;
left:12rem;
top:-11rem;
font-size: 2rem;
font-family: 'Quicksand', sans-serif;
color: #ffef00;
font-weight: bold;
}
.names{
font-family: 'Abril Fatface', cursive;
font-size:3rem;
text-align: center;
color: #a000c8;
}

.backToHome{
color:white;
font-family: 'Quicksand', sans-serif;
background-color: #ca5cdd;
transition: 0.8s;
text-decoration: none;
border-radius: 4px;
padding:0.5rem 2rem;
font-size: 1.5rem;
}
.backToHome:hover{
background-color: #a000c8;
}
</style>

</head>
<body>
<h1>Your love percentage is</h1>

<div class="container">
<div class="names">${userPlay.userName}</div>
<div>
<div class="heart">💗 </div><span class="result">${userPlay.result}%</span>
</div>
<div class="names"> ${userPlay.crushName}</div>
</div>

<p align="center">
<a href="/Spring-loveCalculator/" class="backToHome">Try With Another</a>
</p>
</body>
</html>