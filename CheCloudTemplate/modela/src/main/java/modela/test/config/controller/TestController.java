package modela.test.config.controller;

import modela.test.config.bean.MyConfig;
import modela.test.config.bean.Test1Bean;
import modela.test.config.bean.TestBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("test/config")
public class TestController {

    @Autowired
    TestBean testBean;

    @Autowired
    Test1Bean test1Bean;

    @Autowired
    MyConfig myConfig;

    @RequestMapping("hello")
    public TestBean hello(){
        return testBean;
    }

    @RequestMapping("hello1")
    public Test1Bean hello1(){
        return test1Bean;
    }

    @RequestMapping("hello2")
    public Test1Bean hello2(){
        return myConfig.getTest2();
    }

}
