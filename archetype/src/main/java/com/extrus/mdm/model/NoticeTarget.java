package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the NoticeTarget database table.
 * 
 */
@Entity
@Table(name="NoticeTarget")
@NamedQuery(name="NoticeTarget.findAll", query="SELECT n FROM NoticeTarget n")
public class NoticeTarget implements Serializable {
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
	private String name;

	@Column(name="notice_id")
	private BigInteger noticeId;

	@Column(nullable=false)
	private BigInteger targetId;

	private int targetType;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public NoticeTarget() {
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

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getNoticeId() {
		return this.noticeId;
	}

	public void setNoticeId(BigInteger noticeId) {
		this.noticeId = noticeId;
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