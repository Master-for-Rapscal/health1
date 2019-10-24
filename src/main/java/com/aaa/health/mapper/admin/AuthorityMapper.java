package com.aaa.health.mapper.admin;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.aaa.health.entity.admin.Authority;

/**
 * Ȩ��ʵ����mapper
 * @author llq
 *
 */
@Mapper
public interface AuthorityMapper {
	int add(Authority authority);
	int deleteByRoleId(Long roleId);
	List<Authority> findListByRoleId(Long roleId);
}
