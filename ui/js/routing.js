
function route() {
	var anchor = window.location.hash.replace("#", "");

	// Custom overrides	
	switch (anchor) {
	case "unusual":
		anchor = "test";
		break;
	}
	
	// Load HTML partial
	// If no overrides, the partial with the same name as the anchor
	$("#content").load("partials/" + anchor + ".html");
}

// If no anchor, add one
if (!window.location.hash) {
	window.location += "#home";
} else {
	route();
}
// Route to partial each time the anchor changes
$(window).on("hashchange", function(e) {
	route();
});
