angular.module('app.controllers', [])

.controller('pageCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
   $scope.mdl = {};
   $scope.getMoney = function() {
     $scope.due = $scope.mdl.due;
     $scope.paid = $scope.mdl.paid;

     var amount = $scope.due;

      var change = [], total = 0;
      [500, 200, 100, 50, 20, 10, 5, 2, 1].forEach(function(coin) {
        while (total + coin <= amount) {
          change.push(coin);
          total += coin;
        }
      });
      console.log(total);
      return change;
    };

   // $scope.getMoney = function() {
   //   $scope.due = $scope.mdl.due;
   //   $scope.paid = $scope.mdl.paid;
   //
   //   $scope.change = $scope.paid - $scope.due;
   //
   //   if ($scope.paid < $scope.due) {
   //     $scope.less = "NELSON"
   //     console.log("nelson");
   //   }
   //
   //   if($scope.change >= 500) {
   //     $scope.quinientos = Math.floor($scope.change/500)
   //     $scope.change -= ($scope.quinientos * 500);
   //   }
   //   if($scope.change >= 200) {
   //     $scope.doscientos = Math.floor($scope.change/200)
   //     $scope.change -= ($scope.doscientos * 200);
   //   }
   //   if($scope.change >= 100) {
   //     $scope.cien = Math.floor($scope.change/100)
   //     $scope.change -= ($scope.cien * 100);
   //   }
   //   if($scope.change >= 50 ){
   //     $scope.cincuenta = Math.floor($scope.change/50)
   //     $scope.change -= ($scope.cincuenta * 50);
   //   }
   //   if($scope.change >= 20) {
   //     $scope.veint = Math.floor($scope.change/20)
   //     $scope.change -= ($scope.veint * 20);
   //   }
   //   if($scope.change >= 10){
   //     $scope.diez= Math.floor($scope.change/10)
   //     $scope.change -= ($scope.diez * 10);
   //   }
   //   if($scope.change >= 5){
   //     $scope.cinco= Math.floor($scope.change/5)
   //     $scope.change -= ($scope.cinco * 5);
   //   }
   //   if($scope.change >= 2){
   //     $scope.dos= Math.floor($scope.change/2)
   //     $scope.change -= ($scope.dos * 2);
   //   }
   //   if($scope.change >= 1){
   //     $scope.uno = Math.floor($scope.change/1)
   //     $scope.change -= $scope.uno;
   //   }
   // }

   $scope.reset = function() {
     $scope.due = $scope.mdl.due;
     $scope.paid = $scope.mdl.paid;

     $scope.cincuenta = 0;
     $scope.doscientos = 0;
     $scope.cien = 0;
     $scope.cincuenta = 0;
     $scope.veint = 0;
     $scope.diez = 0;
     $scope.cinco = 0;
     $scope.dos = 0;
     $scope.uno = 0;
  };

   console.log($scope.change);


}])
