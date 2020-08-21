layui.use(['form', 'element','layer'], function () {
    let form = layui.form;
    let element = layui.element;
    let layer = layui.layer;
});


$(function () {
    //检查能否再点击上一页，下一页
    let lab1 = $("#lab1").html().trim();//获取当前页码
    let lab2 = $("#lab2").html().trim();//获取总页码

    $("#prePage").click(function () {
        if (lab1 == 1) {
            layer.msg("已经是第一页了!", {icon: 7});
            return false;
        }
        return true;
    });
    $("#nextPage").click(function () {
        if (lab1 == lab2) {
            layer.msg("已经是最后一页了!", {icon: 7});
            return false;
        }
        return true;
    });

    //点击删除按钮后删除一行
    $(".del_btn").click(function () {

        let that = $(this);

        layer.confirm('确认删除?', {
            btn: ['确认', '取消'] //按钮
        }, function () {
            let userId = that.val();

            deleteUserById(userId);

            that.parent().parent().remove();
            layer.msg("删除成功", {icon: 1, time: 1000});

            setTimeout(function () {

                // 关闭所有 layer选项框
                parent.layer.closeAll();
            }, 1000)

        });

    });

});

//ajax删除用户
function deleteUserById(userId) {
    $.ajax({
        async: false,
        type: "post",
        url: "/deleteUser",
        dataType: "json",
        data: {userId: userId},
        success: function (data) {

        },
        error: function (data) {
            alert(data.result);
        }
    });
}