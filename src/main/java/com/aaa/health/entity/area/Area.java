package com.aaa.health.entity.area;

public class Area {

    private Integer id;
    private Integer areaId;
    private String areaName;
    private Integer parentId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public String getAreaName() {
        return areaName;
    }

    public void setAreaName(String areaName) {
        this.areaName = areaName;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "area{" +
                "id=" + id +
                "areaId=" + areaId +
                ", areaName='" + areaName + '\'' +
                ", parentId=" + parentId +
                '}';
    }
}
