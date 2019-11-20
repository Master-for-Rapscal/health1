package com.aaa.health.service.echarts;

import com.aaa.health.entity.Echarts.Echarts;
import com.aaa.health.mapper.echarts.EchartsMapper;
import com.aaa.health.mapper.hyper.HyPerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class EchartsServiceImpl implements EchartsService{
    @Autowired
    private EchartsMapper echartsMapper;
    @Autowired
    private HyPerMapper hyPerMapper;
//              ['product', '二七区', '上街区', '川汇区', '卧龙区', '惠济区', '金水区'],
//              ['高血压', 41, 30, 65, 53, 83, 98],
//              ['糖尿病', 86, 92, 85, 83, 73, 55],
    @Override
    public List queryAll(int[] recordUnit) {
        List<Echarts> list=new ArrayList<Echarts>();
        String[] big={"高血压","精神病","慢性病","糖尿病"};
            Echarts e1 = new Echarts();
            e1.setBing("高血压");
            e1.setOne1(echartsMapper.queryGao(recordUnit[0]));
            e1.setOne2(echartsMapper.queryGao(recordUnit[1]));
            e1.setOne3(echartsMapper.queryGao(recordUnit[2]));
            e1.setOne4(echartsMapper.queryGao(recordUnit[3]));
            e1.setOne5(echartsMapper.queryGao(recordUnit[4]));
            e1.setOne6(echartsMapper.queryGao(recordUnit[5]));


        Echarts e2 = new Echarts();
        e2.setBing("精神病");
        e2.setOne1(echartsMapper.queryJing(recordUnit[0]));
        e2.setOne2(echartsMapper.queryJing(recordUnit[1]));
        e2.setOne3(echartsMapper.queryJing(recordUnit[2]));
        e2.setOne4(echartsMapper.queryJing(recordUnit[3]));
        e2.setOne5(echartsMapper.queryJing(recordUnit[4]));
        e2.setOne6(echartsMapper.queryJing(recordUnit[5]));

        Echarts e3 = new Echarts();
        e3.setBing("慢性病");
        e3.setOne1(echartsMapper.queryMan(recordUnit[0]));
        e3.setOne2(echartsMapper.queryMan(recordUnit[1]));
        e3.setOne3(echartsMapper.queryMan(recordUnit[2]));
        e3.setOne4(echartsMapper.queryMan(recordUnit[3]));
        e3.setOne5(echartsMapper.queryMan(recordUnit[4]));
        e3.setOne6(echartsMapper.queryMan(recordUnit[5]));

        Echarts e4 = new Echarts();
        e4.setBing("糖尿病");
        e4.setOne1(echartsMapper.queryTang(recordUnit[0]));
        e4.setOne2(echartsMapper.queryTang(recordUnit[1]));
        e4.setOne3(echartsMapper.queryTang(recordUnit[2]));
        e4.setOne4(echartsMapper.queryTang(recordUnit[3]));
        e4.setOne5(echartsMapper.queryTang(recordUnit[4]));
        e4.setOne6(echartsMapper.queryTang(recordUnit[5]));

        list.add(e1);
        list.add(e2);
        list.add(e3);
        list.add(e4);
        System.out.println("Service"+list);
        return list;











//        List AllList=new ArrayList();
//        List area=new ArrayList();
//       area.add(0,"product");
//        List list1=new ArrayList();
//        List list2=new ArrayList();
//        List list3=new ArrayList();
//        List list4=new ArrayList();
//
//
//        for (int i=0;i<recordUnit.length;i++){
//            area.add(hyPerMapper.queryAreaById(recordUnit[i]).get("areaName"));
//            list1.add(echartsMapper.queryGao(recordUnit[i]).get("num"));
//            list2.add( echartsMapper.queryJing(recordUnit[i]).get("num"));
//            list3.add(echartsMapper.queryMan(recordUnit[i]).get("num"));
//            list4.add(echartsMapper.queryTang(recordUnit[i]).get("num"));
//        }
//        list1.add(0,"'高血压'");
//        list2.add(0,"'精神病'");
//        list3.add(0,"'慢性病'");
//        list4.add(0,"'糖尿病'");
//
//        AllList.add(0,area);
//        AllList.add(1,list1);
//        AllList.add(2,list2);
//        AllList.add(3,list3);
//        AllList.add(4,list4);
//        System.out.println("控制层list1"+list1);
//        System.out.println("控制层"+AllList);

    }
}
