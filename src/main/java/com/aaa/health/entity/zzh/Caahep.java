package com.aaa.health.entity.zzh;
import java.util.Date;

public class Caahep {
    private Long caahepId,caahepPeonum,caahepState;
    private  Double  caahepExfunds;
    private String caahepTopic, caahepHealtype,caahepHealtlocation, caahepHealobj, caahepFinalobj, caahep, caahepHealcon, caahepHealques, caahepPlanner;
    private Date caahepPlanyear ,caahepPlandate;

    @Override
    public String toString() {
        return "Caahep{" +
                "caahepId=" + caahepId +
                ", caahepPeonum=" + caahepPeonum +
                ", caahepState=" + caahepState +
                ", caahepExfunds=" + caahepExfunds +
                ", caahepTopic='" + caahepTopic + '\'' +
                ", caahepHealtype='" + caahepHealtype + '\'' +
                ", caahepHealtlocation='" + caahepHealtlocation + '\'' +
                ", caahepHealobj='" + caahepHealobj + '\'' +
                ", caahepFinalobj='" + caahepFinalobj + '\'' +
                ", caahep='" + caahep + '\'' +
                ", caahepHealcon='" + caahepHealcon + '\'' +
                ", caahepHealques='" + caahepHealques + '\'' +
                ", caahepPlanner='" + caahepPlanner + '\'' +
                ", caahepPlanyear=" + caahepPlanyear +
                ", caahepPlandate=" + caahepPlandate +
                '}';
    }

    public Long getCaahepId() {
        return caahepId;
    }

    public void setCaahepId(Long caahepId) {
        this.caahepId = caahepId;
    }

    public Long getCaahepPeonum() {
        return caahepPeonum;
    }

    public void setCaahepPeonum(Long caahepPeonum) {
        this.caahepPeonum = caahepPeonum;
    }

    public Long getCaahepState() {
        return caahepState;
    }

    public void setCaahepState(Long caahepState) {
        this.caahepState = caahepState;
    }

    public Double getCaahepExfunds() {
        return caahepExfunds;
    }

    public void setCaahepExfunds(Double caahepExfunds) {
        this.caahepExfunds = caahepExfunds;
    }

    public String getCaahepTopic() {
        return caahepTopic;
    }

    public void setCaahepTopic(String caahepTopic) {
        this.caahepTopic = caahepTopic;
    }

    public String getCaahepHealtype() {
        return caahepHealtype;
    }

    public void setCaahepHealtype(String caahepHealtype) {
        this.caahepHealtype = caahepHealtype;
    }

    public String getCaahepHealtlocation() {
        return caahepHealtlocation;
    }

    public void setCaahepHealtlocation(String caahepHealtlocation) {
        this.caahepHealtlocation = caahepHealtlocation;
    }

    public String getCaahepHealobj() {
        return caahepHealobj;
    }

    public void setCaahepHealobj(String caahepHealobj) {
        this.caahepHealobj = caahepHealobj;
    }

    public String getCaahepFinalobj() {
        return caahepFinalobj;
    }

    public void setCaahepFinalobj(String caahepFinalobj) {
        this.caahepFinalobj = caahepFinalobj;
    }

    public String getCaahep() {
        return caahep;
    }

    public void setCaahep(String caahep) {
        this.caahep = caahep;
    }

    public String getCaahepHealcon() {
        return caahepHealcon;
    }

    public void setCaahepHealcon(String caahepHealcon) {
        this.caahepHealcon = caahepHealcon;
    }

    public String getCaahepHealques() {
        return caahepHealques;
    }

    public void setCaahepHealques(String caahepHealques) {
        this.caahepHealques = caahepHealques;
    }

    public String getCaahepPlanner() {
        return caahepPlanner;
    }

    public void setCaahepPlanner(String caahepPlanner) {
        this.caahepPlanner = caahepPlanner;
    }

    public Date getCaahepPlanyear() {
        return caahepPlanyear;
    }

    public void setCaahepPlanyear(Date caahepPlanyear) {
        this.caahepPlanyear = caahepPlanyear;
    }

    public Date getCaahepPlandate() {
        return caahepPlandate;
    }

    public void setCaahepPlandate(Date caahepPlandate) {
        this.caahepPlandate = caahepPlandate;
    }
}
