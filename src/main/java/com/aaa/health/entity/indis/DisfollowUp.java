package com.aaa.health.entity.indis;

import java.util.Date;

public class DisfollowUp {
    private Integer disfopId,infdisId,disfopMode,disfopQuarantine,attackCate,disfopSituation,disfopDoctor,
            disfopState,userId,userSex,userGam,userCareer;
    private Date disfopTime,firstVisit,nextfoTime,userBirthday;
    private String disfopSymptom,disfopRemarks,disfopDisinfect,disfopMedicine,disfopRecovery,disfopColumn,
            lastname,recordName,userMyphone,recordAdress;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserSex() {
        return userSex;
    }

    public void setUserSex(Integer userSex) {
        this.userSex = userSex;
    }

    public Integer getUserGam() {
        return userGam;
    }

    public void setUserGam(Integer userGam) {
        this.userGam = userGam;
    }

    public Integer getUserCareer() {
        return userCareer;
    }

    public void setUserCareer(Integer userCareer) {
        this.userCareer = userCareer;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getUserMyphone() {
        return userMyphone;
    }

    public void setUserMyphone(String userMyphone) {
        this.userMyphone = userMyphone;
    }

    public String getRecordAdress() {
        return recordAdress;
    }

    public void setRecordAdress(String recordAdress) {
        this.recordAdress = recordAdress;
    }

    public Integer getDisfopId() {
        return disfopId;
    }

    public void setDisfopId(Integer disfopId) {
        this.disfopId = disfopId;
    }

    public Integer getInfdisId() {
        return infdisId;
    }

    public void setInfdisId(Integer infdisId) {
        this.infdisId = infdisId;
    }

    public Integer getDisfopMode() {
        return disfopMode;
    }

    public void setDisfopMode(Integer disfopMode) {
        this.disfopMode = disfopMode;
    }

    public Integer getDisfopQuarantine() {
        return disfopQuarantine;
    }

    public void setDisfopQuarantine(Integer disfopQuarantine) {
        this.disfopQuarantine = disfopQuarantine;
    }

    public Integer getAttackCate() {
        return attackCate;
    }

    public void setAttackCate(Integer attackCate) {
        this.attackCate = attackCate;
    }

    public Integer getDisfopSituation() {
        return disfopSituation;
    }

    public void setDisfopSituation(Integer disfopSituation) {
        this.disfopSituation = disfopSituation;
    }

    public Integer getDisfopDoctor() {
        return disfopDoctor;
    }

    public void setDisfopDoctor(Integer disfopDoctor) {
        this.disfopDoctor = disfopDoctor;
    }

    public Integer getDisfopState() {
        return disfopState;
    }

    public void setDisfopState(Integer disfopState) {
        this.disfopState = disfopState;
    }

    public Date getDisfopTime() {
        return disfopTime;
    }

    public void setDisfopTime(Date disfopTime) {
        this.disfopTime = disfopTime;
    }

    public Date getFirstVisit() {
        return firstVisit;
    }

    public void setFirstVisit(Date firstVisit) {
        this.firstVisit = firstVisit;
    }

    public Date getNextfoTime() {
        return nextfoTime;
    }

    public void setNextfoTime(Date nextfoTime) {
        this.nextfoTime = nextfoTime;
    }

    public String getDisfopSymptom() {
        return disfopSymptom;
    }

    public void setDisfopSymptom(String disfopSymptom) {
        this.disfopSymptom = disfopSymptom;
    }

    public String getDisfopRemarks() {
        return disfopRemarks;
    }

    public void setDisfopRemarks(String disfopRemarks) {
        this.disfopRemarks = disfopRemarks;
    }

    public String getDisfopDisinfect() {
        return disfopDisinfect;
    }

    public void setDisfopDisinfect(String disfopDisinfect) {
        this.disfopDisinfect = disfopDisinfect;
    }

    public String getDisfopMedicine() {
        return disfopMedicine;
    }

    public void setDisfopMedicine(String disfopMedicine) {
        this.disfopMedicine = disfopMedicine;
    }

    public String getDisfopRecovery() {
        return disfopRecovery;
    }

    public void setDisfopRecovery(String disfopRecovery) {
        this.disfopRecovery = disfopRecovery;
    }

    public String getDisfopColumn() {
        return disfopColumn;
    }

    public void setDisfopColumn(String disfopColumn) {
        this.disfopColumn = disfopColumn;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Override
    public String toString() {
        return "DisfollowUp{" +
                "disfopId=" + disfopId +
                ", infdisId=" + infdisId +
                ", disfopMode=" + disfopMode +
                ", disfopQuarantine=" + disfopQuarantine +
                ", attackCate=" + attackCate +
                ", disfopSituation=" + disfopSituation +
                ", disfopDoctor=" + disfopDoctor +
                ", disfopState=" + disfopState +
                ", userId=" + userId +
                ", userSex=" + userSex +
                ", userGam=" + userGam +
                ", userCareer=" + userCareer +
                ", disfopTime=" + disfopTime +
                ", firstVisit=" + firstVisit +
                ", nextfoTime=" + nextfoTime +
                ", userBirthday=" + userBirthday +
                ", disfopSymptom='" + disfopSymptom + '\'' +
                ", disfopRemarks='" + disfopRemarks + '\'' +
                ", disfopDisinfect='" + disfopDisinfect + '\'' +
                ", disfopMedicine='" + disfopMedicine + '\'' +
                ", disfopRecovery='" + disfopRecovery + '\'' +
                ", disfopColumn='" + disfopColumn + '\'' +
                ", lastname='" + lastname + '\'' +
                ", recordName='" + recordName + '\'' +
                ", userMyphone='" + userMyphone + '\'' +
                ", recordAdress='" + recordAdress + '\'' +
                '}';
    }
}
