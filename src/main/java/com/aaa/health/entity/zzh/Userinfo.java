package com.aaa.health.entity.zzh;


import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
public class Userinfo {

    private  int
    recordUnit ,
    recordCreateuserid,
    recordResponuserid,
    recordResident  ,
    recordBookbuilding  ,
    recordCategory  ,
    recordFamily  ,
    userSex  ,
    userPemanent  ,
    userNamtion  ,
    userBloodtype   ,
    userRh  ,
    userCulture   ,
    userCareer  ,
    userGam  ,
    userKitchen  ,
    userFuel  ,
    userWater  ,
    userWc  ,
    userLinestock  ,
    userState  ,
    userId  ;
    private Date
    recordData   ,
    userBirthday   ;
    private  String
    recordName    ,
    recordAdress    ,
    recordPostalcode    ,
    recordPlaceadress    ,
    recordMedical    ,
    recordInputtingcard    ,
    recordPicurl    ,
    userPapernumber    ,
    userNumber    ,
    userIdnumber    ,
    userWorkunit    ,
    userMyphone,
    userPayway    ,
    userAllergy    ,
    userExpose    ,
    userIllness    ,
    userSurgery    ,
    userTrauma    ,
    userBlood    ,
    userFather     ,
    userNather    ,
    userBirthdy    ,
    userSon    ,
    userHeredity    ,
    userDisability    ,
    userDe    ;

    @Override
    public String toString() {
        return "Userinfo{" +
                "recordUnit=" + recordUnit +
                ", recordCreateuserid=" + recordCreateuserid +
                ", recordResponuserid=" + recordResponuserid +
                ", recordResident=" + recordResident +
                ", recordBookbuilding=" + recordBookbuilding +
                ", recordCategory=" + recordCategory +
                ", recordFamily=" + recordFamily +
                ", userSex=" + userSex +
                ", userPemanent=" + userPemanent +
                ", userNamtion=" + userNamtion +
                ", userBloodtype=" + userBloodtype +
                ", userRh=" + userRh +
                ", userCulture=" + userCulture +
                ", userCareer=" + userCareer +
                ", userGam=" + userGam +
                ", userKitchen=" + userKitchen +
                ", userFuel=" + userFuel +
                ", userWater=" + userWater +
                ", userWc=" + userWc +
                ", userLinestock=" + userLinestock +
                ", userState=" + userState +
                ", userId=" + userId +
                ", recordData=" + recordData +
                ", userBirthday=" + userBirthday +
                ", recordName='" + recordName + '\'' +
                ", recordAdress='" + recordAdress + '\'' +
                ", recordPostalcode='" + recordPostalcode + '\'' +
                ", recordPlaceadress='" + recordPlaceadress + '\'' +
                ", recordMedical='" + recordMedical + '\'' +
                ", recordInputtingcard='" + recordInputtingcard + '\'' +
                ", recordPicurl='" + recordPicurl + '\'' +
                ", userPapernumber='" + userPapernumber + '\'' +
                ", userNumber='" + userNumber + '\'' +
                ", userIdnumber='" + userIdnumber + '\'' +
                ", userWorkunit='" + userWorkunit + '\'' +
                ", userMyphone='" + userMyphone + '\'' +
                ", userPayway='" + userPayway + '\'' +
                ", userAllergy='" + userAllergy + '\'' +
                ", userExpose='" + userExpose + '\'' +
                ", userIllness='" + userIllness + '\'' +
                ", userSurgery='" + userSurgery + '\'' +
                ", userTrauma='" + userTrauma + '\'' +
                ", userBlood='" + userBlood + '\'' +
                ", userFather='" + userFather + '\'' +
                ", userNather='" + userNather + '\'' +
                ", userBirthdy='" + userBirthdy + '\'' +
                ", userSon='" + userSon + '\'' +
                ", userHeredity='" + userHeredity + '\'' +
                ", userDisability='" + userDisability + '\'' +
                ", userDe='" + userDe + '\'' +
                '}';
    }

    public int getRecordUnit() {
        return recordUnit;
    }

    public void setRecordUnit(int recordUnit) {
        this.recordUnit = recordUnit;
    }

    public int getRecordCreateuserid() {
        return recordCreateuserid;
    }

    public void setRecordCreateuserid(int recordCreateuserid) {
        this.recordCreateuserid = recordCreateuserid;
    }

    public int getRecordResponuserid() {
        return recordResponuserid;
    }

    public void setRecordResponuserid(int recordResponuserid) {
        this.recordResponuserid = recordResponuserid;
    }

    public int getRecordResident() {
        return recordResident;
    }

    public void setRecordResident(int recordResident) {
        this.recordResident = recordResident;
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

    public int getUserSex() {
        return userSex;
    }

    public void setUserSex(int userSex) {
        this.userSex = userSex;
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

    public int getUserState() {
        return userState;
    }

    public void setUserState(int userState) {
        this.userState = userState;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public Date getRecordData() {
        return recordData;
    }

    public void setRecordData(Date recordData) {
        this.recordData = recordData;
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

    public String getRecordAdress() {
        return recordAdress;
    }

    public void setRecordAdress(String recordAdress) {
        this.recordAdress = recordAdress;
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

    public String getRecordMedical() {
        return recordMedical;
    }

    public void setRecordMedical(String recordMedical) {
        this.recordMedical = recordMedical;
    }

    public String getRecordInputtingcard() {
        return recordInputtingcard;
    }

    public void setRecordInputtingcard(String recordInputtingcard) {
        this.recordInputtingcard = recordInputtingcard;
    }

    public String getRecordPicurl() {
        return recordPicurl;
    }

    public void setRecordPicurl(String recordPicurl) {
        this.recordPicurl = recordPicurl;
    }

    public String getUserPapernumber() {
        return userPapernumber;
    }

    public void setUserPapernumber(String userPapernumber) {
        this.userPapernumber = userPapernumber;
    }

    public String getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(String userNumber) {
        this.userNumber = userNumber;
    }

    public String getUserIdnumber() {
        return userIdnumber;
    }

    public void setUserIdnumber(String userIdnumber) {
        this.userIdnumber = userIdnumber;
    }

    public String getUserWorkunit() {
        return userWorkunit;
    }

    public void setUserWorkunit(String userWorkunit) {
        this.userWorkunit = userWorkunit;
    }

    public String getUserMyphone() {
        return userMyphone;
    }

    public void setUserMyphone(String userMyphone) {
        this.userMyphone = userMyphone;
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

    public String getUserSurgery() {
        return userSurgery;
    }

    public void setUserSurgery(String userSurgery) {
        this.userSurgery = userSurgery;
    }

    public String getUserTrauma() {
        return userTrauma;
    }

    public void setUserTrauma(String userTrauma) {
        this.userTrauma = userTrauma;
    }

    public String getUserBlood() {
        return userBlood;
    }

    public void setUserBlood(String userBlood) {
        this.userBlood = userBlood;
    }

    public String getUserFather() {
        return userFather;
    }

    public void setUserFather(String userFather) {
        this.userFather = userFather;
    }

    public String getUserNather() {
        return userNather;
    }

    public void setUserNather(String userNather) {
        this.userNather = userNather;
    }

    public String getUserBirthdy() {
        return userBirthdy;
    }

    public void setUserBirthdy(String userBirthdy) {
        this.userBirthdy = userBirthdy;
    }

    public String getUserSon() {
        return userSon;
    }

    public void setUserSon(String userSon) {
        this.userSon = userSon;
    }

    public String getUserHeredity() {
        return userHeredity;
    }

    public void setUserHeredity(String userHeredity) {
        this.userHeredity = userHeredity;
    }

    public String getUserDisability() {
        return userDisability;
    }

    public void setUserDisability(String userDisability) {
        this.userDisability = userDisability;
    }

    public String getUserDe() {
        return userDe;
    }

    public void setUserDe(String userDe) {
        this.userDe = userDe;
    }
}
