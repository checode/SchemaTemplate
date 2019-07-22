package modelb;

import modelb.test.bean.TestBean;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @EnableDiscoveryClient和@EnableEurekaClient 启用服务发现客户端（实例）
 * @EnableEurekaClient 基于spring-cloud-netflix依赖，只作用于eureka注册中心
 * @EnableDiscoveryClient 基于spring-cloud-commons依赖，作用于其他注册中心（包括eureka）
 */
//@EnableDiscoveryClient
@EnableEurekaClient
@SpringBootApplication
public class ModelBApplication {

    public static void main(String[] args){
        ConfigurableApplicationContext applicationContext = SpringApplication.run(ModelBApplication.class, args);
        TestBean testBean = applicationContext.getBean(TestBean.class);
        System.out.println("TEST FOO NAME:" + testBean.getName());
    }

}
