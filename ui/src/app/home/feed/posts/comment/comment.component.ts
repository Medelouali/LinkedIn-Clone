import { Component, Input, signal } from '@angular/core';
import { CommonModule } from '@angular/common';
import Comment from './comment.type';

@Component({
  selector: 'app-comment',
  templateUrl: './comment.component.html',
  styleUrls: ["../post/post.component.css", './comment.component.css']
})
export class CommentComponent {
  @Input() comment: Comment | null = null;
  @Input() ratio: number=0;
  isCommentEnabled=signal(false);

  replyToComment(){
    this.isCommentEnabled.set(true);
  }
}
