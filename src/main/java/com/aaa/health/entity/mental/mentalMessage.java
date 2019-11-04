package com.aaa.health.entity.mental;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;


public class mentalMessage {
    public int userId,userSex,recordBookbuilding,recordCategory,
            recordFamily,recordUnit,recordDoctor,userBloodtype,userRh
            ,userCulture,userCareer,userGam,userPemanent,userNamtion,userKitchen
            ,userFuel,userWater,userWc,userLinestock
            ,recordResident,
            recordState,
            followForm,followLoss,followDiereason,followDisability,
            followAssess,followInsight,followSleep,followDiet,followPersonal,
            followHousework,followLabour,followStuability,followInterpersonal,followAffray,
            followAccident,followAccidentcause,followHazard,followAutolesion,followSuicide,
            followLockcase,followHospital,followLabcheck,followPharmacy,
            followDrugeffect,followTreatres,followTransfer,followDaily,followDose,
            followRecordsid,followSort;

    public String recordInputtingcard,recordName,recordPostalcode,recordPlaceadress
            ,userDisability,recordMedical,recordPicurl,userMyphone,
            userWorkunit,userPayway,userAllergy,userExpose,userIllness,userHeredity,
            recordAdress,userDe,
            followName,followNumber,followCusym,followTrareason,followTraorgan,followMedname,
            followMeduse,followDirect,followRecover,
            followDoctorsign,followDe;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    public Date userBirthday,recordData,
    followDate,followDietime,followNextdate,followOuthospital;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
    }

    public int getRecordBookbuilding() {
        return recordBookbuilding;
    }

    public void setRecordBookbuilding(int recordBookbuilding) {
        this.recordBookbuilding = recordBookbuilding;
    }

    public int getRecordCategory() {
        return recordCategory;
    }

    public void setRecordCategory(int recordCategory) {
        this.recordCategory = recordCategory;
    }

    public int getRecordFamily() {
        return recordFamily;
    }

    public void setRecordFamily(int recordFamily) {
        this.recordFamily = recordFamily;
    }

    public int getRecordUnit() {
        return recordUnit;
    }

    public void setRecordUnit(int recordUnit) {
        this.recordUnit = recordUnit;
    }

    public int getRecordDoctor() {
        return recordDoctor;
    }

    public void setRecordDoctor(int recordDoctor) {
        this.recordDoctor = recordDoctor;
    }

    public int getUserBloodtype() {
        return userBloodtype;
    }

    public void setUserBloodtype(int userBloodtype) {
        this.userBloodtype = userBloodtype;
    }

    public int getUserRh() {
        return userRh;
    }

    public void setUserRh(int userRh) {
        this.userRh = userRh;
    }

    public int getUserCulture() {
        return userCulture;
    }

    public void setUserCulture(int userCulture) {
        this.userCulture = userCulture;
    }

    public int getUserCareer() {
        return userCareer;
    }

    public void setUserCareer(int userCareer) {
        this.userCareer = userCareer;
    }

    public int getUserGam() {
        return userGam;
    }

    public void setUserGam(int userGam) {
        this.userGam = userGam;
    }

    public int getUserPemanent() {
        return userPemanent;
    }

    public void setUserPemanent(int userPemanent) {
        this.userPemanent = userPemanent;
    }

    public int getUserNamtion() {
        return userNamtion;
    }

    public void setUserNamtion(int userNamtion) {
        this.userNamtion = userNamtion;
    }

    public int getUserKitchen() {
        return userKitchen;
    }

    public void setUserKitchen(int userKitchen) {
        this.userKitchen = userKitchen;
    }

    public int getUserFuel() {
        return userFuel;
    }

    public void setUserFuel(int userFuel) {
        this.userFuel = userFuel;
    }

    public int getUserWater() {
        return userWater;
    }

    public void setUserWater(int userWater) {
        this.userWater = userWater;
    }

    public int getUserWc() {
        return userWc;
    }

    public void setUserWc(int userWc) {
        this.userWc = userWc;
    }

    public int getUserLinestock() {
        return userLinestock;
    }

    public void setUserLinestock(int userLinestock) {
        this.userLinestock = userLinestock;
    }

    public int getRecordResident() {
        return recordResident;
    }

    public void setRecordResident(int recordResident) {
        this.recordResident = recordResident;
    }

    public int getRecordState() {
        return recordState;
    }

    public void setRecordState(int recordState) {
        this.recordState = recordState;
    }

    public int getFollowForm() {
        return followForm;
    }

    public void setFollowForm(int followForm) {
        this.followForm = followForm;
    }

    public int getFollowLoss() {
        return followLoss;
    }

    public void setFollowLoss(int followLoss) {
        this.followLoss = followLoss;
    }

    public int getFollowDiereason() {
        return followDiereason;
    }

    public void setFollowDiereason(int followDiereason) {
        this.followDiereason = followDiereason;
    }

    public int getFollowDisability() {
        return followDisability;
    }

    public void setFollowDisability(int followDisability) {
        this.followDisability = followDisability;
    }

    public int getFollowAssess() {
        return followAssess;
    }

    public void setFollowAssess(int followAssess) {
        this.followAssess = followAssess;
    }

    public int getFollowInsight() {
        return followInsight;
    }

    public void setFollowInsight(int followInsight) {
        this.followInsight = followInsight;
    }

    public int getFollowSleep() {
        return followSleep;
    }

    public void setFollowSleep(int followSleep) {
        this.followSleep = followSleep;
    }

    public int getFollowDiet() {
        return followDiet;
    }

    public void setFollowDiet(int followDiet) {
        this.followDiet = followDiet;
    }

    public int getFollowPersonal() {
        return followPersonal;
    }

    public void setFollowPersonal(int followPersonal) {
        this.followPersonal = followPersonal;
    }

    public int getFollowHousework() {
        return followHousework;
    }

    public void setFollowHousework(int followHousework) {
        this.followHousework = followHousework;
    }

    public int getFollowLabour() {
        return followLabour;
    }

    public void setFollowLabour(int followLabour) {
        this.followLabour = followLabour;
    }

    public int getFollowStuability() {
        return followStuability;
    }

    public void setFollowStuability(int followStuability) {
        this.followStuability = followStuability;
    }

    public int getFollowInterpersonal() {
        return followInterpersonal;
    }

    public void setFollowInterpersonal(int followInterpersonal) {
        this.followInterpersonal = followInterpersonal;
    }

    public int getFollowAffray() {
        return followAffray;
    }

    public void setFollowAffray(int followAffray) {
        this.followAffray = followAffray;
    }

    public int getFollowAccident() {
        return followAccident;
    }

    public void setFollowAccident(int followAccident) {
        this.followAccident = followAccident;
    }

    public int getFollowAccidentcause() {
        return followAccidentcause;
    }

    public void setFollowAccidentcause(int followAccidentcause) {
        this.followAccidentcause = followAccidentcause;
    }

    public int getFollowHazard() {
        return followHazard;
    }

    public void setFollowHazard(int followHazard) {
        this.followHazard = followHazard;
    }

    public int getFollowAutolesion() {
        return followAutolesion;
    }

    public void setFollowAutolesion(int followAutolesion) {
        this.followAutolesion = followAutolesion;
    }

    public int getFollowSuicide() {
        return followSuicide;
    }

    public void setFollowSuicide(int followSuicide) {
        this.followSuicide = followSuicide;
    }

    public int getFollowLockcase() {
        return followLockcase;
    }

    public void setFollowLockcase(int followLockcase) {
        this.followLockcase = followLockcase;
    }

    public int getFollowHospital() {
        return followHospital;
    }

    public void setFollowHospital(int followHospital) {
        this.followHospital = followHospital;
    }

    public int getFollowLabcheck() {
        return followLabcheck;
    }

    public void setFollowLabcheck(int followLabcheck) {
        this.followLabcheck = followLabcheck;
    }

    public int getFollowPharmacy() {
        return followPharmacy;
    }

    public void setFollowPharmacy(int followPharmacy) {
        this.followPharmacy = followPharmacy;
    }

    public int getFollowDrugeffect() {
        return followDrugeffect;
    }

    public void setFollowDrugeffect(int followDrugeffect) {
        this.followDrugeffect = followDrugeffect;
    }

    public int getFollowTreatres() {
        return followTreatres;
    }

    public void setFollowTreatres(int followTreatres) {
        this.followTreatres = followTreatres;
    }

    public int getFollowTransfer() {
        return followTransfer;
    }

    public void setFollowTransfer(int followTransfer) {
        this.followTransfer = followTransfer;
    }

    public int getFollowDaily() {
        return followDaily;
    }

    public void setFollowDaily(int followDaily) {
        this.followDaily = followDaily;
    }

    public int getFollowDose() {
        return followDose;
    }

    public void setFollowDose(int followDose) {
        this.followDose = followDose;
    }

    public int getFollowRecordsid() {
        return followRecordsid;
    }

    public void setFollowRecordsid(int followRecordsid) {
        this.followRecordsid = followRecordsid;
    }

    public int getFollowSort() {
        return followSort;
    }

    public void setFollowSort(int followSort) {
        this.followSort = followSort;
    }

    public String getRecordInputtingcard() {
        return recordInputtingcard;
    }

    public void setRecordInputtingcard(String recordInputtingcard) {
        this.recordInputtingcard = recordInputtingcard;
    }

    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    public String getRecordPostalcode() {
        return recordPostalcode;
    }

    public void setRecordPostalcode(String recordPostalcode) {
        this.recordPostalcode = recordPostalcode;
    }

    public String getRecordPlaceadress() {
        return recordPlaceadress;
    }

    public void setRecordPlaceadress(String recordPlaceadress) {
        this.recordPlaceadress = recordPlaceadress;
    }

    public String getUserDisability() {
        return userDisability;
    }

    public void setUserDisability(String userDisability) {
        this.userDisability = userDisability;
    }

    public String getRecordMedical() {
        return recordMedical;
    }

    public void setRecordMedical(String recordMedical) {
        this.recordMedical = recordMedical;
    }

    public String getRecordPicurl() {
        return recordPicurl;
    }

    public void setRecordPicurl(String recordPicurl) {
        this.recordPicurl = recordPicurl;
    }

    public String getUserMyphone() {
        return userMyphone;
    }

    public void setUserMyphone(String userMyphone) {
        this.userMyphone = userMyphone;
    }

    public String getUserWorkunit() {
        return userWorkunit;
    }

    public void setUserWorkunit(String userWorkunit) {
        this.userWorkunit = userWorkunit;
    }

    public String getUserPayway() {
        return userPayway;
    }

    public void setUserPayway(String userPayway) {
        this.userPayway = userPayway;
    }

    public String getUserAllergy() {
        return userAllergy;
    }

    public void setUserAllergy(String userAllergy) {
        this.userAllergy = userAllergy;
    }

    public String getUserExpose() {
        return userExpose;
    }

    public void setUserExpose(String userExpose) {
        this.userExpose = userExpose;
    }

    public String getUserIllness() {
        return userIllness;
    }

    public void setUserIllness(String userIllness) {
        this.userIllness = userIllness;
    }

    public String getUserHeredity() {
        return userHeredity;
    }

    public void setUserHeredity(String userHeredity) {
        this.userHeredity = userHeredity;
    }

    public String getRecordAdress() {
        return recordAdress;
    }

    public void setRecordAdress(String recordAdress) {
        this.recordAdress = recordAdress;
    }

    public String getUserDe() {
        return userDe;
    }

    public void setUserDe(String userDe) {
        this.userDe = userDe;
    }

    public String getFollowName() {
        return followName;
    }

    public void setFollowName(String followName) {
        this.followName = followName;
    }

    public String getFollowNumber() {
        return followNumber;
    }

    public void setFollowNumber(String followNumber) {
        this.followNumber = followNumber;
    }

    public String getFollowCusym() {
        return followCusym;
    }

    public void setFollowCusym(String followCusym) {
        this.followCusym = followCusym;
    }

    public String getFollowTrareason() {
        return followTrareason;
    }

    public void setFollowTrareason(String followTrareason) {
        this.followTrareason = followTrareason;
    }

    public String getFollowTraorgan() {
        return followTraorgan;
    }

    public void setFollowTraorgan(String followTraorgan) {
        this.followTraorgan = followTraorgan;
    }

    public String getFollowMedname() {
        return followMedname;
    }

    public void setFollowMedname(String followMedname) {
        this.followMedname = followMedname;
    }

    public String getFollowMeduse() {
        return followMeduse;
    }

    public void setFollowMeduse(String followMeduse) {
        this.followMeduse = followMeduse;
    }

    public String getFollowDirect() {
        return followDirect;
    }

    public void setFollowDirect(String followDirect) {
        this.followDirect = followDirect;
    }

    public String getFollowRecover() {
        return followRecover;
    }

    public void setFollowRecover(String followRecover) {
        this.followRecover = followRecover;
    }

    public String getFollowDoctorsign() {
        return followDoctorsign;
    }

    public void setFollowDoctorsign(String followDoctorsign) {
        this.followDoctorsign = followDoctorsign;
    }

    public String getFollowDe() {
        return followDe;
    }

    public void setFollowDe(String followDe) {
        this.followDe = followDe;
    }

    public Date getUserBirthday() {
        return userBirthday;
    }

    public void setUserBirthday(Date userBirthday) {
        this.userBirthday = userBirthday;
    }

    public Date getRecordData() {
        return recordData;
    }

    public void setRecordData(Date recordData) {
        this.recordData = recordData;
    }

    public Date getFollowDate() {
        return followDate;
    }

    public void setFollowDate(Date followDate) {
        this.followDate = followDate;
    }

    public Date getFollowDietime() {
        return followDietime;
    }

    public void setFollowDietime(Date followDietime) {
        this.followDietime = followDietime;
    }

    public Date getFollowNextdate() {
        return followNextdate;
    }

    public void setFollowNextdate(Date followNextdate) {
        this.followNextdate = followNextdate;
    }

    public Date getFollowOuthospital() {
        return followOuthospital;
    }

    public void setFollowOuthospital(Date followOuthospital) {
        this.followOuthospital = followOuthospital;
    }

    @Override
    public String toString() {
        return "mentalMessage{" +
                "userId=" + userId +
                ", userSex=" + userSex +
                ", recordBookbuilding=" + recordBookbuilding +
                ", recordCategory=" + recordCategory +
                ", recordFamily=" + recordFamily +
                ", recordUnit=" + recordUnit +
                ", recordDoctor=" + recordDoctor +
                ", userBloodtype=" + userBloodtype +
                ", userRh=" + userRh +
                ", userCulture=" + userCulture +
                ", userCareer=" + userCareer +
                ", userGam=" + userGam +
                ", userPemanent=" + userPemanent +
                ", userNamtion=" + userNamtion +
                ", userKitchen=" + userKitchen +
                ", userFuel=" + userFuel +
                ", userWater=" + userWater +
                ", userWc=" + userWc +
                ", userLinestock=" + userLinestock +
                ", recordResident=" + recordResident +
                ", recordState=" + recordState +
                ", followForm=" + followForm +
                ", followLoss=" + followLoss +
                ", followDiereason=" + followDiereason +
                ", followDisability=" + followDisability +
                ", followAssess=" + followAssess +
                ", followInsight=" + followInsight +
                ", followSleep=" + followSleep +
                ", followDiet=" + followDiet +
                ", followPersonal=" + followPersonal +
                ", followHousework=" + followHousework +
                ", followLabour=" + followLabour +
                ", followStuability=" + followStuability +
                ", followInterpersonal=" + followInterpersonal +
                ", followAffray=" + followAffray +
                ", followAccident=" + followAccident +
                ", followAccidentcause=" + followAccidentcause +
                ", followHazard=" + followHazard +
                ", followAutolesion=" + followAutolesion +
                ", followSuicide=" + followSuicide +
                ", followLockcase=" + followLockcase +
                ", followHospital=" + followHospital +
                ", followLabcheck=" + followLabcheck +
                ", followPharmacy=" + followPharmacy +
                ", followDrugeffect=" + followDrugeffect +
                ", followTreatres=" + followTreatres +
                ", followTransfer=" + followTransfer +
                ", followDaily=" + followDaily +
                ", followDose=" + followDose +
                ", followRecordsid=" + followRecordsid +
                ", followSort=" + followSort +
                ", recordInputtingcard='" + recordInputtingcard + '\'' +
                ", recordName='" + recordName + '\'' +
                ", recordPostalcode='" + recordPostalcode + '\'' +
                ", recordPlaceadress='" + recordPlaceadress + '\'' +
                ", userDisability='" + userDisability + '\'' +
                ", recordMedical='" + recordMedical + '\'' +
                ", recordPicurl='" + recordPicurl + '\'' +
                ", userMyphone='" + userMyphone + '\'' +
                ", userWorkunit='" + userWorkunit + '\'' +
                ", userPayway='" + userPayway + '\'' +
                ", userAllergy='" + userAllergy + '\'' +
                ", userExpose='" + userExpose + '\'' +
                ", userIllness='" + userIllness + '\'' +
                ", userHeredity='" + userHeredity + '\'' +
                ", recordAdress='" + recordAdress + '\'' +
                ", userDe='" + userDe + '\'' +
                ", followName='" + followName + '\'' +
                ", followNumber='" + followNumber + '\'' +
                ", followCusym='" + followCusym + '\'' +
                ", followTrareason='" + followTrareason + '\'' +
                ", followTraorgan='" + followTraorgan + '\'' +
                ", followMedname='" + followMedname + '\'' +
                ", followMeduse='" + followMeduse + '\'' +
                ", followDirect='" + followDirect + '\'' +
                ", followRecover='" + followRecover + '\'' +
                ", followDoctorsign='" + followDoctorsign + '\'' +
                ", followDe='" + followDe + '\'' +
                ", userBirthday=" + userBirthday +
                ", recordData=" + recordData +
                ", followDate=" + followDate +
                ", followDietime=" + followDietime +
                ", followNextdate=" + followNextdate +
                ", followOuthospital=" + followOuthospital +
                '}';
    }
}
