package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the Pkcs12Certificate database table.
 * 
 */
@Entity
@Table(name="Pkcs12Certificate")
@NamedQuery(name="Pkcs12Certificate.findAll", query="SELECT p FROM Pkcs12Certificate p")
public class Pkcs12Certificate implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	private BigInteger actionCompany;

	@Column(length=255)
	private String actionSource;

	private BigInteger actionTime;

	private BigInteger actionUser;

	@Column(name="company_id", nullable=false)
	private BigInteger companyId;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String hash;

	@Column(nullable=false)
	private byte isCertificate;

	@Column(nullable=false)
	private byte isTerminated;

	@Column(length=255)
	private String name;

	@Temporal(TemporalType.TIMESTAMP)
	private Date notAfterDate;

	@Temporal(TemporalType.TIMESTAMP)
	private Date notBeforeDate;

	@Column(length=255)
	private String password;

	@Lob
	private byte[] pkcs12Data;

	@Column(nullable=false)
	private BigInteger serialNumber;

	@Column(length=255)
	private String subjectDn;

	private int type;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public Pkcs12Certificate() {
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

	public String getHash() {
		return this.hash;
	}

	public void setHash(String hash) {
		this.hash = hash;
	}

	public byte getIsCertificate() {
		return this.isCertificate;
	}

	public void setIsCertificate(byte isCertificate) {
		this.isCertificate = isCertificate;
	}

	public byte getIsTerminated() {
		return this.isTerminated;
	}

	public void setIsTerminated(byte isTerminated) {
		this.isTerminated = isTerminated;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getNotAfterDate() {
		return this.notAfterDate;
	}

	public void setNotAfterDate(Date notAfterDate) {
		this.notAfterDate = notAfterDate;
	}

	public Date getNotBeforeDate() {
		return this.notBeforeDate;
	}

	public void setNotBeforeDate(Date notBeforeDate) {
		this.notBeforeDate = notBeforeDate;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public byte[] getPkcs12Data() {
		return this.pkcs12Data;
	}

	public void setPkcs12Data(byte[] pkcs12Data) {
		this.pkcs12Data = pkcs12Data;
	}

	public BigInteger getSerialNumber() {
		return this.serialNumber;
	}

	public void setSerialNumber(BigInteger serialNumber) {
		this.serialNumber = serialNumber;
	}

	public String getSubjectDn() {
		return this.subjectDn;
	}

	public void setSubjectDn(String subjectDn) {
		this.subjectDn = subjectDn;
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

}