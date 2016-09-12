package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the ReservedVisitor database table.
 * 
 */
@Entity
@Table(name="ReservedVisitor")
@NamedQuery(name="ReservedVisitor.findAll", query="SELECT r FROM ReservedVisitor r")
public class ReservedVisitor implements Serializable {
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

	@Column(name="company_id")
	private BigInteger companyId;

	@Column(length=255)
	private String companyName;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String deptName;

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

	private int isVisiting;

	@Column(length=255)
	private String name;

	@Column(length=255)
	private String phoneNumber;

	@Column(length=255)
	private String position;

	@Temporal(TemporalType.TIMESTAMP)
	private Date scheduledTime;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@Column(name="visitor_id")
	private BigInteger visitorId;

	@Column(length=255)
	private String visitorDeptName;

	private int visitType;

	public ReservedVisitor() {
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

	public BigInteger getCompanyId() {
		return this.companyId;
	}

	public void setCompanyId(BigInteger companyId) {
		this.companyId = companyId;
	}

	public String getCompanyName() {
		return this.companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
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

	public int getIsVisiting() {
		return this.isVisiting;
	}

	public void setIsVisiting(int isVisiting) {
		this.isVisiting = isVisiting;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNumber() {
		return this.phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
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

	public BigInteger getVisitorId() {
		return this.visitorId;
	}

	public void setVisitorId(BigInteger visitorId) {
		this.visitorId = visitorId;
	}

	public String getVisitorDeptName() {
		return this.visitorDeptName;
	}

	public void setVisitorDeptName(String visitorDeptName) {
		this.visitorDeptName = visitorDeptName;
	}

	public int getVisitType() {
		return this.visitType;
	}

	public void setVisitType(int visitType) {
		this.visitType = visitType;
	}

}