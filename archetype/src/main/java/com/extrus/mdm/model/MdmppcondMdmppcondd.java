package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the MDMPPCOND_MDMPPCONDD database table.
 * 
 */
@Entity
@Table(name="MDMPPCOND_MDMPPCONDD")
@NamedQuery(name="MdmppcondMdmppcondd.findAll", query="SELECT m FROM MdmppcondMdmppcondd m")
public class MdmppcondMdmppcondd implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(nullable=false)
	private BigInteger conditionDetails_id;

	@Id
	@Column(nullable=false)
	private BigInteger MDMPPCOND_id;

	public MdmppcondMdmppcondd() {
	}

	public BigInteger getConditionDetails_id() {
		return this.conditionDetails_id;
	}

	public void setConditionDetails_id(BigInteger conditionDetails_id) {
		this.conditionDetails_id = conditionDetails_id;
	}

	public BigInteger getMDMPPCOND_id() {
		return this.MDMPPCOND_id;
	}

	public void setMDMPPCOND_id(BigInteger MDMPPCOND_id) {
		this.MDMPPCOND_id = MDMPPCOND_id;
	}

}