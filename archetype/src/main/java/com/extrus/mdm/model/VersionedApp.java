package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the VersionedApp database table.
 * 
 */
@Entity
@Table(name="VersionedApp")
@NamedQuery(name="VersionedApp.findAll", query="SELECT v FROM VersionedApp v")
public class VersionedApp implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false)
	private String id;

	@Column(length=255)
	private String aliasGroup;

	@Column(length=255)
	private String binaryFilePath;

	private int category;

	private byte isAllowedUse;

	private byte isInstalledApp;

	private byte isOfficeApp;

	@Column(length=255)
	private String plistFilePath;

	@Column(length=255)
	private String tag;

	@Column(nullable=false, length=255)
	private String versionName;

	public VersionedApp() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAliasGroup() {
		return this.aliasGroup;
	}

	public void setAliasGroup(String aliasGroup) {
		this.aliasGroup = aliasGroup;
	}

	public String getBinaryFilePath() {
		return this.binaryFilePath;
	}

	public void setBinaryFilePath(String binaryFilePath) {
		this.binaryFilePath = binaryFilePath;
	}

	public int getCategory() {
		return this.category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public byte getIsAllowedUse() {
		return this.isAllowedUse;
	}

	public void setIsAllowedUse(byte isAllowedUse) {
		this.isAllowedUse = isAllowedUse;
	}

	public byte getIsInstalledApp() {
		return this.isInstalledApp;
	}

	public void setIsInstalledApp(byte isInstalledApp) {
		this.isInstalledApp = isInstalledApp;
	}

	public byte getIsOfficeApp() {
		return this.isOfficeApp;
	}

	public void setIsOfficeApp(byte isOfficeApp) {
		this.isOfficeApp = isOfficeApp;
	}

	public String getPlistFilePath() {
		return this.plistFilePath;
	}

	public void setPlistFilePath(String plistFilePath) {
		this.plistFilePath = plistFilePath;
	}

	public String getTag() {
		return this.tag;
	}

	public void setTag(String tag) {
		this.tag = tag;
	}

	public String getVersionName() {
		return this.versionName;
	}

	public void setVersionName(String versionName) {
		this.versionName = versionName;
	}

}