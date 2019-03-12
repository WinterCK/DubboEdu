package org.dubbo.svc.impl;

import org.dubbo.api.dto.ResultDto;
import org.dubbo.api.service.HelloService;

import com.alibaba.dubbo.config.annotation.Service;

@Service
public class HelloServiceImpl implements HelloService {

    @Override
    public String SayHello() {
        System.out.println("Hello, Dubbo");
        return "Hello";
    }

}
