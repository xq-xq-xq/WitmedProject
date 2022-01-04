package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 系统用户实体信息</b>
 *
 * @author Arthur
 * @version 1.0.0
 * @date 2022/1/4
 * @since 1.0.0
 */
@Data
public class Admin extends BaseEntity {
	private static final long serialVersionUID = 4226492550883944160L;
	private String id;              //主键
	private String no;              //工号
	private String name;            //姓名
	private String cellphone;       //手机号码
	private String password;        //登录密码
	private String role;            //角色
	private String identity;        //身份
	private String department;      //所在部门
	private String techPos;         //服务者专业技术职务
	private String education;       //学历
	private String techPosRank;     //服务者专业技术职务等级

}
