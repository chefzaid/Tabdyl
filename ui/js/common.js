// Constants
var API_PATH = "http://lvh.me:8080/api"; // Points to localhost

// Common utils methods
function convertFormToObject($form) {
	var unindexed_array = $form.serializeArray();
	var indexed_array = {};

	$.map(unindexed_array, function(n, i) {
		indexed_array[n['name']] = n['value'];
	});

	return indexed_array;
}

function postFormData(endpoint, formName, successCallback, errorCallback) {
	event.preventDefault();
	var jsonPayload = JSON.stringify(convertFormToObject($('#' + formName)));
	$.ajax({
        url: API_PATH + endpoint,
        type: "post",
        contentType: "application/json; charset=utf-8",
        dataType: 'json',
        data: jsonPayload,
        success: function (response) {
        	if (successCallback) {
        		successCallback();
        	} else {
        		console.log(response);
        	}
        },
        error: function(jqXHR, textStatus, errorThrown) {
        	if (errorCallback) {
        		errorCallback();
        	} else {
        		console.log(textStatus, errorThrown);	
        	}
        }
    });
}