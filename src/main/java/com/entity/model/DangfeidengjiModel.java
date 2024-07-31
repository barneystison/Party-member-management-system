package com.entity.model;

import com.entity.DangfeidengjiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 党费登记
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2020-12-17 17:40:13
 */
public class DangfeidengjiModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 姓名
	 */
	
	private String xingming;
		
	/**
	 * 所在支部
	 */
	
	private String suozaizhibu;
		
	/**
	 * 缴纳金额
	 */
	
	private Integer jiaonajine;
		
	/**
	 * 登记日期
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date dengjiriqi;
		
	/**
	 * 是否支付
	 */
	
	private String ispay;
				
	
	/**
	 * 设置：姓名
	 */
	 
	public void setXingming(String xingming) {
		this.xingming = xingming;
	}
	
	/**
	 * 获取：姓名
	 */
	public String getXingming() {
		return xingming;
	}
				
	
	/**
	 * 设置：所在支部
	 */
	 
	public void setSuozaizhibu(String suozaizhibu) {
		this.suozaizhibu = suozaizhibu;
	}
	
	/**
	 * 获取：所在支部
	 */
	public String getSuozaizhibu() {
		return suozaizhibu;
	}
				
	
	/**
	 * 设置：缴纳金额
	 */
	 
	public void setJiaonajine(Integer jiaonajine) {
		this.jiaonajine = jiaonajine;
	}
	
	/**
	 * 获取：缴纳金额
	 */
	public Integer getJiaonajine() {
		return jiaonajine;
	}
				
	
	/**
	 * 设置：登记日期
	 */
	 
	public void setDengjiriqi(Date dengjiriqi) {
		this.dengjiriqi = dengjiriqi;
	}
	
	/**
	 * 获取：登记日期
	 */
	public Date getDengjiriqi() {
		return dengjiriqi;
	}
				
	
	/**
	 * 设置：是否支付
	 */
	 
	public void setIspay(String ispay) {
		this.ispay = ispay;
	}
	
	/**
	 * 获取：是否支付
	 */
	public String getIspay() {
		return ispay;
	}
			
}