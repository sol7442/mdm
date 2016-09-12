package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the PassingStatus database table.
 * 
 */
@Entity
@Table(name="PassingStatus")
@NamedQuery(name="PassingStatus.findAll", query="SELECT p FROM PassingStatus p")
public class PassingStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	private int category;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String name;

	@Column(name="policy_id")
	private BigInteger policyId;

	@Column(nullable=false)
	private byte signalStatus;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	private BigInteger userDevice_id;

	public PassingStatus() {
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

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
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

	public BigInteger getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(BigInteger policyId) {
		this.policyId = policyId;
	}

	public byte getSignalStatus() {
		return this.signalStatus;
	}

	public void setSignalStatus(byte signalStatus) {
		this.signalStatus = signalStatus;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public BigInteger getUserDevice_id() {
		return this.userDevice_id;
	}

	public void setUserDevice_id(BigInteger userDevice_id) {
		this.userDevice_id = userDevice_id;
	}

}