$(function() {
	$.validator.setDefaults({
	 onkeyup : false,
	 onclick : false,
	 onfocusout : false,
	 showErrors : function(errorMap, errorList) {
		 if (this.numberOfInvalids()) { // 에러가 있으면
			 alert(errorList[0].message); // 경고창으로 띄움
		 }
	 }
	});
	$.validator.addMethod("regex", function(value, element, regexpr) {
		return regexpr.test(value);
	});
	// JSON 형식으로 유효성 검사의 규칙을 지정한다.
	// 특수문자 / 문자 / 숫자 포함 형태의 8~15자리 이내의 암호 정규식
	// /^.*(?=^.{8,15}$)(?=.*\d)(?=.*[a-zA-Z])(?=.*[!@#$%^&+=]).*$/;
	// 핸드폰 정규식 /^\d{2,3}-\d{3,4}-\d{4}$/
	$("#insertForm")
	  .validate(
	    {
	     // 유효성 검사에서 제외한다.
	     ignore : [],
	     // 검사할 필드와 검사 항목을 나열한다.
	     rules : {
	      productname : {
	       required : true,
	       regex : /^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$/
	      },
	      productnum : {
	       // 필수 여부를 지정한다.
	       required : true,
	       // 숫자 입력을 지정한다.
	       digits : true,
	       maxlength : 3
	      },
	      userid : {
	       required : true,
	       // 최소길이를 지정한다.
	       minlength : 4,
	       regex : /^[0-9|a-z|A-Z|ㄱ-ㅎ|ㅏ-ㅣ|가-힣]*$/
	     
	     },
	     // 검사를 충족하지 못하면 표시될 메시지를 나열한다.
	     messages : {
	      productname : {
	       required : "상품명을 입력하세요",
	       regex : "공백이나 특수문자를 제거하세요."
	      },
	      productnum : {
	       required : "상품번호를 입력하세요.",
	       digits : "숫자로만 입력하세요.",
	       maxlength : "최대 {0} 숫자입니다."
	      },
	      userid : {
	       required : "아이디를 입력하세요.",
	       minlength : "최소 {0} 글자입니다.",
	       regex : "공백이나 특수문자를 제거하세요."
	      },
	      
	      }

	     }
	    });

});

