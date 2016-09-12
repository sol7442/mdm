package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the MDMPTGTMDL database table.
 * 
 */
@Entity
@Table(name="MDMPTGTMDL")
@NamedQuery(name="Mdmptgtmdl.findAll", query="SELECT m FROM Mdmptgtmdl m")
public class Mdmptgtmdl implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	private BigInteger mdmPolicy_id;

	@Column(length=255)
	private String name;

	@Column(nullable=false)
	private BigInteger targetId;

	private int targetType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public Mdmptgtmdl() {
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

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public BigInteger getMdmPolicy_id() {
		return this.mdmPolicy_id;
	}

	public void setMdmPolicy_id(BigInteger mdmPolicy_id) {
		this.mdmPolicy_id = mdmPolicy_id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getTargetId() {
		return this.targetId;
	}

	public void setTargetId(BigInteger targetId) {
		this.targetId = targetId;
	}

	public int getTargetType() {
		return this.targetType;
	}

	public void setTargetType(int targetType) {
		this.targetType = targetType;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}