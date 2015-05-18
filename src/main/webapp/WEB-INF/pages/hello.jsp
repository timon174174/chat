<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page pageEncoding="UTF-8" %>
<html>
<head>
	<script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.3.14/angular.min.js"></script>
	<script src='<spring:url value="/resources/js/chat.js"/>'></script>
</head>
<body ng-app = "chat" >
	<h1>Chat</h1>
<div ng-controller="chat_controller">
	<div ng-repeat = "message in chat.messages">{{message.user.name}}: {{message.text}}</div>
	<label>Имя</label><input type="text" ng-model = "message.name"></br>
	<label>Сообщение</label><textarea ng-model = "message.text"></textarea></br>
	<input type="button" value="Отправить" ng-click = "submitMessage(message)">

</div>
</body>
</html>