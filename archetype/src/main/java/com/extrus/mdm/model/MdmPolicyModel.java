package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the MdmPolicyModel database table.
 * 
 */
@Entity
@Table(name="MdmPolicyModel")
@NamedQuery(name="MdmPolicyModel.findAll", query="SELECT m FROM MdmPolicyModel m")
public class MdmPolicyModel implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	private int areaType;

	@Column(nullable=false)
	private byte baseFlag;

	@Column(name="company_id")
	private BigInteger companyId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String policyDesc;

	private int policyType;

	@Column(length=255)
	private String policyVersion;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public MdmPolicyModel() {
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

	public int getAreaType() {
		return this.areaType;
	}

	public void setAreaType(int areaType) {
		this.areaType = areaType;
	}

	public byte getBaseFlag() {
		return this.baseFlag;
	}

	public void setBaseFlag(byte baseFlag) {
		this.baseFlag = baseFlag;
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPolicyDesc() {
		return this.policyDesc;
	}

	public void setPolicyDesc(String policyDesc) {
		this.policyDesc = policyDesc;
	}

	public int getPolicyType() {
		return this.policyType;
	}

	public void setPolicyType(int policyType) {
		this.policyType = policyType;
	}

	public String getPolicyVersion() {
		return this.policyVersion;
	}

	public void setPolicyVersion(String policyVersion) {
		this.policyVersion = policyVersion;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}