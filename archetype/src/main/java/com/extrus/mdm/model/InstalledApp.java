package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the InstalledApp database table.
 * 
 */
@Entity
@Table(name="InstalledApp")
@NamedQuery(name="InstalledApp.findAll", query="SELECT i FROM InstalledApp i")
public class InstalledApp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	@Column(name="app_id")
	private BigInteger appId;

	@Column(length=255)
	private String appSize;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String dataSize;

	@Column(name="device_id")
	private BigInteger deviceId;

	@Column(nullable=false)
	private byte hasDeletedApp;

	@Column(length=255)
	private String installedDate;

	@Column(length=255)
	private String installedVersion;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String publisher;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public InstalledApp() {
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

	public BigInteger getAppId() {
		return this.appId;
	}

	public void setAppId(BigInteger appId) {
		this.appId = appId;
	}

	public String getAppSize() {
		return this.appSize;
	}

	public void setAppSize(String appSize) {
		this.appSize = appSize;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDataSize() {
		return this.dataSize;
	}

	public void setDataSize(String dataSize) {
		this.dataSize = dataSize;
	}

	public BigInteger getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public byte getHasDeletedApp() {
		return this.hasDeletedApp;
	}

	public void setHasDeletedApp(byte hasDeletedApp) {
		this.hasDeletedApp = hasDeletedApp;
	}

	public String getInstalledDate() {
		return this.installedDate;
	}

	public void setInstalledDate(String installedDate) {
		this.installedDate = installedDate;
	}

	public String getInstalledVersion() {
		return this.installedVersion;
	}

	public void setInstalledVersion(String installedVersion) {
		this.installedVersion = installedVersion;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPublisher() {
		return this.publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}