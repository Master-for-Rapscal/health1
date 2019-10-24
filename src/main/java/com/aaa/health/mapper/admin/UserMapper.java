package com.aaa.health.mapper.admin;

import java.util.List;
import java.util.Map;

import com.aaa.health.entity.admin.Menu;
import org.apache.ibatis.annotations.Mapper;

import com.aaa.health.entity.admin.SysUser;

/**
 * user�û�mapper
 * @author llq
 *
 */
@Mapper
public interface UserMapper {
	 SysUser findByUsername(String username);
	 int add(SysUser user);
	 int edit(SysUser user);
	 int editPassword(SysUser user);
	 int delete(String ids);
	 List<SysUser> findList(Map<String, Object> queryMap);
	 List<Menu> findByUsername2(Long id);
	 int getTotal(Map<String, Object> queryMap);

}
