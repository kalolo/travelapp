travelPlanner.service('flightSearchService', function($http) {

    delete $http.defaults.headers.common['X-Requested-With'];


    this.search = function( from, to ) {

          console.log('>> Searching from:', from);

          return $http({
              method: 'GET',
              dataType: 'jsonp',
              url: 'http://api.mytravelapp.dev:8080/api/flight/search/HMO/LAX'
          });
    };


});