package com.aaa.health.service.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;
import com.aaa.health.entity.admin.SysUser;

/**
 * user�û�service
 * @author llq
 *
 */
@Service
public interface UserService {
	public SysUser findByUsername(String username);
	public int add(SysUser user);
	public int edit(SysUser user);
	public int editPassword(SysUser user);
	public int delete(String ids);
	public List<SysUser> findList(Map<String, Object> queryMap);
	public int getTotal(Map<String, Object> queryMap);
}
