package com.aaa.health.service.admin;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.aaa.health.entity.admin.Menu;

/**
 * �˵�����service
 *
 * @author llq
 */
@Service
public interface MenuService {
    int add(Menu menu);

    List<Menu> findList(Map<String, Object> queryMap);

    List<Menu> findTopList();

    int getTotal(Map<String, Object> queryMap);

    int edit(Menu menu);

    int delete(Long id);

    List<Menu> findChildernList(Long parentId);

    List<Menu> findListByIds(String ids);
}
