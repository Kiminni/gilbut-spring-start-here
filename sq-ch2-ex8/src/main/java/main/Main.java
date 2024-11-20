package main;

import config.ProjectConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.function.Supplier;

public class Main {

    public static void main(String[] args) {
        var context = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Parrot x = new Parrot();
        x.setName("Kiki");

        Supplier<Parrot> parrotSupplier = () -> x;

        //context.registerBean("parrot1", Parrot.class, parrotSupplier);
        // beanName, beanType, supplier, customizer을 인자로 받는다.
        context.registerBean("parrot1",
                Parrot.class,
                parrotSupplier,
                bc -> bc.setPrimary(true));



        Parrot p = context.getBean(Parrot.class);

        System.out.println(p.getName());
    }
}
