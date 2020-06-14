/**
 *
 */
$(function () {
    getlist()
    function getlist() {
        $.ajax({
            url:"/finalLinux/info/getpersoninfo/1",
            type:"get",
            dataType:"json",
            success: function (data) {
                if (data.success) {
                    handlerList(data.personList);
                }
            }
        });
    }

    function handleUser(data) {
        $('#user-name').text(data.name);
    }

    function handlerList(data) {
        var html = '';
        data.map(function (item, index) {
            html += '<div class ="row row-shop"><div class="col-50">'
                + item.personName + '</div><div class="col-50">' +item.personNumber
                +'</div></div>';
        });
        $('.shop-wrap').html(html);
    }





});