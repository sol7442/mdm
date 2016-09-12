package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.math.BigInteger;


/**
 * The persistent class for the MDMPCONTCLS database table.
 * 
 */
@Entity
@Table(name="MDMPCONTCLS")
@NamedQuery(name="Mdmpcontcl.findAll", query="SELECT m FROM Mdmpcontcl m")
public class Mdmpcontcl implements Serializable {
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
	private String category;

	@Column(length=255)
	private String code;

	@Temporal(TemporalType.TIMESTAMP)
	private Date createDate;

	@Column(length=255)
	private String itemDefaultValue;

	@Column(length=255)
	private String nameCode;

	@Column(nullable=false)
	private int orderInCategory;

	private int platform;

	@Temporal(TemporalType.TIMESTAMP)
	private Date updateDate;

	@Lob
	private String valueType;

	public Mdmpcontcl() {
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

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}

	public String getItemDefaultValue() {
		return this.itemDefaultValue;
	}

	public void setItemDefaultValue(String itemDefaultValue) {
		this.itemDefaultValue = itemDefaultValue;
	}

	public String getNameCode() {
		return this.nameCode;
	}

	public void setNameCode(String nameCode) {
		this.nameCode = nameCode;
	}

	public int getOrderInCategory() {
		return this.orderInCategory;
	}

	public void setOrderInCategory(int orderInCategory) {
		this.orderInCategory = orderInCategory;
	}

	public int getPlatform() {
		return this.platform;
	}

	public void setPlatform(int platform) {
		this.platform = platform;
	}

	public Date getUpdateDate() {
		return this.updateDate;
	}

	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

	public String getValueType() {
		return this.valueType;
	}

	public void setValueType(String valueType) {
		this.valueType = valueType;
	}

}