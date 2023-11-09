import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MessagingRoutingModule } from './messaging-routing.module';
import { MessagingComponent } from './messaging.component';
import { AddsComponent } from '../feed/adds/adds.component';
import { MessagesComponent } from './messages/messages.component';
import { MessageComponent } from './message/message.component';


@NgModule({
  declarations: [
    MessagingComponent,
    // AddsComponent,
    // MessagesComponent,
    // MessageComponent
  ],
  imports: [
    CommonModule,
    MessagingRoutingModule
  ]
})
export class MessagingModule { }
