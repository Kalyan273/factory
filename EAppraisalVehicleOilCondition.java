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
@AuditTable(value = "APR_VEH_OIL_CONDN_AUD",schema = "FACTORY_AUD")
@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="APR_VEH_OIL_CONDN",schema = "FACTORY_DB")
@DynamicUpdate
@DynamicInsert
@AttributeOverride(name = "vehicleOilConditionId", column = @Column(name = "V_OIL_CONDN_ID"))
@AttributeOverride(name = "createdBy", column = @Column(name = "CREATED_BY"))
@AttributeOverride(name = "createdOn", column = @Column(name = "CREATED_ON"))
@AttributeOverride(name = "modifiedBy", column = @Column(name = "MODIFIED_BY"))
@AttributeOverride(name = "modifiedOn", column = @Column(name = "MODIFIED_ON"))
@AttributeOverride(name = "valid", column = @Column(name = "IS_ACTIVE"))
public class EAppraisalVehicleOilCondition extends TransactionEntity {
    @Id
    @GeneratedValue(strategy= GenerationType.SEQUENCE,generator = "apr_veh_oil_condn")
    @SequenceGenerator(name = "apr_veh_oil_condn",sequenceName = "APR_VEH_OIL_CONDN")
    @Column(name = "V_OIL_CONDN_ID")
    private long vehicleOilConditionId;

    @Audited(targetAuditMode = RelationTargetAuditMode.NOT_AUDITED)
    @OneToOne(targetEntity = EAppraisalTestDrivingStatus.class,fetch = FetchType.LAZY,cascade = CascadeType.ALL)
    @JoinColumn(name = "VEH_STATUS_ID",referencedColumnName = "VEH_STATUS_ID",nullable = false)
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

}
