package com.whackon.witmed.system.admin.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.whackon.witmed.system.admin.dao.AdminDao;
import com.whackon.witmed.system.admin.pojo.vo.Admin;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.service.AdminService;
import com.whackon.witmed.util.PojoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * <b></b>
 *
 * @author: Mr.Xi
 * @create: 2022-01-06 14:12
 * @program: WitmedProject
 **/
@Service("adminService")
@Transactional
public class AdminServiceImpl implements AdminService {
	@Autowired
	private AdminDao adminDao;

	@Override
	public AdminVO getAdminVOByCellphone(String cellphone) throws Exception {
		//创建 MyBatis Plus 查询对象 QueryWrapper
		QueryWrapper<Admin> queryWrapper = new QueryWrapper<Admin>();
		queryWrapper.eq("cellphone",cellphone);
		//进行查询
		Admin admin = adminDao.selectOne(queryWrapper);
		if(admin != null){
			//实体转视图
			return PojoMapper.INSTANCE.parseToVO(admin);
		}
		return null;
	}
}
