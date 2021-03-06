package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the LostHistory database table.
 * 
 */
@Entity
@Table(name="LostHistory")
@NamedQuery(name="LostHistory.findAll", query="SELECT l FROM LostHistory l")
public class LostHistory implements Serializable {
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
	private String commant;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String name;

	@Column(name="reporter_id")
	private BigInteger reporterId;

	private int type;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	private BigInteger userDevice_id;

	public LostHistory() {
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

	public String getCommant() {
		return this.commant;
	}

	public void setCommant(String commant) {
		this.commant = commant;
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

	public BigInteger getReporterId() {
		return this.reporterId;
	}

	public void setReporterId(BigInteger reporterId) {
		this.reporterId = reporterId;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
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