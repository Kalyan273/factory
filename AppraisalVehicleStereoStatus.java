package com.factory.appraisal.vehiclesearchapp.dto;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class AppraisalVehicleStereoStatus {

    @NotNull
    @Size(max = 15)
    private long appraisalStatusId ;
    @NotNull
    private boolean factoryEquipmentOperational ;
    @NotNull
    private boolean factoryEquipmentNotOperational ;
    @NotNull
    private boolean knobsMissing ;
    @NotNull
    private boolean afterMarketNavigationNiceSystem ;
    @NotNull
    private boolean afterMarket;
    @NotNull
    private boolean aftermarketRearEntertainmentSystem ;
    @NotNull
    private boolean factoryRearEntertainmentSystem ;
    @NotNull
    private boolean professionalInstall ;
    @NotNull
    private boolean brokenScreen ;
    @NotNull
    private boolean fadedDisplayButtons ;
    @NotNull
    private boolean notOperational ;
    @NotNull
    private boolean operational ;

    public long getAppraisalStatusId() {
        return appraisalStatusId;
    }

    public void setAppraisalStatusId(long appraisalStatusId) {
        this.appraisalStatusId = appraisalStatusId;
    }

    public boolean isFactoryEquipmentOperational() {
        return factoryEquipmentOperational;
    }

    public void setFactoryEquipmentOperational(boolean factoryEquipmentOperational) {
        this.factoryEquipmentOperational = factoryEquipmentOperational;
    }

    public boolean isFactoryEquipmentNotOperational() {
        return factoryEquipmentNotOperational;
    }

    public void setFactoryEquipmentNotOperational(boolean factoryEquipmentNotOperational) {
        this.factoryEquipmentNotOperational = factoryEquipmentNotOperational;
    }

    public boolean isKnobsMissing() {
        return knobsMissing;
    }

    public void setKnobsMissing(boolean knobsMissing) {
        this.knobsMissing = knobsMissing;
    }

    public boolean isAfterMarketNavigationNiceSystem() {
        return afterMarketNavigationNiceSystem;
    }

    public void setAfterMarketNavigationNiceSystem(boolean afterMarketNavigationNiceSystem) {
        this.afterMarketNavigationNiceSystem = afterMarketNavigationNiceSystem;
    }

    public boolean isAfterMarket() {
        return afterMarket;
    }

    public void setAfterMarket(boolean afterMarket) {
        this.afterMarket = afterMarket;
    }

    public boolean isAftermarketRearEntertainmentSystem() {
        return aftermarketRearEntertainmentSystem;
    }

    public void setAftermarketRearEntertainmentSystem(boolean aftermarketRearEntertainmentSystem) {
        this.aftermarketRearEntertainmentSystem = aftermarketRearEntertainmentSystem;
    }

    public boolean isFactoryRearEntertainmentSystem() {
        return factoryRearEntertainmentSystem;
    }

    public void setFactoryRearEntertainmentSystem(boolean factoryRearEntertainmentSystem) {
        this.factoryRearEntertainmentSystem = factoryRearEntertainmentSystem;
    }

    public boolean isProfessionalInstall() {
        return professionalInstall;
    }

    public void setProfessionalInstall(boolean professionalInstall) {
        this.professionalInstall = professionalInstall;
    }

    public boolean isBrokenScreen() {
        return brokenScreen;
    }

    public void setBrokenScreen(boolean brokenScreen) {
        this.brokenScreen = brokenScreen;
    }

    public boolean isFadedDisplayButtons() {
        return fadedDisplayButtons;
    }

    public void setFadedDisplayButtons(boolean fadedDisplayButtons) {
        this.fadedDisplayButtons = fadedDisplayButtons;
    }

    public boolean isNotOperational() {
        return notOperational;
    }

    public void setNotOperational(boolean notOperational) {
        this.notOperational = notOperational;
    }

    public boolean isOperational() {
        return operational;
    }

    public void setOperational(boolean operational) {
        this.operational = operational;
    }
}
