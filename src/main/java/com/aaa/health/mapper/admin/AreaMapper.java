package com.aaa.health.mapper.admin;

import com.aaa.health.entity.admin.Menu;
import com.aaa.health.entity.area.Area;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * �˵�����mapper
 * @author llq
 *
 */
@Mapper
public interface AreaMapper {
	int add(Area menu);
	List<Area> findList(Map<String, Object> queryMap);
	List<Area> findTopList();
	int getTotal(Map<String, Object> queryMap);
	int edit(Area menu);
	int delete(Long id);
	List<Area> findChildernList(Long parentId);
	List<Area> findListByIds(String ids);
}
