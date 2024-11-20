package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        // 스프링 컨텍스트 생성 시 구성 클래스를 매개변수로 전송 후 스프링이 사용하도록 지시
        Parrot p = context.getBean(Parrot.class);
        //
        System.out.println(p.getName());

        String s = context.getBean(String.class);

        System.out.println(s);

        Integer n = context.getBean(Integer.class);

        System.out.println(n);
    }

    /*
    1. 스프링 컨텍스트 생성
    2. 구성 클래스를 매개변수로 전송
    3. 스프링 컨텍스트는 구성 클래스를 사용해 스프링 컨텍스트를 초기화
    4. 스프링 컨텍스트는 구성 클래스의 Bean 메서드를 호출해 반환값을 스프링 컨텍스트에 추가
    5. 스프링 컨텍스트는 getBean 메서드를 사용해 Bean을 가져옴
     */
}
