package proxies;

import model.Comment;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary가 없다면 NoUniqueBeanDefinitionException 이 발생한다.
// @Primary는 여러 빈 중에서 우선순위를 정할 때 사용한다.
// 특정 인터페이스에 대한 구현을 제공하는 인터페이스를 사용하나, 어느순간 맞아 떨어지지 않는다면 가장 간단하게 @Primary를 사용할 수 있다.
@Primary
public class CommentPushNotificationProxy
        implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending push notification for comment: " + comment.getText());
  }
}
