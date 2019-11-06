package com.aaa.health.entity.hyper;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class HyPerTend implements Serializable {
    private Integer hypertenId,recordId,hypertenVisitway,hypertenBloodheight,//4
            hypertenBloodlow,hypertenHrrest,hypertenSmokfir,hypertenDrinkfir,//4
            hypertenSportsfir,hypertenSportsthird,hypertenTakensaltfir,//3
            hypertenMentality,hypertenCom,hypertenTanghua,hypertenCompliance,//4
            hypertenUneffect,hypertenDixue,hypertenClassify,hypertenDoctor,hypertenState;//5
    private String hypertenWithdrawcause,hypertenSymptom,hypertenElsesign,
            hypertenLeftothers,hypertenReferralcause,hypertenReferralobj,
            hypertenRemark,hypertenDe;
    private Date hypertenVisit,hypertenJianchadate,hypertenVisitdate;

    private BigDecimal hypertenWeightfir,hypertenKongfu;

    public Integer getHypertenId() {
        return hypertenId;
    }

    public void setHypertenId(Integer hypertenId) {
        this.hypertenId = hypertenId;
    }

    public Integer getRecordId() {
        return recordId;
    }

    public void setRecordId(Integer recordId) {
        this.recordId = recordId;
    }

    public Integer getHypertenVisitway() {
        return hypertenVisitway;
    }

    public void setHypertenVisitway(Integer hypertenVisitway) {
        this.hypertenVisitway = hypertenVisitway;
    }

    public Integer getHypertenBloodheight() {
        return hypertenBloodheight;
    }

    public void setHypertenBloodheight(Integer hypertenBloodheight) {
        this.hypertenBloodheight = hypertenBloodheight;
    }

    public Integer getHypertenBloodlow() {
        return hypertenBloodlow;
    }

    public void setHypertenBloodlow(Integer hypertenBloodlow) {
        this.hypertenBloodlow = hypertenBloodlow;
    }

    public Integer getHypertenHrrest() {
        return hypertenHrrest;
    }

    public void setHypertenHrrest(Integer hypertenHrrest) {
        this.hypertenHrrest = hypertenHrrest;
    }

    public Integer getHypertenSmokfir() {
        return hypertenSmokfir;
    }

    public void setHypertenSmokfir(Integer hypertenSmokfir) {
        this.hypertenSmokfir = hypertenSmokfir;
    }

    public Integer getHypertenDrinkfir() {
        return hypertenDrinkfir;
    }

    public void setHypertenDrinkfir(Integer hypertenDrinkfir) {
        this.hypertenDrinkfir = hypertenDrinkfir;
    }

    public Integer getHypertenSportsfir() {
        return hypertenSportsfir;
    }

    public void setHypertenSportsfir(Integer hypertenSportsfir) {
        this.hypertenSportsfir = hypertenSportsfir;
    }

    public Integer getHypertenSportsthird() {
        return hypertenSportsthird;
    }

    public void setHypertenSportsthird(Integer hypertenSportsthird) {
        this.hypertenSportsthird = hypertenSportsthird;
    }

    public Integer getHypertenTakensaltfir() {
        return hypertenTakensaltfir;
    }

    public void setHypertenTakensaltfir(Integer hypertenTakensaltfir) {
        this.hypertenTakensaltfir = hypertenTakensaltfir;
    }

    public Integer getHypertenMentality() {
        return hypertenMentality;
    }

    public void setHypertenMentality(Integer hypertenMentality) {
        this.hypertenMentality = hypertenMentality;
    }

    public Integer getHypertenCom() {
        return hypertenCom;
    }

    public void setHypertenCom(Integer hypertenCom) {
        this.hypertenCom = hypertenCom;
    }

    public Integer getHypertenTanghua() {
        return hypertenTanghua;
    }

    public void setHypertenTanghua(Integer hypertenTanghua) {
        this.hypertenTanghua = hypertenTanghua;
    }

    public Integer getHypertenCompliance() {
        return hypertenCompliance;
    }

    public void setHypertenCompliance(Integer hypertenCompliance) {
        this.hypertenCompliance = hypertenCompliance;
    }

    public Integer getHypertenUneffect() {
        return hypertenUneffect;
    }

    public void setHypertenUneffect(Integer hypertenUneffect) {
        this.hypertenUneffect = hypertenUneffect;
    }

    public Integer getHypertenDixue() {
        return hypertenDixue;
    }

    public void setHypertenDixue(Integer hypertenDixue) {
        this.hypertenDixue = hypertenDixue;
    }

    public Integer getHypertenClassify() {
        return hypertenClassify;
    }

    public void setHypertenClassify(Integer hypertenClassify) {
        this.hypertenClassify = hypertenClassify;
    }

    public Integer getHypertenDoctor() {
        return hypertenDoctor;
    }

    public void setHypertenDoctor(Integer hypertenDoctor) {
        this.hypertenDoctor = hypertenDoctor;
    }

    public Integer getHypertenState() {
        return hypertenState;
    }

    public void setHypertenState(Integer hypertenState) {
        this.hypertenState = hypertenState;
    }

    public String getHypertenWithdrawcause() {
        return hypertenWithdrawcause;
    }

    public void setHypertenWithdrawcause(String hypertenWithdrawcause) {
        this.hypertenWithdrawcause = hypertenWithdrawcause;
    }

    public String getHypertenSymptom() {
        return hypertenSymptom;
    }

    public void setHypertenSymptom(String hypertenSymptom) {
        this.hypertenSymptom = hypertenSymptom;
    }

    public String getHypertenElsesign() {
        return hypertenElsesign;
    }

    public void setHypertenElsesign(String hypertenElsesign) {
        this.hypertenElsesign = hypertenElsesign;
    }

    public String getHypertenLeftothers() {
        return hypertenLeftothers;
    }

    public void setHypertenLeftothers(String hypertenLeftothers) {
        this.hypertenLeftothers = hypertenLeftothers;
    }

    public String getHypertenReferralcause() {
        return hypertenReferralcause;
    }

    public void setHypertenReferralcause(String hypertenReferralcause) {
        this.hypertenReferralcause = hypertenReferralcause;
    }

    public String getHypertenReferralobj() {
        return hypertenReferralobj;
    }

    public void setHypertenReferralobj(String hypertenReferralobj) {
        this.hypertenReferralobj = hypertenReferralobj;
    }

    public String getHypertenRemark() {
        return hypertenRemark;
    }

    public void setHypertenRemark(String hypertenRemark) {
        this.hypertenRemark = hypertenRemark;
    }

    public String getHypertenDe() {
        return hypertenDe;
    }

    public void setHypertenDe(String hypertenDe) {
        this.hypertenDe = hypertenDe;
    }

    public Date getHypertenVisit() {
        return hypertenVisit;
    }

    public void setHypertenVisit(Date hypertenVisit) {
        this.hypertenVisit = hypertenVisit;
    }

    public Date getHypertenJianchadate() {
        return hypertenJianchadate;
    }

    public void setHypertenJianchadate(Date hypertenJianchadate) {
        this.hypertenJianchadate = hypertenJianchadate;
    }

    public Date getHypertenVisitdate() {
        return hypertenVisitdate;
    }

    public void setHypertenVisitdate(Date hypertenVisitdate) {
        this.hypertenVisitdate = hypertenVisitdate;
    }

    public BigDecimal getHypertenWeightfir() {
        return hypertenWeightfir;
    }

    public void setHypertenWeightfir(BigDecimal hypertenWeightfir) {
        this.hypertenWeightfir = hypertenWeightfir;
    }

    public BigDecimal getHypertenKongfu() {
        return hypertenKongfu;
    }

    public void setHypertenKongfu(BigDecimal hypertenKongfu) {
        this.hypertenKongfu = hypertenKongfu;
    }

    @Override
    public String toString() {
        return "HyPerTend{" +
                "hypertenId=" + hypertenId +
                ", recordId=" + recordId +
                ", hypertenVisitway=" + hypertenVisitway +
                ", hypertenBloodheight=" + hypertenBloodheight +
                ", hypertenBloodlow=" + hypertenBloodlow +
                ", hypertenHrrest=" + hypertenHrrest +
                ", hypertenSmokfir=" + hypertenSmokfir +
                ", hypertenDrinkfir=" + hypertenDrinkfir +
                ", hypertenSportsfir=" + hypertenSportsfir +
                ", hypertenSportsthird=" + hypertenSportsthird +
                ", hypertenTakensaltfir=" + hypertenTakensaltfir +
                ", hypertenMentality=" + hypertenMentality +
                ", hypertenCom=" + hypertenCom +
                ", hypertenTanghua=" + hypertenTanghua +
                ", hypertenCompliance=" + hypertenCompliance +
                ", hypertenUneffect=" + hypertenUneffect +
                ", hypertenDixue=" + hypertenDixue +
                ", hypertenClassify=" + hypertenClassify +
                ", hypertenDoctor=" + hypertenDoctor +
                ", hypertenState=" + hypertenState +
                ", hypertenWithdrawcause='" + hypertenWithdrawcause + '\'' +
                ", hypertenSymptom='" + hypertenSymptom + '\'' +
                ", hypertenElsesign='" + hypertenElsesign + '\'' +
                ", hypertenLeftothers='" + hypertenLeftothers + '\'' +
                ", hypertenReferralcause='" + hypertenReferralcause + '\'' +
                ", hypertenReferralobj='" + hypertenReferralobj + '\'' +
                ", hypertenRemark='" + hypertenRemark + '\'' +
                ", hypertenDe='" + hypertenDe + '\'' +
                ", hypertenVisit=" + hypertenVisit +
                ", hypertenJianchadate=" + hypertenJianchadate +
                ", hypertenVisitdate=" + hypertenVisitdate +
                ", hypertenWeightfir=" + hypertenWeightfir +
                ", hypertenKongfu=" + hypertenKongfu +
                '}';
    }
}
