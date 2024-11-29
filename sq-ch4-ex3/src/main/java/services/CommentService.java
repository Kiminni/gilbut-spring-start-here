package services;

import model.Comment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {

  /**
   * 필드는 final이 아니고, @Autowired로 주입되는 의존성이다.
   * 스프링은 기본 생성자로 클래스의 인스턴스를 가져와 생성하고, 두 의존성을 가져와 주입한다.
   */
  @Autowired
  private CommentRepository commentRepository;

  @Autowired
  private CommentNotificationProxy commentNotificationProxy;

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
