package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.entity.BaseEntity;
import lombok.Data;

/**
 * <b>系统功能 - 行政区划实体信息</b>
 *
 * @author Arthur
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class Division extends BaseEntity {
	private static final long serialVersionUID = 3945728722993461962L;
	private String id;                      //主键
	private String parent;                  //上级区划
	private String code;                    //编码
	private String name;                    //名称


}
