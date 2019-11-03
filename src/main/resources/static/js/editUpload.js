var filename = "";
	function editUpload() {
    	console.log("this works");
    $('#uploadForm10').submit(function(event) {
        var formElement = this;
        var formData = new FormData(formElement);
		var name = document.getElementById("photoInput10").value;
		filename = name.replace(/^.*[\\\/]/, '');
		console.log(filename);
        $.ajax({
            type: "POST",
            enctype: 'multipart/form-data',
            url: "http://35.189.73.113:8081/uploadFile",
            data: formData,
            processData: false,
            contentType: false,
            success: function (response) {
				swal("Image updated", "...now press the edit button below!", "success")
            },
            error: function (error) {
                console.log(error);
                // process error
            }
        });
        event.preventDefault();
    });
	}