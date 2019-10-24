package com.aaa.health.service.admin;
/**
 * �˵�����ʵ����
 */
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.aaa.health.mapper.admin.MenuMapper;
import com.aaa.health.entity.admin.Menu;
import com.aaa.health.service.admin.MenuService;

import javax.annotation.Resource;

@Service
public class MenuServiceImpl implements MenuService {

	@Resource
	private MenuMapper menuMapper;
	
	@Override
	public int add(Menu menu) {
		// TODO Auto-generated method stub
		return menuMapper.add(menu);
	}

	@Override
	public List<Menu> findList(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return menuMapper.findList(queryMap);
	}

	@Override
	public List<Menu> findTopList() {
		// TODO Auto-generated method stub
		return menuMapper.findTopList();
	}

	@Override
	public int getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return menuMapper.getTotal(queryMap);
	}

	@Override
	public int edit(Menu menu) {
		// TODO Auto-generated method stub
		return menuMapper.edit(menu);
	}

	@Override
	public int delete(Long id) {
		// TODO Auto-generated method stub
		return menuMapper.delete(id);
	}

	@Override
	public List<Menu> findChildernList(Long parentId) {
		// TODO Auto-generated method stub
		return menuMapper.findChildernList(parentId);
	}

	@Override
	public List<Menu> findListByIds(String ids) {
		// TODO Auto-generated method stub
		return menuMapper.findListByIds(ids);
	}

}
