package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

// @Qualifier을 통해 CommentNotificationProxy의 구현체를 선택할 수 있다.
// @Qualifier("PUSH")를 통해 CommentPushNotificationProxy를 사용한다.
// @Qualifier("EMAIL")을 통해 EmailCommentNotificationProxy를 사용한다.

@Component
public class CommentService {

  private final CommentRepository commentRepository;

  private final CommentNotificationProxy commentNotificationProxy;
  public CommentService(CommentRepository commentRepository,
                        @Qualifier("PUSH") CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
