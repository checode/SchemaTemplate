package hystrixmodel.test.service.impl;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import hystrixmodel.test.service.ITestService;
import hystrixmodel.test.service.hystrix.TestHystrix;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class TestService extends TestHystrix implements ITestService {

    @Autowired
    RestTemplate restTemplate;

    @Override
    @HystrixCommand(fallbackMethod = "helloServiceHystrix")
    public Integer helloService(Integer a) {
        return 20 / a;
    }

    @HystrixCommand(fallbackMethod = "helloService1Hystrix")
    public Integer helloService1(Integer a) {
        Integer f = restTemplate.getForObject("http://modelb/test/hello1",Integer.class);
        System.err.println(f);
        return f / a;
    }
}
