import { Component } from '@angular/core';
import { dummyComments } from 'src/assets/consts/dummyComments';
@Component({
  selector: 'app-post',
  templateUrl: './post.component.html',
  styleUrls: ['./post.component.css']
})
export class PostComponent {
  isCommentOpen=true;
  commnets = dummyComments;

  toggleComments(){
    this.isCommentOpen=!this.isCommentOpen;
  }
}
