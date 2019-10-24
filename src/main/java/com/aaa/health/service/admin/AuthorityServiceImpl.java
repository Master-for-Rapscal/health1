package com.aaa.health.service.admin;

import java.util.List;

import org.springframework.stereotype.Service;

import com.aaa.health.mapper.admin.AuthorityMapper;
import com.aaa.health.entity.admin.Authority;


import javax.annotation.Resource;

@Service
public class AuthorityServiceImpl implements AuthorityService {

	@Resource
	private AuthorityMapper authorityMapper;
	
	@Override
	public int add(Authority authority) {
		// TODO Auto-generated method stub
		return authorityMapper.add(authority);
	}

	@Override
	public int deleteByRoleId(Long roleId) {
		// TODO Auto-generated method stub
		return authorityMapper.deleteByRoleId(roleId);
	}

	@Override
	public List<Authority> findListByRoleId(Long roleId) {
		// TODO Auto-generated method stub
		return authorityMapper.findListByRoleId(roleId);
	}

}
