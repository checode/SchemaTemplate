package hystrixmodel.test.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import hystrixmodel.test.service.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    private TestService service;

    /**
     * @HystrixCommand 当主方法体发生异常，将调用降级方法进行处理
     * @param a
     * @return
     */
    @GetMapping
    @HystrixCommand(fallbackMethod = "helloHystrix")
    public Integer hello(@RequestParam("a") Integer a){
        return 10 / a;
    }

    public Integer helloHystrix(Integer a){
        return 800;
    }

    @GetMapping("hello")
    public Integer helloService(@RequestParam("a") Integer a){
        return service.helloService(a);
    }

    @GetMapping("hello1")
    public Integer helloService1(@RequestParam("a") Integer a){
        return service.helloService1(a);
    }

}
