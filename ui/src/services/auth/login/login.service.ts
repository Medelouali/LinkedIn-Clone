import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  constructor() { }

  login(loginForm: { emailOrPhone: string, password: string }){
    console.log(loginForm);
    // Call the api and stuff
  }
}
