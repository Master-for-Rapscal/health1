
package com.aaa.health.mapper.othslow;

import com.aaa.health.entity.othslow.Othslow;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

    @Mapper
    public interface OthSlowMapper {
        public int delete(String ids);
        List<Map> findList(Map<String, Object> queryMap);
        int getTotal(Map<String, Object> queryMap);
        //添加
        int add(Othslow othslow);
//查询医生
        List<Map> queryDoctor();
//查询所有慢病
        List<Map> queryName();
        // 查询所有用户
        List<Map> queryAllUser(Map map);
        //用户总条数
        Integer queryUserTotal(Map map);
        //根据用户ID来查询用户
        Map<String,Object> queryUserById(Integer uid);
        //查询用户
        List<Map> queryAll(Map map);
        //修改之前的查询
        List<Othslow> queryId();
        //修改
        int edit(Othslow othslow);

        //修改之前查询
        List<Othslow>  queryEdit(int othslowId);
        //修改结案
        int upState(Othslow othslow);
        //查询慢病
        List<Map> queryDis();

    }


