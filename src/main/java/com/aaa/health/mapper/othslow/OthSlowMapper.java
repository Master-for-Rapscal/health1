
package com.aaa.health.mapper.othslow;

import com.aaa.health.entity.admin.SysUser;
import com.aaa.health.entity.oldpeo.Oldpeo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

    @Mapper
    public interface OthSlowMapper {
        public int delete(String ids);
        List<Map> findList(Map<String, Object> queryMap);
        int getTotal(Map<String, Object> queryMap);
    }


