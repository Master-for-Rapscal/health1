package com.aaa.health.mapper.echarts;

import org.apache.ibatis.annotations.Mapper;

import java.util.Map;

@Mapper
public interface EchartsMapper {

    Integer queryGao(Integer recordUnit);

    Integer queryTang(Integer recordUnit);

    Integer queryMan(Integer recordUnit);

    Integer queryJing(Integer recordUnit);

}
