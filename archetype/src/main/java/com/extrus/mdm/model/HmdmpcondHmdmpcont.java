package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the HMDMPCOND_HMDMPCONT database table.
 * 
 */
@Entity
@Table(name="HMDMPCOND_HMDMPCONT")
@NamedQuery(name="HmdmpcondHmdmpcont.findAll", query="SELECT h FROM HmdmpcondHmdmpcont h")
public class HmdmpcondHmdmpcont implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="controls_id", nullable=false)
	private BigInteger controlsId;

	@Id
	@Column(nullable=false)
	private BigInteger HMDMPCOND_id;

	public HmdmpcondHmdmpcont() {
	}

	public BigInteger getControlsId() {
		return this.controlsId;
	}

	public void setControlsId(BigInteger controlsId) {
		this.controlsId = controlsId;
	}

	public BigInteger getHMDMPCOND_id() {
		return this.HMDMPCOND_id;
	}

	public void setHMDMPCOND_id(BigInteger HMDMPCOND_id) {
		this.HMDMPCOND_id = HMDMPCOND_id;
	}

}