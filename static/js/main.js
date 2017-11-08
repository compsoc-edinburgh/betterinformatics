function loadSemesterButtons() {
    $("#sem1-btn,#sem2-btn,#all-btn").click(btn => {
        // First show everything
        $("[data-semester]").show();

        var sem = btn.target.id.slice(3, 4);
        if (sem == "1") {
            $("[data-semester='2']").hide();
        } else if (sem == "2") {
            $("[data-semester='1']").hide();
        }
    });
}

function loadProvider() {
    $.ajax({url:"https://provider.betterinformatics.com", xhrFields:{withCredentials:true}})
    .done(
        (resp) => {
            const data = resp.data;

            const year = "inf" + (data.Year.slice(2));

            if (data.IsStudent && window.location.pathname.slice(0, 5) == "/mine") {
                $("section").each(function(_, section) {
                    section = $(section);

                    if (section.data("pinned") && (section.data("year") == year)) {
                        return;
                    }

                    if (!data.Modules.includes(section.data("course"))) {
                        section.remove();
                    }
                });

                $("#my-sections").show();
            }

            $(".bi-loading").hide();
            $("#user-name").text(data.Name);
            $("#user").show();
        }
    ).fail(
        () => {
            if (window.location.pathname.slice(0, 5) == "/mine") {
                window.location = "https://weblogin.inf.ed.ac.uk/cosign-bin/cosign.cgi?cosign-betterinformatics.com&" + window.location.href;
            }

            $("#login").show();
            $(".bi-loading").hide();
        }
    );
}

$(() => {
    // Load provider
    loadProvider();

    // Load the semester buttons
    loadSemesterButtons();
})
