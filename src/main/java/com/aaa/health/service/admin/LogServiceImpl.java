package com.aaa.health.service.admin;

import java.util.Date;
import java.util.List;
import java.util.Map;
import org.springframework.stereotype.Service;

import com.aaa.health.mapper.admin.LogMapper;
import com.aaa.health.entity.admin.Log;
import javax.annotation.Resource;

@Service
public class LogServiceImpl implements LogService {

	@Resource
	private LogMapper logMapper;

	@Override
	public int add(Log log) {
		return logMapper.add(log);
	}

	@Override
	public List<Log> findList(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return logMapper.findList(queryMap);
	}

	@Override
	public int getTotal(Map<String, Object> queryMap) {
		// TODO Auto-generated method stub
		return logMapper.getTotal(queryMap);
	}

	@Override
	public int delete(String ids) {
		// TODO Auto-generated method stub
		return logMapper.delete(ids);
	}

	@Override
	public int add(String content) {
		// TODO Auto-generated method stub
		Log log = new Log();
		log.setContent(content);
		log.setCreateTime(new Date());
		return logMapper.add(log);
	}
	
	

}
