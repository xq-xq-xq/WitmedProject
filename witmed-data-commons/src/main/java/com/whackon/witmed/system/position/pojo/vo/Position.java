package com.whackon.witmed.system.position.pojo.vo;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 人员职务实体信息</b>
 *
 * @author Arthur
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Position extends BaseEntity {
	private static final long serialVersionUID = 2453178190528955472L;
	private String id;                      //主键
	private String code;                    //编码
	private String name;                    //名称

}
