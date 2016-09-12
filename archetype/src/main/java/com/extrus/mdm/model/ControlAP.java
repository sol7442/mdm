package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ControlAP database table.
 * 
 */
@Entity
@Table(name="ControlAP")
@NamedQuery(name="ControlAP.findAll", query="SELECT c FROM ControlAP c")
public class ControlAP implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	@Column(length=255)
	private String apDesc;

	@Column(length=255)
	private String auth;

	@Column(length=255)
	private String bsID;

	@Column(name="company_id")
	private BigInteger companyId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String pin;

	@Column(length=255)
	private String ssID;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public ControlAP() {
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

	public String getApDesc() {
		return this.apDesc;
	}

	public void setApDesc(String apDesc) {
		this.apDesc = apDesc;
	}

	public String getAuth() {
		return this.auth;
	}

	public void setAuth(String auth) {
		this.auth = auth;
	}

	public String getBsID() {
		return this.bsID;
	}

	public void setBsID(String bsID) {
		this.bsID = bsID;
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

	public String getPin() {
		return this.pin;
	}

	public void setPin(String pin) {
		this.pin = pin;
	}

	public String getSsID() {
		return this.ssID;
	}

	public void setSsID(String ssID) {
		this.ssID = ssID;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}