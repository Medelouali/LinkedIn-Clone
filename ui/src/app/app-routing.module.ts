import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';

const routes: Routes = [
  { path: '', loadChildren: () => import('./welcome/welcome.module').then(m => m.WelcomeModule) },
  { 
    path: 'home', 
    loadChildren: () => import('./home/home.module').then(m => m.HomeModule) 
  }, 
  { 
    path: 'login', 
    loadChildren: () => import('./login/login.module').then(m => m.LoginModule) 
  }, 
  { 
    path: 'register', 
    loadChildren: () => import('./register/register.module').then(m => m.RegisterModule) 
  },
  { 
    path: 'welcome', 
    loadChildren: () => import('./welcome/welcome.module').then(m => m.WelcomeModule) 
  },
  { path: "**", redirectTo: "/home", pathMatch: 'full' },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
