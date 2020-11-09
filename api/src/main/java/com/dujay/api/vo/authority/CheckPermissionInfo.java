package com.dujay.api.vo.authority;

import lombok.Data;

/**
 * <p>验证信息</p>
 * @author hourz
 * @since 2020-11-20
 **/
@Data
public class CheckPermissionInfo{
    // 请求权限资源
    private PermissionInfo permissionInfo;
    // 是否有权限
    private Boolean isAuth;
}
