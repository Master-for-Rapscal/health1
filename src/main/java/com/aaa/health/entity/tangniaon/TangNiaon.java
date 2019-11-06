package com.aaa.health.entity.tangniaon;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class TangNiaon{
    private Integer recordId,dmsmcardDiatype,dmsmcardSources,dmsmcardAdminid,dmsmcardExercise,dmsmcardExetime,dmsmcardState,dmsmcardDoctor,dmsmcardSmoking,dmsmcardDrinking;// 吸烟量，饮酒量，运动量，运动量时间，身高，糖尿病类型，病例来源，管理级别，建档医生
    private String dmsmcardFcorg,dmsmcardFamihis,dmsmcardConunit,dmsmcardDe,dmsmcardCurrsymp,dmsmcardHazards,dmsmcardOutfor;//家族史，确诊单位，目前症状，，危险因素
    private BigDecimal dmsmcardWeight,dmsmcardBmi,dmsmcardBp1,dmsmcardBp2,dmsmcardFbg,dmsmcardHpg,dmsmcardRbg,dmsmcardHbalc,dmsmcardHeight;//体重，体质指数，血压高血压低，空腹血糖，餐后2血糖，随机血糖，糖化血糖蛋白
   @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date dmsmcardAccidate,dmsmcardCondate,dmsmcardOutdate,dmsmcardJkcard; // 发布日期，确诊日期，建卡日期


    //`recordId`='1',用户ID
    //  `dmsmcardFamihis`='家族史', `dmsmcardConunit`='确诊单位',
    // `dmsmcardAccidate`='2019-10-26', `dmsmcardCondate`='2019-10-26', `dmsmcardCurrsymp`='目前症状',
    //`dmsmcardSmoking`='2', `dmsmcardDrinking`='1', `dmsmcardExercise`='1', `dmsmcardExetime`='2',
    // `dmsmcardHeight`='123.00', `dmsmcardWeight`='50.10', `dmsmcardBmi`='12.00', `dmsmcardBp1`='12.00',
    //`dmsmcardBp2`='12.00', `dmsmcardDiatype`='2', `dmsmcardSources`='2', `dmsmcardAdminid`='2', `dmsmcardHazards`='危险因素',
    //`dmsmcardFbg`='12.00', `dmsmcardHpg`='12.00', `dmsmcardRbg`='12.00', `dmsmcardHbalc`='12.00', `dmsmcardOutfor`='转归原因',
    // `dmsmcardOutdate`='2019-10-26',
    // `dmsmcardDoctor`='2', `dmsmcardJkcard`='2019-10-26', `dmsmcardState`='1', `dmsmcardDe`='备用列'


    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getDmsmcardDiatype() {
        return dmsmcardDiatype;
    }

    public void setDmsmcardDiatype(Integer dmsmcardDiatype) {
        this.dmsmcardDiatype = dmsmcardDiatype;
    }

    public Integer getDmsmcardSources() {
        return dmsmcardSources;
    }

    public void setDmsmcardSources(Integer dmsmcardSources) {
        this.dmsmcardSources = dmsmcardSources;
    }

    public Integer getDmsmcardAdminid() {
        return dmsmcardAdminid;
    }

    public void setDmsmcardAdminid(Integer dmsmcardAdminid) {
        this.dmsmcardAdminid = dmsmcardAdminid;
    }

    public Integer getDmsmcardExercise() {
        return dmsmcardExercise;
    }

    public void setDmsmcardExercise(Integer dmsmcardExercise) {
        this.dmsmcardExercise = dmsmcardExercise;
    }

    public Integer getDmsmcardExetime() {
        return dmsmcardExetime;
    }

    public void setDmsmcardExetime(Integer dmsmcardExetime) {
        this.dmsmcardExetime = dmsmcardExetime;
    }

    public Integer getDmsmcardState() {
        return dmsmcardState;
    }

    public void setDmsmcardState(Integer dmsmcardState) {
        this.dmsmcardState = dmsmcardState;
    }

    public Integer getDmsmcardDoctor() {
        return dmsmcardDoctor;
    }

    public void setDmsmcardDoctor(Integer dmsmcardDoctor) {
        this.dmsmcardDoctor = dmsmcardDoctor;
    }

    public Integer getDmsmcardSmoking() {
        return dmsmcardSmoking;
    }

    public void setDmsmcardSmoking(Integer dmsmcardSmoking) {
        this.dmsmcardSmoking = dmsmcardSmoking;
    }

    public Integer getDmsmcardDrinking() {
        return dmsmcardDrinking;
    }

    public void setDmsmcardDrinking(Integer dmsmcardDrinking) {
        this.dmsmcardDrinking = dmsmcardDrinking;
    }

    public String getDmsmcardFcorg() {
        return dmsmcardFcorg;
    }

    public void setDmsmcardFcorg(String dmsmcardFcorg) {
        this.dmsmcardFcorg = dmsmcardFcorg;
    }

    public String getDmsmcardFamihis() {
        return dmsmcardFamihis;
    }

    public void setDmsmcardFamihis(String dmsmcardFamihis) {
        this.dmsmcardFamihis = dmsmcardFamihis;
    }

    public String getDmsmcardConunit() {
        return dmsmcardConunit;
    }

    public void setDmsmcardConunit(String dmsmcardConunit) {
        this.dmsmcardConunit = dmsmcardConunit;
    }

    public String getDmsmcardDe() {
        return dmsmcardDe;
    }

    public void setDmsmcardDe(String dmsmcardDe) {
        this.dmsmcardDe = dmsmcardDe;
    }

    public String getDmsmcardCurrsymp() {
        return dmsmcardCurrsymp;
    }

    public void setDmsmcardCurrsymp(String dmsmcardCurrsymp) {
        this.dmsmcardCurrsymp = dmsmcardCurrsymp;
    }

    public String getDmsmcardHazards() {
        return dmsmcardHazards;
    }

    public void setDmsmcardHazards(String dmsmcardHazards) {
        this.dmsmcardHazards = dmsmcardHazards;
    }

    public String getDmsmcardOutfor() {
        return dmsmcardOutfor;
    }

    public void setDmsmcardOutfor(String dmsmcardOutfor) {
        this.dmsmcardOutfor = dmsmcardOutfor;
    }

    public BigDecimal getDmsmcardWeight() {
        return dmsmcardWeight;
    }

    public void setDmsmcardWeight(BigDecimal dmsmcardWeight) {
        this.dmsmcardWeight = dmsmcardWeight;
    }

    public BigDecimal getDmsmcardBmi() {
        return dmsmcardBmi;
    }

    public void setDmsmcardBmi(BigDecimal dmsmcardBmi) {
        this.dmsmcardBmi = dmsmcardBmi;
    }

    public BigDecimal getDmsmcardBp1() {
        return dmsmcardBp1;
    }

    public void setDmsmcardBp1(BigDecimal dmsmcardBp1) {
        this.dmsmcardBp1 = dmsmcardBp1;
    }

    public BigDecimal getDmsmcardBp2() {
        return dmsmcardBp2;
    }

    public void setDmsmcardBp2(BigDecimal dmsmcardBp2) {
        this.dmsmcardBp2 = dmsmcardBp2;
    }

    public BigDecimal getDmsmcardFbg() {
        return dmsmcardFbg;
    }

    public void setDmsmcardFbg(BigDecimal dmsmcardFbg) {
        this.dmsmcardFbg = dmsmcardFbg;
    }

    public BigDecimal getDmsmcardHpg() {
        return dmsmcardHpg;
    }

    public void setDmsmcardHpg(BigDecimal dmsmcardHpg) {
        this.dmsmcardHpg = dmsmcardHpg;
    }

    public BigDecimal getDmsmcardRbg() {
        return dmsmcardRbg;
    }

    public void setDmsmcardRbg(BigDecimal dmsmcardRbg) {
        this.dmsmcardRbg = dmsmcardRbg;
    }

    public BigDecimal getDmsmcardHbalc() {
        return dmsmcardHbalc;
    }

    public void setDmsmcardHbalc(BigDecimal dmsmcardHbalc) {
        this.dmsmcardHbalc = dmsmcardHbalc;
    }

    public BigDecimal getDmsmcardHeight() {
        return dmsmcardHeight;
    }

    public void setDmsmcardHeight(BigDecimal dmsmcardHeight) {
        this.dmsmcardHeight = dmsmcardHeight;
    }

    public Date getDmsmcardAccidate() {
        return dmsmcardAccidate;
    }

    public void setDmsmcardAccidate(Date dmsmcardAccidate) {
        this.dmsmcardAccidate = dmsmcardAccidate;
    }

    public Date getDmsmcardCondate() {
        return dmsmcardCondate;
    }

    public void setDmsmcardCondate(Date dmsmcardCondate) {
        this.dmsmcardCondate = dmsmcardCondate;
    }

    public Date getDmsmcardOutdate() {
        return dmsmcardOutdate;
    }

    public void setDmsmcardOutdate(Date dmsmcardOutdate) {
        this.dmsmcardOutdate = dmsmcardOutdate;
    }

    public Date getDmsmcardJkcard() {
        return dmsmcardJkcard;
    }

    public void setDmsmcardJkcard(Date dmsmcardJkcard) {
        this.dmsmcardJkcard = dmsmcardJkcard;
    }

    @Override
    public String toString() {
        return "TangNiaon{" +
                "recordId=" + recordId +
                ", dmsmcardDiatype=" + dmsmcardDiatype +
                ", dmsmcardSources=" + dmsmcardSources +
                ", dmsmcardAdminid=" + dmsmcardAdminid +
                ", dmsmcardExercise=" + dmsmcardExercise +
                ", dmsmcardExetime=" + dmsmcardExetime +
                ", dmsmcardState=" + dmsmcardState +
                ", dmsmcardDoctor=" + dmsmcardDoctor +
                ", dmsmcardSmoking=" + dmsmcardSmoking +
                ", dmsmcardDrinking=" + dmsmcardDrinking +
                ", dmsmcardFcorg='" + dmsmcardFcorg + '\'' +
                ", dmsmcardFamihis='" + dmsmcardFamihis + '\'' +
                ", dmsmcardConunit='" + dmsmcardConunit + '\'' +
                ", dmsmcardDe='" + dmsmcardDe + '\'' +
                ", dmsmcardCurrsymp='" + dmsmcardCurrsymp + '\'' +
                ", dmsmcardHazards='" + dmsmcardHazards + '\'' +
                ", dmsmcardOutfor='" + dmsmcardOutfor + '\'' +
                ", dmsmcardWeight=" + dmsmcardWeight +
                ", dmsmcardBmi=" + dmsmcardBmi +
                ", dmsmcardBp1=" + dmsmcardBp1 +
                ", dmsmcardBp2=" + dmsmcardBp2 +
                ", dmsmcardFbg=" + dmsmcardFbg +
                ", dmsmcardHpg=" + dmsmcardHpg +
                ", dmsmcardRbg=" + dmsmcardRbg +
                ", dmsmcardHbalc=" + dmsmcardHbalc +
                ", dmsmcardHeight=" + dmsmcardHeight +
                ", dmsmcardAccidate=" + dmsmcardAccidate +
                ", dmsmcardCondate=" + dmsmcardCondate +
                ", dmsmcardOutdate=" + dmsmcardOutdate +
                ", dmsmcardJkcard=" + dmsmcardJkcard +
                '}';
    }
}
