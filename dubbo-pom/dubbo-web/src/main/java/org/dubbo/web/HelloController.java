package org.dubbo.web;

import org.dubbo.api.service.HelloService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
@RestController
public class HelloController {
  @Reference
  private HelloService helloService;
  
  @RequestMapping("/sayHello/{name}")
  public String sayHello(@PathVariable String name) {
      System.out.println("success");
    return helloService.SayHello();
  }

}
