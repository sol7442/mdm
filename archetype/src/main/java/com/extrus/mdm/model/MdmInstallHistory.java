package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the MdmInstallHistory database table.
 * 
 */
@Entity
@Table(name="MdmInstallHistory")
@NamedQuery(name="MdmInstallHistory.findAll", query="SELECT m FROM MdmInstallHistory m")
public class MdmInstallHistory implements Serializable {
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
	private String authToken;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	private int flag;

	@Column(length=255)
	private String name;

	@Column(name="owner_id")
	private BigInteger ownerId;

	private int reinstall;

	@Column(length=255)
	private String unqKey;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@Column(nullable=false)
	private BigInteger userDeviceId;

	@Column(length=255)
	private String version;

	public MdmInstallHistory() {
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

	public int getFlag() {
		return this.flag;
	}

	public void setFlag(int flag) {
		this.flag = flag;
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

	public int getReinstall() {
		return this.reinstall;
	}

	public void setReinstall(int reinstall) {
		this.reinstall = reinstall;
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

	public BigInteger getUserDeviceId() {
		return this.userDeviceId;
	}

	public void setUserDeviceId(BigInteger userDeviceId) {
		this.userDeviceId = userDeviceId;
	}

	public String getVersion() {
		return this.version;
	}

	public void setVersion(String version) {
		this.version = version;
	}

}