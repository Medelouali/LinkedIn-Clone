import { Component, EventEmitter, Input, Output, signal } from '@angular/core';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-message',
  templateUrl: './message.component.html',
  styleUrls: [ "../messaging.component.css", './message.component.css']
})
export class MessageComponent {
  @Output() closeUp = new EventEmitter<void>();
  @Input() convId: number | null=null;
  
  currentTab=signal("FOCUSED");
  isInputExtended=signal(false);

  setCurrentTab(tab: "FOCUSED" | "OTHER"){
    this.currentTab.set(tab);
  }

  toggleIsInputExtended(){
    this.isInputExtended.update(v=>!v);
  }

  closeUpDialog(){
    this.closeUp.emit();
  }
}
