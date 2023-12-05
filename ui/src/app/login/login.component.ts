import { Component, Input, signal } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from 'src/services/auth/login/login.service';
import { emailOrPhoneValidator } from 'src/utils/validators/emailOrPhoneValidator';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  standalone: false,
  styleUrls: ["../register/register.component.css", './login.component.css']
})
export class LoginComponent {
  @Input() isFullForm=true;
  isPasswordHidden= signal(true);
  loginFormGroup=new FormGroup({
    emailOrPhone: new FormControl(
      "", 
      [ 
        Validators.required, 
        emailOrPhoneValidator(/^(\w+([-+.']\w+)*@\w+([-.]\w+)*\.\w+([-.]\w+)*)|(((00)?(\+)?\d{1,3})[-\s]+(\d{1,3})[-\s]+(\d{4,10}))$/i)
      ]
    ),
    password: new FormControl("", [Validators.required, Validators.minLength(6)])
  });
  constructor(private router: Router, private readonly loginService: LoginService) {}

  navigateToHome() {
    if(this.loginFormGroup.status=="INVALID")return;
    if(this.loginService.login({ 
      emailOrPhone: this.loginFormGroup.value?.emailOrPhone ?? "", 
      password: this.loginFormGroup.value?.password ?? "" }))
        this.router.navigate(['/home', 'feed']);
  }
  
  toggleIsPasswordHidden(){
    this.isPasswordHidden.update(v=>!v);
  }

  get emailOrPhone(){
    return this.loginFormGroup.get("emailOrPhone");
  }

  get password(){
    return this.loginFormGroup.get("password");
  }
}
