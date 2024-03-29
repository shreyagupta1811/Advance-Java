window.onload = initAll;

function initAll(){
	getAllElements();
	setAllActions();
}

var fld,records;
var recs,details;
function getAllElements(){
	fld = document.getElementById('fld');
	records = document.getElementById('records');
	
	details = document.getElementById('details');	
}

function setAllActions(){
	fld.onkeyup = collectRecords;
}

var req;
function collectRecords(){
	details.innerHTML = ' ';
	details.style.display = 'none';
	
	if(fld.value.length>2){
		req = new XMLHttpRequest();

		req.open('get','collect_records.do?city='+fld.value,true);
		req.onreadystatechange = showRecords;
		req.send(null);
	}else{
		records.innerHTML = ' ';
		records.style.display = 'none';
	}
}

function showRecords(){
	//alert(req.readyState+' ~ '+req.status)

	if(req.readyState==4&&req.status==200){
		records.innerHTML = ' ';
		records.style.display = 'block';
		//alert(req.responseText);

		var arr = eval(req.responseText);
		
		var len = arr.length;
		for(i=0;i<len;i++){
			var elm = document.createElement('div');
			elm.className = 'rec';
			elm.innerHTML = arr[i]['city'];
			elm.ctid = arr[i]['cityId']

			elm.onmouseover = function(){ this.className = 'rec over'; }; 
			elm.onmouseout = function(){ this.className = 'rec out'; };
			elm.onclick = bringDetails;

			records.appendChild(elm);
		}
	}
}

function bringDetails(){
	//alert(this.innerHTML)
	fld.value = this.innerHTML;
	records.style.display = 'none';
	//alert(this.ctid)
	getDetails(this.ctid);
}

var dreq;
function getDetails(ctid){
	dreq = new XMLHttpRequest();

	dreq.open('get','get_details.do?ct_id='+ctid,true);
	dreq.onreadystatechange = showDetails;
	dreq.send(null);
}

function showDetails(){
	if(dreq.readyState==4&&dreq.status==200){
		//alert(dreq.responseText);
		details.innerHTML = dreq.responseText;
		details.style.display = 'block';
	}
}






