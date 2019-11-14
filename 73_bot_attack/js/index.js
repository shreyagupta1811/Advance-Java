window.onload = initAll;

function initAll(){
		getAllElement();
		setAllAction();
}

var regform,uname,email,passw,repassw;
var unerr,emerr,perr,reperr;

function getAllElement(){
	regform = document.getElementById("regform");

	uname=document.getElementById("uname");
	email=document.getElementById("email");
	passw = document.getElementById("passw");
	repassw = document.getElementById("repassw");

	unerr=document.getElementById("unerr");
	emerr=document.getElementById("emerr");
	perr = document.getElementById("perr");
	reperr=document.getElementById("reperr");
}

function setAllAction(){
	regform.onsubmit = validateForm;

	uname.onblur=function(){
															if(uname.value.length<3){
																	unerr.style.visibility ="visible";
																	flag=false;
															}else{
																	unerr.style.visibility = 'hidden';
																	flag = true;
															}	
													};
 email.onblur = function(){
													var emailTest=/\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}/.test(email.value)
													if(!emailTest){
															emerr.style.visibility ="visible";
															flag=false;
													}
													else{
														emerr.style.visibility = 'hidden';
														flag = true;
													}
												};
passw.onblur=function(){
													var passlen = passw.value.length;
													if(passlen<6 || passlen>12){
														perr.style.visibility ="visible";
														flag=false;
													}
													else{
														perr.style.visibility = 'hidden';
														flag = true;
													}
												};
repassw.onKeyUp=function(){
														if(passw.value!=repassw.value){
																reperr.style.visibility ="visible";
																flag=false;
														}
														else{
														reperr.style.visibility = 'hidden';
														flag = true;
														}
													};
}

var flag=true;
function validateForm(){

		if(uname.value.length<3){
				unerr.style.visibility ="visible";
				flag=false;
		}
		var emailTest=/\w+@[a-zA-Z_]+?\.[a-zA-Z]{2,3}/.test(email.value)
		if(!emailTest){
				emerr.style.visibility ="visible";
				flag=false;
		}
		var passlen = passw.value.length;
		if(passlen<6 || passlen>12){
			perr.style.visibility ="visible";
			flag=false;
		}
		if(passw.value!=repassw.value){
				reperr.style.visibility ="visible";
				flag=false;
		}

		if(!flag){
			return flag;
		}
}