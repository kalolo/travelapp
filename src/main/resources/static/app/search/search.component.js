travelPlanner.
    component('searchPanel', {
        templateUrl: '/app/search/search.template.html',
        controller: function SearchController($scope, flightSearchService) {

        this.user = 'world';
        this.offerTitle = "/";
        this.foundOffers = false;
        var self = this;


        this.searchFlights = function() {

            console.log(">> CLICK!", $scope.from);

            this.foundOffers = false;


            flightSearchService.search( "PHX" ).then(function(response){

                 console.log(response.data);

                 self.renderOffers( response.data );
            });

        };


        this.renderOffers = function( offersResponse ) {

             this.foundOffers = true;
             this.offerTitle = offersResponse.title;



        };


    }
});