package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.oldpeo.Oldpeo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OldPeopleService {
    public int delete(String ids);
    public List<Map> findList(Map<String, Object> queryMap);
    public int getTotal(Map<String, Object> queryMap);
    // 查询所有用户
    List<Map> queryAllUser(Map map);
    //用户总条数
    Integer queryUserTotal(Map map);
}
