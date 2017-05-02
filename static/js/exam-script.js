$(".examTime").each(function() {
    let examTime = moment.unix(parseInt($(this).data("time")));
    if (moment().isAfter(examTime)) {
        $(this).text("done!");
        return;
    }
    $(this).text(examTime.fromNow(true));
});
