package org.dubbo.api.dto;

import java.io.Serializable;

public class ResultDto<T> implements Serializable {

	private static final long serialVersionUID = 1L;
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
	
	
	public static ResultDto valueOfSuccess() {
		return new ResultDto("0000");
	}
	
	public static ResultDto valueOfError() {
		return new ResultDto("9999");
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
