package com.whackon.witmed.system.professional.pojo.vo;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 专业职务实体信息</b>
 *
 * @author Arthur
 * @version 1.0.0
 * @date 2022/1/4
 * @since 1.0.0
 */
@Data
public class ProTitle extends BaseEntity {
	private static final long serialVersionUID = -6233871189769297005L;
	private String id;                      //主键
	private String category;                //所属类别
	private String rank;                    //所属等级
	private String code;                    //编码
	private String name;                    //名称

}
