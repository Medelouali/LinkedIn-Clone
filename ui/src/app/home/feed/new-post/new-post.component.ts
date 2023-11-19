import { Component, signal } from '@angular/core';

@Component({
  selector: 'app-new-post',
  templateUrl: './new-post.component.html',
  styleUrls: ['./new-post.component.css']
})
export class NewPostComponent {
  isNewPostOn=signal(false);
  areMorePostTypesOn=signal(false);

  newPost(){
    this.toggleIsNewPostOn();
  }

  toggleIsNewPostOn(){
    this.isNewPostOn.update(p=>!p);
  }
}
