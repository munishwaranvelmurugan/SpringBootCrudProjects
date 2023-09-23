 const form = document.getElementById('form');
  const username = document.getElementById('Username');
  const email = document.getElementById('Email');
  const password = document.getElementById('Password1');
   const password2 = document.getElementById('Password2');
   
   form.addEventListener('submit' , (e)=>{
	   e.preventDefault();
	   
	   checkInputs();
   });
 
 
 function checkInputs(){
	  const usernameval = username.value.trim();
	  const emailval = email.value.trim();
	  const passwordval = password.value.trim();
	  const password2val = password2.value.trim();
    //userName
	if(usernameval==''){
	  setErrorFor(username,'Username cannot be blank');
	}
	else{
		setSuccessFor(username);				
	}
	
	
	
	
	
	
	//email    
	if(emailval==''){
	  setErrorFor(email,'email cannot be blank');
	}
	else if(isValidEmail(emailval) ){
		setErrorFor(email,'Email is Invalid');
	}
	else{
		setSuccessFor(email);				
	} 
	
	
	
	
	//password 1   
	if(passwordval==''){
	  setErrorFor(password,'password cannot be blank');
	}
	else{
		setSuccessFor(password);				
	} 
	
	
	
	
	
	//password2    
	if(password2val==''){
	  setErrorFor(password2,'password cannot be blank');
	}
	else if(passwordval !== password2val){
		setErrorFor(password2,'Passwords does not match');
	}
	else{
		setSuccessFor(password2);				
	}  
		  
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
	 const formControl = input.parentElement;
	 formControl.className = 'form-control success';
 }

  
function isValidEmail(e) {
    var filter = /^\s*[\w\-\+_]+(\.[\w\-\+_]+)*\@[\w\-\+_]+\.[\w\-\+_]+(\.[\w\-\+_]+)*\s*$/;
    var t = String(e).search (filter) != -1 ;
    console.log(t);
    return !t;
}
 
 
 
 
 
 
 
 
 