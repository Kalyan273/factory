package com.factory.appraisal.vehiclesearchapp.dto;


import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalTestDrivingStatus;
import com.factory.appraisal.vehiclesearchapp.persistence.model.TransactionEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AppraisalVehicleInteriorCondition extends TransactionEntity {

    @NotNull
    @Max(15)
    private Long interiorConditionId ;
    private AppraisalTestDrivingStatus vehicleStatusId;
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



}
