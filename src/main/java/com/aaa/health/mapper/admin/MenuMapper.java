package com.aaa.health.mapper.admin;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.health.entity.admin.Menu;

/**
 * �˵�����mapper
 * @author llq
 *
 */
@Mapper
public interface MenuMapper {
	int add(Menu menu);
	List<Menu> findList(Map<String, Object> queryMap);
	List<Menu> findTopList();
	int getTotal(Map<String, Object> queryMap);
	int edit(Menu menu);
	int delete(Long id);
	List<Menu> findChildernList(Long parentId);
	List<Menu> findListByIds(String ids);
}
