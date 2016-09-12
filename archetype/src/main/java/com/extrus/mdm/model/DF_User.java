package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the DF_User database table.
 * 
 */
@Entity
@Table(name="DF_User")
@NamedQuery(name="DF_User.findAll", query="SELECT d FROM DF_User d")
public class DF_User implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	@Column(name="company_id")
	private BigInteger companyId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(name="credential_id")
	private BigInteger credentialId;

	@Column(length=255)
	private String customUserType;

	@Column(name="dept_id")
	private BigInteger deptId;

	@Column(length=255)
	private String email;

	@Column(nullable=false)
	private byte isLock;

	@Column(nullable=false)
	private int isUse;

	@Column(length=255)
	private String lastAccessIp;

	@Column(nullable=false)
	private BigInteger lastAccessTime;

	@Column(nullable=false)
	private int lockCnt;

	@Column(length=255)
	private String membernum;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String password;

	@Temporal(TemporalType.TIMESTAMP)
	private Date passwordChangeDate;

	@Column(length=255)
	private String permAccessIp1;

	@Column(length=255)
	private String permAccessIp2;

	@Column(nullable=false)
	private int roleType;

	@Column(name="title_id")
	private BigInteger titleId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@Column(nullable=false, length=255)
	private String username;

	public DF_User() {
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

	public BigInteger getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(BigInteger companyId) {
		this.companyId = companyId;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public BigInteger getCredentialId() {
		return this.credentialId;
	}

	public void setCredentialId(BigInteger credentialId) {
		this.credentialId = credentialId;
	}

	public String getCustomUserType() {
		return this.customUserType;
	}

	public void setCustomUserType(String customUserType) {
		this.customUserType = customUserType;
	}

	public BigInteger getDeptId() {
		return this.deptId;
	}

	public void setDeptId(BigInteger deptId) {
		this.deptId = deptId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public byte getIsLock() {
		return this.isLock;
	}

	public void setIsLock(byte isLock) {
		this.isLock = isLock;
	}

	public int getIsUse() {
		return this.isUse;
	}

	public void setIsUse(int isUse) {
		this.isUse = isUse;
	}

	public String getLastAccessIp() {
		return this.lastAccessIp;
	}

	public void setLastAccessIp(String lastAccessIp) {
		this.lastAccessIp = lastAccessIp;
	}

	public BigInteger getLastAccessTime() {
		return this.lastAccessTime;
	}

	public void setLastAccessTime(BigInteger lastAccessTime) {
		this.lastAccessTime = lastAccessTime;
	}

	public int getLockCnt() {
		return this.lockCnt;
	}

	public void setLockCnt(int lockCnt) {
		this.lockCnt = lockCnt;
	}

	public String getMembernum() {
		return this.membernum;
	}

	public void setMembernum(String membernum) {
		this.membernum = membernum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getPasswordChangeDate() {
		return this.passwordChangeDate;
	}

	public void setPasswordChangeDate(Date passwordChangeDate) {
		this.passwordChangeDate = passwordChangeDate;
	}

	public String getPermAccessIp1() {
		return this.permAccessIp1;
	}

	public void setPermAccessIp1(String permAccessIp1) {
		this.permAccessIp1 = permAccessIp1;
	}

	public String getPermAccessIp2() {
		return this.permAccessIp2;
	}

	public void setPermAccessIp2(String permAccessIp2) {
		this.permAccessIp2 = permAccessIp2;
	}

	public int getRoleType() {
		return this.roleType;
	}

	public void setRoleType(int roleType) {
		this.roleType = roleType;
	}

	public BigInteger getTitleId() {
		return this.titleId;
	}

	public void setTitleId(BigInteger titleId) {
		this.titleId = titleId;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

}