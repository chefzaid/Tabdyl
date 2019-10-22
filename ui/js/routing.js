
$( document ).ready(function() {
	$(window).on('hashchange', function(e){
      // e.preventDefault();
	  
	  // Your routing goes here:
	  switch (window.location.hash) {
		  case "#hello" :
			  $( "#result" ).load( "partials/hello.html" );
			  break;
		  case "#world" :
			  $( "#result" ).load( "partials/world.html" );
			  break;
	  }
   } );
});

