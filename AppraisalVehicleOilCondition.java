package com.factory.appraisal.vehiclesearchapp.persistence.model;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Audited
@Entity
@Table(name="FACTORY_DB.APR_VEH_OIL_CONDN")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class AppraisalVehicleOilCondition extends TransactionEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "V_OIL_CONDN_ID")
    @Min(1)
    @Max(99999999999L)
    private long vehicleOilConditionId;
    @OneToOne(targetEntity = EAppraisalTestDrivingStatus.class,fetch = FetchType.LAZY)
    @JoinColumn(name = "VEH_STATUS_ID",referencedColumnName = "")
    private EAppraisalTestDrivingStatus vehicleStatusId;
    @Column(name = "CLEAN_OIL")
    private boolean cleanOil ;
    @Column(name = "DIRTY_OIL")
    private boolean dirtyOil ;
    @Column(name = "WTR_IN_OIL")
    private boolean waterInOil;
    @Column(name = "CRT_LEVEL")
    private boolean correctLevel ;
    @Column(name = "S_QUART_LOW")
    private boolean  oneQuartLow ;
    @Column(name = "GT_QUART_LOW")
    private boolean moreThanAQuartLow ;
    @Column(name = "EC_GAUGE")
    private boolean electronicGauge ;

    public long getVehicleOilConditionId() {
        return vehicleOilConditionId;
    }

    public void setVehicleOilConditionId(long vehicleOilConditionId) {
        this.vehicleOilConditionId = vehicleOilConditionId;
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
