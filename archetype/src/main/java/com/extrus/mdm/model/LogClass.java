package com.extrus.mdm.model;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the LogClass database table.
 * 
 */
@Entity
@Table(name="LogClass")
@NamedQuery(name="LogClass.findAll", query="SELECT l FROM LogClass l")
public class LogClass implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(unique=true, nullable=false, length=255)
	private String code;

	private int defaultSeverity;

	@Column(length=255)
	private String issueHandlerFMC;

	@Column(length=255)
	private String issueHandlerFS;

	@Column(length=255)
	private String issueStatusCheckScript;

	@Column(length=255)
	private String issueUrlFormat;

	private int sourceType;

	public LogClass() {
	}

	public String getCode() {
		return this.code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getDefaultSeverity() {
		return this.defaultSeverity;
	}

	public void setDefaultSeverity(int defaultSeverity) {
		this.defaultSeverity = defaultSeverity;
	}

	public String getIssueHandlerFMC() {
		return this.issueHandlerFMC;
	}

	public void setIssueHandlerFMC(String issueHandlerFMC) {
		this.issueHandlerFMC = issueHandlerFMC;
	}

	public String getIssueHandlerFS() {
		return this.issueHandlerFS;
	}

	public void setIssueHandlerFS(String issueHandlerFS) {
		this.issueHandlerFS = issueHandlerFS;
	}

	public String getIssueStatusCheckScript() {
		return this.issueStatusCheckScript;
	}

	public void setIssueStatusCheckScript(String issueStatusCheckScript) {
		this.issueStatusCheckScript = issueStatusCheckScript;
	}

	public String getIssueUrlFormat() {
		return this.issueUrlFormat;
	}

	public void setIssueUrlFormat(String issueUrlFormat) {
		this.issueUrlFormat = issueUrlFormat;
	}

	public int getSourceType() {
		return this.sourceType;
	}

	public void setSourceType(int sourceType) {
		this.sourceType = sourceType;
	}

}