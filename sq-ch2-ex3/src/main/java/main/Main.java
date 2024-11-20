package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

//        Parrot p = context.getBean(Parrot.class);
//        위와 같다면, Parrot 인스턴스 중 어떤 걸 참조해야할지 모르기 때문에 예외 발생

        Parrot p = context.getBean("parrot1", Parrot.class);
        Parrot q = context.getBean("parrot2", Parrot.class);
        Parrot r = context.getBean("parrot3", Parrot.class);
        System.out.println(p.getName());
        System.out.println(q.getName());
        System.out.println(r.getName());

    }
}
