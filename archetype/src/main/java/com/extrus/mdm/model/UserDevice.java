package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the UserDevice database table.
 * 
 */
@Entity
@Table(name="UserDevice")
@NamedQuery(name="UserDevice.findAll", query="SELECT u FROM UserDevice u")
public class UserDevice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	@Column(name="admin_id")
	private BigInteger adminId;

	@Column(length=255)
	private String agentId;

	@Column(nullable=false)
	private byte allowedLocationMonitoring;

	@Column(length=255)
	private String authToken;

	@Column(length=255)
	private String commonPolicyVer;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	private BigInteger deviceTypeId_id;

	@Column(length=255)
	private String extCode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date heartbeatDateTime;

	@Column(length=255)
	private String imeiVal;

	@Column(nullable=false)
	private byte isLastVersion;

	@Column(nullable=false)
	private byte isLock;

	@Column(nullable=false)
	private byte isModuleInstalled;

	@Column(nullable=false)
	private byte isRegistered;

	@Column(nullable=false)
	private byte isRooted;

	@Column(nullable=false)
	private byte isVendorPushEnabled;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastAccessTime;

	private BigInteger lastPolicyApplied_id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lastSyncTime;

	@Column(length=255)
	private String lockCnt;

	@Column(nullable=false)
	private int lost;

	@Temporal(TemporalType.TIMESTAMP)
	private Date lostTime;

	@Column(length=255)
	private String mobileNumber;

	@Column(length=255)
	private String name;

	private BigInteger nowPolicy_id;

	@Column(length=255)
	private String nowPolicyControl;

	@Column(name="owner_id")
	private BigInteger ownerId;

	@Column(length=255)
	private String pushId;

	@Column(nullable=false)
	private int reConnectCount;

	@Column(length=255)
	private String statusCode;

	@Lob
	private String unlockToken;

	@Column(length=255)
	private String unqKey;

	@Temporal(TemporalType.TIMESTAMP)
	private Date unRegisteredDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	private int vendor;

	public UserDevice() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public BigInteger getActionCompany() {
		return this.actionCompany;
	}

	public void setActionCompany(BigInteger actionCompany) {
		this.actionCompany = actionCompany;
	}

	public String getActionSource() {
		return this.actionSource;
	}

	public void setActionSource(String actionSource) {
		this.actionSource = actionSource;
	}

	public BigInteger getActionTime() {
		return this.actionTime;
	}

	public void setActionTime(BigInteger actionTime) {
		this.actionTime = actionTime;
	}

	public BigInteger getActionUser() {
		return this.actionUser;
	}

	public void setActionUser(BigInteger actionUser) {
		this.actionUser = actionUser;
	}

	public BigInteger getAdminId() {
		return this.adminId;
	}

	public void setAdminId(BigInteger adminId) {
		this.adminId = adminId;
	}

	public String getAgentId() {
		return this.agentId;
	}

	public void setAgentId(String agentId) {
		this.agentId = agentId;
	}

	public byte getAllowedLocationMonitoring() {
		return this.allowedLocationMonitoring;
	}

	public void setAllowedLocationMonitoring(byte allowedLocationMonitoring) {
		this.allowedLocationMonitoring = allowedLocationMonitoring;
	}

	public String getAuthToken() {
		return this.authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
	}

	public String getCommonPolicyVer() {
		return this.commonPolicyVer;
	}

	public void setCommonPolicyVer(String commonPolicyVer) {
		this.commonPolicyVer = commonPolicyVer;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public BigInteger getDeviceTypeId_id() {
		return this.deviceTypeId_id;
	}

	public void setDeviceTypeId_id(BigInteger deviceTypeId_id) {
		this.deviceTypeId_id = deviceTypeId_id;
	}

	public String getExtCode() {
		return this.extCode;
	}

	public void setExtCode(String extCode) {
		this.extCode = extCode;
	}

	public Date getHeartbeatDateTime() {
		return this.heartbeatDateTime;
	}

	public void setHeartbeatDateTime(Date heartbeatDateTime) {
		this.heartbeatDateTime = heartbeatDateTime;
	}

	public String getImeiVal() {
		return this.imeiVal;
	}

	public void setImeiVal(String imeiVal) {
		this.imeiVal = imeiVal;
	}

	public byte getIsLastVersion() {
		return this.isLastVersion;
	}

	public void setIsLastVersion(byte isLastVersion) {
		this.isLastVersion = isLastVersion;
	}

	public byte getIsLock() {
		return this.isLock;
	}

	public void setIsLock(byte isLock) {
		this.isLock = isLock;
	}

	public byte getIsModuleInstalled() {
		return this.isModuleInstalled;
	}

	public void setIsModuleInstalled(byte isModuleInstalled) {
		this.isModuleInstalled = isModuleInstalled;
	}

	public byte getIsRegistered() {
		return this.isRegistered;
	}

	public void setIsRegistered(byte isRegistered) {
		this.isRegistered = isRegistered;
	}

	public byte getIsRooted() {
		return this.isRooted;
	}

	public void setIsRooted(byte isRooted) {
		this.isRooted = isRooted;
	}

	public byte getIsVendorPushEnabled() {
		return this.isVendorPushEnabled;
	}

	public void setIsVendorPushEnabled(byte isVendorPushEnabled) {
		this.isVendorPushEnabled = isVendorPushEnabled;
	}

	public Date getLastAccessTime() {
		return this.lastAccessTime;
	}

	public void setLastAccessTime(Date lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	public BigInteger getLastPolicyApplied_id() {
		return this.lastPolicyApplied_id;
	}

	public void setLastPolicyApplied_id(BigInteger lastPolicyApplied_id) {
		this.lastPolicyApplied_id = lastPolicyApplied_id;
	}

	public Date getLastSyncTime() {
		return this.lastSyncTime;
	}

	public void setLastSyncTime(Date lastSyncTime) {
		this.lastSyncTime = lastSyncTime;
	}

	public String getLockCnt() {
		return this.lockCnt;
	}

	public void setLockCnt(String lockCnt) {
		this.lockCnt = lockCnt;
	}

	public int getLost() {
		return this.lost;
	}

	public void setLost(int lost) {
		this.lost = lost;
	}

	public Date getLostTime() {
		return this.lostTime;
	}

	public void setLostTime(Date lostTime) {
		this.lostTime = lostTime;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getNowPolicy_id() {
		return this.nowPolicy_id;
	}

	public void setNowPolicy_id(BigInteger nowPolicy_id) {
		this.nowPolicy_id = nowPolicy_id;
	}

	public String getNowPolicyControl() {
		return this.nowPolicyControl;
	}

	public void setNowPolicyControl(String nowPolicyControl) {
		this.nowPolicyControl = nowPolicyControl;
	}

	public BigInteger getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(BigInteger ownerId) {
		this.ownerId = ownerId;
	}

	public String getPushId() {
		return this.pushId;
	}

	public void setPushId(String pushId) {
		this.pushId = pushId;
	}

	public int getReConnectCount() {
		return this.reConnectCount;
	}

	public void setReConnectCount(int reConnectCount) {
		this.reConnectCount = reConnectCount;
	}

	public String getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}

	public String getUnlockToken() {
		return this.unlockToken;
	}

	public void setUnlockToken(String unlockToken) {
		this.unlockToken = unlockToken;
	}

	public String getUnqKey() {
		return this.unqKey;
	}

	public void setUnqKey(String unqKey) {
		this.unqKey = unqKey;
	}

	public Date getUnRegisteredDate() {
		return this.unRegisteredDate;
	}

	public void setUnRegisteredDate(Date unRegisteredDate) {
		this.unRegisteredDate = unRegisteredDate;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getVendor() {
		return this.vendor;
	}

	public void setVendor(int vendor) {
		this.vendor = vendor;
	}

}