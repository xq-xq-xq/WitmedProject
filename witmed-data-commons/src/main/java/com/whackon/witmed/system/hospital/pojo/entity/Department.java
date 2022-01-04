package com.whackon.witmed.system.hospital.pojo.VO;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 医院部门实体信息</b>
 *
 * @author Arthur
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Department extends BaseEntity {
	private static final long serialVersionUID = -5793475151487271519L;
	private String id;                      //主键
	private String hospital;                //所在医院
	private String parent;                  //上级部门
	private String code;                    //编码
	private String name;                    //名称

}
