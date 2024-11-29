package proxies;

import model.Comment;
import org.springframework.stereotype.Component;

@Component // 스프링이 클래스의 인스턴스를 만들고 빈으로 추가하도록 지시
public class EmailCommentNotificationProxy implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText());
  }
}
