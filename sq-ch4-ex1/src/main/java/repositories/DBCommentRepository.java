package repositories;

import model.Comment;

public class DBCommentRepository implements CommentRepository {

  @Override
  public void storeComment(Comment comment) {
    System.out.println("Storing comment: " + comment.getText());
  }
  // 댓글 저장을 하기 위한 구현체
}
