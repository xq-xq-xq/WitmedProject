package com.whackon.witmed.system.admin.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.whackon.witmed.system.admin.pojo.vo.Admin;
import org.springframework.stereotype.Repository;

/**
 * <b>系统功能 - 系统用户数据持久层接口</b>
 *
 * @author: Mr.Xi
 * @create: 2022-01-06 14:09
 * @program: WitmedProject
 **/
@Repository
public interface AdminDao extends BaseMapper<Admin> {
}
