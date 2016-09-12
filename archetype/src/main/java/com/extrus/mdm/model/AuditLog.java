package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the AuditLog database table.
 * 
 */
@Entity
@Table(name="AuditLog")
@NamedQuery(name="AuditLog.findAll", query="SELECT a FROM AuditLog a")
public class AuditLog implements Serializable {
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

	@Lob
	private String difference;

	@Lob
	private String differenceView;

	@Column(length=255)
	private String entityName;

	@Column(length=255)
	private String name;

	private int operation;

	@Lob
	private String originalEntity;

	@Lob
	private String originalEntityView;

	@Column(length=255)
	private String sourceIp;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@Column(name="who_id")
	private BigInteger whoId;

	public AuditLog() {
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

	public String getDifference() {
		return this.difference;
	}

	public void setDifference(String difference) {
		this.difference = difference;
	}

	public String getDifferenceView() {
		return this.differenceView;
	}

	public void setDifferenceView(String differenceView) {
		this.differenceView = differenceView;
	}

	public String getEntityName() {
		return this.entityName;
	}

	public void setEntityName(String entityName) {
		this.entityName = entityName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getOperation() {
		return this.operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	public String getOriginalEntity() {
		return this.originalEntity;
	}

	public void setOriginalEntity(String originalEntity) {
		this.originalEntity = originalEntity;
	}

	public String getOriginalEntityView() {
		return this.originalEntityView;
	}

	public void setOriginalEntityView(String originalEntityView) {
		this.originalEntityView = originalEntityView;
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public BigInteger getWhoId() {
		return this.whoId;
	}

	public void setWhoId(BigInteger whoId) {
		this.whoId = whoId;
	}

}