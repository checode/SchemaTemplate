package modela.test.config.bean;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * @Value读取配置
 */
@Component
public class TestBean {

    @Value("${test.name}")
    private String name;

    @Value("${test.secret}")
    private String secret;

    public static TestBean builder(){
        return new TestBean();
    }

    public String getName() {
        return name;
    }

    public TestBean setName(String name) {
        this.name = name;
        return this;
    }

    public String getSecret() {
        return secret;
    }

    public TestBean setSecret(String secret) {
        this.secret = secret;
        return this;
    }

}
