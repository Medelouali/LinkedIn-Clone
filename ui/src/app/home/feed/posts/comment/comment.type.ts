

export default interface Comment {
    commentText: string;
    commenterName: string;
    commenterJob: string;
    timeStamp: string;
    reactions: number;
    commenterAvatar: string;
    replies?: Comment[];
  }
  