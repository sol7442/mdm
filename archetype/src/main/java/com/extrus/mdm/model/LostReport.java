package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the LostReport database table.
 * 
 */
@Entity
@Table(name="LostReport")
@NamedQuery(name="LostReport.findAll", query="SELECT l FROM LostReport l")
public class LostReport implements Serializable {
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

	private int isCallLock;

	private int isDeletedData;

	private int isLocation;

	private int isLocked;

	private int isResetPasswd;

	private int isTraceCall;

	private int isWipe;

	@Column(length=255)
	private String name;

	private int statusCode;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	private BigInteger userDeviceId_id;

	public LostReport() {
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

	public int getIsCallLock() {
		return this.isCallLock;
	}

	public void setIsCallLock(int isCallLock) {
		this.isCallLock = isCallLock;
	}

	public int getIsDeletedData() {
		return this.isDeletedData;
	}

	public void setIsDeletedData(int isDeletedData) {
		this.isDeletedData = isDeletedData;
	}

	public int getIsLocation() {
		return this.isLocation;
	}

	public void setIsLocation(int isLocation) {
		this.isLocation = isLocation;
	}

	public int getIsLocked() {
		return this.isLocked;
	}

	public void setIsLocked(int isLocked) {
		this.isLocked = isLocked;
	}

	public int getIsResetPasswd() {
		return this.isResetPasswd;
	}

	public void setIsResetPasswd(int isResetPasswd) {
		this.isResetPasswd = isResetPasswd;
	}

	public int getIsTraceCall() {
		return this.isTraceCall;
	}

	public void setIsTraceCall(int isTraceCall) {
		this.isTraceCall = isTraceCall;
	}

	public int getIsWipe() {
		return this.isWipe;
	}

	public void setIsWipe(int isWipe) {
		this.isWipe = isWipe;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getStatusCode() {
		return this.statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public BigInteger getUserDeviceId_id() {
		return this.userDeviceId_id;
	}

	public void setUserDeviceId_id(BigInteger userDeviceId_id) {
		this.userDeviceId_id = userDeviceId_id;
	}

}