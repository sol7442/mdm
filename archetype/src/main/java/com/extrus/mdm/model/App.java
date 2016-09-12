package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the App database table.
 * 
 */
@Entity
@Table(name="App")
@NamedQuery(name="App.findAll", query="SELECT a FROM App a")
public class App implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	private int agentDeviceVendor;

	private int appAgent;

	@Column(nullable=false)
	private int appType;

	@Column(name="certificate_id")
	private BigInteger certificateId;

	@Column(name="company_id", nullable=false)
	private BigInteger companyId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String hash;

	@Column(length=255)
	private String name;

	@Column(nullable=false, length=255)
	private String packageName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@Column(nullable=false)
	private int virusResult;

	private int windowsType;

	public App() {
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

	public int getAgentDeviceVendor() {
		return this.agentDeviceVendor;
	}

	public void setAgentDeviceVendor(int agentDeviceVendor) {
		this.agentDeviceVendor = agentDeviceVendor;
	}

	public int getAppAgent() {
		return this.appAgent;
	}

	public void setAppAgent(int appAgent) {
		this.appAgent = appAgent;
	}

	public int getAppType() {
		return this.appType;
	}

	public void setAppType(int appType) {
		this.appType = appType;
	}

	public BigInteger getCertificateId() {
		return this.certificateId;
	}

	public void setCertificateId(BigInteger certificateId) {
		this.certificateId = certificateId;
	}

	public BigInteger getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(BigInteger companyId) {
		this.companyId = companyId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPackageName() {
		return this.packageName;
	}

	public void setPackageName(String packageName) {
		this.packageName = packageName;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getVirusResult() {
		return this.virusResult;
	}

	public void setVirusResult(int virusResult) {
		this.virusResult = virusResult;
	}

	public int getWindowsType() {
		return this.windowsType;
	}

	public void setWindowsType(int windowsType) {
		this.windowsType = windowsType;
	}

}