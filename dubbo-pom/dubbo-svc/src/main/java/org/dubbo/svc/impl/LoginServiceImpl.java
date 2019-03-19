package org.dubbo.svc.impl;

import org.dubbo.api.common.dto.ResultDto;
import org.dubbo.api.dto.EduUserDto;
import org.dubbo.api.service.LoginService;
import org.dubbo.business.LoginBusiness;
import org.springframework.beans.factory.annotation.Autowired;

import com.alibaba.dubbo.config.annotation.Service;


/**
 * <p>标题: </p>
 * <p>描述: </p>
 * <p>版权: chenjk </p>
 * <p>创建时间: 2019年3月19日</p>  
 * <p>作者: chenjk</p>
 * <p>修改历史记录：</p>
 * ====================================================================<br>
 * 维护单：<br>
 * 修改日期：<br>
 * 修改人：<br>
 * 修改内容：<br>      
 */
@Service
public class LoginServiceImpl implements LoginService {
    @Autowired
    private LoginBusiness loginBusiness;
    
    @Override
    public ResultDto<String> doLogin(EduUserDto userDto) {
        System.out.println("已成功远程调用");
        return loginBusiness.doLogin(userDto);
    }

    @Override
    public ResultDto<String> doRegister(EduUserDto userDto) {
        return loginBusiness.doRegister(userDto);
    }

    
}
