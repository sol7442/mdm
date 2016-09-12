package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the UserDeviceRegInit database table.
 * 
 */
@Entity
@Table(name="UserDeviceRegInit")
@NamedQuery(name="UserDeviceRegInit.findAll", query="SELECT u FROM UserDeviceRegInit u")
public class UserDeviceRegInit implements Serializable {
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
	private String authToken;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	private BigInteger deviceTypeId_id;

	private int initType;

	@Column(length=255)
	private String name;

	@Column(name="owner_id")
	private BigInteger ownerId;

	@Column(length=255)
	private String unqKey;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public UserDeviceRegInit() {
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

	public String getAuthToken() {
		return this.authToken;
	}

	public void setAuthToken(String authToken) {
		this.authToken = authToken;
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

	public int getInitType() {
		return this.initType;
	}

	public void setInitType(int initType) {
		this.initType = initType;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getOwnerId() {
		return this.ownerId;
	}

	public void setOwnerId(BigInteger ownerId) {
		this.ownerId = ownerId;
	}

	public String getUnqKey() {
		return this.unqKey;
	}

	public void setUnqKey(String unqKey) {
		this.unqKey = unqKey;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}