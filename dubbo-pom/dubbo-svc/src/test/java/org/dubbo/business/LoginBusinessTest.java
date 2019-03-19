package org.dubbo.business;

import org.dubbo.api.common.dto.ResultDto;
import org.dubbo.api.dto.EduUserDto;
import org.dubbo.commons.Application;
import org.dubbo.edu.dao.EduUserDAO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: chenjk & tangjh </p>
 * <p>创建时间: 2019年3月19日</p>  
 * <p>作者: chenjk</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>      
 */
//获取启动类，加载配置，确定装载 Spring 程序的装载方法，它回去寻找 主配置启动类（被 @SpringBootApplication 注解的）
//@SpringBootApplication
@WebAppConfiguration
@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class)
public class LoginBusinessTest {
    @Autowired
    private LoginBusiness busi;
    
    @Test
    public void testDoLogin() {
        EduUserDto userDto = new EduUserDto();
        userDto.setPhone("1213123");
//        EduUserDto re = busi.selectByPhonePassword("123", "123");
        busi.doLogin(userDto);
        System.out.println("");
    }

}
