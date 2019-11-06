package com.aaa.health.entity.outco;

public class OutCome {
    private Integer outcomeId,outcomeWhether,outcomeState;
    private String outcomeReason,outcomeOtherreason,outcomeRemarks,outcomeColumn;

    public Integer getOutcomeId() {
        return outcomeId;
    }

    public void setOutcomeId(Integer outcomeId) {
        this.outcomeId = outcomeId;
    }

    public Integer getOutcomeWhether() {
        return outcomeWhether;
    }

    public void setOutcomeWhether(Integer outcomeWhether) {
        this.outcomeWhether = outcomeWhether;
    }

    public Integer getOutcomeState() {
        return outcomeState;
    }

    public void setOutcomeState(Integer outcomeState) {
        this.outcomeState = outcomeState;
    }

    public String getOutcomeReason() {
        return outcomeReason;
    }

    public void setOutcomeReason(String outcomeReason) {
        this.outcomeReason = outcomeReason;
    }

    public String getOutcomeOtherreason() {
        return outcomeOtherreason;
    }

    public void setOutcomeOtherreason(String outcomeOtherreason) {
        this.outcomeOtherreason = outcomeOtherreason;
    }

    public String getOutcomeRemarks() {
        return outcomeRemarks;
    }

    public void setOutcomeRemarks(String outcomeRemarks) {
        this.outcomeRemarks = outcomeRemarks;
    }

    public String getOutcomeColumn() {
        return outcomeColumn;
    }

    public void setOutcomeColumn(String outcomeColumn) {
        this.outcomeColumn = outcomeColumn;
    }

    @Override
    public String toString() {
        return "OutCome{" +
                "outcomeId=" + outcomeId +
                ", outcomeWhether=" + outcomeWhether +
                ", outcomeState=" + outcomeState +
                ", outcomeReason='" + outcomeReason + '\'' +
                ", outcomeOtherreason='" + outcomeOtherreason + '\'' +
                ", outcomeRemarks='" + outcomeRemarks + '\'' +
                ", outcomeColumn='" + outcomeColumn + '\'' +
                '}';
    }
}
