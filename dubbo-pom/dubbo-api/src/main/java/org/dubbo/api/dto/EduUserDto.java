package org.dubbo.api.dto;

import java.io.Serializable;

/**
 * <p>标题: 用户Dto</p>
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
public class EduUserDto implements Serializable {

    private static final long serialVersionUID = 1L;
    
    public String email;
    
    public String password;
    
    /** 姓名 */
    public String name;
    
    public String phone;
    
    /** 身份证 */
    public String idCard;
    
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
    public String getIdCard() {
        return idCard;
    }
    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }

}
