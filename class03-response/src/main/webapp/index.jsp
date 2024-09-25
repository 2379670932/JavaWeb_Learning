<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>响应不同类型的资源文件</title>
  <style>
    ul li{
      list-style: none;
      float: left;
      margin-top:40px ;
    }
    ul li a{
      padding: 20px 50px;
      height: 40px;
      background-color: blue;
      color: aquamarine;
      box-sizing: border-box;
      margin-right: 10px;
      font-size: 16px;
      text-decoration: azure;
    }

    ul li a:hover{
      background-color: blueviolet;
    }
  </style>
</head>
<body>
<h1><%= "设置Content—Type 不同类型的资源" %></h1>
<h2><%= "根据不同的参数类型返回不同的资源" %></h2>


<br/>
<ul>
  <li>
    <a href="http://localhost:8080/class03_response_war_exploded/responseType?type=img">Return Image</a>
    <a href="http://localhost:8080/class03_response_war_exploded/responseType?type=pdf">Return PDF</a>
    <a href="http://localhost:8080/class03_response_war_exploded/responseType?type=json">Return Json</a>
    <a href="http://localhost:8080/class03_response_war_exploded/responseType?type=zip">Return Zip</a>
  </li>
</ul>
</body>
</html>