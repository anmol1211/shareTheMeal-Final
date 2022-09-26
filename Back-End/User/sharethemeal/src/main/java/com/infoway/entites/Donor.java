package com.infoway.entites;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="donor")
public class Donor {
	 
	@Id
	 private int rid;
	 private String rname;      
	 private String raddr;      
	 private String rphone;     
	 private String remail;     
	 private String rpassword;  
	 private int citypincode;
//	 @OneToMany(mappedBy = "donor")
//	 private List<Food> foodList;
	 
	 
	 public Donor() {
		// TODO Auto-generated constructor stub
//		 this.foodList= new ArrayList<Food>();
	}


	public Donor(int rid, String rname, String raddr, String rphone, String remail, String rpassword, int citypincode) {
		//super();
		this.rid = rid;
		this.rname = rname;
		this.raddr = raddr;
		this.rphone = rphone;
		this.remail = remail;
		this.rpassword = rpassword;
		this.citypincode = citypincode;
	}
	
	


//	public List<Food> getFoodList() {
//		return foodList;
//	}
//
//
//	public void setFoodList(List<Food> foodList) {
//		this.foodList = foodList;
//	}


//	public Donor(int rid, String rname, String raddr, String rphone, String remail, String rpassword, int citypincode,
//			List<Food> foodList) {
//		super();
//		this.rid = rid;
//		this.rname = rname;
//		this.raddr = raddr;
//		this.rphone = rphone;
//		this.remail = remail;
//		this.rpassword = rpassword;
//		this.citypincode = citypincode;
//		//this.foodList = foodList;
//	}


	public int getRid() {
		return rid;
	}


	public void setRid(int rid) {
		this.rid = rid;
	}


	public String getRname() {
		return rname;
	}


	public void setRname(String rname) {
		this.rname = rname;
	}


	public String getRaddr() {
		return raddr;
	}


	public void setRaddr(String raddr) {
		this.raddr = raddr;
	}


	public String getRphone() {
		return rphone;
	}


	public void setRphone(String rphone) {
		this.rphone = rphone;
	}


	public String getRemail() {
		return remail;
	}


	public void setRemail(String remail) {
		this.remail = remail;
	}


	public String getRpassword() {
		return rpassword;
	}


	public void setRpassword(String rpassword) {
		this.rpassword = rpassword;
	}


	public int getCitypincode() {
		return citypincode;
	}


	public void setCitypincode(int citypincode) {
		this.citypincode = citypincode;
	}


	@Override
	public String toString() {
		return "Donor [rid=" + rid + ", rname=" + rname + ", raddr=" + raddr + ", rphone=" + rphone + ", remail="
				+ remail + ", rpassword=" + rpassword + ", citypincode=" + citypincode + "]";
	}
	 
	 
	 

}
