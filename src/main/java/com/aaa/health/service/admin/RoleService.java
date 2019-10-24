package com.aaa.health.service.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.aaa.health.entity.admin.Role;

/**
 * ��ɫrole service
 * @author llq
 *
 */
@Service
public interface RoleService {
	int add(Role role);
	int edit(Role role);
	int delete(Long id);
	List<Role> findList(Map<String, Object> queryMap);
	int getTotal(Map<String, Object> queryMap);
	Role find(Long id);
}
