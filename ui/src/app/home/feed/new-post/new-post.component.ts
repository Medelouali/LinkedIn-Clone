import { CommonModule } from '@angular/common';
import { Component, signal } from '@angular/core';
import { FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';

@Component({
  selector: 'app-new-post',
  templateUrl: './new-post.component.html',
  styleUrls: ['./new-post.component.css'],
})
export class NewPostComponent {
  isNewPostOn=signal(false);
  areMorePostTypesOn=signal(false);
  newPostFormGroup=new FormGroup({
    text: new FormControl("")
  });

  newPost(){
    this.toggleIsNewPostOn();
  }

  toggleIsNewPostOn(){
    this.isNewPostOn.update(p=>!p);
  }

  createPost(){
    console.log(this.newPostFormGroup.value?.text);
  }
}
