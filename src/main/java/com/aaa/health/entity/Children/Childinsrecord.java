package com.aaa.health.entity.Children;

/**
 * 新生儿健康检查记录
 */

import com.fasterxml.jackson.annotation.JsonFormat;

import java.math.BigDecimal;
import java.util.Date;

public class Childinsrecord {
    public int insrecordId,recordId,insrecordHeight,insrecordHeadsize,
            insrecordFace,insrecordSkin,insrecordFontane,insrecordMasses,
            insrecordEyes,insrecordEars,insrecordListen,insrecordOral,
            insrecordTeeth,insrecordChest,insrecordBelly,insrecordNavel,
            insrecordLimbs,insrecordRicksign,insrecordAnus,
            insrecordTranadvice
           ,insrecordState;

    public String insrecordWeiassess,insrecordHeiassess,insrecordRickets,
            insrecordGrowassess,
    insrecordTrandivision,insrecordGuide,
    insrecordHgb,insrecordTranreason,insrecordTwofollow,insrecordDe,insrecordDoctor;

    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    public Date insrecordDate,insrecordNextdate;


    public BigDecimal insrecordWeight,insrecordFonlong,insrecordFonwidth
            , insrecordOutdoors,insrecordTakevd;

    public int getInsrecordId() {
        return insrecordId;
    }

    public void setInsrecordId(int insrecordId) {
        this.insrecordId = insrecordId;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getInsrecordHeight() {
        return insrecordHeight;
    }

    public void setInsrecordHeight(int insrecordHeight) {
        this.insrecordHeight = insrecordHeight;
    }

    public int getInsrecordHeadsize() {
        return insrecordHeadsize;
    }

    public void setInsrecordHeadsize(int insrecordHeadsize) {
        this.insrecordHeadsize = insrecordHeadsize;
    }

    public int getInsrecordFace() {
        return insrecordFace;
    }

    public void setInsrecordFace(int insrecordFace) {
        this.insrecordFace = insrecordFace;
    }

    public int getInsrecordSkin() {
        return insrecordSkin;
    }

    public void setInsrecordSkin(int insrecordSkin) {
        this.insrecordSkin = insrecordSkin;
    }

    public int getInsrecordFontane() {
        return insrecordFontane;
    }

    public void setInsrecordFontane(int insrecordFontane) {
        this.insrecordFontane = insrecordFontane;
    }

    public int getInsrecordMasses() {
        return insrecordMasses;
    }

    public void setInsrecordMasses(int insrecordMasses) {
        this.insrecordMasses = insrecordMasses;
    }

    public int getInsrecordEyes() {
        return insrecordEyes;
    }

    public void setInsrecordEyes(int insrecordEyes) {
        this.insrecordEyes = insrecordEyes;
    }

    public int getInsrecordEars() {
        return insrecordEars;
    }

    public void setInsrecordEars(int insrecordEars) {
        this.insrecordEars = insrecordEars;
    }

    public int getInsrecordListen() {
        return insrecordListen;
    }

    public void setInsrecordListen(int insrecordListen) {
        this.insrecordListen = insrecordListen;
    }

    public int getInsrecordOral() {
        return insrecordOral;
    }

    public void setInsrecordOral(int insrecordOral) {
        this.insrecordOral = insrecordOral;
    }

    public int getInsrecordTeeth() {
        return insrecordTeeth;
    }

    public void setInsrecordTeeth(int insrecordTeeth) {
        this.insrecordTeeth = insrecordTeeth;
    }

    public int getInsrecordChest() {
        return insrecordChest;
    }

    public void setInsrecordChest(int insrecordChest) {
        this.insrecordChest = insrecordChest;
    }

    public int getInsrecordBelly() {
        return insrecordBelly;
    }

    public void setInsrecordBelly(int insrecordBelly) {
        this.insrecordBelly = insrecordBelly;
    }

    public int getInsrecordNavel() {
        return insrecordNavel;
    }

    public void setInsrecordNavel(int insrecordNavel) {
        this.insrecordNavel = insrecordNavel;
    }

    public int getInsrecordLimbs() {
        return insrecordLimbs;
    }

    public void setInsrecordLimbs(int insrecordLimbs) {
        this.insrecordLimbs = insrecordLimbs;
    }

    public int getInsrecordRicksign() {
        return insrecordRicksign;
    }

    public void setInsrecordRicksign(int insrecordRicksign) {
        this.insrecordRicksign = insrecordRicksign;
    }

    public int getInsrecordAnus() {
        return insrecordAnus;
    }

    public void setInsrecordAnus(int insrecordAnus) {
        this.insrecordAnus = insrecordAnus;
    }

    public int getInsrecordTranadvice() {
        return insrecordTranadvice;
    }

    public void setInsrecordTranadvice(int insrecordTranadvice) {
        this.insrecordTranadvice = insrecordTranadvice;
    }

    public int getInsrecordState() {
        return insrecordState;
    }

    public void setInsrecordState(int insrecordState) {
        this.insrecordState = insrecordState;
    }

    public String getInsrecordWeiassess() {
        return insrecordWeiassess;
    }

    public void setInsrecordWeiassess(String insrecordWeiassess) {
        this.insrecordWeiassess = insrecordWeiassess;
    }

    public String getInsrecordHeiassess() {
        return insrecordHeiassess;
    }

    public void setInsrecordHeiassess(String insrecordHeiassess) {
        this.insrecordHeiassess = insrecordHeiassess;
    }

    public String getInsrecordRickets() {
        return insrecordRickets;
    }

    public void setInsrecordRickets(String insrecordRickets) {
        this.insrecordRickets = insrecordRickets;
    }

    public String getInsrecordGrowassess() {
        return insrecordGrowassess;
    }

    public void setInsrecordGrowassess(String insrecordGrowassess) {
        this.insrecordGrowassess = insrecordGrowassess;
    }

    public String getInsrecordTrandivision() {
        return insrecordTrandivision;
    }

    public void setInsrecordTrandivision(String insrecordTrandivision) {
        this.insrecordTrandivision = insrecordTrandivision;
    }

    public String getInsrecordGuide() {
        return insrecordGuide;
    }

    public void setInsrecordGuide(String insrecordGuide) {
        this.insrecordGuide = insrecordGuide;
    }

    public String getInsrecordHgb() {
        return insrecordHgb;
    }

    public void setInsrecordHgb(String insrecordHgb) {
        this.insrecordHgb = insrecordHgb;
    }

    public String getInsrecordTranreason() {
        return insrecordTranreason;
    }

    public void setInsrecordTranreason(String insrecordTranreason) {
        this.insrecordTranreason = insrecordTranreason;
    }

    public String getInsrecordTwofollow() {
        return insrecordTwofollow;
    }

    public void setInsrecordTwofollow(String insrecordTwofollow) {
        this.insrecordTwofollow = insrecordTwofollow;
    }

    public String getInsrecordDe() {
        return insrecordDe;
    }

    public void setInsrecordDe(String insrecordDe) {
        this.insrecordDe = insrecordDe;
    }

    public String getInsrecordDoctor() {
        return insrecordDoctor;
    }

    public void setInsrecordDoctor(String insrecordDoctor) {
        this.insrecordDoctor = insrecordDoctor;
    }

    public Date getInsrecordDate() {
        return insrecordDate;
    }

    public void setInsrecordDate(Date insrecordDate) {
        this.insrecordDate = insrecordDate;
    }

    public Date getInsrecordNextdate() {
        return insrecordNextdate;
    }

    public void setInsrecordNextdate(Date insrecordNextdate) {
        this.insrecordNextdate = insrecordNextdate;
    }

    public BigDecimal getInsrecordWeight() {
        return insrecordWeight;
    }

    public void setInsrecordWeight(BigDecimal insrecordWeight) {
        this.insrecordWeight = insrecordWeight;
    }

    public BigDecimal getInsrecordFonlong() {
        return insrecordFonlong;
    }

    public void setInsrecordFonlong(BigDecimal insrecordFonlong) {
        this.insrecordFonlong = insrecordFonlong;
    }

    public BigDecimal getInsrecordFonwidth() {
        return insrecordFonwidth;
    }

    public void setInsrecordFonwidth(BigDecimal insrecordFonwidth) {
        this.insrecordFonwidth = insrecordFonwidth;
    }

    public BigDecimal getInsrecordOutdoors() {
        return insrecordOutdoors;
    }

    public void setInsrecordOutdoors(BigDecimal insrecordOutdoors) {
        this.insrecordOutdoors = insrecordOutdoors;
    }

    public BigDecimal getInsrecordTakevd() {
        return insrecordTakevd;
    }

    public void setInsrecordTakevd(BigDecimal insrecordTakevd) {
        this.insrecordTakevd = insrecordTakevd;
    }

    @Override
    public String toString() {
        return "Childinsrecord{" +
                "insrecordId=" + insrecordId +
                ", recordId=" + recordId +
                ", insrecordHeight=" + insrecordHeight +
                ", insrecordHeadsize=" + insrecordHeadsize +
                ", insrecordFace=" + insrecordFace +
                ", insrecordSkin=" + insrecordSkin +
                ", insrecordFontane=" + insrecordFontane +
                ", insrecordMasses=" + insrecordMasses +
                ", insrecordEyes=" + insrecordEyes +
                ", insrecordEars=" + insrecordEars +
                ", insrecordListen=" + insrecordListen +
                ", insrecordOral=" + insrecordOral +
                ", insrecordTeeth=" + insrecordTeeth +
                ", insrecordChest=" + insrecordChest +
                ", insrecordBelly=" + insrecordBelly +
                ", insrecordNavel=" + insrecordNavel +
                ", insrecordLimbs=" + insrecordLimbs +
                ", insrecordRicksign=" + insrecordRicksign +
                ", insrecordAnus=" + insrecordAnus +
                ", insrecordTranadvice=" + insrecordTranadvice +
                ", insrecordState=" + insrecordState +
                ", insrecordWeiassess='" + insrecordWeiassess + '\'' +
                ", insrecordHeiassess='" + insrecordHeiassess + '\'' +
                ", insrecordRickets='" + insrecordRickets + '\'' +
                ", insrecordGrowassess='" + insrecordGrowassess + '\'' +
                ", insrecordTrandivision='" + insrecordTrandivision + '\'' +
                ", insrecordGuide='" + insrecordGuide + '\'' +
                ", insrecordHgb='" + insrecordHgb + '\'' +
                ", insrecordTranreason='" + insrecordTranreason + '\'' +
                ", insrecordTwofollow='" + insrecordTwofollow + '\'' +
                ", insrecordDe='" + insrecordDe + '\'' +
                ", insrecordDoctor='" + insrecordDoctor + '\'' +
                ", insrecordDate=" + insrecordDate +
                ", insrecordNextdate=" + insrecordNextdate +
                ", insrecordWeight=" + insrecordWeight +
                ", insrecordFonlong=" + insrecordFonlong +
                ", insrecordFonwidth=" + insrecordFonwidth +
                ", insrecordOutdoors=" + insrecordOutdoors +
                ", insrecordTakevd=" + insrecordTakevd +
                '}';
    }
}
