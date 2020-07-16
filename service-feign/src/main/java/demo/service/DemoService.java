package demo.service;

import demo.hystrix.DemoServiceHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "eureka-client",fallback = DemoServiceHystrix.class)
public interface DemoService {
    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String demoClient(@RequestParam(value = "name")String name);
}
