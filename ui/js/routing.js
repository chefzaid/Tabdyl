$(document).ready(function() {
	$(window).on('hashchange', function(e) {
		// e.preventDefault();
		
		// Constants
		var PLACEHOLDER_DIV_NAME = "#content";
		var PARTIALS_PATH = "partials/";
		var PARTIALS_EXT = ".html"
		var PARTIALS_DEFAULT_PAGE = "default"
			
		// By default map URL's anchors to the same name as HTML file
		var anchor = window.location.hash;
		$(PLACEHOLDER_DIV_NAME).load(PARTIALS_PATH + anchor.replace('#', '') + PARTIALS_EXT);
		
		// Custom overrides + Default route
		switch (anchor) {
		case "#unusual":
			$(PLACEHOLDER_DIV_NAME).load("partials/test.html");
			break;
		default
			$(PLACEHOLDER_DIV_NAME).load(PARTIALS_PATH + PARTIALS_DEFAULT_PAGE + PARTIALS_EXT);
			break;
		}
	});
});
