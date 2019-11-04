package com.aaa.health.entity.zzh;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

public class Healthcheck implements Serializable {
    private Date healthcheckDate;
    private double
    healthcheckStyleDaydrink ,
    healthcheckStatusWaist ,
    healthcheckStatusConstitution ,
    healthcheckStatusWeight ,
    healthcheckVisceraVisionl ,
    healthcheckVisceraVisionr ,
    healthcheckVisceraCval ,
    healthcheckVisceraCvar ,
    healthcheckAcpHemoglobin ,
    healthcheckAcpHemameba ,
    healthcheckAcpSoterocyte   ,
    healthcheckAcpFbg1  ,
    healthcheckAcpFbg2  ,
    healthcheckAcpHbalc ,
    healthcheckAcpDbil ,
    healthcheckAcpBun ,
    healthcheckAcpPotasiosangre ,
    healthcheckAcpTch ,
    healthcheckAcpColesterolldl ,
    healthcheckAcpColesterolhdl ;

    private Long userinfoId,healthcheckId;
    private int
    healthcheckDoctor ,
    healthcheckStatusHeight ,
    healthcheckStatusStateevaluation ,
    healthcheckStatusSelf ,
    healthcheckStatusPerceive ,
    healthcheckStatusEmotion ,
    healthcheckStyleExfrequency ,
    healthcheckStyleEverytime ,
    healthcheckStyleInsisttime ,
    healthcheckStyleSmokingstate ,
    healthcheckStyleSmokingnum ,
    healthcheckStyleSmokingage ,
    healthcheckStyleCessationage ,
    healthcheckStyleDrink  ,
    healthcheckCheckupVulva ,
    healthcheckCheckupVagina ,
    healthcheckCheckupCervix ,
    healthcheckCheckupCorpus ,
    healthcheckCheckupAdjunct ,
    healthcheckAcpOccultbloodstool  ,
    healthcheckAcpHbsag ,
    healthcheckAcpSgpt ,
    healthcheckAcpSgot ,
    healthcheckAcpAlb ,
    healthcheckAcpTbil ,
    healthcheckAcpTrig ,
    healthcheckAcpChestxray ,
    healthcheckAcpOthers  ,
    healthcheckStatusGrade ,
    healthcheckStatusState ,
    healthcheckAcpCreatinine ,
    healthcheckAcpSerumsodium ,
    healthcheckAcpUalb ,
    healthcheckStyleTemperance ,
    healthcheckStyleTemperanceage ,
    healthcheckStyleBegintemperance ,
    healthcheckStyleEbriety ,
    healthcheckVisceraMotor ,
    healthcheckCheckupBarrelchest  ,
    healthcheckCheckupHeartrate ,
    healthcheckCheckupEdema ,
    healthcheckCheckupAcrotarsium ,
    healthcheckVisceraLips ,
    healthcheckVisceraPharynx ,
    healthcheckStyleOccupational ,
    healthcheckStyleWorkyear;

    private  String
    healthcheckSymptomSympotom  ,
    healthcheckStatusHeat  ,
    healthcheckStatusPr  ,
    healthcheckStatusRr  ,
    healthcheckStatusBrl  ,
    healthcheckStatusBrr  ,
    healthcheckStyleExercise  ,
    healthcheckStyleDietary  ,
    healthcheckStyleDrinktype  ,
    healthcheckStyleCraft  ,
    healthcheckStyleDust  ,
    healthcheckStyleDustfence  ,
    healthcheckStyleRadiate  ,
    healthcheckStyleRadiatefence  ,
    healthcheckStylePhysics  ,
    healthcheckStylePhysicsfence  ,
    healthcheckStyleChemistry  ,
    healthcheckStyleChemistryfence  ,
    healthcheckStyleOthers  ,
    healthcheckStyleOthersfence  ,
    healthcheckVisceraDentrue  ,
    healthcheckVisceraEar  ,
    healthcheckCheckupEye  ,
    healthcheckCheckupSkin  ,
    healthcheckCheckupSclera  ,
    healthcheckCheckupLymphaden  ,
    healthcheckCheckupBreathsounds  ,
    healthcheckCheckupRale  ,
    healthcheckCheckupNoise  ,
    healthcheckCheckupTenderness  ,
    healthcheckCheckupMasses  ,
    healthcheckCheckupHepatomegaly  ,
    healthcheckCheckupSplenauxe  ,
    healthcheckCheckupDevoice  ,
    healthcheckCheckupAnus  ,
    healthcheckCheckupBreast  ,
    healthcheckCheckupOthers  ,
    healthcheckAcpBloodroutineother  ,
    healthcheckAcpPro  ,
    healthcheckAcpUglu  ,
    healthcheckAcpKet  ,
    healthcheckAcpEry  ,
    healthcheckAcpEcg   ,
    healthcheckAcpBtypeultrasonic   ,
    healthcheckAcpBultrasoundothers   ,
    healthcheckAcpPapsmear   ,
    healthcheckProblemaCered  ,
    healthcheckProblemaKidneyd   ,
    healthcheckProblemaHeartd  ,
    healthcheckProblemaVarsculard  ,
    healthcheckProblemaEyed  ,
    healthcheckProblemaNervousystem  ,
    healthcheckProblemaOthersdis;


    @Override
    public String toString() {
        return "Healthcheck{" +
                "healthcheckDate=" + healthcheckDate +
                ", healthcheckStyleDaydrink=" + healthcheckStyleDaydrink +
                ", healthcheckStatusWaist=" + healthcheckStatusWaist +
                ", healthcheckStatusConstitution=" + healthcheckStatusConstitution +
                ", healthcheckStatusWeight=" + healthcheckStatusWeight +
                ", healthcheckVisceraVisionl=" + healthcheckVisceraVisionl +
                ", healthcheckVisceraVisionr=" + healthcheckVisceraVisionr +
                ", healthcheckVisceraCval=" + healthcheckVisceraCval +
                ", healthcheckVisceraCvar=" + healthcheckVisceraCvar +
                ", healthcheckAcpHemoglobin=" + healthcheckAcpHemoglobin +
                ", healthcheckAcpHemameba=" + healthcheckAcpHemameba +
                ", healthcheckAcpSoterocyte=" + healthcheckAcpSoterocyte +
                ", healthcheckAcpFbg1=" + healthcheckAcpFbg1 +
                ", healthcheckAcpFbg2=" + healthcheckAcpFbg2 +
                ", healthcheckAcpHbalc=" + healthcheckAcpHbalc +
                ", healthcheckAcpDbil=" + healthcheckAcpDbil +
                ", healthcheckAcpBun=" + healthcheckAcpBun +
                ", healthcheckAcpPotasiosangre=" + healthcheckAcpPotasiosangre +
                ", healthcheckAcpTch=" + healthcheckAcpTch +
                ", healthcheckAcpColesterolldl=" + healthcheckAcpColesterolldl +
                ", healthcheckAcpColesterolhdl=" + healthcheckAcpColesterolhdl +
                ", userinfoId=" + userinfoId +
                ", healthcheckId=" + healthcheckId +
                ", healthcheckDoctor=" + healthcheckDoctor +
                ", healthcheckStatusHeight=" + healthcheckStatusHeight +
                ", healthcheckStatusStateevaluation=" + healthcheckStatusStateevaluation +
                ", healthcheckStatusSelf=" + healthcheckStatusSelf +
                ", healthcheckStatusPerceive=" + healthcheckStatusPerceive +
                ", healthcheckStatusEmotion=" + healthcheckStatusEmotion +
                ", healthcheckStyleExfrequency=" + healthcheckStyleExfrequency +
                ", healthcheckStyleEverytime=" + healthcheckStyleEverytime +
                ", healthcheckStyleInsisttime=" + healthcheckStyleInsisttime +
                ", healthcheckStyleSmokingstate=" + healthcheckStyleSmokingstate +
                ", healthcheckStyleSmokingnum=" + healthcheckStyleSmokingnum +
                ", healthcheckStyleSmokingage=" + healthcheckStyleSmokingage +
                ", healthcheckStyleCessationage=" + healthcheckStyleCessationage +
                ", healthcheckStyleDrink=" + healthcheckStyleDrink +
                ", healthcheckCheckupVulva=" + healthcheckCheckupVulva +
                ", healthcheckCheckupVagina=" + healthcheckCheckupVagina +
                ", healthcheckCheckupCervix=" + healthcheckCheckupCervix +
                ", healthcheckCheckupCorpus=" + healthcheckCheckupCorpus +
                ", healthcheckCheckupAdjunct=" + healthcheckCheckupAdjunct +
                ", healthcheckAcpOccultbloodstool=" + healthcheckAcpOccultbloodstool +
                ", healthcheckAcpHbsag=" + healthcheckAcpHbsag +
                ", healthcheckAcpSgpt=" + healthcheckAcpSgpt +
                ", healthcheckAcpSgot=" + healthcheckAcpSgot +
                ", healthcheckAcpAlb=" + healthcheckAcpAlb +
                ", healthcheckAcpTbil=" + healthcheckAcpTbil +
                ", healthcheckAcpTrig=" + healthcheckAcpTrig +
                ", healthcheckAcpChestxray=" + healthcheckAcpChestxray +
                ", healthcheckAcpOthers=" + healthcheckAcpOthers +
                ", healthcheckStatusGrade=" + healthcheckStatusGrade +
                ", healthcheckStatusState=" + healthcheckStatusState +
                ", healthcheckAcpCreatinine=" + healthcheckAcpCreatinine +
                ", healthcheckAcpSerumsodium=" + healthcheckAcpSerumsodium +
                ", healthcheckAcpUalb=" + healthcheckAcpUalb +
                ", healthcheckStyleTemperance=" + healthcheckStyleTemperance +
                ", healthcheckStyleTemperanceage=" + healthcheckStyleTemperanceage +
                ", healthcheckStyleBegintemperance=" + healthcheckStyleBegintemperance +
                ", healthcheckStyleEbriety=" + healthcheckStyleEbriety +
                ", healthcheckVisceraMotor=" + healthcheckVisceraMotor +
                ", healthcheckCheckupBarrelchest=" + healthcheckCheckupBarrelchest +
                ", healthcheckCheckupHeartrate=" + healthcheckCheckupHeartrate +
                ", healthcheckCheckupEdema=" + healthcheckCheckupEdema +
                ", healthcheckCheckupAcrotarsium=" + healthcheckCheckupAcrotarsium +
                ", healthcheckVisceraLips=" + healthcheckVisceraLips +
                ", healthcheckVisceraPharynx=" + healthcheckVisceraPharynx +
                ", healthcheckStyleOccupational=" + healthcheckStyleOccupational +
                ", healthcheckStyleWorkyear=" + healthcheckStyleWorkyear +
                ", healthcheckSymptomSympotom='" + healthcheckSymptomSympotom + '\'' +
                ", healthcheckStatusHeat='" + healthcheckStatusHeat + '\'' +
                ", healthcheckStatusPr='" + healthcheckStatusPr + '\'' +
                ", healthcheckStatusRr='" + healthcheckStatusRr + '\'' +
                ", healthcheckStatusBrl='" + healthcheckStatusBrl + '\'' +
                ", healthcheckStatusBrr='" + healthcheckStatusBrr + '\'' +
                ", healthcheckStyleExercise='" + healthcheckStyleExercise + '\'' +
                ", healthcheckStyleDietary='" + healthcheckStyleDietary + '\'' +
                ", healthcheckStyleDrinktype='" + healthcheckStyleDrinktype + '\'' +
                ", healthcheckStyleCraft='" + healthcheckStyleCraft + '\'' +
                ", healthcheckStyleDust='" + healthcheckStyleDust + '\'' +
                ", healthcheckStyleDustfence='" + healthcheckStyleDustfence + '\'' +
                ", healthcheckStyleRadiate='" + healthcheckStyleRadiate + '\'' +
                ", healthcheckStyleRadiatefence='" + healthcheckStyleRadiatefence + '\'' +
                ", healthcheckStylePhysics='" + healthcheckStylePhysics + '\'' +
                ", healthcheckStylePhysicsfence='" + healthcheckStylePhysicsfence + '\'' +
                ", healthcheckStyleChemistry='" + healthcheckStyleChemistry + '\'' +
                ", healthcheckStyleChemistryfence='" + healthcheckStyleChemistryfence + '\'' +
                ", healthcheckStyleOthers='" + healthcheckStyleOthers + '\'' +
                ", healthcheckStyleOthersfence='" + healthcheckStyleOthersfence + '\'' +
                ", healthcheckVisceraDentrue='" + healthcheckVisceraDentrue + '\'' +
                ", healthcheckVisceraEar='" + healthcheckVisceraEar + '\'' +
                ", healthcheckCheckupEye='" + healthcheckCheckupEye + '\'' +
                ", healthcheckCheckupSkin='" + healthcheckCheckupSkin + '\'' +
                ", healthcheckCheckupSclera='" + healthcheckCheckupSclera + '\'' +
                ", healthcheckCheckupLymphaden='" + healthcheckCheckupLymphaden + '\'' +
                ", healthcheckCheckupBreathsounds='" + healthcheckCheckupBreathsounds + '\'' +
                ", healthcheckCheckupRale='" + healthcheckCheckupRale + '\'' +
                ", healthcheckCheckupNoise='" + healthcheckCheckupNoise + '\'' +
                ", healthcheckCheckupTenderness='" + healthcheckCheckupTenderness + '\'' +
                ", healthcheckCheckupMasses='" + healthcheckCheckupMasses + '\'' +
                ", healthcheckCheckupHepatomegaly='" + healthcheckCheckupHepatomegaly + '\'' +
                ", healthcheckCheckupSplenauxe='" + healthcheckCheckupSplenauxe + '\'' +
                ", healthcheckCheckupDevoice='" + healthcheckCheckupDevoice + '\'' +
                ", healthcheckCheckupAnus='" + healthcheckCheckupAnus + '\'' +
                ", healthcheckCheckupBreast='" + healthcheckCheckupBreast + '\'' +
                ", healthcheckCheckupOthers='" + healthcheckCheckupOthers + '\'' +
                ", healthcheckAcpBloodroutineother='" + healthcheckAcpBloodroutineother + '\'' +
                ", healthcheckAcpPro='" + healthcheckAcpPro + '\'' +
                ", healthcheckAcpUglu='" + healthcheckAcpUglu + '\'' +
                ", healthcheckAcpKet='" + healthcheckAcpKet + '\'' +
                ", healthcheckAcpEry='" + healthcheckAcpEry + '\'' +
                ", healthcheckAcpEcg='" + healthcheckAcpEcg + '\'' +
                ", healthcheckAcpBtypeultrasonic='" + healthcheckAcpBtypeultrasonic + '\'' +
                ", healthcheckAcpBultrasoundothers='" + healthcheckAcpBultrasoundothers + '\'' +
                ", healthcheckAcpPapsmear='" + healthcheckAcpPapsmear + '\'' +
                ", healthcheckProblemaCered='" + healthcheckProblemaCered + '\'' +
                ", healthcheckProblemaKidneyd='" + healthcheckProblemaKidneyd + '\'' +
                ", healthcheckProblemaHeartd='" + healthcheckProblemaHeartd + '\'' +
                ", healthcheckProblemaVarsculard='" + healthcheckProblemaVarsculard + '\'' +
                ", healthcheckProblemaEyed='" + healthcheckProblemaEyed + '\'' +
                ", healthcheckProblemaNervousystem='" + healthcheckProblemaNervousystem + '\'' +
                ", healthcheckProblemaOthersdis='" + healthcheckProblemaOthersdis + '\'' +
                '}';
    }

    public Long getHealthcheckId() {
        return healthcheckId;
    }

    public void setHealthcheckId(Long healthcheckId) {
        this.healthcheckId = healthcheckId;
    }

    public Date getHealthcheckDate() {
        return healthcheckDate;
    }

    public void setHealthcheckDate(Date healthcheckDate) {
        this.healthcheckDate = healthcheckDate;
    }

    public double getHealthcheckStyleDaydrink() {
        return healthcheckStyleDaydrink;
    }

    public void setHealthcheckStyleDaydrink(double healthcheckStyleDaydrink) {
        this.healthcheckStyleDaydrink = healthcheckStyleDaydrink;
    }

    public double getHealthcheckStatusWaist() {
        return healthcheckStatusWaist;
    }

    public void setHealthcheckStatusWaist(double healthcheckStatusWaist) {
        this.healthcheckStatusWaist = healthcheckStatusWaist;
    }

    public double getHealthcheckStatusConstitution() {
        return healthcheckStatusConstitution;
    }

    public void setHealthcheckStatusConstitution(double healthcheckStatusConstitution) {
        this.healthcheckStatusConstitution = healthcheckStatusConstitution;
    }

    public double getHealthcheckStatusWeight() {
        return healthcheckStatusWeight;
    }

    public void setHealthcheckStatusWeight(double healthcheckStatusWeight) {
        this.healthcheckStatusWeight = healthcheckStatusWeight;
    }

    public double getHealthcheckVisceraVisionl() {
        return healthcheckVisceraVisionl;
    }

    public void setHealthcheckVisceraVisionl(double healthcheckVisceraVisionl) {
        this.healthcheckVisceraVisionl = healthcheckVisceraVisionl;
    }

    public double getHealthcheckVisceraVisionr() {
        return healthcheckVisceraVisionr;
    }

    public void setHealthcheckVisceraVisionr(double healthcheckVisceraVisionr) {
        this.healthcheckVisceraVisionr = healthcheckVisceraVisionr;
    }

    public double getHealthcheckVisceraCval() {
        return healthcheckVisceraCval;
    }

    public void setHealthcheckVisceraCval(double healthcheckVisceraCval) {
        this.healthcheckVisceraCval = healthcheckVisceraCval;
    }

    public double getHealthcheckVisceraCvar() {
        return healthcheckVisceraCvar;
    }

    public void setHealthcheckVisceraCvar(double healthcheckVisceraCvar) {
        this.healthcheckVisceraCvar = healthcheckVisceraCvar;
    }

    public double getHealthcheckAcpHemoglobin() {
        return healthcheckAcpHemoglobin;
    }

    public void setHealthcheckAcpHemoglobin(double healthcheckAcpHemoglobin) {
        this.healthcheckAcpHemoglobin = healthcheckAcpHemoglobin;
    }

    public double getHealthcheckAcpHemameba() {
        return healthcheckAcpHemameba;
    }

    public void setHealthcheckAcpHemameba(double healthcheckAcpHemameba) {
        this.healthcheckAcpHemameba = healthcheckAcpHemameba;
    }

    public double getHealthcheckAcpSoterocyte() {
        return healthcheckAcpSoterocyte;
    }

    public void setHealthcheckAcpSoterocyte(double healthcheckAcpSoterocyte) {
        this.healthcheckAcpSoterocyte = healthcheckAcpSoterocyte;
    }

    public double getHealthcheckAcpFbg1() {
        return healthcheckAcpFbg1;
    }

    public void setHealthcheckAcpFbg1(double healthcheckAcpFbg1) {
        this.healthcheckAcpFbg1 = healthcheckAcpFbg1;
    }

    public double getHealthcheckAcpFbg2() {
        return healthcheckAcpFbg2;
    }

    public void setHealthcheckAcpFbg2(double healthcheckAcpFbg2) {
        this.healthcheckAcpFbg2 = healthcheckAcpFbg2;
    }

    public double getHealthcheckAcpHbalc() {
        return healthcheckAcpHbalc;
    }

    public void setHealthcheckAcpHbalc(double healthcheckAcpHbalc) {
        this.healthcheckAcpHbalc = healthcheckAcpHbalc;
    }

    public double getHealthcheckAcpDbil() {
        return healthcheckAcpDbil;
    }

    public void setHealthcheckAcpDbil(double healthcheckAcpDbil) {
        this.healthcheckAcpDbil = healthcheckAcpDbil;
    }

    public double getHealthcheckAcpBun() {
        return healthcheckAcpBun;
    }

    public void setHealthcheckAcpBun(double healthcheckAcpBun) {
        this.healthcheckAcpBun = healthcheckAcpBun;
    }

    public double getHealthcheckAcpPotasiosangre() {
        return healthcheckAcpPotasiosangre;
    }

    public void setHealthcheckAcpPotasiosangre(double healthcheckAcpPotasiosangre) {
        this.healthcheckAcpPotasiosangre = healthcheckAcpPotasiosangre;
    }

    public double getHealthcheckAcpTch() {
        return healthcheckAcpTch;
    }

    public void setHealthcheckAcpTch(double healthcheckAcpTch) {
        this.healthcheckAcpTch = healthcheckAcpTch;
    }

    public double getHealthcheckAcpColesterolldl() {
        return healthcheckAcpColesterolldl;
    }

    public void setHealthcheckAcpColesterolldl(double healthcheckAcpColesterolldl) {
        this.healthcheckAcpColesterolldl = healthcheckAcpColesterolldl;
    }

    public double getHealthcheckAcpColesterolhdl() {
        return healthcheckAcpColesterolhdl;
    }

    public void setHealthcheckAcpColesterolhdl(double healthcheckAcpColesterolhdl) {
        this.healthcheckAcpColesterolhdl = healthcheckAcpColesterolhdl;
    }

    public Long getUserinfoId() {
        return userinfoId;
    }

    public void setUserinfoId(Long userinfoId) {
        this.userinfoId = userinfoId;
    }

    public int getHealthcheckDoctor() {
        return healthcheckDoctor;
    }

    public void setHealthcheckDoctor(int healthcheckDoctor) {
        this.healthcheckDoctor = healthcheckDoctor;
    }

    public int getHealthcheckStatusHeight() {
        return healthcheckStatusHeight;
    }

    public void setHealthcheckStatusHeight(int healthcheckStatusHeight) {
        this.healthcheckStatusHeight = healthcheckStatusHeight;
    }

    public int getHealthcheckStatusStateevaluation() {
        return healthcheckStatusStateevaluation;
    }

    public void setHealthcheckStatusStateevaluation(int healthcheckStatusStateevaluation) {
        this.healthcheckStatusStateevaluation = healthcheckStatusStateevaluation;
    }

    public int getHealthcheckStatusSelf() {
        return healthcheckStatusSelf;
    }

    public void setHealthcheckStatusSelf(int healthcheckStatusSelf) {
        this.healthcheckStatusSelf = healthcheckStatusSelf;
    }

    public int getHealthcheckStatusPerceive() {
        return healthcheckStatusPerceive;
    }

    public void setHealthcheckStatusPerceive(int healthcheckStatusPerceive) {
        this.healthcheckStatusPerceive = healthcheckStatusPerceive;
    }

    public int getHealthcheckStatusEmotion() {
        return healthcheckStatusEmotion;
    }

    public void setHealthcheckStatusEmotion(int healthcheckStatusEmotion) {
        this.healthcheckStatusEmotion = healthcheckStatusEmotion;
    }

    public int getHealthcheckStyleExfrequency() {
        return healthcheckStyleExfrequency;
    }

    public void setHealthcheckStyleExfrequency(int healthcheckStyleExfrequency) {
        this.healthcheckStyleExfrequency = healthcheckStyleExfrequency;
    }

    public int getHealthcheckStyleEverytime() {
        return healthcheckStyleEverytime;
    }

    public void setHealthcheckStyleEverytime(int healthcheckStyleEverytime) {
        this.healthcheckStyleEverytime = healthcheckStyleEverytime;
    }

    public int getHealthcheckStyleInsisttime() {
        return healthcheckStyleInsisttime;
    }

    public void setHealthcheckStyleInsisttime(int healthcheckStyleInsisttime) {
        this.healthcheckStyleInsisttime = healthcheckStyleInsisttime;
    }

    public int getHealthcheckStyleSmokingstate() {
        return healthcheckStyleSmokingstate;
    }

    public void setHealthcheckStyleSmokingstate(int healthcheckStyleSmokingstate) {
        this.healthcheckStyleSmokingstate = healthcheckStyleSmokingstate;
    }

    public int getHealthcheckStyleSmokingnum() {
        return healthcheckStyleSmokingnum;
    }

    public void setHealthcheckStyleSmokingnum(int healthcheckStyleSmokingnum) {
        this.healthcheckStyleSmokingnum = healthcheckStyleSmokingnum;
    }

    public int getHealthcheckStyleSmokingage() {
        return healthcheckStyleSmokingage;
    }

    public void setHealthcheckStyleSmokingage(int healthcheckStyleSmokingage) {
        this.healthcheckStyleSmokingage = healthcheckStyleSmokingage;
    }

    public int getHealthcheckStyleCessationage() {
        return healthcheckStyleCessationage;
    }

    public void setHealthcheckStyleCessationage(int healthcheckStyleCessationage) {
        this.healthcheckStyleCessationage = healthcheckStyleCessationage;
    }

    public int getHealthcheckStyleDrink() {
        return healthcheckStyleDrink;
    }

    public void setHealthcheckStyleDrink(int healthcheckStyleDrink) {
        this.healthcheckStyleDrink = healthcheckStyleDrink;
    }

    public int getHealthcheckCheckupVulva() {
        return healthcheckCheckupVulva;
    }

    public void setHealthcheckCheckupVulva(int healthcheckCheckupVulva) {
        this.healthcheckCheckupVulva = healthcheckCheckupVulva;
    }

    public int getHealthcheckCheckupVagina() {
        return healthcheckCheckupVagina;
    }

    public void setHealthcheckCheckupVagina(int healthcheckCheckupVagina) {
        this.healthcheckCheckupVagina = healthcheckCheckupVagina;
    }

    public int getHealthcheckCheckupCervix() {
        return healthcheckCheckupCervix;
    }

    public void setHealthcheckCheckupCervix(int healthcheckCheckupCervix) {
        this.healthcheckCheckupCervix = healthcheckCheckupCervix;
    }

    public int getHealthcheckCheckupCorpus() {
        return healthcheckCheckupCorpus;
    }

    public void setHealthcheckCheckupCorpus(int healthcheckCheckupCorpus) {
        this.healthcheckCheckupCorpus = healthcheckCheckupCorpus;
    }

    public int getHealthcheckCheckupAdjunct() {
        return healthcheckCheckupAdjunct;
    }

    public void setHealthcheckCheckupAdjunct(int healthcheckCheckupAdjunct) {
        this.healthcheckCheckupAdjunct = healthcheckCheckupAdjunct;
    }

    public int getHealthcheckAcpOccultbloodstool() {
        return healthcheckAcpOccultbloodstool;
    }

    public void setHealthcheckAcpOccultbloodstool(int healthcheckAcpOccultbloodstool) {
        this.healthcheckAcpOccultbloodstool = healthcheckAcpOccultbloodstool;
    }

    public int getHealthcheckAcpHbsag() {
        return healthcheckAcpHbsag;
    }

    public void setHealthcheckAcpHbsag(int healthcheckAcpHbsag) {
        this.healthcheckAcpHbsag = healthcheckAcpHbsag;
    }

    public int getHealthcheckAcpSgpt() {
        return healthcheckAcpSgpt;
    }

    public void setHealthcheckAcpSgpt(int healthcheckAcpSgpt) {
        this.healthcheckAcpSgpt = healthcheckAcpSgpt;
    }

    public int getHealthcheckAcpSgot() {
        return healthcheckAcpSgot;
    }

    public void setHealthcheckAcpSgot(int healthcheckAcpSgot) {
        this.healthcheckAcpSgot = healthcheckAcpSgot;
    }

    public int getHealthcheckAcpAlb() {
        return healthcheckAcpAlb;
    }

    public void setHealthcheckAcpAlb(int healthcheckAcpAlb) {
        this.healthcheckAcpAlb = healthcheckAcpAlb;
    }

    public int getHealthcheckAcpTbil() {
        return healthcheckAcpTbil;
    }

    public void setHealthcheckAcpTbil(int healthcheckAcpTbil) {
        this.healthcheckAcpTbil = healthcheckAcpTbil;
    }

    public int getHealthcheckAcpTrig() {
        return healthcheckAcpTrig;
    }

    public void setHealthcheckAcpTrig(int healthcheckAcpTrig) {
        this.healthcheckAcpTrig = healthcheckAcpTrig;
    }

    public int getHealthcheckAcpChestxray() {
        return healthcheckAcpChestxray;
    }

    public void setHealthcheckAcpChestxray(int healthcheckAcpChestxray) {
        this.healthcheckAcpChestxray = healthcheckAcpChestxray;
    }

    public int getHealthcheckAcpOthers() {
        return healthcheckAcpOthers;
    }

    public void setHealthcheckAcpOthers(int healthcheckAcpOthers) {
        this.healthcheckAcpOthers = healthcheckAcpOthers;
    }

    public int getHealthcheckStatusGrade() {
        return healthcheckStatusGrade;
    }

    public void setHealthcheckStatusGrade(int healthcheckStatusGrade) {
        this.healthcheckStatusGrade = healthcheckStatusGrade;
    }

    public int getHealthcheckStatusState() {
        return healthcheckStatusState;
    }

    public void setHealthcheckStatusState(int healthcheckStatusState) {
        this.healthcheckStatusState = healthcheckStatusState;
    }

    public int getHealthcheckAcpCreatinine() {
        return healthcheckAcpCreatinine;
    }

    public void setHealthcheckAcpCreatinine(int healthcheckAcpCreatinine) {
        this.healthcheckAcpCreatinine = healthcheckAcpCreatinine;
    }

    public int getHealthcheckAcpSerumsodium() {
        return healthcheckAcpSerumsodium;
    }

    public void setHealthcheckAcpSerumsodium(int healthcheckAcpSerumsodium) {
        this.healthcheckAcpSerumsodium = healthcheckAcpSerumsodium;
    }

    public int getHealthcheckAcpUalb() {
        return healthcheckAcpUalb;
    }

    public void setHealthcheckAcpUalb(int healthcheckAcpUalb) {
        this.healthcheckAcpUalb = healthcheckAcpUalb;
    }

    public int getHealthcheckStyleTemperance() {
        return healthcheckStyleTemperance;
    }

    public void setHealthcheckStyleTemperance(int healthcheckStyleTemperance) {
        this.healthcheckStyleTemperance = healthcheckStyleTemperance;
    }

    public int getHealthcheckStyleTemperanceage() {
        return healthcheckStyleTemperanceage;
    }

    public void setHealthcheckStyleTemperanceage(int healthcheckStyleTemperanceage) {
        this.healthcheckStyleTemperanceage = healthcheckStyleTemperanceage;
    }

    public int getHealthcheckStyleBegintemperance() {
        return healthcheckStyleBegintemperance;
    }

    public void setHealthcheckStyleBegintemperance(int healthcheckStyleBegintemperance) {
        this.healthcheckStyleBegintemperance = healthcheckStyleBegintemperance;
    }

    public int getHealthcheckStyleEbriety() {
        return healthcheckStyleEbriety;
    }

    public void setHealthcheckStyleEbriety(int healthcheckStyleEbriety) {
        this.healthcheckStyleEbriety = healthcheckStyleEbriety;
    }

    public int getHealthcheckVisceraMotor() {
        return healthcheckVisceraMotor;
    }

    public void setHealthcheckVisceraMotor(int healthcheckVisceraMotor) {
        this.healthcheckVisceraMotor = healthcheckVisceraMotor;
    }

    public int getHealthcheckCheckupBarrelchest() {
        return healthcheckCheckupBarrelchest;
    }

    public void setHealthcheckCheckupBarrelchest(int healthcheckCheckupBarrelchest) {
        this.healthcheckCheckupBarrelchest = healthcheckCheckupBarrelchest;
    }

    public int getHealthcheckCheckupHeartrate() {
        return healthcheckCheckupHeartrate;
    }

    public void setHealthcheckCheckupHeartrate(int healthcheckCheckupHeartrate) {
        this.healthcheckCheckupHeartrate = healthcheckCheckupHeartrate;
    }

    public int getHealthcheckCheckupEdema() {
        return healthcheckCheckupEdema;
    }

    public void setHealthcheckCheckupEdema(int healthcheckCheckupEdema) {
        this.healthcheckCheckupEdema = healthcheckCheckupEdema;
    }

    public int getHealthcheckCheckupAcrotarsium() {
        return healthcheckCheckupAcrotarsium;
    }

    public void setHealthcheckCheckupAcrotarsium(int healthcheckCheckupAcrotarsium) {
        this.healthcheckCheckupAcrotarsium = healthcheckCheckupAcrotarsium;
    }

    public int getHealthcheckVisceraLips() {
        return healthcheckVisceraLips;
    }

    public void setHealthcheckVisceraLips(int healthcheckVisceraLips) {
        this.healthcheckVisceraLips = healthcheckVisceraLips;
    }

    public int getHealthcheckVisceraPharynx() {
        return healthcheckVisceraPharynx;
    }

    public void setHealthcheckVisceraPharynx(int healthcheckVisceraPharynx) {
        this.healthcheckVisceraPharynx = healthcheckVisceraPharynx;
    }

    public int getHealthcheckStyleOccupational() {
        return healthcheckStyleOccupational;
    }

    public void setHealthcheckStyleOccupational(int healthcheckStyleOccupational) {
        this.healthcheckStyleOccupational = healthcheckStyleOccupational;
    }

    public int getHealthcheckStyleWorkyear() {
        return healthcheckStyleWorkyear;
    }

    public void setHealthcheckStyleWorkyear(int healthcheckStyleWorkyear) {
        this.healthcheckStyleWorkyear = healthcheckStyleWorkyear;
    }

    public String getHealthcheckSymptomSympotom() {
        return healthcheckSymptomSympotom;
    }

    public void setHealthcheckSymptomSympotom(String healthcheckSymptomSympotom) {
        this.healthcheckSymptomSympotom = healthcheckSymptomSympotom;
    }

    public String getHealthcheckStatusHeat() {
        return healthcheckStatusHeat;
    }

    public void setHealthcheckStatusHeat(String healthcheckStatusHeat) {
        this.healthcheckStatusHeat = healthcheckStatusHeat;
    }

    public String getHealthcheckStatusPr() {
        return healthcheckStatusPr;
    }

    public void setHealthcheckStatusPr(String healthcheckStatusPr) {
        this.healthcheckStatusPr = healthcheckStatusPr;
    }

    public String getHealthcheckStatusRr() {
        return healthcheckStatusRr;
    }

    public void setHealthcheckStatusRr(String healthcheckStatusRr) {
        this.healthcheckStatusRr = healthcheckStatusRr;
    }

    public String getHealthcheckStatusBrl() {
        return healthcheckStatusBrl;
    }

    public void setHealthcheckStatusBrl(String healthcheckStatusBrl) {
        this.healthcheckStatusBrl = healthcheckStatusBrl;
    }

    public String getHealthcheckStatusBrr() {
        return healthcheckStatusBrr;
    }

    public void setHealthcheckStatusBrr(String healthcheckStatusBrr) {
        this.healthcheckStatusBrr = healthcheckStatusBrr;
    }

    public String getHealthcheckStyleExercise() {
        return healthcheckStyleExercise;
    }

    public void setHealthcheckStyleExercise(String healthcheckStyleExercise) {
        this.healthcheckStyleExercise = healthcheckStyleExercise;
    }

    public String getHealthcheckStyleDietary() {
        return healthcheckStyleDietary;
    }

    public void setHealthcheckStyleDietary(String healthcheckStyleDietary) {
        this.healthcheckStyleDietary = healthcheckStyleDietary;
    }

    public String getHealthcheckStyleDrinktype() {
        return healthcheckStyleDrinktype;
    }

    public void setHealthcheckStyleDrinktype(String healthcheckStyleDrinktype) {
        this.healthcheckStyleDrinktype = healthcheckStyleDrinktype;
    }

    public String getHealthcheckStyleCraft() {
        return healthcheckStyleCraft;
    }

    public void setHealthcheckStyleCraft(String healthcheckStyleCraft) {
        this.healthcheckStyleCraft = healthcheckStyleCraft;
    }

    public String getHealthcheckStyleDust() {
        return healthcheckStyleDust;
    }

    public void setHealthcheckStyleDust(String healthcheckStyleDust) {
        this.healthcheckStyleDust = healthcheckStyleDust;
    }

    public String getHealthcheckStyleDustfence() {
        return healthcheckStyleDustfence;
    }

    public void setHealthcheckStyleDustfence(String healthcheckStyleDustfence) {
        this.healthcheckStyleDustfence = healthcheckStyleDustfence;
    }

    public String getHealthcheckStyleRadiate() {
        return healthcheckStyleRadiate;
    }

    public void setHealthcheckStyleRadiate(String healthcheckStyleRadiate) {
        this.healthcheckStyleRadiate = healthcheckStyleRadiate;
    }

    public String getHealthcheckStyleRadiatefence() {
        return healthcheckStyleRadiatefence;
    }

    public void setHealthcheckStyleRadiatefence(String healthcheckStyleRadiatefence) {
        this.healthcheckStyleRadiatefence = healthcheckStyleRadiatefence;
    }

    public String getHealthcheckStylePhysics() {
        return healthcheckStylePhysics;
    }

    public void setHealthcheckStylePhysics(String healthcheckStylePhysics) {
        this.healthcheckStylePhysics = healthcheckStylePhysics;
    }

    public String getHealthcheckStylePhysicsfence() {
        return healthcheckStylePhysicsfence;
    }

    public void setHealthcheckStylePhysicsfence(String healthcheckStylePhysicsfence) {
        this.healthcheckStylePhysicsfence = healthcheckStylePhysicsfence;
    }

    public String getHealthcheckStyleChemistry() {
        return healthcheckStyleChemistry;
    }

    public void setHealthcheckStyleChemistry(String healthcheckStyleChemistry) {
        this.healthcheckStyleChemistry = healthcheckStyleChemistry;
    }

    public String getHealthcheckStyleChemistryfence() {
        return healthcheckStyleChemistryfence;
    }

    public void setHealthcheckStyleChemistryfence(String healthcheckStyleChemistryfence) {
        this.healthcheckStyleChemistryfence = healthcheckStyleChemistryfence;
    }

    public String getHealthcheckStyleOthers() {
        return healthcheckStyleOthers;
    }

    public void setHealthcheckStyleOthers(String healthcheckStyleOthers) {
        this.healthcheckStyleOthers = healthcheckStyleOthers;
    }

    public String getHealthcheckStyleOthersfence() {
        return healthcheckStyleOthersfence;
    }

    public void setHealthcheckStyleOthersfence(String healthcheckStyleOthersfence) {
        this.healthcheckStyleOthersfence = healthcheckStyleOthersfence;
    }

    public String getHealthcheckVisceraDentrue() {
        return healthcheckVisceraDentrue;
    }

    public void setHealthcheckVisceraDentrue(String healthcheckVisceraDentrue) {
        this.healthcheckVisceraDentrue = healthcheckVisceraDentrue;
    }

    public String getHealthcheckVisceraEar() {
        return healthcheckVisceraEar;
    }

    public void setHealthcheckVisceraEar(String healthcheckVisceraEar) {
        this.healthcheckVisceraEar = healthcheckVisceraEar;
    }

    public String getHealthcheckCheckupEye() {
        return healthcheckCheckupEye;
    }

    public void setHealthcheckCheckupEye(String healthcheckCheckupEye) {
        this.healthcheckCheckupEye = healthcheckCheckupEye;
    }

    public String getHealthcheckCheckupSkin() {
        return healthcheckCheckupSkin;
    }

    public void setHealthcheckCheckupSkin(String healthcheckCheckupSkin) {
        this.healthcheckCheckupSkin = healthcheckCheckupSkin;
    }

    public String getHealthcheckCheckupSclera() {
        return healthcheckCheckupSclera;
    }

    public void setHealthcheckCheckupSclera(String healthcheckCheckupSclera) {
        this.healthcheckCheckupSclera = healthcheckCheckupSclera;
    }

    public String getHealthcheckCheckupLymphaden() {
        return healthcheckCheckupLymphaden;
    }

    public void setHealthcheckCheckupLymphaden(String healthcheckCheckupLymphaden) {
        this.healthcheckCheckupLymphaden = healthcheckCheckupLymphaden;
    }

    public String getHealthcheckCheckupBreathsounds() {
        return healthcheckCheckupBreathsounds;
    }

    public void setHealthcheckCheckupBreathsounds(String healthcheckCheckupBreathsounds) {
        this.healthcheckCheckupBreathsounds = healthcheckCheckupBreathsounds;
    }

    public String getHealthcheckCheckupRale() {
        return healthcheckCheckupRale;
    }

    public void setHealthcheckCheckupRale(String healthcheckCheckupRale) {
        this.healthcheckCheckupRale = healthcheckCheckupRale;
    }

    public String getHealthcheckCheckupNoise() {
        return healthcheckCheckupNoise;
    }

    public void setHealthcheckCheckupNoise(String healthcheckCheckupNoise) {
        this.healthcheckCheckupNoise = healthcheckCheckupNoise;
    }

    public String getHealthcheckCheckupTenderness() {
        return healthcheckCheckupTenderness;
    }

    public void setHealthcheckCheckupTenderness(String healthcheckCheckupTenderness) {
        this.healthcheckCheckupTenderness = healthcheckCheckupTenderness;
    }

    public String getHealthcheckCheckupMasses() {
        return healthcheckCheckupMasses;
    }

    public void setHealthcheckCheckupMasses(String healthcheckCheckupMasses) {
        this.healthcheckCheckupMasses = healthcheckCheckupMasses;
    }

    public String getHealthcheckCheckupHepatomegaly() {
        return healthcheckCheckupHepatomegaly;
    }

    public void setHealthcheckCheckupHepatomegaly(String healthcheckCheckupHepatomegaly) {
        this.healthcheckCheckupHepatomegaly = healthcheckCheckupHepatomegaly;
    }

    public String getHealthcheckCheckupSplenauxe() {
        return healthcheckCheckupSplenauxe;
    }

    public void setHealthcheckCheckupSplenauxe(String healthcheckCheckupSplenauxe) {
        this.healthcheckCheckupSplenauxe = healthcheckCheckupSplenauxe;
    }

    public String getHealthcheckCheckupDevoice() {
        return healthcheckCheckupDevoice;
    }

    public void setHealthcheckCheckupDevoice(String healthcheckCheckupDevoice) {
        this.healthcheckCheckupDevoice = healthcheckCheckupDevoice;
    }

    public String getHealthcheckCheckupAnus() {
        return healthcheckCheckupAnus;
    }

    public void setHealthcheckCheckupAnus(String healthcheckCheckupAnus) {
        this.healthcheckCheckupAnus = healthcheckCheckupAnus;
    }

    public String getHealthcheckCheckupBreast() {
        return healthcheckCheckupBreast;
    }

    public void setHealthcheckCheckupBreast(String healthcheckCheckupBreast) {
        this.healthcheckCheckupBreast = healthcheckCheckupBreast;
    }

    public String getHealthcheckCheckupOthers() {
        return healthcheckCheckupOthers;
    }

    public void setHealthcheckCheckupOthers(String healthcheckCheckupOthers) {
        this.healthcheckCheckupOthers = healthcheckCheckupOthers;
    }

    public String getHealthcheckAcpBloodroutineother() {
        return healthcheckAcpBloodroutineother;
    }

    public void setHealthcheckAcpBloodroutineother(String healthcheckAcpBloodroutineother) {
        this.healthcheckAcpBloodroutineother = healthcheckAcpBloodroutineother;
    }

    public String getHealthcheckAcpPro() {
        return healthcheckAcpPro;
    }

    public void setHealthcheckAcpPro(String healthcheckAcpPro) {
        this.healthcheckAcpPro = healthcheckAcpPro;
    }

    public String getHealthcheckAcpUglu() {
        return healthcheckAcpUglu;
    }

    public void setHealthcheckAcpUglu(String healthcheckAcpUglu) {
        this.healthcheckAcpUglu = healthcheckAcpUglu;
    }

    public String getHealthcheckAcpKet() {
        return healthcheckAcpKet;
    }

    public void setHealthcheckAcpKet(String healthcheckAcpKet) {
        this.healthcheckAcpKet = healthcheckAcpKet;
    }

    public String getHealthcheckAcpEry() {
        return healthcheckAcpEry;
    }

    public void setHealthcheckAcpEry(String healthcheckAcpEry) {
        this.healthcheckAcpEry = healthcheckAcpEry;
    }

    public String getHealthcheckAcpEcg() {
        return healthcheckAcpEcg;
    }

    public void setHealthcheckAcpEcg(String healthcheckAcpEcg) {
        this.healthcheckAcpEcg = healthcheckAcpEcg;
    }

    public String getHealthcheckAcpBtypeultrasonic() {
        return healthcheckAcpBtypeultrasonic;
    }

    public void setHealthcheckAcpBtypeultrasonic(String healthcheckAcpBtypeultrasonic) {
        this.healthcheckAcpBtypeultrasonic = healthcheckAcpBtypeultrasonic;
    }

    public String getHealthcheckAcpBultrasoundothers() {
        return healthcheckAcpBultrasoundothers;
    }

    public void setHealthcheckAcpBultrasoundothers(String healthcheckAcpBultrasoundothers) {
        this.healthcheckAcpBultrasoundothers = healthcheckAcpBultrasoundothers;
    }

    public String getHealthcheckAcpPapsmear() {
        return healthcheckAcpPapsmear;
    }

    public void setHealthcheckAcpPapsmear(String healthcheckAcpPapsmear) {
        this.healthcheckAcpPapsmear = healthcheckAcpPapsmear;
    }

    public String getHealthcheckProblemaCered() {
        return healthcheckProblemaCered;
    }

    public void setHealthcheckProblemaCered(String healthcheckProblemaCered) {
        this.healthcheckProblemaCered = healthcheckProblemaCered;
    }

    public String getHealthcheckProblemaKidneyd() {
        return healthcheckProblemaKidneyd;
    }

    public void setHealthcheckProblemaKidneyd(String healthcheckProblemaKidneyd) {
        this.healthcheckProblemaKidneyd = healthcheckProblemaKidneyd;
    }

    public String getHealthcheckProblemaHeartd() {
        return healthcheckProblemaHeartd;
    }

    public void setHealthcheckProblemaHeartd(String healthcheckProblemaHeartd) {
        this.healthcheckProblemaHeartd = healthcheckProblemaHeartd;
    }

    public String getHealthcheckProblemaVarsculard() {
        return healthcheckProblemaVarsculard;
    }

    public void setHealthcheckProblemaVarsculard(String healthcheckProblemaVarsculard) {
        this.healthcheckProblemaVarsculard = healthcheckProblemaVarsculard;
    }

    public String getHealthcheckProblemaEyed() {
        return healthcheckProblemaEyed;
    }

    public void setHealthcheckProblemaEyed(String healthcheckProblemaEyed) {
        this.healthcheckProblemaEyed = healthcheckProblemaEyed;
    }

    public String getHealthcheckProblemaNervousystem() {
        return healthcheckProblemaNervousystem;
    }

    public void setHealthcheckProblemaNervousystem(String healthcheckProblemaNervousystem) {
        this.healthcheckProblemaNervousystem = healthcheckProblemaNervousystem;
    }

    public String getHealthcheckProblemaOthersdis() {
        return healthcheckProblemaOthersdis;
    }

    public void setHealthcheckProblemaOthersdis(String healthcheckProblemaOthersdis) {
        this.healthcheckProblemaOthersdis = healthcheckProblemaOthersdis;
    }
}
