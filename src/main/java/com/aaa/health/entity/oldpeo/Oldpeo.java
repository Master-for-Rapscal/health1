package com.aaa.health.entity.oldpeo;

public class Oldpeo {
    public  int OLDPEO_ID, RECORD_ID ,   OLDPEO_SELFSTATE ,    OLDPEO_MSTATE ,    OLDPEO_STATE ;
    public  String  RECORD_DOCTOR  ,   OLDPEO_DE;

    public int getOLDPEO_ID() {
        return OLDPEO_ID;
    }

    public void setOLDPEO_ID(int OLDPEO_ID) {
        this.OLDPEO_ID = OLDPEO_ID;
    }

    public int getRECORD_ID() {
        return RECORD_ID;
    }

    public void setRECORD_ID(int RECORD_ID) {
        this.RECORD_ID = RECORD_ID;
    }

    public int getOLDPEO_SELFSTATE() {
        return OLDPEO_SELFSTATE;
    }

    public void setOLDPEO_SELFSTATE(int OLDPEO_SELFSTATE) {
        this.OLDPEO_SELFSTATE = OLDPEO_SELFSTATE;
    }

    public int getOLDPEO_MSTATE() {
        return OLDPEO_MSTATE;
    }

    public void setOLDPEO_MSTATE(int OLDPEO_MSTATE) {
        this.OLDPEO_MSTATE = OLDPEO_MSTATE;
    }

    public int getOLDPEO_STATE() {
        return OLDPEO_STATE;
    }

    public void setOLDPEO_STATE(int OLDPEO_STATE) {
        this.OLDPEO_STATE = OLDPEO_STATE;
    }

    public String getRECORD_DOCTOR() {
        return RECORD_DOCTOR;
    }

    public void setRECORD_DOCTOR(String RECORD_DOCTOR) {
        this.RECORD_DOCTOR = RECORD_DOCTOR;
    }

    public String getOLDPEO_DE() {
        return OLDPEO_DE;
    }

    public void setOLDPEO_DE(String OLDPEO_DE) {
        this.OLDPEO_DE = OLDPEO_DE;
    }

    @Override
    public String toString() {
        return "Oldpeo{" +
                "OLDPEO_ID=" + OLDPEO_ID +
                ", RECORD_ID=" + RECORD_ID +
                ", OLDPEO_SELFSTATE=" + OLDPEO_SELFSTATE +
                ", OLDPEO_MSTATE=" + OLDPEO_MSTATE +
                ", OLDPEO_STATE=" + OLDPEO_STATE +
                ", RECORD_DOCTOR='" + RECORD_DOCTOR + '\'' +
                ", OLDPEO_DE='" + OLDPEO_DE + '\'' +
                '}';
    }
}
