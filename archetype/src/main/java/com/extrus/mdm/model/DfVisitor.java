package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the DF_VISITOR database table.
 * 
 */
@Entity
@Table(name="DF_VISITOR")
@NamedQuery(name="DfVisitor.findAll", query="SELECT d FROM DfVisitor d")
public class DfVisitor implements Serializable {
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
	private String companyName;

	private int complete;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String deptName;

	@Column(name="device_id", nullable=false)
	private BigInteger deviceId;

	@Column(length=255)
	private String email;

	@Column(length=255)
	private String employeeCompany;

	@Column(length=255)
	private String employeeDeptName;

	@Column(length=255)
	private String employeeName;

	@Column(length=255)
	private String employeePosition;

	@Column(nullable=false)
	private int externalVisitNo;

	@Column(length=255)
	private String name;

	@Column(name="policy_id")
	private BigInteger policyId;

	@Column(length=255)
	private String position;

	@Temporal(TemporalType.TIMESTAMP)
	private Date scheduledTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	private int visitorActionType;

	@Column(length=255)
	private String visitorDeptName;

	private int visitorType;

	public DfVisitor() {
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

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public int getComplete() {
		return this.complete;
	}

	public void setComplete(int complete) {
		this.complete = complete;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public BigInteger getDeviceId() {
		return this.deviceId;
	}

	public void setDeviceId(BigInteger deviceId) {
		this.deviceId = deviceId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getEmployeeCompany() {
		return this.employeeCompany;
	}

	public void setEmployeeCompany(String employeeCompany) {
		this.employeeCompany = employeeCompany;
	}

	public String getEmployeeDeptName() {
		return this.employeeDeptName;
	}

	public void setEmployeeDeptName(String employeeDeptName) {
		this.employeeDeptName = employeeDeptName;
	}

	public String getEmployeeName() {
		return this.employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmployeePosition() {
		return this.employeePosition;
	}

	public void setEmployeePosition(String employeePosition) {
		this.employeePosition = employeePosition;
	}

	public int getExternalVisitNo() {
		return this.externalVisitNo;
	}

	public void setExternalVisitNo(int externalVisitNo) {
		this.externalVisitNo = externalVisitNo;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getPolicyId() {
		return this.policyId;
	}

	public void setPolicyId(BigInteger policyId) {
		this.policyId = policyId;
	}

	public String getPosition() {
		return this.position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public Date getScheduledTime() {
		return this.scheduledTime;
	}

	public void setScheduledTime(Date scheduledTime) {
		this.scheduledTime = scheduledTime;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getVisitorActionType() {
		return this.visitorActionType;
	}

	public void setVisitorActionType(int visitorActionType) {
		this.visitorActionType = visitorActionType;
	}

	public String getVisitorDeptName() {
		return this.visitorDeptName;
	}

	public void setVisitorDeptName(String visitorDeptName) {
		this.visitorDeptName = visitorDeptName;
	}

	public int getVisitorType() {
		return this.visitorType;
	}

	public void setVisitorType(int visitorType) {
		this.visitorType = visitorType;
	}

}