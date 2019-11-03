function deleteStory(clickedID) {
    $.ajax({
        url : "http://35.189.73.113:8081/deletestory/" + clickedID,
        type: 'DELETE',
        success: function(result) {
            swal("Success", "The story has been deleted!", "success")
            .then((value) => {
                location.reload(true);
            });
        }
    });
}