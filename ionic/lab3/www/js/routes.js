angular.module('app.routes', [])

.config(function($stateProvider, $urlRouterProvider) {

  // Ionic uses AngularUI Router which uses the concept of states
  // Learn more here: https://github.com/angular-ui/ui-router
  // Set up the various states which the app can be in.
  // Each state's controller can be found in controllers.js
  $stateProvider


    .state('lab3Ionic', {
    url: '/page1',
    templateUrl: 'templates/lab3Ionic.html',
    controller: 'lab3IonicCtrl'
  })

  .state('lab3Ionic2', {
    url: '/page3',
    params: {
      option: null,
    },
    templateUrl: 'templates/lab3Ionic2.html',
    controller: 'lab3Ionic2Ctrl'
  })

  .state('lab3Ionic3', {
    url: '/page4',
    params: {
      option: null,
      check1: null,
      check2: null,
      check3: null,
      check4: null
    },
    templateUrl: 'templates/lab3Ionic3.html',
    controller: 'lab3Ionic3Ctrl'
  })

  .state('lab3Ionic4', {
    url: '/page5',
    params: {
      option: null,
      check1: null,
      check2: null,
      check3: null,
      check4: null,
      comment: null
    },
    templateUrl: 'templates/lab3Ionic4.html',
    controller: 'lab3Ionic4Ctrl'
  })

  .state('answers', {
    url: '/page6',
    params: {
      option: null,
      check1: null,
      check2: null,
      check3: null,
      check4: null,
      comment: null,
      name: null,
      email: null,
      phone: null
    },
    templateUrl: 'templates/answers.html',
    controller: 'answersCtrl'
  })

$urlRouterProvider.otherwise('/page1')


});
