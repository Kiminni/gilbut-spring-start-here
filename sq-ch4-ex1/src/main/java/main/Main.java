package main;

import model.Comment;
import proxies.EmailCommentNotificationProxy;
import repositories.DBCommentRepository;
import services.CommentService;

public class Main {

  public static void main(String[] args) {
    // 의존성 객체 생성
    var commentRepository = new DBCommentRepository();
    var commentNotificationProxy = new EmailCommentNotificationProxy();

    // 의존성 제공하여 서비스 객체 생성
    var commentService = new CommentService(commentRepository,
                                            commentNotificationProxy);
    // 댓글 게시를 위한 댓글 인스턴스 생성
    var comment = new Comment();
    comment.setAuthor("Laurentiu");
    comment.setText("Demo comment");
    // 댓글 게시 사례 호출
    commentService.publishComment(comment);
  }
}
