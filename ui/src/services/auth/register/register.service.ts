import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class RegisterService {

  constructor() { }

  
  register(loginForm: { emailOrPhone: string, password: string }){
    console.log(loginForm);
    // Call the api and stuff
    return true;
  }
}
