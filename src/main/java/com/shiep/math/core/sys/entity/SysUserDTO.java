package com.shiep.math.core.sys.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * @Auther: zasx-liziyue
 * @Date: 2019/1/2 15:19
 * @Description:
 */
@Data
@Component
public class SysUserDTO {

    private Long id;

    private String username;

    private String password;

}
