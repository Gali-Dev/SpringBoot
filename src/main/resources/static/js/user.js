let index = {
	init: function(){
		$("#btn-save").on("click",()=>{
			this.save();
		});
		$("#btn-login").on("click",()=>{
			this.login();
		});
	},
	save: function(){
		let data ={
			username: $("#username").val(),
			password: $("#password").val(),
			email: $("#email").val()
		}

		$.ajax({
			type:"POST",
			url:"/api/user",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json",
		})
		.done(function(resp){
			alert("회원가입 완료");
			location.href="/";
		})
		.fail(function(error){
			alert(JSON.stringify(error));
		});//ajax통신을 이용해서 3개의 데이터를 json으로 변경하여 insert
	},
	login: function(){
		let data ={
			username: $("#username").val(),
			password: $("#password").val(),
		}

		$.ajax({
			type:"POST",
			url:"/api/user/login",
			data:JSON.stringify(data),
			contentType:"application/json; charset=utf-8",
			dataType:"json",
		})
		.done(function(resp){
			alert("로그인 완료");
			location.href="/";
		})
		.fail(function(error){
			alert(JSON.stringify(error));
		});//ajax통신을 이용해서 3개의 데이터를 json으로 변경하여 insert
	}
	
}

index.init();