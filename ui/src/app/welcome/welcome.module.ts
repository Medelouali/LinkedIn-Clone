import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { WelcomeRoutingModule } from './welcome-routing.module';
import { LoginModule } from '../login/login.module';
import { LoginComponent } from '../login/login.component';
import { WelcomeComponent } from './welcome.component';


@NgModule({
  declarations: [
    WelcomeComponent
  ],
  imports: [
    LoginModule,
    CommonModule,
    WelcomeRoutingModule,
  ]
})
export class WelcomeModule { }
