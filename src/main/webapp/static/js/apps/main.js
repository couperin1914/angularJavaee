angular.module('app').config(['$routeProvider',
         function ($routeProvider) {
//ルートの定義。画面を追加したらここで追記
             $routeProvider.when('/login', {templateUrl: 'static/partials/app/login/login.tpl.html', controller: 'LoginCtrl'});
             $routeProvider.otherwise({redirectTo: '/login'});
         }
     ]);
