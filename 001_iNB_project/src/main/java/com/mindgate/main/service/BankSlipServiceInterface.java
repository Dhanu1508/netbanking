package com.mindgate.main.service;

import java.util.List;

import com.mindgate.main.domain.BankSlip;

public interface BankSlipServiceInterface {
	public boolean addnewbankslip(BankSlip bankslip);
	public BankSlip updatebankslipbyslipstatus(BankSlip bankslip);
	public BankSlip getbankslipbychequeno(String chequeno);
	public boolean deletebankslip(String chequeno);
	public List<BankSlip> getallbankslip();
}
