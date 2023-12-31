import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { MessagingRoutingModule } from './messaging-routing.module';
import { MessagingComponent } from './messaging.component';
import { AddsComponent } from '../feed/adds/adds.component';
import { AddsModule } from '../feed/adds/adds.module';


@NgModule({
  declarations: [
    MessagingComponent,
    // AddsComponent
  ],
  imports: [
    CommonModule,
    MessagingRoutingModule,
    AddsModule
  ]
})
export class MessagingModule { }
