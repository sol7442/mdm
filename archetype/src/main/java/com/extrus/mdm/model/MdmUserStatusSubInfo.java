package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the MDM_USER_STATUS_SUB_INFO database table.
 * 
 */
@Entity
@Table(name="MDM_USER_STATUS_SUB_INFO")
@NamedQuery(name="MdmUserStatusSubInfo.findAll", query="SELECT m FROM MdmUserStatusSubInfo m")
public class MdmUserStatusSubInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	@Column(nullable=false, length=255)
	private String uid;

	@Column(nullable=false)
	private BigInteger userStatus_id;

	private int userStatusType;

	public MdmUserStatusSubInfo() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getUid() {
		return this.uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	public BigInteger getUserStatus_id() {
		return this.userStatus_id;
	}

	public void setUserStatus_id(BigInteger userStatus_id) {
		this.userStatus_id = userStatus_id;
	}

	public int getUserStatusType() {
		return this.userStatusType;
	}

	public void setUserStatusType(int userStatusType) {
		this.userStatusType = userStatusType;
	}

}