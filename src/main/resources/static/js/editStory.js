function editStory() {
    var title = document.getElementById('exampleFormControlInput10').value;
    var locations = document.getElementById('exampleFormControlInput20').value;
    var text = document.getElementById('exampleFormControlTextarea10').value;
    var name = document.getElementById("photoInput10").value;
    filename = name.replace(/^.*[\\\/]/, '');
    var user_id = 2;
    var picture = "/uploads/" + filename;
    var story_id = editID;
    var num_likes = 0;
    var story = new Object();
    story.user_id = user_id;
    story.title = title;
    story.picture = picture;
    story.num_likes = num_likes;
    story.location = locations;
    story.storytext = text;
    story.story_id = story_id;
    var storyJSON = JSON.stringify(story);
    console.log(storyJSON);
    //swal("Success", "The story has been added!", "success");
    swal("Success", "The story has been updated!", "success")
            .then((value) => {
                location.reload(true);
            });
    $.ajax({
      type : "PUT",
      url : "http://35.189.73.113:8081/updatestory",
      //url : "http://localhost:8080/updatestory",
      contentType : "application/json",
      data : storyJSON,
      success : function(data) {
      },
      error : function(data) {
        console.log(data);
      },
      dataType : 'json'
    });
  }