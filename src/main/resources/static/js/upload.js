var filename = "";
	function upload() {
    	console.log("this works");
    $('#uploadForm').submit(function(event) {
        var formElement = this;
        var formData = new FormData(formElement);
		var name = document.getElementById("photoInput").value;
		filename = name.replace(/^.*[\\\/]/, '');
		console.log(filename);
		console.log(formData);
        $.ajax({
            type: "POST",
            enctype: 'multipart/form-data',
            url: "http://35.189.73.113:8081/uploadFile",
            data: formData,
            processData: false,
            contentType: false,
            success: function (response) {
            	console.log("this worked!!!!")
            	swal("Image Stored", "...now press the save button below!", "success")	
            },
            error: function (error) {
                console.log(error);
                // process error
            }
        });
        event.preventDefault();
    });
	}