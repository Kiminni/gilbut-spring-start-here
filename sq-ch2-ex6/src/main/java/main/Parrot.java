package main;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component //@Component 애너테이션을 통해 인스턴스 생성 후 컨텍스트에 추가
public class Parrot {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
