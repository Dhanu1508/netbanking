package com.mindgate.main.domain;

public class BankSlip {
	private String slipdate;
	private String accountid;
	private String chequeno;
	private String chequedate;
	private String payerbank;
	private String payeraccountid;
	private int amount;
    private String slipstatus;
    
    
     public BankSlip() {
		// TODO Auto-generated constructor stub
	}


	public BankSlip(String slipdate, String accountid, String chequeno, String chequedate, String payerbank,
			String payeraccountid, int amount, String slipstatus) {
		super();
		this.slipdate = slipdate;
		this.accountid = accountid;
		this.chequeno = chequeno;
		this.chequedate = chequedate;
		this.payerbank = payerbank;
		this.payeraccountid = payeraccountid;
		this.amount = amount;
		this.slipstatus = slipstatus;
	}


	public String getSlipdate() {
		return slipdate;
	}


	public void setSlipdate(String slipdate) {
		this.slipdate = slipdate;
	}


	public String getAccountid() {
		return accountid;
	}


	public void setAccountid(String accountid) {
		this.accountid = accountid;
	}


	public String getChequeno() {
		return chequeno;
	}


	public void setChequeno(String chequeno) {
		this.chequeno = chequeno;
	}


	public String getChequedate() {
		return chequedate;
	}


	public void setChequedate(String chequedate) {
		this.chequedate = chequedate;
	}


	public String getPayerbank() {
		return payerbank;
	}


	public void setPayerbank(String payerbank) {
		this.payerbank = payerbank;
	}


	public String getPayeraccountid() {
		return payeraccountid;
	}


	public void setPayeraccountid(String payeraccountid) {
		this.payeraccountid = payeraccountid;
	}


	public int getAmount() {
		return amount;
	}


	public void setAmount(int amount) {
		this.amount = amount;
	}


	public String getSlipstatus() {
		return slipstatus;
	}


	public void setSlipstatus(String slipstatus) {
		this.slipstatus = slipstatus;
	}


	@Override
	public String toString() {
		return "BankSlip [slipdate=" + slipdate + ", accountid=" + accountid + ", chequeno=" + chequeno
				+ ", chequedate=" + chequedate + ", payerbank=" + payerbank + ", payeraccountid=" + payeraccountid
				+ ", amount=" + amount + ", slipstatus=" + slipstatus + "]";
	}
     
}

	