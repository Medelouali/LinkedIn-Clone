import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { MessagingComponent } from './messaging.component';
import { AddsComponent } from '../feed/adds/adds.component';

const routes: Routes = [{ path: '', component: MessagingComponent }];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule],
})
export class MessagingRoutingModule { }
