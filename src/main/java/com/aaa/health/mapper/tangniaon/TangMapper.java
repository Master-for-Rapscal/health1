package com.aaa.health.mapper.tangniaon;

import com.aaa.health.entity.tangniaon.Tang;
import com.aaa.health.entity.tangniaon.TangNiaon;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface TangMapper {
    //查询所有
    List<Map> queryAll(Map map);
    //查询总条数
    int queryTotal(Map map);
    //s删除
    int deleteById(String ids);
    // 查询所有用户==========================
    List<Map> queryAllUser(Map map);
    //用户总条数
    Integer queryUserTotal(Map map);
    //根据用户ID来查询用户
    Map<String,Object> queryUserById(Integer uid);
    // 查询医生表   select * from `user` where roleId != 1
    List<Map> queryDoctor();
    //添加专项卡信息
    Integer insertDmsm(TangNiaon tangNiaon);
    // 根据用户编号来查询要修改的内容
    List<TangNiaon> queryDmsmById(Integer uid);
    // 根据用户ID来修改此专项卡
    Integer updateByUserId(TangNiaon tangNiaon);
    //根据用户ID来查询随访记录
    List<Tang> querySuiById(Integer uid);
    //添加随访记录
    Integer insertSui(Tang tang);
    //查询最大ID
    Integer querySuiMax();
    //添加用药----------------------------------------
    Integer insertHyperYao(Map map);
    //删除随访记录
    Integer delSui(String ids);
    //查询之前的查询
    Tang querySuiFangById(Integer hid);
    // 修改
    Integer updateSuiFangById(Tang tang);
    //根据随访记录ID查询该记录中所开的药方
    List<Map<String,Object>> queryYao(Integer hid);

    //查询地区
    List<Map<String,Object>> queryArea();//SELECT * from area

    //-----修改药-------------------------------queryYao
    //根据随访ID来修改用药情况
    //Integer updateYaoById(Map<String,Object> map);

    Integer deleteYaoById(Integer hid);
    Integer insertYao(Map map);
}
