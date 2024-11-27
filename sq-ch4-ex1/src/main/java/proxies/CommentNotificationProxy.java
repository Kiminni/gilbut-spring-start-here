package proxies;

import model.Comment;

public interface CommentNotificationProxy {

  void sendComment(Comment comment); // 알림 전송을 위한 인터페이스
}
