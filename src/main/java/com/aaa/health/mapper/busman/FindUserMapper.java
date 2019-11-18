package com.aaa.health.mapper.busman;

import com.aaa.health.entity.pultub.Puserinfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;
@Mapper
public interface FindUserMapper {
    List<Puserinfo> findList(Map<String, Object> queryMap);
    int getTotal(Map<String, Object> queryMap);
    List<Puserinfo> findUserById(Map<String, Object> queryMap);
    int getUserById(Map<String, Object> queryMap);
}
