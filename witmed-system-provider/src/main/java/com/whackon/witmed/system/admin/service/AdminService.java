package com.whackon.witmed.system.admin.service;

import com.whackon.witmed.system.admin.pojo.vo.AdminVO;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2022-01-06 14:10
 * @program: WitmedProject
 **/
public interface AdminService {

	AdminVO getAdminVOByCellphone(String cellphone) throws Exception;
}
