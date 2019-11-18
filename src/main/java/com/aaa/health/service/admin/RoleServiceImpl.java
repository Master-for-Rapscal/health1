package com.aaa.health.service.admin;
/**
 * ��ɫrole��ʵ����
 */
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.aaa.health.mapper.admin.RoleMapper;
import com.aaa.health.entity.admin.Role;
import com.aaa.health.service.admin.RoleService;

import javax.annotation.Resource;

@Service
public class RoleServiceImpl implements RoleService {

	@Resource
	private RoleMapper roleMapper;
	
	@Override
	public int add(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.add(role);
	}

	@Override
	public int edit(Role role) {
		// TODO Auto-generated method stub
		return roleMapper.edit(role);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return roleMapper.delete(id);
	}

	@Override
	public List<Role> findList(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return roleMapper.findList(queryMap);
	}

	@Override
	public int getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return roleMapper.getTotal(queryMap);
	}

	@Override
	public Role find(Long id) {
		// TODO Auto-generated method stub
		Role  a = roleMapper.find(id);

		return a;
	}

}
