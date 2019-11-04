package com.aaa.health.entity.Children;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class Chmedmre {

   public int RECORD_ID ,CHMEDMRE_MONTHS  ,CHMEDMRE_DOC,CHMEDMRE_STATE  ;
   @JsonFormat(pattern = "yyyy-MM-dd",timezone="GMT+8")
   public Date CHMEDMRE_FOLLOWDATE ,CHMEDMRE_NEXTFOLLOW ;
   public String CHMEDMRE_CHMED ,CHMEDMRE_DE;

   public int getRECORD_ID() {
      return RECORD_ID;
   }

   public void setRECORD_ID(int RECORD_ID) {
      this.RECORD_ID = RECORD_ID;
   }

   public int getCHMEDMRE_MONTHS() {
      return CHMEDMRE_MONTHS;
   }

   public void setCHMEDMRE_MONTHS(int CHMEDMRE_MONTHS) {
      this.CHMEDMRE_MONTHS = CHMEDMRE_MONTHS;
   }

   public int getCHMEDMRE_DOC() {
      return CHMEDMRE_DOC;
   }

   public void setCHMEDMRE_DOC(int CHMEDMRE_DOC) {
      this.CHMEDMRE_DOC = CHMEDMRE_DOC;
   }

   public int getCHMEDMRE_STATE() {
      return CHMEDMRE_STATE;
   }

   public void setCHMEDMRE_STATE(int CHMEDMRE_STATE) {
      this.CHMEDMRE_STATE = CHMEDMRE_STATE;
   }

   public Date getCHMEDMRE_FOLLOWDATE() {
      return CHMEDMRE_FOLLOWDATE;
   }

   public void setCHMEDMRE_FOLLOWDATE(Date CHMEDMRE_FOLLOWDATE) {
      this.CHMEDMRE_FOLLOWDATE = CHMEDMRE_FOLLOWDATE;
   }

   public Date getCHMEDMRE_NEXTFOLLOW() {
      return CHMEDMRE_NEXTFOLLOW;
   }

   public void setCHMEDMRE_NEXTFOLLOW(Date CHMEDMRE_NEXTFOLLOW) {
      this.CHMEDMRE_NEXTFOLLOW = CHMEDMRE_NEXTFOLLOW;
   }

   public String getCHMEDMRE_CHMED() {
      return CHMEDMRE_CHMED;
   }

   public void setCHMEDMRE_CHMED(String CHMEDMRE_CHMED) {
      this.CHMEDMRE_CHMED = CHMEDMRE_CHMED;
   }

   public String getCHMEDMRE_DE() {
      return CHMEDMRE_DE;
   }

   public void setCHMEDMRE_DE(String CHMEDMRE_DE) {
      this.CHMEDMRE_DE = CHMEDMRE_DE;
   }

   @Override
   public String toString() {
      return "Chmedmre{" +
              "RECORD_ID=" + RECORD_ID +
              ", CHMEDMRE_MONTHS=" + CHMEDMRE_MONTHS +
              ", CHMEDMRE_DOC=" + CHMEDMRE_DOC +
              ", CHMEDMRE_STATE=" + CHMEDMRE_STATE +
              ", CHMEDMRE_FOLLOWDATE=" + CHMEDMRE_FOLLOWDATE +
              ", CHMEDMRE_NEXTFOLLOW=" + CHMEDMRE_NEXTFOLLOW +
              ", CHMEDMRE_CHMED='" + CHMEDMRE_CHMED + '\'' +
              ", CHMEDMRE_DE='" + CHMEDMRE_DE + '\'' +
              '}';
   }
}
