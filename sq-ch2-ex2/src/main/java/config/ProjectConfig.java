package config;

import main.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
// @Configuration을 통해서 클래스를 스프링 구성 클래스로
//
public class ProjectConfig {

    @Bean
    // @Bean을 추가해 컨텍스트가 초기화 될 때 메서드 호출 후 반환값 스프링 컨텍스트에 추가
    Parrot parrot() {
        var p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    String hello() {
        return "Hello";
    }

    @Bean
    Integer ten() {
        return 10;
    }
}
