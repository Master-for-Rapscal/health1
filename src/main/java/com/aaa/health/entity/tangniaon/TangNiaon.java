package com.aaa.health.entity.tangniaon;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TangNiaon implements Serializable {
    private Integer a;// 吸烟量，饮酒量，运动量，运动量时间，身高，糖尿病类型，病例来源，管理级别，建档医生
    private String fam;//家族史，确诊单位，目前症状，，危险因素
    private BigDecimal c;//体重，体质指数，血压高血压低，空腹血糖，餐后2血糖，随机血糖，糖化血糖蛋白
    private Date d; // 发布日期，确诊日期，建卡日期
}
