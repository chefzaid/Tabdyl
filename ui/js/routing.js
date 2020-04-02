
/**
 * 
 * By default the HTML partial with the same name as the URL's anchor is loaded.
 * Except if a custom override is provided in the route() method.
 * When there is no anchor in the URL, a default anchor is appended.
 * Routing is triggered each time the URL's anchor has changed.
 * @returns Loads corresponding HTML partial.
 */
function route() {
	var anchor = window.location.hash.replace("#", "");

	// Custom overrides	
	switch (anchor) {
	case "xxx":
		anchor = "yyy";
		break;
	}
	
	$("#content").load("partials/" + anchor + ".html");
}

if (!window.location.hash) {
	window.location += "#home";
} else {
	route();
}

$(window).on("hashchange", function(e) {
	route();
});
