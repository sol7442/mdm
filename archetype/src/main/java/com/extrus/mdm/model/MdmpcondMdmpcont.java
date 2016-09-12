package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the MDMPCOND_MDMPCONT database table.
 * 
 */
@Entity
@Table(name="MDMPCOND_MDMPCONT")
@NamedQuery(name="MdmpcondMdmpcont.findAll", query="SELECT m FROM MdmpcondMdmpcont m")
public class MdmpcondMdmpcont implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="controls_id", nullable=false)
	private BigInteger controlsId;

	@Id
	@Column(nullable=false)
	private BigInteger MDMPCOND_id;

	public MdmpcondMdmpcont() {
	}

	public BigInteger getControlsId() {
		return this.controlsId;
	}

	public void setControlsId(BigInteger controlsId) {
		this.controlsId = controlsId;
	}

	public BigInteger getMDMPCOND_id() {
		return this.MDMPCOND_id;
	}

	public void setMDMPCOND_id(BigInteger MDMPCOND_id) {
		this.MDMPCOND_id = MDMPCOND_id;
	}

}