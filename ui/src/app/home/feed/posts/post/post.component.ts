import { Component, signal } from '@angular/core';
import { dummyComments } from 'src/assets/consts/dummyComments';
import { inputEmojis } from 'src/assets/emojis/emojis';
@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css', "../post/post.component.css"]
})
export class PostComponent {
  isCommentOpen=signal(true);
  isEmojisOn=signal(false);
  commnets = signal(dummyComments);
  emojisIcons = signal(inputEmojis);

  toggleComments(){
    this.isCommentOpen.update(prev=>!prev);
  }

  toggleEmojis(){
    this.isEmojisOn.update(prev=>!prev);
  }

  removeWhiteSpaces(stringWithSpaces: string): string{
    return stringWithSpaces.replace(/\s/g, '');
  }
}
