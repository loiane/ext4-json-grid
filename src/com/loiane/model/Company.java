package com.loiane.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.codehaus.jackson.annotate.JsonAutoDetect;
import org.codehaus.jackson.map.annotate.JsonSerialize;

import com.loiane.util.JsonDateSerializer;

/**
 * Company POJO
 * 
 * @author Loiane Groner
 * http://loianegroner.com (English)
 * http://loiane.com (Portuguese)
 */
@JsonAutoDetect
@Entity
@Table(name="COMPANIES")
public class Company {

	@Id
	@GeneratedValue
	@Column(name="COMPANY_ID")
	private int id;
	
	@Column(name="COMPANY_NAME", nullable=false, length=45)
	private String company;
	
	@Column(name="COMPANY_PRICE", nullable=false)
	private double price;
	
	@Column(name="COMPANY_CHANGE", nullable=false)
	private double change;
	
	@Column(name="COMPANY_PCT_CHANGE", nullable=false)
	private double pctChange;
	
	@Column(name="COMPANY_LAST_CHANGE", nullable=false)
	private Date lastChange;
	
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public double getChange() {
		return change;
	}
	public void setChange(double change) {
		this.change = change;
	}
	public double getPctChange() {
		return pctChange;
	}
	public void setPctChange(double pctChange) {
		this.pctChange = pctChange;
	}
	
	@JsonSerialize(using=JsonDateSerializer.class)
	public Date getLastChange() {
		return lastChange;
	}
	public void setLastChange(Date lastChange) {
		this.lastChange = lastChange;
	}
}
