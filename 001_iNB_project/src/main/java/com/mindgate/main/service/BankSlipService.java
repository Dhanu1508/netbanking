package com.mindgate.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mindgate.main.domain.BankSlip;
import com.mindgate.main.repository.BankSlipRepositoryInterface;
@Service
public class BankSlipService implements BankSlipServiceInterface {
	
	@Autowired
	private BankSlipRepositoryInterface banksliprepositoryInterface;

	@Override
	public boolean addnewbankslip(BankSlip bankslip) {	
		return banksliprepositoryInterface.addnewbankslip(bankslip);
	}

	@Override
	public BankSlip updatebankslipbyslipstatus(BankSlip bankSlip) {
		
		return banksliprepositoryInterface.updatebankslipbyslipstatus(bankSlip);
	}

	@Override
	public BankSlip getbankslipbychequeno(String chequeno) {
		return banksliprepositoryInterface.getbankslipbychequeno(chequeno);
	}

	@Override
	public boolean deletebankslip(String chequeno) {
		return banksliprepositoryInterface.deletebankslip(chequeno);
	}

	@Override
	public List<BankSlip> getallbankslip() {
		
		return banksliprepositoryInterface.getallbankslip();
	}

}
