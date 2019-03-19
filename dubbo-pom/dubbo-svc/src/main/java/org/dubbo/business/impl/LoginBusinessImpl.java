package org.dubbo.business.impl;

import org.dubbo.api.common.dto.ResultDto;
import org.dubbo.api.dto.EduUserDto;
import org.dubbo.business.LoginBusiness;
import org.dubbo.edu.dao.EduUserDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.alibaba.dubbo.common.utils.StringUtils;

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
@Repository
public class LoginBusinessImpl implements LoginBusiness {
    @Autowired
    private EduUserDAO userDao;

    @Override
    public ResultDto<String> doLogin(EduUserDto userDto) {
        ResultDto<String> result = checkParams(userDto);
        if("0000".equals(result.getRespCode())) {
            EduUserDto user = userDao.selectByPhonePassword(userDto.getPhone(), userDto.getPassword());
            if(user == null) {
                result.setRespCode("9999");
                result.setRespMsg("请您注册后再登录!");
                return result;
            }
            //有数据
            result.setValue(user.getName());
            return result;
        }
        //返回respCode为失败
        return result;
    }

    @Override
    public ResultDto<String> doRegister(EduUserDto userDto) {
        userDao.insertEduUser(userDto);
        return ResultDto.valueOfSuccess("注册成功");
    }

    public ResultDto<String> checkParams(EduUserDto userDto) {
        if(StringUtils.isBlank(userDto.getPhone())) {
            return ResultDto.valueOfError("请使用手机号登录");
        }
        return ResultDto.valueOfSuccess();
    }
}
