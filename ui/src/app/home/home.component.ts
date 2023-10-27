import { Component } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  isProfileOpen = false;
  isBesinessOpen= false;

  toggleProfile() {
    if(this.isBesinessOpen)this.toggleBesiness();
    this.isProfileOpen =!this.isProfileOpen;
  }

  toggleBesiness(){
    if(this.isProfileOpen)this.toggleProfile();
    this.isBesinessOpen=!this.isBesinessOpen;
  }
}
