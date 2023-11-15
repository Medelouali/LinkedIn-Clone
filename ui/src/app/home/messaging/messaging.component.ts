import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-messaging',
  templateUrl: './messaging.component.html',
  styleUrls: ['./messaging.component.css']
})
export class MessagingComponent {
  currentTab=signal("FOCUSED");
  isInputExtended=signal(false);

  setCurrentTab(tab: "FOCUSED" | "OTHER"){
    this.currentTab.set(tab);
  }

  toggleIsInputExtended(){
    this.isInputExtended.update(v=>!v);
  }
}
