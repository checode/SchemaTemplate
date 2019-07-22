package hystrixmodel.test.service.hystrix;

import hystrixmodel.test.service.ITestService;

public abstract class TestHystrix implements ITestService {

    public Integer helloServiceHystrix(Integer a){
        return 2000;
    }

    public Integer helloService1Hystrix(Integer a){
        return 3000;
    }

}
