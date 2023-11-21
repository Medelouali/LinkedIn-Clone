import { Component, EventEmitter, Input, Output, signal } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-messages',
  templateUrl: './messages.component.html',
  styleUrls: ["../messaging.component.css", './messages.component.css']
})
export class MessagesComponent {
  @Output() messagesEvent = new EventEmitter<void>();
  @Output() setCurrentMessage = new EventEmitter<number>();

  currentTab=signal("FOCUSED");
  isInputExtended=signal(false);

  setCurrentTab(tab: "FOCUSED" | "OTHER"){
    this.currentTab.set(tab);
  }

  toggleIsInputExtended(){
    this.isInputExtended.update(v=>!v);
  }

  toggleMessages() {
    this.messagesEvent.emit();
  }

  setCurrentMessage_(convId: number){
    this.setCurrentMessage.emit(convId);
  }
}
