package com.whackon.witmed.system.admin;

import cn.hutool.crypto.digest.MD5;
import cn.hutool.extra.tokenizer.TokenizerUtil;
import com.whackon.witmed.base.controller.BaseController;
import com.whackon.witmed.base.pojo.enums.Status;
import com.whackon.witmed.base.pojo.vo.ResponseVO;
import com.whackon.witmed.base.util.BaseConstants;
import com.whackon.witmed.base.util.RedisUtil;
import com.whackon.witmed.base.util.TokenUtil;
import com.whackon.witmed.system.admin.pojo.vo.AdminLoginVO;
import com.whackon.witmed.system.admin.pojo.vo.AdminVO;
import com.whackon.witmed.system.admin.transport.AdminTransport;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * <b>系统用户控制层类</b>
 *
 * @author: Mr.Xi
 * @create: 2022-01-06 14:23
 * @program: WitmedProject
 **/
@RestController("adminController")
@RequestMapping("/system/admin/admin")
public class AdminController extends BaseController {
	@Autowired
	private AdminTransport adminTransport;
	@Autowired
	private RedisUtil redisUtil;
	public ResponseVO loginAdmin(@RequestBody@Validated AdminLoginVO adminLoginVO, BindingResult result) throws Exception {
		if (result.hasErrors()){
			return ResponseVO.error("请填写正确的手机号码和登录密码");
		}
		//用户信息校验成功，根据手机号码查询用户信息
		AdminVO adminVO = adminTransport.getAdminVOByCellphone(adminLoginVO.getCellphone());
		//判断所得到的的用户信息是否存在
		if (adminVO == null){
			return ResponseVO.error("该用户不存在");
		}
		//用户存在判断是否启用
		if(Status.STATUS_DISABLE.getCode().equals(adminVO.getStatus())){
			//此时用户的状态是禁用状态
			return ResponseVO.error("该用户禁止登录系统");
		}
		String password = MD5.create().digestHex(adminLoginVO.getPassword());
		if (!adminVO.getPassword().equals(password)){
			//此时密码错误
			return ResponseVO.error("手机号码或密码错误");
		}
		//此时用户的手机号码和密码正确
		Map<String, String> claimMap = new HashMap<String, String>();
		claimMap.put("id", adminVO.getId());
		String token = TokenUtil.createToken(claimMap, BaseConstants.EXPIRE_AUTO_SEC);
		//以该 Token 作为 key,以用户对象作为 Value 存储到 Redis 中
		if (redisUtil.saveToRedis(token,adminVO,BaseConstants.EXPIRE_AUTO_SEC)){
			//此时将信息存储到Redis 中成功,那么将Token 返回给用户
			//为了将 Token 交给用户存储，那么我们可以将Token 绑定到 Http 响应对象的消息头的部分  Auhorization
			response.setHeader("Authroization",token);
			//返回前端登陆成功结果
			return ResponseVO.success("系统登录成功",adminVO);
		}
		return ResponseVO.error("系统登录失败");
	}
}
