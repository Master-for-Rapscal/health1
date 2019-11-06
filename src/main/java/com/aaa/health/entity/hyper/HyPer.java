package com.aaa.health.entity.hyper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HyPer implements Serializable{
    private Integer hypertensionId,recordId,hypertensionSource,hypertensionSmokingnum,
    hypertensionCapacitynum,hypertensionExercise,hypertensionRundate,hypertensionHeight,
            hypertensionBloodheight,hypertensionBloodlow,hypertensionDoctor,hypertensionArea;
    //高血压分级  危险因素 靶器官损坏
    // 临床疾患    -- 危险分层   转归原因
   //确诊单位   -- 目前症状
    private String hypertensionHypertension,hypertensionHazards,hypertensionTargetorgan,
            hypertensionDisorders,hypertensionStratification,hypertensionOutcome,
            hypertensionConfirmedunit,hypertensionCurrentsymptoms;
    private Date hypertensionConfirmed,hypertensionAccident,hypertensionOutcomedate,
            hypertensionJiankadate;
    private BigDecimal hypertensionWeight,hypertensionBmi,hypertensionFbg;

    public Integer getHypertensionArea() {
        return hypertensionArea;
    }

    public void setHypertensionArea(Integer hypertensionArea) {
        this.hypertensionArea = hypertensionArea;
    }

    public String getHypertensionConfirmedunit() {
        return hypertensionConfirmedunit;
    }

    public void setHypertensionConfirmedunit(String hypertensionConfirmedunit) {
        this.hypertensionConfirmedunit = hypertensionConfirmedunit;
    }

    public String getHypertensionCurrentsymptoms() {
        return hypertensionCurrentsymptoms;
    }

    public void setHypertensionCurrentsymptoms(String hypertensionCurrentsymptoms) {
        this.hypertensionCurrentsymptoms = hypertensionCurrentsymptoms;
    }

    public Integer getHypertensionId() {
        return hypertensionId;
    }

    public void setHypertensionId(Integer hypertensionId) {
        this.hypertensionId = hypertensionId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getHypertensionSource() {
        return hypertensionSource;
    }

    public void setHypertensionSource(Integer hypertensionSource) {
        this.hypertensionSource = hypertensionSource;
    }

    public Integer getHypertensionSmokingnum() {
        return hypertensionSmokingnum;
    }

    public void setHypertensionSmokingnum(Integer hypertensionSmokingnum) {
        this.hypertensionSmokingnum = hypertensionSmokingnum;
    }

    public Integer getHypertensionCapacitynum() {
        return hypertensionCapacitynum;
    }

    public void setHypertensionCapacitynum(Integer hypertensionCapacitynum) {
        this.hypertensionCapacitynum = hypertensionCapacitynum;
    }

    public Integer getHypertensionExercise() {
        return hypertensionExercise;
    }

    public void setHypertensionExercise(Integer hypertensionExercise) {
        this.hypertensionExercise = hypertensionExercise;
    }

    public Integer getHypertensionRundate() {
        return hypertensionRundate;
    }

    public void setHypertensionRundate(Integer hypertensionRundate) {
        this.hypertensionRundate = hypertensionRundate;
    }

    public Integer getHypertensionHeight() {
        return hypertensionHeight;
    }

    public void setHypertensionHeight(Integer hypertensionHeight) {
        this.hypertensionHeight = hypertensionHeight;
    }

    public Integer getHypertensionBloodheight() {
        return hypertensionBloodheight;
    }

    public void setHypertensionBloodheight(Integer hypertensionBloodheight) {
        this.hypertensionBloodheight = hypertensionBloodheight;
    }

    public Integer getHypertensionBloodlow() {
        return hypertensionBloodlow;
    }

    public void setHypertensionBloodlow(Integer hypertensionBloodlow) {
        this.hypertensionBloodlow = hypertensionBloodlow;
    }

    public Integer getHypertensionDoctor() {
        return hypertensionDoctor;
    }

    public void setHypertensionDoctor(Integer hypertensionDoctor) {
        this.hypertensionDoctor = hypertensionDoctor;
    }

    public String getHypertensionHypertension() {
        return hypertensionHypertension;
    }

    public void setHypertensionHypertension(String hypertensionHypertension) {
        this.hypertensionHypertension = hypertensionHypertension;
    }

    public String getHypertensionHazards() {
        return hypertensionHazards;
    }

    public void setHypertensionHazards(String hypertensionHazards) {
        this.hypertensionHazards = hypertensionHazards;
    }

    public String getHypertensionTargetorgan() {
        return hypertensionTargetorgan;
    }

    public void setHypertensionTargetorgan(String hypertensionTargetorgan) {
        this.hypertensionTargetorgan = hypertensionTargetorgan;
    }

    public String getHypertensionDisorders() {
        return hypertensionDisorders;
    }

    public void setHypertensionDisorders(String hypertensionDisorders) {
        this.hypertensionDisorders = hypertensionDisorders;
    }

    public String getHypertensionStratification() {
        return hypertensionStratification;
    }

    public void setHypertensionStratification(String hypertensionStratification) {
        this.hypertensionStratification = hypertensionStratification;
    }

    public String getHypertensionOutcome() {
        return hypertensionOutcome;
    }

    public void setHypertensionOutcome(String hypertensionOutcome) {
        this.hypertensionOutcome = hypertensionOutcome;
    }

    public Date getHypertensionConfirmed() {
        return hypertensionConfirmed;
    }

    public void setHypertensionConfirmed(Date hypertensionConfirmed) {
        this.hypertensionConfirmed = hypertensionConfirmed;
    }

    public Date getHypertensionAccident() {
        return hypertensionAccident;
    }

    public void setHypertensionAccident(Date hypertensionAccident) {
        this.hypertensionAccident = hypertensionAccident;
    }

    public Date getHypertensionOutcomedate() {
        return hypertensionOutcomedate;
    }

    public void setHypertensionOutcomedate(Date hypertensionOutcomedate) {
        this.hypertensionOutcomedate = hypertensionOutcomedate;
    }

    public Date getHypertensionJiankadate() {
        return hypertensionJiankadate;
    }

    public void setHypertensionJiankadate(Date hypertensionJiankadate) {
        this.hypertensionJiankadate = hypertensionJiankadate;
    }

    public BigDecimal getHypertensionWeight() {
        return hypertensionWeight;
    }

    public void setHypertensionWeight(BigDecimal hypertensionWeight) {
        this.hypertensionWeight = hypertensionWeight;
    }

    public BigDecimal getHypertensionBmi() {
        return hypertensionBmi;
    }

    public void setHypertensionBmi(BigDecimal hypertensionBmi) {
        this.hypertensionBmi = hypertensionBmi;
    }

    public BigDecimal getHypertensionFbg() {
        return hypertensionFbg;
    }

    public void setHypertensionFbg(BigDecimal hypertensionFbg) {
        this.hypertensionFbg = hypertensionFbg;
    }

    @Override
    public String toString() {
        return "HyPer{" +
                "hypertensionId=" + hypertensionId +
                ", recordId=" + recordId +
                ", hypertensionSource=" + hypertensionSource +
                ", hypertensionSmokingnum=" + hypertensionSmokingnum +
                ", hypertensionCapacitynum=" + hypertensionCapacitynum +
                ", hypertensionExercise=" + hypertensionExercise +
                ", hypertensionRundate=" + hypertensionRundate +
                ", hypertensionHeight=" + hypertensionHeight +
                ", hypertensionBloodheight=" + hypertensionBloodheight +
                ", hypertensionBloodlow=" + hypertensionBloodlow +
                ", hypertensionDoctor=" + hypertensionDoctor +
                ", hypertensionArea=" + hypertensionArea +
                ", hypertensionHypertension='" + hypertensionHypertension + '\'' +
                ", hypertensionHazards='" + hypertensionHazards + '\'' +
                ", hypertensionTargetorgan='" + hypertensionTargetorgan + '\'' +
                ", hypertensionDisorders='" + hypertensionDisorders + '\'' +
                ", hypertensionStratification='" + hypertensionStratification + '\'' +
                ", hypertensionOutcome='" + hypertensionOutcome + '\'' +
                ", hypertensionConfirmedunit='" + hypertensionConfirmedunit + '\'' +
                ", hypertensionCurrentsymptoms='" + hypertensionCurrentsymptoms + '\'' +
                ", hypertensionConfirmed=" + hypertensionConfirmed +
                ", hypertensionAccident=" + hypertensionAccident +
                ", hypertensionOutcomedate=" + hypertensionOutcomedate +
                ", hypertensionJiankadate=" + hypertensionJiankadate +
                ", hypertensionWeight=" + hypertensionWeight +
                ", hypertensionBmi=" + hypertensionBmi +
                ", hypertensionFbg=" + hypertensionFbg +
                '}';
    }
}
