package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the MdmLog database table.
 * 
 */
@Entity
@Table(name="MdmLog")
@NamedQuery(name="MdmLog.findAll", query="SELECT m FROM MdmLog m")
public class MdmLog implements Serializable {
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
	private byte[] handlerArgs;

	@Column(length=255)
	private String logClass_code;

	@Column(name="manager_id")
	private BigInteger managerId;

	@Lob
	private String message;

	@Lob
	private byte[] messageArgs;

	@Column(length=255)
	private String name;

	@Lob
	private String result;

	@Column(nullable=false)
	private int severity;

	private BigInteger sourceDevice_id;

	@Column(length=255)
	private String sourceIp;

	@Column(nullable=false)
	private int sourceType;

	private BigInteger sourceUser_id;

	@Column(nullable=false)
	private int status;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	public MdmLog() {
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

	public byte[] getHandlerArgs() {
		return this.handlerArgs;
	}

	public void setHandlerArgs(byte[] handlerArgs) {
		this.handlerArgs = handlerArgs;
	}

	public String getLogClass_code() {
		return this.logClass_code;
	}

	public void setLogClass_code(String logClass_code) {
		this.logClass_code = logClass_code;
	}

	public BigInteger getManagerId() {
		return this.managerId;
	}

	public void setManagerId(BigInteger managerId) {
		this.managerId = managerId;
	}

	public String getMessage() {
		return this.message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public byte[] getMessageArgs() {
		return this.messageArgs;
	}

	public void setMessageArgs(byte[] messageArgs) {
		this.messageArgs = messageArgs;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getResult() {
		return this.result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getSeverity() {
		return this.severity;
	}

	public void setSeverity(int severity) {
		this.severity = severity;
	}

	public BigInteger getSourceDevice_id() {
		return this.sourceDevice_id;
	}

	public void setSourceDevice_id(BigInteger sourceDevice_id) {
		this.sourceDevice_id = sourceDevice_id;
	}

	public String getSourceIp() {
		return this.sourceIp;
	}

	public void setSourceIp(String sourceIp) {
		this.sourceIp = sourceIp;
	}

	public int getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(int sourceType) {
		this.sourceType = sourceType;
	}

	public BigInteger getSourceUser_id() {
		return this.sourceUser_id;
	}

	public void setSourceUser_id(BigInteger sourceUser_id) {
		this.sourceUser_id = sourceUser_id;
	}

	public int getStatus() {
		return this.status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}