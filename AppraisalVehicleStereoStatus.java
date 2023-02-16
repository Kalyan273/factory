package com.factory.appraisal.vehiclesearchapp.dto;

import com.factory.appraisal.vehiclesearchapp.persistence.model.EAppraisalTestDrivingStatus;
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
public class AppraisalVehicleStereoStatus {

    @NotNull
    @Max(15)
    private EAppraisalTestDrivingStatus vehicleStatusId;
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

}
