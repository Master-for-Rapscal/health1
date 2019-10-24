package com.aaa.health.service.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.aaa.health.mapper.admin.UserMapper;
import com.aaa.health.entity.admin.SysUser;

import javax.annotation.Resource;

/**
 * user�û�serviceimpl
 * @author llq
 *
 */
@Service
public class UserServiceImpl implements UserService {

	@Resource
	private UserMapper userMapper;
	
	@Override
	public SysUser findByUsername(String username) {
		// TODO Auto-generated method stub
		return userMapper.findByUsername(username);
	}

	@Override
	public int add(SysUser user) {
		// TODO Auto-generated method stub
		return userMapper.add(user);
	}

	@Override
	public int edit(SysUser user) {
		// TODO Auto-generated method stub
		return userMapper.edit(user);
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return userMapper.delete(ids);
	}

	@Override
	public List<SysUser> findList(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return userMapper.findList(queryMap);
	}

	@Override
	public int getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return userMapper.getTotal(queryMap);
	}

	@Override
	public int editPassword(SysUser user) {
		// TODO Auto-generated method stub
		return userMapper.editPassword(user);
	}

}
