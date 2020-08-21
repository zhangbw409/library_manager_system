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
});