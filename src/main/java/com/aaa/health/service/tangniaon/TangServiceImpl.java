package com.aaa.health.service.tangniaon;

import com.aaa.health.entity.tangniaon.Tang;
import com.aaa.health.entity.tangniaon.TangNiaon;
import com.aaa.health.mapper.tangniaon.TangMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;
@Service
public  class TangServiceImpl implements TangService {
    @Resource
    private TangMapper tangMapper;

    @Override
    public List<Map> queryAll(Map map) {
        return tangMapper.queryAll(map);
    }

    @Override
    public int queryTotal(Map map) {
        return tangMapper.queryTotal(map);
    }

    @Override
    public int deleteById(String ids) {
        return tangMapper.deleteById(ids);
    }

    @Override
    public List<Map> queryAllUser(Map map) {
        return tangMapper.queryAllUser(map);
    }

    @Override
    public Integer queryUserTotal(Map map) {
        return tangMapper.queryUserTotal(map);
    }

    @Override
    public Map<String, Object> queryUserById(Integer uid) {
        Map<String, Object> map=tangMapper.queryUserById(uid);
        Integer a= (Integer) map.get("recordUnit");
        List<Map<String,Object>> list=tangMapper.queryArea();
        for (int i=0;i<list.size();i++){
           // System.out.println("进入Service循环");
            if(list.get(i).get("areaId") == a){
             //   System.out.println("Service"+list.get(i).get("areaName"));
                map.put("recordUnitName",list.get(i).get("areaName"));
            }
        }
        return map;
    }

    @Override
    public List<Map> queryDoctor() {
        return tangMapper.queryDoctor();
    }

    @Override
    public Integer insertDmsm(TangNiaon tangNiaon) {
        return tangMapper.insertDmsm(tangNiaon);
    }

    @Override
    public List<TangNiaon> queryDmsmById(Integer uid) {
        return tangMapper.queryDmsmById(uid);
    }

    @Override
    public Integer updateByUserId(TangNiaon tangNiaon) {
        return tangMapper.updateByUserId(tangNiaon);
    }

    @Override
    public List<Tang> querySuiById(Integer uid) {
        return tangMapper.querySuiById(uid);
    }

    @Override
    public Integer insertSui(Tang tang) {
        return tangMapper.insertSui(tang);
    }

    @Override
    public Integer querySuiMax() {
        return tangMapper.querySuiMax();
    }

    @Override
    public Integer insertHyperYao(Map map) {
        return tangMapper.insertHyperYao(map);
    }

    @Override
    public Integer delSui(String ids) {
        return tangMapper.delSui(ids);
    }

    @Override
    public Tang querySuiFangById(Integer hid) {
        return tangMapper.querySuiFangById(hid);
    }

    @Override
    public Integer updateSuiFangById(Tang tang) {
        return tangMapper.updateSuiFangById(tang);
    }

    @Override
    public List<Map<String, Object>> queryYao(Integer hid) {
        return tangMapper.queryYao(hid);
    }

    @Override
    public List<Map<String, Object>> queryArea() {
        return tangMapper.queryArea();
    }

    @Override
    public Integer deleteYaoById(Integer hid) {
        return tangMapper.deleteYaoById(hid);
    }

    @Override
    public Integer insertYao(Map map) {
        return tangMapper.insertYao(map);
    }

//    @Override
//    public Integer updateYaoById(Map<String, Object> map) {
//        return tangMapper.updateYaoById(map);
//    }
}
