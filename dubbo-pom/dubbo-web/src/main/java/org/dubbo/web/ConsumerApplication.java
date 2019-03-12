package org.dubbo.web;

import org.dubbo.api.service.HelloService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.alibaba.dubbo.config.annotation.Reference;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: chenjk & tangjh </p>
 * <p>创建时间: 2019年3月12日</p>  
 * <p>作者: chenjk</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>      
 */
@SpringBootApplication
public class ConsumerApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
