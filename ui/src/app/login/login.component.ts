import { Component, Input, signal } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  standalone: false,
  styleUrls: ["../register/register.component.css", './login.component.css']
})
export class LoginComponent {
  @Input() isFullForm=true;
  isPasswordHidden= signal(true);
  signUpData={
    email : { value: "", isTouched: false },
    password : { value: "", isTouched: false },
  }

  constructor(private router: Router) {}

  navigateToHome() {
    //todo: implement the login before navigation
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
