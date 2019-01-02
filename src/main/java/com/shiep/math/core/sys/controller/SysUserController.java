package com.shiep.math.core.sys.controller;


import com.shiep.math.core.common.ResponseEntity;
import com.shiep.math.core.common.ShmCodeEnum;
import com.shiep.math.core.sys.entity.SysUserDTO;
import com.shiep.math.core.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @Auther: zasx-liziyue
 * @Date: 2019/1/2 15:04
 * @Description:
 */
@RestController
@RequestMapping("/mathSubject/sysUser")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;

    @RequestMapping("/checkSysUser")
    public ResponseEntity checkSysUser(@RequestBody SysUserDTO sysUserDTO){
        ResponseEntity re = new ResponseEntity();
        try{
            Boolean isSuccess = sysUserService.checkSysUser(sysUserDTO);
            re.setSuccess(isSuccess);
            re.setCode(ShmCodeEnum.REQUEST_SUCCESS_200.getCode());
            String message = !isSuccess ? "登录失败，用户名或密码错误!":"";
            re.setMessage(message);
        }catch (Exception e){
            re.setSuccess(false);
            re.setCode(ShmCodeEnum.REQUEST_FAIL_900.getCode());
            re.setMessage(ShmCodeEnum.REQUEST_FAIL_900.getDesc());
        }
        return re;
    }

}
