$(function( ) {
$.validator.setDefaults({
onkeyup : false,
onclick : false,
onfocusout : false,
showErrors : function(errorMap, errorList) {
if(this.numberOfInvalids( )) {
alert(errorList[0].message);
}
}
});
$.validator.addMethod("regex", function(value, element, regexpr) {
return regexpr.test(value);
});
$("#sign_dept").validate({
rules : {
deptno : {
required : true, digits : true, maxlength : 2
},
dname : {
required : true, minlength : 2, maxlength : 4, regex : /^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$/
},
loc : {
required : true, minlength : 2, maxlength : 4, regex : /^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$/
}
},
messages : {
deptno : {
required : "부서 번호를 입력하세요.", digits : "숫자로만 입력하세요.", maxlength : "최대 {0}자리 숫자입니다."
},
dname : {
required : "부서 이름을 입력하세요.", minlength : "최소 {0} 글자입니다.", maxlength : "최대 {0} 글자입니다.",
regex : "공백이나 특수문자를 제거하세요."
},
loc : {
required : "부서 지역을 입력하세요.", minlength : "최소 {0} 글자입니다.", maxlength : "최대 {0} 글자입니다.",
regex : "공백이나 특수문자를 제거하세요."
}
}
});
});