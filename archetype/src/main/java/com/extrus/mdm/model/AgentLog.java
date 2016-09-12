package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the AgentLog database table.
 * 
 */
@Entity
@Table(name="AgentLog")
@NamedQuery(name="AgentLog.findAll", query="SELECT a FROM AgentLog a")
public class AgentLog implements Serializable {
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

	@Column(length=255)
	private String etc;

	@Temporal(TemporalType.TIMESTAMP)
	private Date invokeDate;

	private int levelFlag;

	@Lob
	private String message;

	@Column(length=255)
	private String name;

	@Column(nullable=false)
	private int osType;

	private BigInteger sourceDevice_id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public AgentLog() {
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

	public String getEtc() {
		return this.etc;
	}

	public void setEtc(String etc) {
		this.etc = etc;
	}

	public Date getInvokeDate() {
		return this.invokeDate;
	}

	public void setInvokeDate(Date invokeDate) {
		this.invokeDate = invokeDate;
	}

	public int getLevelFlag() {
		return this.levelFlag;
	}

	public void setLevelFlag(int levelFlag) {
		this.levelFlag = levelFlag;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOsType() {
		return this.osType;
	}

	public void setOsType(int osType) {
		this.osType = osType;
	}

	public BigInteger getSourceDevice_id() {
		return this.sourceDevice_id;
	}

	public void setSourceDevice_id(BigInteger sourceDevice_id) {
		this.sourceDevice_id = sourceDevice_id;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}