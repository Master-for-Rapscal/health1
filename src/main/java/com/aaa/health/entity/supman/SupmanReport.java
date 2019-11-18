package com.aaa.health.entity.supman;


import org.apache.ibatis.annotations.Mapper;

import java.util.Date;

@Mapper
public class SupmanReport {
    private Integer reportId,addressId,areaId,addressId2,reportCategory,reportState;
    private Date reportFindtime,reportTime;
    private String reportContent,reportName,reportColumn;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getReportId() {
        return reportId;
    }

    public void setReportId(Integer reportId) {
        this.reportId = reportId;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public Integer getAddressId2() {
        return addressId2;
    }

    public void setAddressId2(Integer addressId2) {
        this.addressId2 = addressId2;
    }

    public Integer getReportCategory() {
        return reportCategory;
    }

    public void setReportCategory(Integer reportCategory) {
        this.reportCategory = reportCategory;
    }

    public Integer getReportState() {
        return reportState;
    }

    public void setReportState(Integer reportState) {
        this.reportState = reportState;
    }

    public Date getReportFindtime() {
        return reportFindtime;
    }

    public void setReportFindtime(Date reportFindtime) {
        this.reportFindtime = reportFindtime;
    }

    public Date getReportTime() {
        return reportTime;
    }

    public void setReportTime(Date reportTime) {
        this.reportTime = reportTime;
    }

    public String getReportContent() {
        return reportContent;
    }

    public void setReportContent(String reportContent) {
        this.reportContent = reportContent;
    }

    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    public String getReportColumn() {
        return reportColumn;
    }

    public void setReportColumn(String reportColumn) {
        this.reportColumn = reportColumn;
    }

    @Override
    public String toString() {
        return "SupmanReport{" +
                "reportId=" + reportId +
                ", addressId=" + addressId +
                ", areaId=" + areaId +
                ", addressId2=" + addressId2 +
                ", reportCategory=" + reportCategory +
                ", reportState=" + reportState +
                ", reportFindtime=" + reportFindtime +
                ", reportTime=" + reportTime +
                ", reportContent='" + reportContent + '\'' +
                ", reportName='" + reportName + '\'' +
                ", reportColumn='" + reportColumn + '\'' +
                '}';
    }
}
