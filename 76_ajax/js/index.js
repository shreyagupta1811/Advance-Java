window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var xy,aaa,rec;
var uname,eml,pass;
function getAllElements(){
	uname = document.getElementById("uname");
	eml = document.getElementById("eml");
	pass = document.getElementById("pass");
	//repass = document.getElementById("repass");

	xy = document.getElementById("xy");
	aaa= document.getElementById("aaa");
     rec = document.getElementById("rec");
}

function setAllActions(){
	xy.onclick=collectRecords;
}

var reqObj;
function collectRecords(){
	alert("hello");
	reqObj =  new XMLHttpRequest();
	reqObj.open('get','collect_user.do',true);
	reqObj.onreadystatechange = showRecord;
	reqObj.send(null);
}

function showRecord(){
		if(reqObj.readyState==4&&reqObj.status==200){
				//alert(reqObj.responseText);
		
		var records = eval(reqObj.responseText);
		//alert(records);

		var len = records.length;
		for(i=0;i<len;i++){
				var row = rec.insertRow(i);
				var n=0;
				var obj = records[i];
				for(x in obj){
						var cell = row.insertCell(n);
						cell.innerHTML= obj[x];
						n++;
				}
		   }
		}
}

var req;
function sendRequest(){
		req = new XMLHttpRequest();
		var url='act.do?user_name='+uname.value+'&email='+eml.value+'&password='+pass.value;
		//alert(url);
		req.open('get',url,true);
		req.onreadystatechange= handleResponse;
		req.send(null);
}

function handleResponse(){
		if(req.readyState==4&&req.status==200){
			alert(req.responseText);
		}
}