import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { HomeRoutingModule } from './home-routing.module';
import { HomeComponent } from './home.component';
import { MessagesModule } from './messaging/messages/messages.module';
import { MessageModule } from './messaging/message/message.module';


@NgModule({
  declarations: [
    HomeComponent
  ],
  imports: [
    CommonModule,
    HomeRoutingModule,
    MessagesModule,
    MessageModule
  ]
})
export class HomeModule { }
