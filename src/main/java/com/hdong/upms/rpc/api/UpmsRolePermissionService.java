package com.hdong.upms.rpc.api;

import com.alibaba.fastjson.JSONArray;
import com.hdong.common.base.BaseService;
import com.hdong.upms.dao.model.UpmsRolePermission;
import com.hdong.upms.dao.model.UpmsRolePermissionExample;

/**
* UpmsRolePermissionService接口
* Created by hdong on 2017/3/20.
*/
public interface UpmsRolePermissionService extends BaseService<UpmsRolePermission, UpmsRolePermissionExample> {
    
    JSONArray getRolePermissionTreeByRoleId(Integer roleId);

    int rolePermissionSave(JSONArray datas, int id);

}