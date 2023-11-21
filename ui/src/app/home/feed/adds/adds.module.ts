import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { AddsComponent } from './adds.component';



@NgModule({
  declarations: [
    AddsComponent
  ],
  imports: [
    CommonModule
  ],
  exports: [
    AddsComponent
  ]
})
export class AddsModule { }
