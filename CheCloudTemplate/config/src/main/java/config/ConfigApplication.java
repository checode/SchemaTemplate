package config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

/**
 * Spring Cloud Config服务端
 * @EnableConfigServer 启动配置中心
 * 配置访问地址：http://host:port/foo/development
 */
@SpringBootApplication
@EnableConfigServer
public class ConfigApplication {

    public static void main(String[] args){
        SpringApplication.run(ConfigApplication.class, args);
    }

}
