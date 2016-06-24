var travelPlanner = angular
    .module('travelPlanner', ['ngAnimate'])
    .config(function($httpProvider) {
        $httpProvider.defaults.useXDomain = true;
        delete $httpProvider.defaults.headers.common['X-Requested-With'];
    });