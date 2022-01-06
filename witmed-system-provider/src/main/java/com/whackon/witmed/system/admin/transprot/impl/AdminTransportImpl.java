package com.whackon.witmed.system.admin.transprot.impl;

import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.service.AdminService;
import com.whackon.witmed.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * <b>传输层接口实现类</b>
 *
 * @author: Mr.Xi
 * @create: 2022-01-06 14:17
 * @program: WitmedProject
 **/
@RestController("admin")
@RequestMapping("/system/admin/admin/trans")
public class AdminTransportImpl implements AdminTransport {
	@Autowired
	private AdminService adminService;

	@PostMapping("/cellphone")
	@Override
	public AdminVO getAdminVOByCellphone(@RequestParam String cellphone) throws Exception {
		return adminService.getAdminVOByCellphone(cellphone);
	}
}
