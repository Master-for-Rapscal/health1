
// 验证手机号
function checkPhone(phone) {
    //移动号码归属地支持号段:134 135 136 137 138 139 147 150 151 152 157 158 159 178  182 183 184 187 188
    //联通号码归属地支持号段:130 131 132  145 155 156 176  186
    //电信号码归属地支持号段:133 153 177 180 181 189
    //移动运营商:170
    var flag = false;
    var message = "";
    var myreg = /^(((13[0-9]{1})|(14[5|7]{1})|(17[0|6|7|5|8]{1})|(15[0-3]{1})|(15[5-9]{1})|(18[0-9]{1}))+\d{8})$/;
    if(phone == ''){
        message = "手机号码不能为空！";
    }else if(phone.length !=11){
        message = "请输入有效的手机号码！";
    }else if(!myreg.test(phone)){
        message = "请输入有效的手机号码！";
    }else if(1!=1){
        message = "该手机号码已经被绑定！";
    }else{
        flag = true;
    }
    if(!flag){
        $.messager.alert('信息提示',message,'info');

    }
}

// 验证身份证
//出生日期码校验
function checkUserDate(val) {
    // alert(val);
    var reg = /(^\d{15}$)|(^\d{18}$)|(^\d{17}(\d|X|x)$)/;
    if(!reg.test(val))
    {
        $.messager.alert('信息提示','身份证输入不合法！','info');
        return;
    }
    var val = val.substring(6, 14);
    var pattern = /^(18|19|20)\d{2}((0[1-9])|(1[0-2]))(([0-2][1-9])|10|20|30|31)$/;
    // alert(val);
    if(pattern.test(val)) {
        var year = val.substring(0, 4);
        var month = val.substring(4, 6);
        var date = val.substring(6, 8);
        var date2 = new Date(year+"-"+month+"-"+date);
        // alert(date2);
        if(date2 && date2.getMonth() == (parseInt(month) - 1)) {
            // alert("验证成功"+year+"-"+month+"-"+date);
            $("#userBirthday").val(year+"-"+month+"-"+date);
            // $("#userBirthday").datebox('setValue',year+"-"+month+"-"+date);
            // alert("验证成功2"+date2);

        }
    }else{
        $.messager.alert('信息提示','身份证输入不合法！','info');

    }
}

// userInfo地址互通
function  copyAddress(v) {
    $("input[name='recordPlaceadress']").val(v);
}
function  copyAddress2(v) {
    $("input[name='recordAdress']").val(v);
}