package org.dubbo.web;

import org.dubbo.api.common.dto.ResultDto;
import org.dubbo.api.dto.EduUserDto;
import org.dubbo.api.service.HelloService;
import org.dubbo.api.service.LoginService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.dubbo.config.annotation.Reference;
@RestController
public class HelloController {
  @Reference
  private HelloService helloService;
  @Reference
  private LoginService loginService;
  
  @RequestMapping("/sayHello/{name}")
  public String sayHello(@PathVariable String name) {
      System.out.println("success");
    return helloService.SayHello();
  }
  
  @RequestMapping("/dologin/{phone}/{password}")
  public ResultDto<String> doLogin(@PathVariable String phone, @PathVariable String password) {
      EduUserDto user = new EduUserDto();
      user.setPhone(phone);
      user.setPassword(password);
      return loginService.doLogin(user);
  }

}
