layui.use(['element', 'form', 'layer'], function () {
    let layer = layui.layer;
    let element = layui.element;
    let form = layui.form;

    form.on('submit(btn1)', function (data) {

        addBook();

        // console.log(data.field); //当前容器的全部表单字段，名值对形式：{name: value};获取单个值data.field["title"]
        return false; //阻止表单跳转。如果需要表单跳转，去掉这段即可。
    });
});

function addBook() {

    $.ajax({
        async: false,
        type: 'post',
        url: '/addBook',
        data: $('#addBookForm').serialize(),
        success: function (data) {
            layer.msg("添加成功", {time: 1500, icon: 1});

            setTimeout(function () {
                // 重新刷新页面
                location.reload();
            }, 1500)
        },
        error: function (data) {
            alert("添加失败");
        }
    });
};

$(document).ready(function () {

    //查找所有图书种类，并给select选择框赋值
    findAllBookCategory();

});

function findAllBookCategory() {
    $.ajax({
        async: false,
        type: "post",
        url: "/findAllBookCategory",
        dataType: "json",
        success: function (data) {
            console.log(data);
            $("select[name='bookCategory']").empty();
            $("select[name='bookCategory']").append('<option value="">——请选择——</option>');
            for (let i = 0; i < data.length; i++) {
                let html = '<option value="' + data[i].categoryId + '">';
                html += data[i].categoryName + '</option>';
                $("select[name='bookCategory']").append(html);
            }
        },
        error: function (data) {
            alert(data.result);
        }
    });
};













