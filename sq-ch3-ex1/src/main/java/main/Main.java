package main;

import beans.Parrot;
import beans.Person;
import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) {
    var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

    Person person = context.getBean(Person.class);

    Parrot parrot = context.getBean(Parrot.class);

    System.out.println("Person's name: " + person.getName());
    System.out.println("Parrot's name: " + parrot.getName());

    System.out.println("Person's parrot: " + person.getParrot());

    /*
    1. 스프링 컨텍스트 인스턴스를 생성
    2. ProjectConfig 클래스를 사용해 스프링 컨텍스트를 초기화
    3. 스프링 컨텍스트에서 Person과 Parrot 빈을 가져옴
    4. Person과 Parrot 빈의 이름을 출력
    5. Person의 Parrot 객체는 null => 아직 아무런 관계가 설정되지 않음.
    */
  }
}
