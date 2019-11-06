package com.aaa.health.entity.oldpeo;

import java.util.Date;

public class Oldself {
    public int oldselfId,oldpeoId ,oldselfDine,oldselfToilet,oldselfDress,oldselfClean,oldselfEvent,oldselfState;
    public Date oldselfDe;



    public int getOldselfId() {
        return oldselfId;
    }

    public void setOldselfId(int oldselfId) {
        this.oldselfId = oldselfId;
    }

    public int getOldpeoId() {
        return oldpeoId;
    }

    public void setOldpeoId(int oldpeoId) {
        this.oldpeoId = oldpeoId;
    }

    public int getOldselfDine() {
        return oldselfDine;
    }

    public void setOldselfDine(int oldselfDine) {
        this.oldselfDine = oldselfDine;
    }

    public int getOldselfToilet() {
        return oldselfToilet;
    }

    public void setOldselfToilet(int oldselfToilet) {
        this.oldselfToilet = oldselfToilet;
    }

    public int getOldselfDress() {
        return oldselfDress;
    }

    public void setOldselfDress(int oldselfDress) {
        this.oldselfDress = oldselfDress;
    }

    public int getOldselfClean() {
        return oldselfClean;
    }

    public void setOldselfClean(int oldselfClean) {
        this.oldselfClean = oldselfClean;
    }

    public int getOldselfEvent() {
        return oldselfEvent;
    }

    public void setOldselfEvent(int oldselfEvent) {
        this.oldselfEvent = oldselfEvent;
    }

    public int getOldselfState() {
        return oldselfState;
    }

    public void setOldselfState(int oldselfState) {
        this.oldselfState = oldselfState;
    }

    public Date getOldselfDe() {
        return oldselfDe;
    }

    public void setOldselfDe(Date oldselfDe) {
        this.oldselfDe = oldselfDe;
    }

    @Override
    public String toString() {
        return "Oldself{" +
                "oldselfId=" + oldselfId +
                ", oldpeoId=" + oldpeoId +
                ", oldselfDine=" + oldselfDine +
                ", oldselfToilet=" + oldselfToilet +
                ", oldselfDress=" + oldselfDress +
                ", oldselfClean=" + oldselfClean +
                ", oldselfEvent=" + oldselfEvent +
                ", oldselfState=" + oldselfState +
                ", oldselfDe='" + oldselfDe + '\'' +
                '}';
    }

    public Oldself(int oldselfId, int oldpeoId, int oldselfDine, int oldselfToilet, int oldselfDress, int oldselfClean, int oldselfEvent, int oldselfState, Date oldselfDe) {
        this.oldselfId = oldselfId;
        this.oldpeoId = oldpeoId;
        this.oldselfDine = oldselfDine;
        this.oldselfToilet = oldselfToilet;
        this.oldselfDress = oldselfDress;
        this.oldselfClean = oldselfClean;
        this.oldselfEvent = oldselfEvent;
        this.oldselfState = oldselfState;
        this.oldselfDe = oldselfDe;
    }

    public Oldself() {

    }
}
