package com.factory.appraisal.vehiclesearchapp.dto;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AppraisalVehicleInteriorCondition {


    @NotNull
    @Size(max = 15)
    private long appraisalStatusId;
    @NotNull
    private boolean cleanFrontlineReady;
    @NotNull
    private boolean goodMinorRepairsNeeded;
    @NotNull
    private boolean smokersCar;
    @NotNull
    private boolean oddSmelling;
    @NotNull
    private boolean veryDirty;
    @NotNull
    private boolean strongPetSmell;
    @NotNull
    private boolean driversSeatWear;
    @NotNull
    private boolean headlinearNeedReplacement;
    @NotNull
    private boolean driverSeatRipped;

    @NotNull
    private boolean dashCrackedMinor;
    @NotNull
    private boolean dashCrackedBrokenMajor;
    @NotNull
    private boolean passengerSeatRipped;
    @NotNull
    private boolean carpetBadlyWorn;
    @NotNull
    private boolean interiorTrimBrokenMissing;
    @NotNull
    private boolean poorNeedsRepair;

    public long getAppraisalStatusId() {
        return appraisalStatusId;
    }

    public void setAppraisalStatusId(long appraisalStatusId) {
        this.appraisalStatusId = appraisalStatusId;
    }

    public boolean isCleanFrontlineReady() {
        return cleanFrontlineReady;
    }

    public void setCleanFrontlineReady(boolean cleanFrontlineReady) {
        this.cleanFrontlineReady = cleanFrontlineReady;
    }

    public boolean isGoodMinorRepairsNeeded() {
        return goodMinorRepairsNeeded;
    }

    public void setGoodMinorRepairsNeeded(boolean goodMinorRepairsNeeded) {
        this.goodMinorRepairsNeeded = goodMinorRepairsNeeded;
    }

    public boolean isSmokersCar() {
        return smokersCar;
    }

    public void setSmokersCar(boolean smokersCar) {
        this.smokersCar = smokersCar;
    }

    public boolean isOddSmelling() {
        return oddSmelling;
    }

    public void setOddSmelling(boolean oddSmelling) {
        this.oddSmelling = oddSmelling;
    }

    public boolean isVeryDirty() {
        return veryDirty;
    }

    public void setVeryDirty(boolean veryDirty) {
        this.veryDirty = veryDirty;
    }

    public boolean isStrongPetSmell() {
        return strongPetSmell;
    }

    public void setStrongPetSmell(boolean strongPetSmell) {
        this.strongPetSmell = strongPetSmell;
    }

    public boolean isDriversSeatWear() {
        return driversSeatWear;
    }

    public void setDriversSeatWear(boolean driversSeatWear) {
        this.driversSeatWear = driversSeatWear;
    }

    public boolean isHeadlinearNeedReplacement() {
        return headlinearNeedReplacement;
    }

    public void setHeadlinearNeedReplacement(boolean headlinearNeedReplacement) {
        this.headlinearNeedReplacement = headlinearNeedReplacement;
    }

    public boolean isDriverSeatRipped() {
        return driverSeatRipped;
    }

    public void setDriverSeatRipped(boolean driverSeatRipped) {
        this.driverSeatRipped = driverSeatRipped;
    }

    public boolean isDashCrackedMinor() {
        return dashCrackedMinor;
    }

    public void setDashCrackedMinor(boolean dashCrackedMinor) {
        this.dashCrackedMinor = dashCrackedMinor;
    }

    public boolean isDashCrackedBrokenMajor() {
        return dashCrackedBrokenMajor;
    }

    public void setDashCrackedBrokenMajor(boolean dashCrackedBrokenMajor) {
        this.dashCrackedBrokenMajor = dashCrackedBrokenMajor;
    }

    public boolean isPassengerSeatRipped() {
        return passengerSeatRipped;
    }

    public void setPassengerSeatRipped(boolean passengerSeatRipped) {
        this.passengerSeatRipped = passengerSeatRipped;
    }

    public boolean isCarpetBadlyWorn() {
        return carpetBadlyWorn;
    }

    public void setCarpetBadlyWorn(boolean carpetBadlyWorn) {
        this.carpetBadlyWorn = carpetBadlyWorn;
    }

    public boolean isInteriorTrimBrokenMissing() {
        return interiorTrimBrokenMissing;
    }

    public void setInteriorTrimBrokenMissing(boolean interiorTrimBrokenMissing) {
        this.interiorTrimBrokenMissing = interiorTrimBrokenMissing;
    }

    public boolean isPoorNeedsRepair() {
        return poorNeedsRepair;
    }

    public void setPoorNeedsRepair(boolean poorNeedsRepair) {
        this.poorNeedsRepair = poorNeedsRepair;
    }
}
