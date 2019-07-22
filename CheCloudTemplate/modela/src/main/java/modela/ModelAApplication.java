package modela;

import modela.test.config.bean.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

@EnableEurekaClient
@SpringBootApplication
public class ModelAApplication {

    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ModelAApplication.class, args);
        TestBean testBean= applicationContext.getBean(TestBean.class);
        System.out.println("TEST FOO NAME:" + testBean.getName());
    }

}
