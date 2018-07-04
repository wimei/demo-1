package com.example.demo.entity;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the DEMO database table.
 * 
 */
@Entity
@NamedQuery(name="Demo.findAll", query="SELECT d FROM Demo d")
public class Demo implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="AREA_ID")
	private long areaId;

	@Column(name="AREA_NAME")
	private String areaName;

	@Column(name="CREATE_TIME")
	private String createTime;

	@Column(name="LAST_EDIT_TIME")
	private String lastEditTime;

	private BigDecimal property;

	public Demo() {
	}

	public long getAreaId() {
		return this.areaId;
	}

	public void setAreaId(long areaId) {
		this.areaId = areaId;
	}

	public String getAreaName() {
		return this.areaName;
	}

	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getLastEditTime() {
		return this.lastEditTime;
	}

	public void setLastEditTime(String lastEditTime) {
		this.lastEditTime = lastEditTime;
	}

	public BigDecimal getProperty() {
		return this.property;
	}

	public void setProperty(BigDecimal property) {
		this.property = property;
	}

}