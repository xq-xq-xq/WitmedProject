package com.whackon.witmed.system.admin.pojo.vo;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 系统用户角色实体信息</b>
 *
 * @author Arthur
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Role extends BaseEntity {
	private static final long serialVersionUID = 3832012392097686144L;
	private String id;                  //主键
	private String code;                //角色编码
	private String name;                //角色名称


}
