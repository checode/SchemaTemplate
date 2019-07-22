package modela.test.config.bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public Test1Bean getTest2(){
        return new Test1Bean();
    }

}
