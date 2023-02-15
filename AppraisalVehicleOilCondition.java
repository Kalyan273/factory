package com.factory.appraisal.vehiclesearchapp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AppraisalVehicleOilCondition {

    @NotNull
    @Size(max = 15)
    private long appraisalStatusId;
    @NotNull
    private boolean cleanOil ;
    @NotNull
    private boolean dirtyOil ;
    @NotNull
    private boolean waterInOil;
    @NotNull
    private boolean correctLevel ;
    @NotNull
    private boolean  oneQuartLow ;
    @NotNull
    private boolean moreThanAQuartLow ;
    @NotNull
    private boolean electronicGauge ;

    public long getAppraisalStatusId() {
        return appraisalStatusId;
    }

    public void setAppraisalStatusId(long appraisalStatusId) {
        this.appraisalStatusId = appraisalStatusId;
    }

    public boolean isCleanOil() {
        return cleanOil;
    }

    public void setCleanOil(boolean cleanOil) {
        this.cleanOil = cleanOil;
    }

    public boolean isDirtyOil() {
        return dirtyOil;
    }

    public void setDirtyOil(boolean dirtyOil) {
        this.dirtyOil = dirtyOil;
    }

    public boolean isWaterInOil() {
        return waterInOil;
    }

    public void setWaterInOil(boolean waterInOil) {
        this.waterInOil = waterInOil;
    }

    public boolean isCorrectLevel() {
        return correctLevel;
    }

    public void setCorrectLevel(boolean correctLevel) {
        this.correctLevel = correctLevel;
    }

    public boolean isOneQuartLow() {
        return oneQuartLow;
    }

    public void setOneQuartLow(boolean oneQuartLow) {
        this.oneQuartLow = oneQuartLow;
    }

    public boolean isMoreThanAQuartLow() {
        return moreThanAQuartLow;
    }

    public void setMoreThanAQuartLow(boolean moreThanAQuartLow) {
        this.moreThanAQuartLow = moreThanAQuartLow;
    }

    public boolean isElectronicGauge() {
        return electronicGauge;
    }

    public void setElectronicGauge(boolean electronicGauge) {
        this.electronicGauge = electronicGauge;
    }
}
