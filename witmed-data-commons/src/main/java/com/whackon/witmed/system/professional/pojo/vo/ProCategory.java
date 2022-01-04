package com.whackon.witmed.system.professional.pojo.vo;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 专业职务类别实体信息</b>
 *
 * @author Arthur
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class ProCategory extends BaseEntity {
	private static final long serialVersionUID = 3360095505608161612L;
	private String id;                      //主键
	private String code;                    //编码
	private String name;                    //名称

}
