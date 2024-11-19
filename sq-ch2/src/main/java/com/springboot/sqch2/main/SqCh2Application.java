package com.springboot.sqch2.main;

import com.springboot.sqch2.config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class SqCh2Application {
    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);
        Parrot p = context.getBean(Parrot.class);
        System.out.println(p.getName());

        Carrot c = context.getBean(Carrot.class);
        System.out.println(c.getName());

        Parrot x = new Parrot();
        x.setName("pupu");

        Supplier<Parrot> parrotSupplier = () -> x;
        context.registerBean("parrot1", Parrot.class, parrotSupplier);
        Parrot p2 = context.getBean("parrot1", Parrot.class);
        System.out.println(p2.getName());
    }

}
