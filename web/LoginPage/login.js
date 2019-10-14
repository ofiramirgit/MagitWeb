$("#login-form").submit(function (event) {
    event.preventDefault();
    var username = $("#username").val();
    alert(username);

    $.ajax({
        url: 'update',
        type: 'POST',
        dataType: 'json',
        data: $("#username").serialize(),
        success: function (data) {
            if (data.isValid) {
                alert("VALID");
            } else {
                alert("NOT VALID");
            }
        }
    });
    return false;
});





