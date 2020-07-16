package demo.hystrix;

import demo.service.DemoService;
import org.springframework.stereotype.Component;

@Component
public class DemoServiceHystrix implements DemoService {
    @Override
    public String demoClient(String name) {
        return String.format("you have an bad request,your send msg is %s",name);
    }
}
