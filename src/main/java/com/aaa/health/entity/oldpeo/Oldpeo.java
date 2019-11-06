package com.aaa.health.entity.oldpeo;

public class Oldpeo {
    public  int oldpeoId, recordId ,   oldpeoSelfstate ,    oldpeoMatestate ,    oldpeoMstate ,oldpeoState ;
    public  String  recordDoctor  , oldcloseRea,  oldpeoDe,oldcloseDate;


    public int getOldpeoId() {
        return oldpeoId;
    }

    public void setOldpeoId(int oldpeoId) {
        this.oldpeoId = oldpeoId;
    }

    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    public int getOldpeoSelfstate() {
        return oldpeoSelfstate;
    }

    public void setOldpeoSelfstate(int oldpeoSelfstate) {
        this.oldpeoSelfstate = oldpeoSelfstate;
    }

    public int getOldpeoMatestate() {
        return oldpeoMatestate;
    }

    public void setOldpeoMatestate(int oldpeoMatestate) {
        this.oldpeoMatestate = oldpeoMatestate;
    }

    public int getOldpeoMstate() {
        return oldpeoMstate;
    }

    public void setOldpeoMstate(int oldpeoMstate) {
        this.oldpeoMstate = oldpeoMstate;
    }

    public int getOldpeoState() {
        return oldpeoState;
    }

    public void setOldpeoState(int oldpeoState) {
        this.oldpeoState = oldpeoState;
    }

    public String getRecordDoctor() {
        return recordDoctor;
    }

    public void setRecordDoctor(String recordDoctor) {
        this.recordDoctor = recordDoctor;
    }

    public String getOldpeoDe() {
        return oldpeoDe;
    }

    public void setOldpeoDe(String oldpeoDe) {
        this.oldpeoDe = oldpeoDe;
    }

    public String getOldcloseRea() {
        return oldcloseRea;
    }

    public void setOldcloseRea(String oldcloseRea) {
        this.oldcloseRea = oldcloseRea;
    }


    public void setOldcloseDate(String oldcloseDate) {
        this.oldcloseDate = oldcloseDate;
    }

    @Override
    public String toString() {
        return "Oldpeo{" +
                "oldpeoId=" + oldpeoId +
                ", recordId=" + recordId +
                ", oldpeoSelfstate=" + oldpeoSelfstate +
                ", oldpeoMatestate=" + oldpeoMatestate +
                ", oldpeoMstate=" + oldpeoMstate +
                ", oldpeoState=" + oldpeoState +
                ", recordDoctor='" + recordDoctor + '\'' +
                ", oldcloseRea='" + oldcloseRea + '\'' +
                ", oldpeoDe='" + oldpeoDe + '\'' +
                ", oldcloseDate=" + oldcloseDate +
                '}';
    }
}
