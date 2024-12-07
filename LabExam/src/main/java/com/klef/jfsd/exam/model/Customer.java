package com.klef.jfsd.exam.model;

import java.sql.Date;
import java.time.LocalDate;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customer_table")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "customer_id")
    private int cid;
    
    @Column(name="customer_name", length=30, nullable=false)
    private String cname;
    
    
    @Column(name = "customer_email",length=30,nullable=false,unique=true)
    private String cemail;
    
    @Column(name="customer_phonenumber", length=10, nullable=false, unique=true)
    private String cphonenumber;
    
    
    @Column(name="customer_address", length=100, nullable=true) // Initially nullable
    private String caddress;
    
    @Column(name="customer_dob", nullable=false)
    private String cdob;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCemail() {
		return cemail;
	}

	public void setCemail(String cemail) {
		this.cemail = cemail;
	}

	public String getCphonenumber() {
		return cphonenumber;
	}

	public void setCphonenumber(String cphonenumber) {
		this.cphonenumber = cphonenumber;
	}

	public String getCaddress() {
		return caddress;
	}

	public void setCaddress(String caddress) {
		this.caddress = caddress;
	}

	public String getCdob() {
		return cdob;
	}

	public void setCdob(String cdob) {
		this.cdob = cdob;
	}

	@Override
	public String toString() {
		return "Customer [cid=" + cid + ", cname=" + cname + ", cemail=" + cemail + ", cphonenumber=" + cphonenumber
				+ ", caddress=" + caddress + ", cdob=" + cdob + "]";
	}

}