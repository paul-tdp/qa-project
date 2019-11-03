$( document ).ready(function() {
    $.ajax({
        type : "GET",
        url : "http://"+location.hostname+":8081/getstories",
        success : function(data) {
            console.log("success")
            $.each(data, function(index, story) {
                $('#page-content').prepend(
                        "<div class='col-lg-6'>" +
                           "<div class='card mb-3'>" +
                             "<div class='card-body'>" +
                               "<div class='card' style='width: 100%; border:none'>" +
                    "<img src='"+story.picture+"'" + "width='200' height='300' class='card-img-top' alt='...'>" +
                    "<div class='card-body text-center'>" + 
                        "<span id='" + story.story_id + "'>" + "</span>" +
                        "<h5 class='card-title'>" + story.title + "</h5>" +
                        "<p class='card-text'>" + story.storytext + "</p>" +
                        "<a href='javascript:void(0)' class='btn btn-primary btn-primary-spacing' id='" + story.picture + "' onclick='downloadFile(this.id)'>Download Image</a>" + "<a href='javascript:void(0)' class='btn btn-warning btn-primary-spacing' data-toggle='modal' data-target='#editModal' onclick='captureID(this.id)' id='" + story.story_id + "'>Edit Story</a>" + "<a href='javascript:void(0)' class='btn btn-danger btn-primary-spacing' onclick='deleteStory(this.id)' id='" + story.story_id + "'>Delete Story</a>" +
                        "</div>" +
                "</div>"
                        )
            });
            return false;
        }
    });
});