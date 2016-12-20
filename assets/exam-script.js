$(".examTime").each(function() {
    let fromNow = moment.unix(parseInt($(this).data("time"))).fromNow();
    $(this).text(fromNow);
});
