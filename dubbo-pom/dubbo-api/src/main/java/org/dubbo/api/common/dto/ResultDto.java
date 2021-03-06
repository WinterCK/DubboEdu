package org.dubbo.api.common.dto;

import java.io.Serializable;

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
public class ResultDto<T> implements Serializable {

    private static final long serialVersionUID = 1L;
    private static final String SUCCESS_CODE = "0000";
    private static final String ERROR_CODE = "9999";
    
    /** 返回代码Code */
    private String respCode;
    /** 返回信息Msg */
    private String respMsg;
    /** 返回数据value */
    private T value;
    
    public ResultDto() {}
    
    public ResultDto(String respCode) {
        this.respCode = respCode;
    }
    
    public ResultDto(String respCode, String respMsg, T value) {
        this.respCode = respCode;
        this.respMsg = respMsg;
        this.value = value;
    }
    
    /**
     * 成功返回方法
     * @param value
     * @return
     */
    public static <T> ResultDto<T> valueOfSuccess(T value) {
        ResultDto<T> vo = new ResultDto<T>(SUCCESS_CODE);
        vo.value = value;
        return vo;
    }
    
    /**
     * 失败返回方法
     * @param value
     * @return
     */
    public static <T> ResultDto<T> valueOfError(T value) {
        ResultDto<T> vo = new ResultDto<T>(ERROR_CODE);
        vo.value = value;
        return vo;
    }
    
    public static <T> ResultDto<T> valueOfSuccess() {
        return valueOfSuccess(null);
    }
    
    public static <T> ResultDto<T> valueOfError() {
        return valueOfError(null);
    }

    public String getRespCode() {
        return respCode;
    }

    public void setRespCode(String respCode) {
        this.respCode = respCode;
    }

    public String getRespMsg() {
        return respMsg;
    }

    public void setRespMsg(String respMsg) {
        this.respMsg = respMsg;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
	

}
