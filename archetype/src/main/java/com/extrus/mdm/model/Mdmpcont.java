package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the MDMPCONT database table.
 * 
 */
@Entity
@Table(name="MDMPCONT")
@NamedQuery(name="Mdmpcont.findAll", query="SELECT m FROM Mdmpcont m")
public class Mdmpcont implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	@Column(nullable=false)
	private BigInteger controlClass_id;

	@Column(length=255)
	private String controlValue;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	private BigInteger mdmPolicyCondition_id;

	@Column(length=255)
	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public Mdmpcont() {
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

	public BigInteger getControlClass_id() {
		return this.controlClass_id;
	}

	public void setControlClass_id(BigInteger controlClass_id) {
		this.controlClass_id = controlClass_id;
	}

	public String getControlValue() {
		return this.controlValue;
	}

	public void setControlValue(String controlValue) {
		this.controlValue = controlValue;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public BigInteger getMdmPolicyCondition_id() {
		return this.mdmPolicyCondition_id;
	}

	public void setMdmPolicyCondition_id(BigInteger mdmPolicyCondition_id) {
		this.mdmPolicyCondition_id = mdmPolicyCondition_id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}