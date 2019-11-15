package com.aaa.health.service.oldpeo;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.oldpeo.Oldarrange;
import com.aaa.health.entity.oldpeo.Oldpeo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface OldPeopleService {
    // 添加
    int add(Oldpeo oldpeo);
    public int delete(String ids);
    public List<Map> findList(Map<String, Object> queryMap);
    public int getTotal(Map<String, Object> queryMap);
    // 查询所有用户
    List<Map> queryAllUser(Map map);
    //用户总条数
    Integer queryUserTotal(Map map);
    //根据用户ID来查询用户
    Map<String,Object> queryUserById(Integer uid);
    // 查询所有用户信息
    List<Map> queryAll(Map map);
    //修改结案
    int edit(Oldpeo oldpeo);

    List<Oldpeo> queryId();
    //随访表查询
    List<Map> queryArrange(int oldpeoId);
    //添加随访
    int addSui(Oldarrange oldarrange);
    //删除随访记录
    public int deleteArr(String ids);
    //查询医生
    List<Map> queryDoctor(Map<String, Object> queryMap);
    //修改随访之前的查询
    List<Oldarrange> queryArr(int oldarrangeId);
//修改
    int updateArr(Oldarrange oldarrange);
}
