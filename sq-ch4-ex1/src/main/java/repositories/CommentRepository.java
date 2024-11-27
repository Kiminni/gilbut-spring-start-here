package repositories;

import model.Comment;

public interface CommentRepository {

  void storeComment(Comment comment); // 댓글 저장을 위한 인터페이스
}
