    var editID = 0;
	function captureID(btnid) {
		editID = btnid;
		var capturedID = btnid;
		console.log("this is btn ID" + " " + capturedID);
		console.log(" gobal this is btn ID" + " " + editID);
        return capturedID;
    }