package com.example.demo.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.math.BigDecimal;
import java.util.Date;

@TableName("storm_order_matching")
public class StormOrderMatching {

    @TableId(type = IdType.AUTO)
    private Long id;

    private String createdBy;

    private Date creationTime;

    private Date lastUpdateTime;

    private String updatedBy;

    private Long version;

    private String blNo;

    private String erChehngBlNo;

    private String loadSplitPackPoint;

    private String loadSplitPackPort;

    private String number;

    private BigDecimal payedCost;

    private Date planArrivalTime;

    private BigDecimal pointToPortDistance;

    private String sizeType;

    private Long truckOrderTontainerId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy == null ? null : createdBy.trim();
    }

    public Date getCreationTime() {
        return creationTime;
    }

    public void setCreationTime(Date creationTime) {
        this.creationTime = creationTime;
    }

    public Date getLastUpdateTime() {
        return lastUpdateTime;
    }

    public void setLastUpdateTime(Date lastUpdateTime) {
        this.lastUpdateTime = lastUpdateTime;
    }

    public String getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy == null ? null : updatedBy.trim();
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getBlNo() {
        return blNo;
    }

    public void setBlNo(String blNo) {
        this.blNo = blNo == null ? null : blNo.trim();
    }

    public String getErChehngBlNo() {
        return erChehngBlNo;
    }

    public void setErChehngBlNo(String erChehngBlNo) {
        this.erChehngBlNo = erChehngBlNo == null ? null : erChehngBlNo.trim();
    }

    public String getLoadSplitPackPoint() {
        return loadSplitPackPoint;
    }

    public void setLoadSplitPackPoint(String loadSplitPackPoint) {
        this.loadSplitPackPoint = loadSplitPackPoint == null ? null : loadSplitPackPoint.trim();
    }

    public String getLoadSplitPackPort() {
        return loadSplitPackPort;
    }

    public void setLoadSplitPackPort(String loadSplitPackPort) {
        this.loadSplitPackPort = loadSplitPackPort == null ? null : loadSplitPackPort.trim();
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number == null ? null : number.trim();
    }

    public BigDecimal getPayedCost() {
        return payedCost;
    }

    public void setPayedCost(BigDecimal payedCost) {
        this.payedCost = payedCost;
    }

    public Date getPlanArrivalTime() {
        return planArrivalTime;
    }

    public void setPlanArrivalTime(Date planArrivalTime) {
        this.planArrivalTime = planArrivalTime;
    }

    public BigDecimal getPointToPortDistance() {
        return pointToPortDistance;
    }

    public void setPointToPortDistance(BigDecimal pointToPortDistance) {
        this.pointToPortDistance = pointToPortDistance;
    }

    public String getSizeType() {
        return sizeType;
    }

    public void setSizeType(String sizeType) {
        this.sizeType = sizeType == null ? null : sizeType.trim();
    }

    public Long getTruckOrderTontainerId() {
        return truckOrderTontainerId;
    }

    public void setTruckOrderTontainerId(Long truckOrderTontainerId) {
        this.truckOrderTontainerId = truckOrderTontainerId;
    }
}