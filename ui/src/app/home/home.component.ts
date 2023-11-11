import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  isProfileOpen = signal(false);
  isBesinessOpen= signal(false);

  toggleProfile() {
    if(this.isBesinessOpen())this.toggleBesiness();
    this.isProfileOpen.update(p=>!p);
  }

  toggleBesiness(){
    if(this.isProfileOpen())this.toggleProfile();
    this.isBesinessOpen.update(p=>!p);
  }
}
