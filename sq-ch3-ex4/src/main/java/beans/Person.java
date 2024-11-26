package beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

  private String name = "Ella";

  @Autowired
  private Parrot parrot;

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Parrot getParrot() {
    return parrot;
  }

  public void setParrot(Parrot parrot) {
    this.parrot = parrot;
  }
}

/*
1. @Component는 Person 타입의 빈을 생성하고 추가하도록 지시
2. 스프링 컨텍스트에서 빈을 가져와 @Autowired 애너테이션된 필드 값에 설정하도록 지시
*/
