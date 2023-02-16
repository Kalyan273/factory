package com.factory.appraisal.vehiclesearchapp.persistence.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.hibernate.envers.AuditTable;
import org.hibernate.envers.Audited;
import org.hibernate.envers.RelationTargetAuditMode;

import javax.persistence.*;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

@Audited
@AuditTable(value = "APR_VEH_STEREO_STATUS",schema = "FACTORY_DB")
@Table(name="APR_VEH_STEREO_STATUS",schema = "FACTORY_DB")
@DynamicUpdate
@DynamicInsert
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@AttributeOverride(name = "stereoStatusId", column = @Column(name = "STEREO_ST_ID"))
@AttributeOverride(name = "createdBy", column = @Column(name = "CREATED_BY"))
@AttributeOverride(name = "createdOn", column = @Column(name = "CREATED_ON"))
@AttributeOverride(name = "modifiedBy", column = @Column(name = "MODIFIED_BY"))
@AttributeOverride(name = "modifiedOn", column = @Column(name = "MODIFIED_ON"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class EAppraisalVehicleStereoStatus extends TransactionEntity{
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "apr_veh_stereo_status_seq")
    @SequenceGenerator(name = "apr_veh_stereo_status_seq",sequenceName = "APR_VEH_STEREO_STATUS_SEQ")
    @Column(name = "STEREO_ST_ID")
    private long stereoStatusId ;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EAppraisalTestDrivingStatus.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "VEH_STATUS_ID",referencedColumnName = "VEH_STATUS_ID",nullable = false)
    private EAppraisalTestDrivingStatus vehicleStatusId;

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

}
