package com.shiep.math.core.sys.dao;

import com.shiep.math.core.sys.entity.SysUserDTO;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

/**
 * @Auther: zasx-liziyue
 * @Date: 2019/1/2 15:27
 * @Description:
 */
@Component("sysUserDao")
@Mapper
public interface SysUserDao {


    String getSysUser(SysUserDTO sysUserDTO);

}
