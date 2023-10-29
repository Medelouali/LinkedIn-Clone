import { Component } from '@angular/core';

@Component({
  selector: 'app-new-post',
  templateUrl: './new-post.component.html',
  styleUrls: ['./new-post.component.css']
})
export class NewPostComponent {
  isNewPostOn=false;

  newPost(){
    this.toggleIsNewPostOn();
  }

  toggleIsNewPostOn(){
    this.isNewPostOn=!this.isNewPostOn;
  }
}
