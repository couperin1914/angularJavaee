angular.module('controllers').controller('LoginCtrl', ['$scope', 'loginResource',
    function ($scope, loginResource) {
        $scope.login = function login() {
            loginResource.login(
                {'loginUserId': $scope.loginUserId, 'password': $scope.password},
                function (data) {
                    if (data.result === "ok") {
                        $scope.messages = data.messages;
                    }
                }
            );
        };
    }]);
