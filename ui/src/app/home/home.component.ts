import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent {
  isProfileOpen = signal(false);
  isBesinessOpen= signal(false);
  isMessagesOpen= signal(false);

  lastConversation = signal<number | null>(null);
  currentConversation = signal<number | null>(null);

  toggleProfile() {
    if(this.isBesinessOpen())this.toggleBesiness();
    this.isProfileOpen.update(p=>!p);
  }

  toggleBesiness(){
    if(this.isProfileOpen())this.toggleProfile();
    this.isBesinessOpen.update(p=>!p);
  }

  toggleMessages() {
    this.isMessagesOpen.update(p=>!p);
  }

  setCurrentMessage(convId: number){
    if(convId===this.currentConversation() || convId===this.lastConversation())return;
    this.lastConversation.set(this.currentConversation());
    this.currentConversation.set(convId);
  }
}
