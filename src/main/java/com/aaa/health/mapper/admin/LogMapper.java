package com.aaa.health.mapper.admin;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import com.aaa.health.entity.admin.Log;

/**
 * ϵͳ��־��mapper
 * @author llq
 *
 */
@Mapper
public interface LogMapper {
	public int add(Log log);
	public List<Log> findList(Map<String, Object> queryMap);
	public int getTotal(Map<String, Object> queryMap);
	public int delete(String ids);
}
