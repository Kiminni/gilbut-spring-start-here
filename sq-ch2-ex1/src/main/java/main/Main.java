package main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext();

        Parrot p = new Parrot();
        /*
        1. 스프링 컨텍스트와 패럿 객체를 생성
        2. Parrot 객체는 스프링 컨텍스트 외부에 존재
        3. 스프링 컨텍스트는 비어있다.
        */
    }
}
