package com.ibm.user.entities;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Payments {

	@Id
	private int id;
	private String txnType;
	private double amount;
	private String remarks;
	private String trainingId;
	private String paidTo;

	
	public Payments(int id, String txnType, double amount, String remarks, String trainingId,
			String paidTo) {
		super();
		this.id = id;
		this.txnType = txnType;
		this.amount = amount;
		this.remarks = remarks;
		this.trainingId = trainingId;
		this.paidTo = paidTo;
	}

	public Payments() {
//	super();
}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTxnType() {
		return txnType;
	}

	public void setTxnType(String txnType) {
		this.txnType = txnType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

	public String getTrainingId() {
		return trainingId;
	}

	public void setTrainingId(String trainingId) {
		this.trainingId = trainingId;
	}


	public String getPaidTo() {
		return paidTo;
	}

	public void setPaidTo(String paidTo) {
		this.paidTo = paidTo;
	}
	
	

}
