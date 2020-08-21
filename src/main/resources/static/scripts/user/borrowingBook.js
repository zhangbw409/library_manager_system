layui.use(['form', 'element','layer'], function () {
    let form = layui.form;
    let element = layui.element;
    let layer = layui.layer;
});

layui.use(['form', 'layer'], function () {
    let form = layui.form;
    let layer = layui.layer;
});

$(document).ready(function () {
    $("#btn1").click(function () {
        let bookId = $("#bookId").val().toString().trim();

        if (bookId === null || bookId === '' || isNaN(bookId)) {
            layer.alert("请正确输入书籍编号");
            return false;
        }

        borrowingBook(bookId);
    });
});

//借书
function borrowingBook(bookId) {
    $.ajax({
        async: false,
        type: "post",
        url: "/userBorrowingBook",
        dataType: "json",
        data: {bookId: bookId},
        success: function (data) {
            console.log(data.toString());
            if (data.toString() == "true") {
                layer.msg('借 书 成 功!', {icon: 6, time: 2000});
            } else {
                layer.msg('借 书 失 败!', {icon: 7, time: 2000});
            }
        },
        error: function (data) {
            layer.alert(data.result);
        }
    });
};