package modelb.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test")
public class TestContrller {

    @GetMapping
    public String hello(){
        return "test";
    }

    @GetMapping("hello1")
    public Integer hello1(){
        return 102;
    }

}
