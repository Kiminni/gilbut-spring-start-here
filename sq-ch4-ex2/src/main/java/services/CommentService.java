package services;

import model.Comment;
import org.springframework.stereotype.Component;
import proxies.CommentNotificationProxy;
import repositories.CommentRepository;

@Component
public class CommentService {

  private final CommentRepository commentRepository;
  private final CommentNotificationProxy commentNotificationProxy; // 생성자가 2개 이상이라면 @Autowired를 사용해야 함

  // 스프링은 이 생성자로 빈을 생성하며, 빈 인스턴스를 생성할 때 매개변수의 레퍼런스를 주입
  public CommentService(CommentRepository commentRepository,
                        CommentNotificationProxy commentNotificationProxy) {
    this.commentRepository = commentRepository;
    this.commentNotificationProxy = commentNotificationProxy;
  }

  public void publishComment(Comment comment) {
    commentRepository.storeComment(comment);
    commentNotificationProxy.sendComment(comment);
  }
}
