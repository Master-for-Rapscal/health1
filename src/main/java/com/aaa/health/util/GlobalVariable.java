package com.aaa.health.util;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "globalvariable")
public class GlobalVariable {

    private String SysuserName;
    private Integer areaId;

    @Override
    public String toString() {
        return "GlobalVariable{" +
                "SysuserName='" + SysuserName + '\'' +
                "areaId='" + areaId + '\'' +
                '}';
    }

    public String getSysuserName() {
        return SysuserName;
    }

    public void setSysuserName(String sysuserName) {
        SysuserName = sysuserName;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }


}
