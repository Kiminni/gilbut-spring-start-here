package proxies;

import model.Comment;

public class EmailCommentNotificationProxy implements CommentNotificationProxy {

  @Override
  public void sendComment(Comment comment) {
    System.out.println("Sending notification for comment: " + comment.getText()); // 알림 전송을 위한 구현체
  }
}
