package com.example.demo.entity;

import com.example.demo.conf.pluging.Sensitive;
import com.example.demo.conf.pluging.SensitiveStrategy;

import java.util.Date;

public class DriverRegistration {
    private Long id;

    private String createdBy;

    private Date creationTime;

    private Date lastUpdateTime;

    private String updatedBy;

    private Long version;

    private Date auditTime;

    private String auditor;

    private Date createTime;

    private String creater;

    private Date expireDate;

    private Boolean effectiveFlag;

    private String remark;

    private String appUserId;

    private String driverCode;

    @Sensitive(strategy = SensitiveStrategy.DRIVER_NAME)
    private String driverName;

    private String gender;

    private String identityCardAddress;

    private String identityCardNo;

    private String mobilePhone;

    private String phone;

    private String weixinOpenId;

    private Long portId;

    private String statusId;

    private Long companyId;

    private String eqSyncFlag;

    private String sqSyncFlag;

    private String syncStatus;

    private String yqSyncFlag;

    private Long identityCardPic;

    private Long identityCardPic1;

    private String rejectReason;

    private Date drivingLicenseEffectiveDate;

    private Date identityCardEffectiveDate;

    private Date payCompleteTime;

    private Date payTime;

    private String payUniqueNo;

    private String payStatus;

    private String payer;

    private Integer age;

    private Date drivingLicenseInitialGetDate;

    private Integer drivingTime;

    private Long capacityTruckId;

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

    public Date getAuditTime() {
        return auditTime;
    }

    public void setAuditTime(Date auditTime) {
        this.auditTime = auditTime;
    }

    public String getAuditor() {
        return auditor;
    }

    public void setAuditor(String auditor) {
        this.auditor = auditor == null ? null : auditor.trim();
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater == null ? null : creater.trim();
    }

    public Date getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    public Boolean getEffectiveFlag() {
        return effectiveFlag;
    }

    public void setEffectiveFlag(Boolean effectiveFlag) {
        this.effectiveFlag = effectiveFlag;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    public String getAppUserId() {
        return appUserId;
    }

    public void setAppUserId(String appUserId) {
        this.appUserId = appUserId == null ? null : appUserId.trim();
    }

    public String getDriverCode() {
        return driverCode;
    }

    public void setDriverCode(String driverCode) {
        this.driverCode = driverCode == null ? null : driverCode.trim();
    }

    public String getDriverName() {
        return driverName;
    }

    public void setDriverName(String driverName) {
        this.driverName = driverName == null ? null : driverName.trim();
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender == null ? null : gender.trim();
    }

    public String getIdentityCardAddress() {
        return identityCardAddress;
    }

    public void setIdentityCardAddress(String identityCardAddress) {
        this.identityCardAddress = identityCardAddress == null ? null : identityCardAddress.trim();
    }

    public String getIdentityCardNo() {
        return identityCardNo;
    }

    public void setIdentityCardNo(String identityCardNo) {
        this.identityCardNo = identityCardNo == null ? null : identityCardNo.trim();
    }

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone == null ? null : mobilePhone.trim();
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    public String getWeixinOpenId() {
        return weixinOpenId;
    }

    public void setWeixinOpenId(String weixinOpenId) {
        this.weixinOpenId = weixinOpenId == null ? null : weixinOpenId.trim();
    }

    public Long getPortId() {
        return portId;
    }

    public void setPortId(Long portId) {
        this.portId = portId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId == null ? null : statusId.trim();
    }

    public Long getCompanyId() {
        return companyId;
    }

    public void setCompanyId(Long companyId) {
        this.companyId = companyId;
    }

    public String getEqSyncFlag() {
        return eqSyncFlag;
    }

    public void setEqSyncFlag(String eqSyncFlag) {
        this.eqSyncFlag = eqSyncFlag == null ? null : eqSyncFlag.trim();
    }

    public String getSqSyncFlag() {
        return sqSyncFlag;
    }

    public void setSqSyncFlag(String sqSyncFlag) {
        this.sqSyncFlag = sqSyncFlag == null ? null : sqSyncFlag.trim();
    }

    public String getSyncStatus() {
        return syncStatus;
    }

    public void setSyncStatus(String syncStatus) {
        this.syncStatus = syncStatus == null ? null : syncStatus.trim();
    }

    public String getYqSyncFlag() {
        return yqSyncFlag;
    }

    public void setYqSyncFlag(String yqSyncFlag) {
        this.yqSyncFlag = yqSyncFlag == null ? null : yqSyncFlag.trim();
    }

    public Long getIdentityCardPic() {
        return identityCardPic;
    }

    public void setIdentityCardPic(Long identityCardPic) {
        this.identityCardPic = identityCardPic;
    }

    public Long getIdentityCardPic1() {
        return identityCardPic1;
    }

    public void setIdentityCardPic1(Long identityCardPic1) {
        this.identityCardPic1 = identityCardPic1;
    }

    public String getRejectReason() {
        return rejectReason;
    }

    public void setRejectReason(String rejectReason) {
        this.rejectReason = rejectReason == null ? null : rejectReason.trim();
    }

    public Date getDrivingLicenseEffectiveDate() {
        return drivingLicenseEffectiveDate;
    }

    public void setDrivingLicenseEffectiveDate(Date drivingLicenseEffectiveDate) {
        this.drivingLicenseEffectiveDate = drivingLicenseEffectiveDate;
    }

    public Date getIdentityCardEffectiveDate() {
        return identityCardEffectiveDate;
    }

    public void setIdentityCardEffectiveDate(Date identityCardEffectiveDate) {
        this.identityCardEffectiveDate = identityCardEffectiveDate;
    }

    public Date getPayCompleteTime() {
        return payCompleteTime;
    }

    public void setPayCompleteTime(Date payCompleteTime) {
        this.payCompleteTime = payCompleteTime;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getPayUniqueNo() {
        return payUniqueNo;
    }

    public void setPayUniqueNo(String payUniqueNo) {
        this.payUniqueNo = payUniqueNo == null ? null : payUniqueNo.trim();
    }

    public String getPayStatus() {
        return payStatus;
    }

    public void setPayStatus(String payStatus) {
        this.payStatus = payStatus == null ? null : payStatus.trim();
    }

    public String getPayer() {
        return payer;
    }

    public void setPayer(String payer) {
        this.payer = payer == null ? null : payer.trim();
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getDrivingLicenseInitialGetDate() {
        return drivingLicenseInitialGetDate;
    }

    public void setDrivingLicenseInitialGetDate(Date drivingLicenseInitialGetDate) {
        this.drivingLicenseInitialGetDate = drivingLicenseInitialGetDate;
    }

    public Integer getDrivingTime() {
        return drivingTime;
    }

    public void setDrivingTime(Integer drivingTime) {
        this.drivingTime = drivingTime;
    }

    public Long getCapacityTruckId() {
        return capacityTruckId;
    }

    public void setCapacityTruckId(Long capacityTruckId) {
        this.capacityTruckId = capacityTruckId;
    }
}