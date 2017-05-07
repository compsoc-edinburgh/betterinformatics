$(".examTime").each(function() {
    let examTime = moment.unix(parseInt($(this).data("time")));
    if (moment().isAfter(examTime)) {
        $(this).text("done!");
        return;
    }
    $(this).text(examTime.fromNow(true));
});

// Based on https://stackoverflow.com/questions/133925/javascript-post-request-like-a-form-submit
function searchExam(value) {
	// The rest of this code assumes you are not using a library.
	// It can be made less wordy if you use one.
	var form = document.createElement("form");
	form.setAttribute("method", "POST");
	form.setAttribute("action", "http://www.scripts.sasg.ed.ac.uk/registry/examinations/index.cfm");
	form.setAttribute("target", "__blank");

	var hiddenField = document.createElement("input");
	hiddenField.setAttribute("type", "hidden");
	hiddenField.setAttribute("name", "searchfrm");
	hiddenField.setAttribute("value", "yes");
	form.append(hiddenField);

	var searchField = document.createElement("input");
	searchField.setAttribute("type", "hidden");
	searchField.setAttribute("name", "code");
	searchField.setAttribute("value", value);
	form.append(searchField);

	document.body.appendChild(form);
	form.submit();
}
