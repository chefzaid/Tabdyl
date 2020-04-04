
$( document ).ready(function() {
	$('#user-form').submit(function(event) {
		postFormData("/user", "user-form");
	});
});

