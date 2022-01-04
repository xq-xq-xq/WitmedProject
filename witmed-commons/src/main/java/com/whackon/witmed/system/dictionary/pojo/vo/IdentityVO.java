package com.whackon.witmed.system.dictionary.pojo.vo;

import com.whackon.witmed.base.pojo.vo.BaseVO;
import lombok.Data;

/**
 * <b>系统功能 - 人员身份实体信息</b>
 *
 * @author Arthur
 * @date 2022/1/4
 * @version 1.0.0
 * @since 1.0.0
 */
@Data
public class IdentityVO extends BaseVO {
	private static final long serialVersionUID = 7229802796791467997L;
	private String id;                      //主键
	private String code;                    //编码
	private String name;                    //名称

}
