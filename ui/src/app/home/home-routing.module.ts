import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './home.component';

const routes: Routes = [
  { path: '', redirectTo: '/feed', pathMatch: 'full' },
  { 
    path: 'feed', 
    loadChildren: () => import('./feed/feed.module').then(m => m.FeedModule) 
  }, { 
    path: 'network', 
    loadChildren: () => import('./network/network.module').then(m => m.NetworkModule) 
  }, 
  { 
    path: 'jobs', 
    loadChildren: () => import('./jobs/jobs.module').then(m => m.JobsModule) 
  }, 
  { 
    path: 'messaging', 
    loadChildren: () => import('./messaging/messaging.module').then(m => m.MessagingModule) 
  }, 
  { 
    path: 'notifications', 
    loadChildren: () => import('./notifications/notifications.module').then(m => m.NotificationsModule) 
  }, 
  { 
    path: 'profile', 
    loadChildren: () => import('./profile/profile.module').then(m => m.ProfileModule) 
  },
  { path: '**', redirectTo: '/feed' }
];

@NgModule({
  imports: [RouterModule.forChild(routes)],
  exports: [RouterModule]
})
export class HomeRoutingModule { }
