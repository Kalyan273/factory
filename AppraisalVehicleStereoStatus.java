package com.factory.appraisal.vehiclesearchapp.persistence.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Audited
@Entity
@Table(name="FACTORY_DB.APR_VEH_STEREO_STATUS")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class AppraisalVehicleStereoStatus extends TransactionEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "STEREO_ST_ID")
    @Min(1)
    @Max(99999999999L)
    private long stereoStatusId ;
    @OneToOne(targetEntity = EAppraisalTestDrivingStatus.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "VEH_STATUS_ID",referencedColumnName = "")
    private EAppraisalTestDrivingStatus vehicleStatusId;

    public EAppraisalTestDrivingStatus getVehicleStatusId() {
        return vehicleStatusId;
    }

    public void setVehicleStatusId(EAppraisalTestDrivingStatus vehicleStatusId) {
        this.vehicleStatusId = vehicleStatusId;
    }

    @Column(name = "FACTORY_EQU_OP")
    private boolean factoryEquipmentOperational ;
    @Column(name = "EQPT_NOT_OP")
    private boolean factoryEquipmentNotOperational ;
    @Column(name = "KNOBS_MISSING")
    private boolean knobsMissing ;
    @Column(name = "AFT_MKT_NAV_NICE_SYS")
    private boolean afterMarketNavigationNiceSystem ;
    @Column(name = "AFT_MKT")
    private boolean afterMarket;
    @Column(name = "AFT_MKT_R_ENTMT_SYS")
    private boolean aftermarketRearEntertainmentSystem ;
    @Column(name = "FACTORY_R_ENTMT_SYS")
    private boolean factoryRearEntertainmentSystem ;
    @Column(name = "PRO_INSTALL")
    private boolean professionalInstall ;
    @Column(name = "BROKEN_SCREEN")
    private boolean brokenScreen ;
    @Column(name = "FADED_DIS_OR_BTNS")
    private boolean fadedDisplayButtons ;
    @Column(name = "NOT_OPRNL")
    private boolean notOperational ;
    @Column(name = "OPERATIONAL")
    private boolean operational ;

    public long getStereoStatusId() {
        return stereoStatusId;
    }

    public void setStereoStatusId(long stereoStatusId) {
        this.stereoStatusId = stereoStatusId;
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
