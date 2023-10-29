import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';

import { FeedRoutingModule } from './feed-routing.module';
import { FeedComponent } from './feed.component';
import { NewPostComponent } from './new-post/new-post.component';
import { PostsComponent } from './posts/posts.component';
import { PersonalInfoComponent } from './personal-info/personal-info.component';
import { SuggestionComponent } from './suggestion/suggestion.component';
import { RecentsComponent } from './recents/recents.component';
import { AddsComponent } from './adds/adds.component';
import { PostComponent } from './posts/post/post.component';


@NgModule({
  declarations: [
    FeedComponent,
    NewPostComponent,
    PostsComponent,
    PersonalInfoComponent,
    SuggestionComponent,
    RecentsComponent,
    AddsComponent,
    PostComponent
  ],
  imports: [
    CommonModule,
    FeedRoutingModule
  ]
})
export class FeedModule { }
