package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the Dvc database table.
 * 
 */
@Entity
@Table(name="Dvc")
@NamedQuery(name="Dvc.findAll", query="SELECT d FROM Dvc d")
public class Dvc implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	@Column(length=255)
	private String code;

	@Column(length=255)
	private String path;

	private int type;

	@Column(nullable=false)
	private byte used;

	public Dvc() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public int getType() {
		return this.type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public byte getUsed() {
		return this.used;
	}

	public void setUsed(byte used) {
		this.used = used;
	}

}