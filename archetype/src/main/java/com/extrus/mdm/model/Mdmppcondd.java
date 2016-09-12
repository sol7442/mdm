package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the MDMPPCONDD database table.
 * 
 */
@Entity
@Table(name="MDMPPCONDD")
@NamedQuery(name="Mdmppcondd.findAll", query="SELECT m FROM Mdmppcondd m")
public class Mdmppcondd implements Serializable {
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
	private String definition;

	@Lob
	private String expression;

	@Column(length=255)
	private String name;

	private int passingCategory;

	private BigInteger passingCondition_id;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	private int useType;

	public Mdmppcondd() {
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

	public String getDefinition() {
		return this.definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getExpression() {
		return this.expression;
	}

	public void setExpression(String expression) {
		this.expression = expression;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPassingCategory() {
		return this.passingCategory;
	}

	public void setPassingCategory(int passingCategory) {
		this.passingCategory = passingCategory;
	}

	public BigInteger getPassingCondition_id() {
		return this.passingCondition_id;
	}

	public void setPassingCondition_id(BigInteger passingCondition_id) {
		this.passingCondition_id = passingCondition_id;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public int getUseType() {
		return this.useType;
	}

	public void setUseType(int useType) {
		this.useType = useType;
	}

}