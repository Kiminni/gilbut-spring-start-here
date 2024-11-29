package configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import proxies.CommentNotificationProxy;
import proxies.EmailCommentNotificationProxy;
import repositories.CommentRepository;
import repositories.DBCommentRepository;
import services.CommentService;

@Configuration //@ComponentScan은 스테레오 타입 애너테이션을 쓰지 않기에 필요가 없어졌다.
public class ProjectConfiguration {

  /**
   * @Bean을 통해 매개변수로 오토 와이어링을 사용한다.
   * 각각의 두 의존성에 직접 설정한다.
   */
  @Bean
  public CommentRepository commentRepository() {
    return new DBCommentRepository();
  }

  @Bean
  public CommentNotificationProxy commentNotificationProxy() {
    return new EmailCommentNotificationProxy();
  }

  @Bean //@Bean 을 통해 스프링 컨텍스트에서 호환되는 빈에 대한 참조를 제공한다.
  public CommentService commentService(CommentRepository commentRepository,
                                       CommentNotificationProxy commentNotificationProxy) {
    return new CommentService(commentRepository, commentNotificationProxy);
  }
}
