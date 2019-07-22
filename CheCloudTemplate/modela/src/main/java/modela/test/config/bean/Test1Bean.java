package modela.test.config.bean;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @ConfigurationProperties 读取配置
 * @PropertySource 指定配置源
 */
// @PropertySource("classpath:application.yml")
@ConfigurationProperties("test1")
public class Test1Bean {

    private String name;

    private List<String> secret;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getSecret() {
        return secret;
    }

    public void setSecret(List<String> secret) {
        this.secret = secret;
    }

}
