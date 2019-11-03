var cptId = "";
function downloadFile(cid) {
	cptId = document.getElementById(cid).value;
	console.log("this is the id " + " " + cid);
	var name = cid.substring(8);
	var downloadUrl = "http://35.189.73.113:8081/downloadFile" + name
	console.log(name);
	location.href = downloadUrl;
}