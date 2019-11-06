package com.aaa.health.service.hyper;

import com.aaa.health.entity.hyper.HyPer;
import com.aaa.health.entity.hyper.HyPerTend;
import com.aaa.health.entity.tangniaon.Tang;

import java.util.List;
import java.util.Map;

public interface HyPerService {
    // 查询好血压总信息
    List<Map> queryHyAll(Map map);
    // 查询好血压总人数
    Integer queryHyTotal(Map map);
    //批量删除
    Integer deleteByIds(String ids);
    //查询不是高血压用户信息
    List<Map> queryNotUser(Map map);
    //查询不是高血压条数
    Integer queryNoUserTotal(Map map);
    //添加高血压专项卡
    Integer insertHy(HyPer hyPer);
    //查询地址
    List<Map<String,Object>> queryArea();
    //修改之前的查询
    HyPer queryHyById(Integer userId);
    //根据用户ID来进行修改
    Integer updateByUserId(HyPer hyper);
    //根据用户ID来查询随访记录
  //  List<HyPerTend> querySuiById(Integer uid);


    List<Tang> querySuiById(Integer uid);

    //添加随访记录
    Integer insertSui(Tang tang);
    //查询最大ID
    Integer querySuiMax();
    //添加用药
    Integer insertHyperYao(Map map);
    //删除随访记录
    Integer delSui(String ids);
    //查询之前的查询
    Tang querySuiFangById(Integer hid);
    // 修改
    Integer updateSuiFangById(Tang tang);
    //根据随访记录ID查询该记录中所开的药方
    List<Map<String,Object>> queryYao(Integer hid);

    Integer updateZhuan(Map map);

}
