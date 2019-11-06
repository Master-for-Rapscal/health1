package com.aaa.health.entity.suppat;

import java.util.Date;

public class SupmanPatrol {
    private Integer patrolId,areaId,patrolYear,patrolState;
    private String patrolContent,patrolProblem,patrolName,patrolRemarks,patrolColumn;
    private Date patrolTime;

    public Integer getAreaId() {
        return areaId;
    }

    public void setAreaId(Integer areaId) {
        this.areaId = areaId;
    }

    public Integer getPatrolId() {
        return patrolId;
    }

    public void setPatrolId(Integer patrolId) {
        this.patrolId = patrolId;
    }

    public Integer getPatrolYear() {
        return patrolYear;
    }

    public void setPatrolYear(Integer patrolYear) {
        this.patrolYear = patrolYear;
    }

    public String getPatrolContent() {
        return patrolContent;
    }

    public void setPatrolContent(String patrolContent) {
        this.patrolContent = patrolContent;
    }

    public String getPatrolProblem() {
        return patrolProblem;
    }

    public void setPatrolProblem(String patrolProblem) {
        this.patrolProblem = patrolProblem;
    }

    public Date getPatrolTime() {
        return patrolTime;
    }

    public void setPatrolTime(Date patrolTime) {
        this.patrolTime = patrolTime;
    }

    public String getPatrolName() {
        return patrolName;
    }

    public void setPatrolName(String patrolName) {
        this.patrolName = patrolName;
    }

    public String getPatrolRemarks() {
        return patrolRemarks;
    }

    public void setPatrolRemarks(String patrolRemarks) {
        this.patrolRemarks = patrolRemarks;
    }

    public Integer getPatrolState() {
        return patrolState;
    }

    public void setPatrolState(Integer patrolState) {
        this.patrolState = patrolState;
    }

    public String getPatrolColumn() {
        return patrolColumn;
    }

    public void setPatrolColumn(String patrolColumn) {
        this.patrolColumn = patrolColumn;
    }

    @Override
    public String toString() {
        return "SupmanPatrol{" +
                "patrolId=" + patrolId +
                ", areaId=" + areaId +
                ", patrolYear=" + patrolYear +
                ", patrolState=" + patrolState +
                ", patrolContent='" + patrolContent + '\'' +
                ", patrolProblem='" + patrolProblem + '\'' +
                ", patrolName='" + patrolName + '\'' +
                ", patrolRemarks='" + patrolRemarks + '\'' +
                ", patrolColumn='" + patrolColumn + '\'' +
                ", patrolTime=" + patrolTime +
                '}';
    }
}
