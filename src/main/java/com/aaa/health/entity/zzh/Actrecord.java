package com.aaa.health.entity.zzh;

import java.util.Date;

public class Actrecord {
    private Long actrecordId,caahepId,actrecordPeohealnum,actrecordHealnum,actrecordState;
    private String actrecordActtime, actrecordVenue,actrecordWhat,actrecordActtheme,actrecordOrganize,actrecordSpeaker,actrecordPeohealtype,actrecordHealtype,actrecordActivities,actrecordActeval,actrecordArchmate,actrecordPreparer,actrecordLeader;
    private Date actrecordTime;

    @Override
    public String toString() {
        return "Actrecord{" +
                "actrecordId=" + actrecordId +
                ", caahepId=" + caahepId +
                ", actrecordPeohealnum=" + actrecordPeohealnum +
                ", actrecordHealnum=" + actrecordHealnum +
                ", actrecordState=" + actrecordState +
                ", actrecordActtime='" + actrecordActtime + '\'' +
                ", actrecordVenue='" + actrecordVenue + '\'' +
                ", actrecordWhat='" + actrecordWhat + '\'' +
                ", actrecordActtheme='" + actrecordActtheme + '\'' +
                ", actrecordOrganize='" + actrecordOrganize + '\'' +
                ", actrecordSpeaker='" + actrecordSpeaker + '\'' +
                ", actrecordPeohealtype='" + actrecordPeohealtype + '\'' +
                ", actrecordHealtype='" + actrecordHealtype + '\'' +
                ", actrecordActivities='" + actrecordActivities + '\'' +
                ", actrecordActeval='" + actrecordActeval + '\'' +
                ", actrecordArchmate='" + actrecordArchmate + '\'' +
                ", actrecordPreparer='" + actrecordPreparer + '\'' +
                ", actrecordLeader='" + actrecordLeader + '\'' +
                ", actrecordTime=" + actrecordTime +
                '}';
    }

    public Long getActrecordId() {
        return actrecordId;
    }

    public void setActrecordId(Long actrecordId) {
        this.actrecordId = actrecordId;
    }

    public Long getCaahepId() {
        return caahepId;
    }

    public void setCaahepId(Long caahepId) {
        this.caahepId = caahepId;
    }

    public Long getActrecordPeohealnum() {
        return actrecordPeohealnum;
    }

    public void setActrecordPeohealnum(Long actrecordPeohealnum) {
        this.actrecordPeohealnum = actrecordPeohealnum;
    }

    public Long getActrecordHealnum() {
        return actrecordHealnum;
    }

    public void setActrecordHealnum(Long actrecordHealnum) {
        this.actrecordHealnum = actrecordHealnum;
    }

    public Long getActrecordState() {
        return actrecordState;
    }

    public void setActrecordState(Long actrecordState) {
        this.actrecordState = actrecordState;
    }

    public String getActrecordActtime() {
        return actrecordActtime;
    }

    public void setActrecordActtime(String actrecordActtime) {
        this.actrecordActtime = actrecordActtime;
    }

    public String getActrecordVenue() {
        return actrecordVenue;
    }

    public void setActrecordVenue(String actrecordVenue) {
        this.actrecordVenue = actrecordVenue;
    }

    public String getActrecordWhat() {
        return actrecordWhat;
    }

    public void setActrecordWhat(String actrecordWhat) {
        this.actrecordWhat = actrecordWhat;
    }

    public String getActrecordActtheme() {
        return actrecordActtheme;
    }

    public void setActrecordActtheme(String actrecordActtheme) {
        this.actrecordActtheme = actrecordActtheme;
    }

    public String getActrecordOrganize() {
        return actrecordOrganize;
    }

    public void setActrecordOrganize(String actrecordOrganize) {
        this.actrecordOrganize = actrecordOrganize;
    }

    public String getActrecordSpeaker() {
        return actrecordSpeaker;
    }

    public void setActrecordSpeaker(String actrecordSpeaker) {
        this.actrecordSpeaker = actrecordSpeaker;
    }

    public String getActrecordPeohealtype() {
        return actrecordPeohealtype;
    }

    public void setActrecordPeohealtype(String actrecordPeohealtype) {
        this.actrecordPeohealtype = actrecordPeohealtype;
    }

    public String getActrecordHealtype() {
        return actrecordHealtype;
    }

    public void setActrecordHealtype(String actrecordHealtype) {
        this.actrecordHealtype = actrecordHealtype;
    }

    public String getActrecordActivities() {
        return actrecordActivities;
    }

    public void setActrecordActivities(String actrecordActivities) {
        this.actrecordActivities = actrecordActivities;
    }

    public String getActrecordActeval() {
        return actrecordActeval;
    }

    public void setActrecordActeval(String actrecordActeval) {
        this.actrecordActeval = actrecordActeval;
    }

    public String getActrecordArchmate() {
        return actrecordArchmate;
    }

    public void setActrecordArchmate(String actrecordArchmate) {
        this.actrecordArchmate = actrecordArchmate;
    }

    public String getActrecordPreparer() {
        return actrecordPreparer;
    }

    public void setActrecordPreparer(String actrecordPreparer) {
        this.actrecordPreparer = actrecordPreparer;
    }

    public String getActrecordLeader() {
        return actrecordLeader;
    }

    public void setActrecordLeader(String actrecordLeader) {
        this.actrecordLeader = actrecordLeader;
    }

    public Date getActrecordTime() {
        return actrecordTime;
    }

    public void setActrecordTime(Date actrecordTime) {
        this.actrecordTime = actrecordTime;
    }
}
