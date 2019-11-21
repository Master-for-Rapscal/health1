package com.aaa.health.service.hyper;

import com.aaa.health.entity.hyper.HyPer;
import com.aaa.health.entity.hyper.HyPerTend;
import com.aaa.health.entity.tangniaon.Tang;
import com.aaa.health.mapper.hyper.HyPerMapper;
import com.aaa.health.mapper.tangniaon.TangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class HyPerServiceImpl implements HyPerService {

    @Resource
    private HyPerMapper hyPerMapper;

    @Resource
    private TangMapper tangMapper;

    @Override
    public List<Map> queryHyAll(Map map) {
        return hyPerMapper.queryHyAll(map);
    }

    @Override
    public Integer queryHyTotal(Map map) {
        return hyPerMapper.queryHyTotal(map);
    }

    @Override
    public Integer deleteByIds(String ids) {
        return hyPerMapper.deleteByIds(ids);
    }

    @Override
    public List<Map> queryNotUser(Map map) {
        return hyPerMapper.queryNotUser(map);
    }

    @Override
    public Integer queryNoUserTotal(Map map) {
        return hyPerMapper.queryNoUserTotal(map);
    }

    @Override
    public Integer insertHy(HyPer hyPer) {
        return hyPerMapper.insertHy(hyPer);
    }

    @Override
    public List<Map<String, Object>> queryArea() {
        return hyPerMapper.queryArea();
    }

    @Override
    public List<HyPer> queryHyById(Integer userId) {
        return hyPerMapper.queryHyById(userId);
    }

    @Override
    public Integer updateByUserId(HyPer hyper) {



        return hyPerMapper.updateByUserId(hyper);
    }

   // @Override
    //public List<HyPerTend> querySuiById(Integer uid) {
     //   return hyPerMapper.querySuiById(uid);
  //  }

    @Override
    public List<Tang> querySuiById(Integer uid) {
        return hyPerMapper.querySuiById(uid);
    }

    @Override
    public Integer insertSui(Tang tang) {
        return hyPerMapper.insertSui(tang);
    }

    @Override
    public Integer querySuiMax() {
        return hyPerMapper.querySuiMax();
    }

    @Override
    public Integer insertHyperYao(Map map) {
        return hyPerMapper.insertHyperYao(map);
    }

    @Override
    public Integer delSui(String ids) {
        return hyPerMapper.delSui(ids);
    }

    @Override
    public Tang querySuiFangById(Integer hid) {
        return hyPerMapper.querySuiFangById(hid);
    }

    @Override
    public Integer updateSuiFangById(Tang tang) {
        return hyPerMapper.updateSuiFangById(tang);
    }

    @Override
    public List<Map<String, Object>> queryYao(Integer hid) {
        return hyPerMapper.queryYao(hid);
    }

    @Override
    public Integer updateZhuan(Map map) {
        return hyPerMapper.updateZhuan(map);
    }

    @Override
    public Map<Object, Object> queryAreaById(Integer areaId) {
        return hyPerMapper.queryAreaById(areaId);
    }

    @Override
    public Integer panduan(Integer uid) {
        Integer num=hyPerMapper.queryThisUserByid(uid);
        if(num>0){
            System.out.println("没有执行修改吗？");
            hyPerMapper.updataThisUserByid(uid);
            return  1;
        }else{
            return -1;
        }

    }
}
