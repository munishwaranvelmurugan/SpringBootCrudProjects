const form = document.getElementById('form');
const Name= document.getElementById('Name');
const Email= document.getElementById('Email');
const Gender     = document.getElementById('Gender');
const Department     = document.getElementById('Department');
const PhoneNo     = document.getElementById('PhoneNo');
const DoorNo     = document.getElementById('Door No');
const Country     = document.getElementById('Country');
const State     = document.getElementById('State');
const District     = document.getElementById('District');
const PinCode     = document.getElementById('PinCode');
const Password1     = document.getElementById('Password1');
const Password2     = document.getElementById('Password2');
var val;
  form.addEventListener('submit' , (e)=>{
	   e.preventDefault();
	   val = 0;
	   CheckTheUserDetials();
	   if(val==12){
		  
		   
	   }
	   
   });
   
   function CheckTheUserDetials()
   {
	   const nameval        =     Name.value.trim();
	   const Emailval  	    =     Email.value.trim();
	   const Genderval      =     Gender.value.trim();
	   const Departmetval	=     Department.value.trim();
	   const PhoneNoval  	=     PhoneNo.value.trim();
	   const doorNoval  	=     DoorNo.value.trim();
	   const countryval     =     Country.value.trim();
	   const stateval       =     State.value.trim();
	   const Districtval    =     District.value.trim();
	   const PinCodeval     =     PinCode.value.trim();
	   const Password1val   =     Password1.value.trim();
	   const Password2val   =     Password2.value.trim();
	  
	   /* NameValidation */
	   Namevalidation(Name, nameval);
	   /*EmailValidation*/
	   EmailValidation(Email,Emailval);
       /*Gendervalidation*/
       Gendervalidation(Gender     ,Genderval);
	   /*Department*/
	   DepartmentValidation(Department     ,Departmetval);
	   /*phoneNovalidation*/
	   PhoneNoValidation(PhoneNo     ,PhoneNoval);
	   /*doornovalidation*/
	   DoorNoValidation(DoorNo     ,doorNoval);
	   /*CountryValidation*/
	   Countryvalidation(Country ,countryval)
	   /*StateValidation*/
	   StateValidation(State     ,stateval);
	   /*DistrictValidation*/
	   DistrictValidation( District     ,Districtval);
	   /*PinCodevalidation*/
	   PinCodeValidation( PinCode   ,PinCodeval);
	   /*Password*/
	   PasswordValidation(Password1,Password2,Password1val,Password2val);
   
   }
function Namevalidation(input,val){
	if(val==''){
		setErrorFor(input,"Name Can't Be Empty");
	}
	else{
		setSuccessFor(input);
	}
}

function EmailValidation(input,val){
	if(val==''){
		setErrorFor(input,"Email Can't Be Empty");
	}
	else if(isValidMail(val)){
		setErrorFor(input,"Email is invalid");
	}
	else{
		setSuccessFor(input);
	}
}
function Gendervalidation(input,val){
	if(val==''){
		setErrorFor(input,"Gender Can't Be Empty");
	}
	else if(CorrectGender(val)){
		setErrorFor(input,"Not a Valid Gender");
	}
	else{
		setSuccessFor(input);
	}
}
function DepartmentValidation(input,val){
	if(val==''){
		setErrorFor(input,"Department Can't Be Empty");
	}
	else if(DepartmentContains(val)){
		setErrorFor(input,"Unidentifyed department Use Capital Letter");
	}
	else{
		setSuccessFor(input);
	}
}
function PhoneNoValidation(input,val){
	if(val==''){
		setErrorFor(input,"Phone Number Can't Be Empty");
	}
	else if(!(val.length==10)){
		setErrorFor(input,"Number must be 10dig");
	}
	else{
		setSuccessFor(input);
	}
}
function DoorNoValidation(input,val){
	if(val==''){
		setErrorFor(input,"Door Number Can't Be Empty");
	}
	else{
		setSuccessFor(input);
	}
}
function Countryvalidation(input,val){
	if(val==''){
		setErrorFor(input,"Contry Name Can't Be Empty");
	}
	else{
		setSuccessFor(input);
	}
}
function StateValidation(input,val){
	if(val==''){
		setErrorFor(input,"State Name Can't Be Empty");
	}
	else{
		setSuccessFor(input);
	}
}
function DistrictValidation(input,val){
	if(val==''){
		setErrorFor(input,"District Name Can't Be Empty");
	}
	else{
		setSuccessFor(input);
	}
}
function PinCodeValidation(input,val){
	if(val==''){
		setErrorFor(input,"Pin Can't Be Empty");
	}
	else if(val.length!==6){
		setErrorFor(input,"Not a PinCode Number ");
	}
	else{
		setSuccessFor(input);
	}
}
function PasswordValidation(input1,input2,val1,val2){
	pass1();
	pass2();
	function pass1(){
		if(val1==''){
		setErrorFor(input1,"Password Can't Be Empty");
	    }
	    else{
		setSuccessFor(input1);
		}
	
	}
	
	function pass2(){
		if(val2==''){
		setErrorFor(input2,"Password Can't Be Empty");
		}
		else{
		setSuccessFor(input2);
		}
	}
	if(!(val1==val2)){
			setErrorFor(input2,"Passwords are not matched");
		}
	

}




































function DepartmentContains(val){
	var s = new Set();
	s.add("EEE");s.add("ECE");s.add("IT");s.add("CSE");s.add("CST");
	s.add("AI");s.add("MBA");s.add("MECH");s.add("CIVIL");s.add("ETE");
	return !s.has(val);
}
function CorrectGender(val){
	var s=new Set();s.add("male");s.add("MALE");s.add("FEMAL");
	s.add("female");
	return !s.has(val);
}

 function setErrorFor(input,msg){
	 const formControl = input.parentElement;
	 const small = formControl.querySelector('small');

	 //add error msg inside small
	 small.innerText = msg;
	 
	 //add error class to it
	 formControl.className = 'form-control error'
	 
 }
 
 function setSuccessFor(input){
	 val=val+1;
	 const formControl = input.parentElement;
	 formControl.className = 'form-control success';
 }
 
 function isValidMail(e) {
    var filter = /^\s*[\w\-\+_]+(\.[\w\-\+_]+)*\@[\w\-\+_]+\.[\w\-\+_]+(\.[\w\-\+_]+)*\s*$/;
    var t = String(e).search (filter) != -1 ;
    console.log(t);
    return !t;
}

