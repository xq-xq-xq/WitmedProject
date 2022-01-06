package com.whackon.witmed.system.admin.pojo.vo;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import java.io.Serializable;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2022-01-06 14:28
 * @program: WitmedProject
 **/
public class AdminLoginVO implements Serializable {
	private static final long serialVersionUID = -5579801678324121359L;
	@NotBlank(message = "未填写手机号码")
	@Pattern(regexp = "1[0-9]{10}",message = "手机号码格式错误")
	private String cellphone;
	@NotBlank(message = "未填写密码")
	@Pattern(regexp = "A-Za-z0-9_@*]{6,}",message = "登录密码格式错误")
	private String password;

	public String getCellphone() {
		return cellphone;
	}

	public void setCellphone(String cellphone) {
		this.cellphone = cellphone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
