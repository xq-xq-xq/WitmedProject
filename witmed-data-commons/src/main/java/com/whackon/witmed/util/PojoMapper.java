package com.whackon.witmed.util;

import com.whackon.witmed.system.admin.pojo.vo.Admin;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2022-01-06 15:39
 * @program: WitmedProject
 **/
@Mapper(componentModel = "spring")
public interface PojoMapper {
	PojoMapper INSTANCE = Mappers.getMapper(PojoMapper.class);

	//实体转视图
	AdminVO parseToVO(Admin entity);
}
