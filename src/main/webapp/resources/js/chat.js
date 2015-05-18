var chat_app = angular.module("chat",[]);
chat_app.controller("chat_controller",function($scope,$http,$interval){
    $scope.chat = {};
    $http.get("chat/get_chat").success(function(data){
        $scope.chat = data;

    });
    var inter = $interval(action,2000);
    function action(){
        $http.get("chat/get_chat").success(function(data){
            $scope.chat = data;

        });
    }
    function action2(){
        $http.get("chat/get_chat").success(function(data){
            $scope.chat = data;

        });
    }

    $scope.submitMessage = function(message){
        $http.get("chat/add_user?username="+message.name+"&message="+message.text).success(function(data){
            alert(data);
        });
    }

});