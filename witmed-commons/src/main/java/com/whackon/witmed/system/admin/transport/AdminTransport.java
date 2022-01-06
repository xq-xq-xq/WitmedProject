package com.whackon.witmed.system.admin.transport;

import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * <b>系统业务传输层接口</b>
 *
 * @author: Mr.Xi
 * @create: 2022-01-06 14:14
 * @program: WitmedProject
 **/
@FeignClient(name = "witmed-system-provider")
public interface AdminTransport {
	/**
	 * 根据手机号码查询用户信息
	 * @param cellphone
	 * @return
	 * @throws Exception
	 */
	@PostMapping("/system/admin/admin/trans/cellphone")
	AdminVO getAdminVOByCellphone(@RequestParam String cellphone) throws Exception;
}
