package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the AppVerification database table.
 * 
 */
@Entity
@Table(name="AppVerification")
@NamedQuery(name="AppVerification.findAll", query="SELECT a FROM AppVerification a")
public class AppVerification implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	@Column(name="app_id", nullable=false)
	private BigInteger appId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name="dvc_id", nullable=false)
	private BigInteger dvcId;

	@Column(nullable=false)
	private int dvcVerifyTime;

	private int errorCode;

	@Column(length=255)
	private String name;

	@Column(nullable=false)
	private int serverVerifyTime;

	private int status;

	@Column(length=255)
	private String token;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public AppVerification() {
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

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public BigInteger getDvcId() {
		return this.dvcId;
	}

	public void setDvcId(BigInteger dvcId) {
		this.dvcId = dvcId;
	}

	public int getDvcVerifyTime() {
		return this.dvcVerifyTime;
	}

	public void setDvcVerifyTime(int dvcVerifyTime) {
		this.dvcVerifyTime = dvcVerifyTime;
	}

	public int getErrorCode() {
		return this.errorCode;
	}

	public void setErrorCode(int errorCode) {
		this.errorCode = errorCode;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getServerVerifyTime() {
		return this.serverVerifyTime;
	}

	public void setServerVerifyTime(int serverVerifyTime) {
		this.serverVerifyTime = serverVerifyTime;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getToken() {
		return this.token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}