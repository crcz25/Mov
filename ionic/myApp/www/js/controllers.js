angular.module('app.controllers', [])

.controller('lab3IonicCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams, $cordovaCamera) {
  // $scope.option = $stateParams.option;
 // console.log($scope);
 // console.log($stateParams);
 $scope.vibration = function() {
   navigator.vibrate(1500);
   console.log("Vibrar");
 };
 $scope.toast = function() {
   window.plugins.toast.show("Holi crayoli", 'short', 'center');
   console.log("Toast");
 };
 $scope.alert = function() {
   navigator.notification.alert(
     'You are the winner!',
     0,
     'notification',
     'Dismiss'
   );
   console.log("Alert");
 };
 $scope.beep = function() {
   navigator.notification.beep(5);
   console.log("Beep");
 };
 $scope.torch = function() {
   window.plugins.flashlight.toggle(
     function(){},
     function(){
       alert("I do not have a flashlight");
     },
     {intensity: 0.3}
   );
   console.log("Torch");
 };

}])


.controller('lab3Ionic2Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
  $scope.option = $stateParams.option;
  console.log($scope);
  console.log($stateParams);
}])

.controller('lab3Ionic3Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
  $scope.option = $stateParams.option;
  $scope.check1 = $stateParams.check1;
  $scope.check2 = $stateParams.check2;
  $scope.check3 = $stateParams.check3;
  $scope.check4 = $stateParams.check4;
  console.log($scope);
  console.log($stateParams);
}])

.controller('lab3Ionic4Ctrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
  $scope.option = $stateParams.option;
  $scope.check1 = $stateParams.check1;
  $scope.check2 = $stateParams.check2;
  $scope.check3 = $stateParams.check3;
  $scope.check4 = $stateParams.check4;
  $scope.comment = $stateParams.comment;
  console.log($scope);
  console.log($stateParams);
}])

.controller('answersCtrl', ['$scope', '$stateParams', // The following is the constructor function for this page's controller. See https://docs.angularjs.org/guide/controller
// You can include any angular dependencies as parameters for this function
// TIP: Access Route Parameters for your page via $stateParams.parameterName
function ($scope, $stateParams) {
  $scope.option = $stateParams.option;
  $scope.check1 = $stateParams.check1;
  $scope.check2 = $stateParams.check2;
  $scope.check3 = $stateParams.check3;
  $scope.check4 = $stateParams.check4;
  $scope.comment = $stateParams.comment;
  $scope.name = $stateParams.name;
  $scope.email = $stateParams.email;
  $scope.phone = $stateParams.phone;
  console.log($scope);
  console.log($stateParams);
}])
