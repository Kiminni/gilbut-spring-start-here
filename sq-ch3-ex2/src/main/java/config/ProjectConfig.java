package config;

import beans.Parrot;
import beans.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {

  @Bean
  public Parrot parrot() {
    Parrot p = new Parrot();
    p.setName("Koko");
    return p;
  }

  @Bean
  public Person person() {
    Person p = new Person();
    p.setName("Ella");
    p.setParrot(parrot());
    return p;
  }

  /*
  1. Parrot 빈을 생성하고 이름을 "Koko"로 설정
  2. Person 빈을 생성하고 이름을 "Ella"로 설정
  3. Person 빈의 Parrot 프로퍼티를 Parrot 빈으로 설정
  4. 이 때, Parrot 빈이 이미 생성되어 있으므로, Parrot 빈을 생성하는 메서드를 호출하지 않고, 이미 생성된 Parrot 빈을 사용
  5. 만약, 스프링 컨텍스트에 Parrot 빈이 없다면, Person 빈 내의 Parrot 빈을 생성하는 메서드를 호출하여 Parrot 빈을 생성
  */
}
