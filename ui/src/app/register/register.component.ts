import { Component, signal } from '@angular/core';
import { FormBuilder, FormControl, FormGroup, NgForm } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {
  isPasswordHidden= signal(true);
  signUpData={
    email : { value: "", isTouched: false },
    password : { value: "", isTouched: false },
  }

  constructor(private router: Router) {}

  navigateToHome() {
    //todo: implement the register before navigation
    this.router.navigate(['/home', 'feed']);
  }
  
  toggleIsPasswordHidden(){
    this.isPasswordHidden.update(v=>!v);
  }

  onSubmit(data: {
    email: string,
    password: string
  }) {
    this.signUpData={
      email : { value: data.email, isTouched: false },
      password : { value: data.password, isTouched: false },
    };
    console.log(this.signUpData);
  }
}
