package model;

public class Comment {

  private String author;
  private String text;

  public String getAuthor() {
    return author;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }
}

/*
 스프링이 객체를 제어하고, 프레임워크가 제공하는 기능으로 객체를 더욱 보강하려는 것
 의존성이 없고, 그 자체로 의존성이 아닌 유일한 객체
 현재 사용하는 유일한 스프링 기능은 DI(Dependency Injection)이다.
 객체가 컨텍스트로부터 주입해야하는 의존성이 있거나, 그 자체가 의존성인 경우 해당 객체를 스프링 컨텍스트에 추가
 프레임워크가 관리할 필요 없는 Comment는 스프링 컨텍스트가 객체를 관리할 이유가 없다.
*/

