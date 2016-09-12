package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the MDMPPCONT database table.
 * 
 */
@Entity
@Table(name="MDMPPCONT")
@NamedQuery(name="Mdmppcont.findAll", query="SELECT m FROM Mdmppcont m")
public class Mdmppcont implements Serializable {
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

	@Column(length=255)
	private String name;

	private BigInteger passingCondition_id;

	private int passingType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public Mdmppcont() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getPassingCondition_id() {
		return this.passingCondition_id;
	}

	public void setPassingCondition_id(BigInteger passingCondition_id) {
		this.passingCondition_id = passingCondition_id;
	}

	public int getPassingType() {
		return this.passingType;
	}

	public void setPassingType(int passingType) {
		this.passingType = passingType;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}