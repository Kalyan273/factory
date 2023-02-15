package com.factory.appraisal.vehiclesearchapp.persistence.model;


import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.Size;

@Audited
@Entity
@Table(name="FACTORY_DB.APR_VEH_INTR_CONDN")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class AppraisalVehicleInteriorCondition extends TransactionEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "INTR_CONDN_ID")
    @Size(max = 15)
    private long interiorConditionId ;
    @Column(name="appraisalStatusId")
    private long appraisalStatusId;
    @Column(name = "CLEAN_FL")
    private boolean cleanFrontlineReady ;
    @Column(name = "GOOD_MNR_RPR_ND")
    private boolean goodMinorRepairsNeeded ;
    @Column(name = "SMOKERS_CAR")
    private boolean smokersCar ;
    @Column(name = "ODD_SMELL")
    private boolean oddSmelling ;
    @Column(name = "VERY_DIRTY")
    private boolean veryDirty ;
    @Column(name = "STG_PET_SMELL")
    private boolean strongPetSmell ;
    @Column(name = "DRV_SEAT_WEAR")
    private boolean driversSeatWear ;
    @Column(name = "HL_NEED_RPLC")
    private boolean headlinearNeedReplacement ;
    @Column(name = "DRV_SEAT_RIPPED")
    private boolean driverSeatRipped;

    @Column(name = "DASH_CRACKED_MNR")
    private boolean dashCrackedMinor ;
    @Column(name = "DASH_CRK_BRKN_MAJ")
    private boolean dashCrackedBrokenMajor ;
    @Column(name = "PAX_SEAT_RIPPED")
    private boolean passengerSeatRipped ;
    @Column(name = "CARPET_BADLY_WORN")
    private boolean carpetBadlyWorn ;
    @Column(name = "INT_TRIM_BRKN_MS")
    private boolean interiorTrimBrokenMissing ;
    @Column(name = "POOR_NEEDS_RPR")
    private boolean poorNeedsRepair ;

    public long getInteriorConditionId() {
        return interiorConditionId;
    }

    public void setInteriorConditionId(long interiorConditionId) {
        this.interiorConditionId = interiorConditionId;
    }

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
