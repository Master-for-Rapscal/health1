package com.aaa.health.mapper.admin;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.health.entity.admin.Role;

/**
 * ��ɫrole mapper
 * @author llq
 *
 */
@Mapper
public interface RoleMapper {
	int add(Role role);
	int edit(Role role);
	int delete(Long id);
	List<Role> findList(Map<String, Object> queryMap);
	int getTotal(Map<String, Object> queryMap);
	Role find(Long id);
}
