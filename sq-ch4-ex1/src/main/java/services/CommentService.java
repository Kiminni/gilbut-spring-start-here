package services;

import model.Comment;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

public class CommentService {

  // 클래스의 속성으로 의존성을 정의
  private final CommentRepository commentRepository;
  private final CommentNotificationProxy commentNotificationProxy;

  // CommentService 객체 생성 시 의존성을 주입
  public CommentService(CommentRepository commentRepository,
                        CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  // 댓글 저장과 알림 전송을 의존성에 위임하는 사례 구현
  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }

}
