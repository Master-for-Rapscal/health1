package com.aaa.health.controller.echarts;

import com.aaa.health.service.echarts.EchartsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/echarts")
public class EchartsController {
    @Autowired
    private EchartsService echartsService;
    @RequestMapping("/queryarea")
    public Object queryArea(int[] area){
        List list=echartsService.queryAll(area);
        return list;
    }
}
