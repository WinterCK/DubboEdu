package org.dubbo.business;

import org.dubbo.api.common.dto.ResultDto;
import org.dubbo.api.dto.EduUserDto;
import org.springframework.stereotype.Component;

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
public interface LoginBusiness {
    
    ResultDto<String> doLogin(EduUserDto userDto);
    
    ResultDto<String> doRegister(EduUserDto userDto);

}
