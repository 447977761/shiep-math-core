package com.shiep.math.core.sys.service.impl;

import com.shiep.math.core.sys.dao.SysUserDao;
import com.shiep.math.core.sys.entity.SysUserDTO;
import com.shiep.math.core.sys.service.SysUserService;
import com.shiep.math.core.utils.PasswordUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Auther: zasx-liziyue
 * @Date: 2019/1/2 15:11
 * @Description:
 */
@Service
@Transactional
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserDao sysUserDao;

    @Override
    public Boolean checkSysUser(SysUserDTO sysUserDTO) {
        return PasswordUtil.verify(sysUserDTO.getPassword(),sysUserDao.getSysUser(sysUserDTO));
    }
}
