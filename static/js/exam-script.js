$(".examTime").each(function() {
    let fromNow = moment.unix(parseInt($(this).data("time")));
    if (moment().isAfter(fromNow)) {
        $(this).text("done!");
        return;
    }
    $(this).text(fromNow.fromNow(true));
});
