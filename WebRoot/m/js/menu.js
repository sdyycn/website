// JavaScript Document

function showdd(mydl){//显示指定DL下的DD
	var alldl = document.getElementsByTagName("dl");
	var dl0 = alldl[mydl];
	dl0.className = "mdl";
	var thedt = alldl[mydl].getElementsByTagName("dt");
	thedt[0].className = "mdt";
	var thedd = alldl[mydl].getElementsByTagName("dd");
	
	for (ii=0; ii<thedd.length; ii++){
		thedd[ii].style.display = "block";
	}
}

function hideAllDD(){
	var alldd = document.getElementsByTagName("dd");
	for (i=0;i<alldd.length;i++){
		alldd[i].style.display = "none";
	}
}

function show(obj){
	if (obj.className == "mdt"){
//		obj.className = "";
//		hideAllDD();
	}else{
		hideAllDD();
        var allDL = document.getElementsByTagName("dl");
        for (i=0;i<allDL.length;i++){
        	allDL[i].className = "";
        }
        
        var allDT = document.getElementsByTagName("dt");
        for (i=0;i<allDT.length;i++){
        	allDT[i].className = "";
        }
        
        obj.className = "mdt";
        for (i=0;i<allDT.length;i++){
        	if (obj == allDT[i]){
        		showdd(i);
        	}
        }
    }
}
