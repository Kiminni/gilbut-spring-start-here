package main;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class Parrot {

    private String name;

    @PostConstruct // 빈을 생성 후 하는 행동을 정의하기 위해 사용

    public void init() {
        this.name = "Kiki";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
