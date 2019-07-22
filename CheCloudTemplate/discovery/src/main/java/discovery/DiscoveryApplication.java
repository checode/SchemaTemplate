// 根包（项目结构根部的package）
package discovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 主应用程序类（启动类，通常放于根包中，否则可能会引起不必要的麻烦）
 * @SpringBootApplication 相当于同时使用以下三个注解
 * @Configuration 声明配置类
 * @EnableAutoConfiguration 自动配置（可以使用exclude属性来禁用不需要的自动配置类，
 * 可以使用@Import注解来手动引入配置类）
 * @ComponentScan 自动扫描所有Spring组件（如果在非根包使用，需要制定basePackage属性，
 * 并且不可以直接使用@SpringBootApplication代替）
 *
 * @EnableEurekaServer 启用Eureka服务端（注册中心）
 */
@SpringBootApplication
@EnableEurekaServer
public class DiscoveryApplication {

    public static void main(String[] args){
        SpringApplication.run(DiscoveryApplication.class, args);
    }

}
