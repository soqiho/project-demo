package com.liebao.lb7881.demo.common.enums;

import com.liebao.lb7881.common.enums.IErrorCodeEnum;

/**
 * 
 * @author Administrator
 *
 */
public enum ErrorCodeEnum implements IErrorCodeEnum {
	
	
	/**
	 * 无可用的卡密
	 */   
	NO_AVAILABLE_CARD_SECRET("5001","无可用的卡密"),
	/**
	 * 卡管理查询多条结果集异常
	 */   
	CARDSECRET_QUERY_REPEAT("5003","卡管理查询多条结果集异常"),
	/**
	 * 卡密状态异常
	 */   
	CARDSECRET_STATUS_ILLEGAL("5004","卡密状态异常"),
	
	
	/**
     * 查询结果为空
     */
    QUERY_NO_RESULT("9997","查询结果为空"),
    /**
     * 参数非法
     */
    ILLEGAL_ARGUMENT("9998","参数非法"),
    /**
     * 日期格式转换异常
     */
    DATE_PARSE_EXCEPTION("ERROR9997","日期格式转换异常"),
    /**
     * 成功
     */
    SUCCESS("0000","success"),
    /**
     * 系统异常
     */
    SYSTEM_ERROR("9999","当前网络忙，请稍后再试");
	
	 /**
     * 响应码
     */ 
	private String responseCode;
    /**
     * 描述
     */
    private String responseMsg;
    /**
     * 私有构造函数
     * 
     * @param responseCode
     * @param responseMsg
     */
    private ErrorCodeEnum(String responseCode, String responseMsg) {
        this.responseCode = responseCode;
        this.responseMsg = responseMsg;
    }

	@Override
	public String getResponseCode() {
		return responseCode;
	}

	@Override
	public String getResponseMsg() {
		return responseMsg;
	}
	

}
