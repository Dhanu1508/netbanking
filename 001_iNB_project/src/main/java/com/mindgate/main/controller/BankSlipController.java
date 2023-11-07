package com.mindgate.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.mindgate.main.domain.BankSlip;

import com.mindgate.main.service.BankSlipServiceInterface;

@RestController
@RequestMapping("bankslipapi")
@CrossOrigin("*")
public class BankSlipController {
	@Autowired
	private BankSlipServiceInterface  bankSlipServiceInterface;
	
	//https://localhost:8081/bankslipapi/bankslips
	@RequestMapping(value="bankslips",method=RequestMethod.GET)
	public List<BankSlip> getallbankslip(){
		System.out.println("Get all");
		return bankSlipServiceInterface.getallbankslip();
	
}
	//https://localhost:8081/bankslipapi/bankslips/1000
	@RequestMapping(value="bankslips/{chequeno}", method = RequestMethod.GET)
	public BankSlip getbankslipbychequeno(@PathVariable String chequeno){
		return bankSlipServiceInterface.getbankslipbychequeno(chequeno);
	}
	
	//https://localhost:8081/bankslipapi/bankslips/1000
	@RequestMapping(value="bankslips/{chequeno}", method = RequestMethod.DELETE)
	public boolean deletebankslipbychequeno(@PathVariable String chequeno) {
		return bankSlipServiceInterface.deletebankslip(chequeno);
	}
	
	// http://localhost:8082/bankslipapi/bankslips/bankslip
		@RequestMapping(value = "bankslips/bankslip", method = RequestMethod.POST)
		public boolean addnewbankslip(@RequestBody BankSlip bankslip) {
			return bankSlipServiceInterface.addnewbankslip(bankslip);
		}
		
		// http://localhost:8082/bankslipapi/bankslips/bankslip
		@RequestMapping(value = "bankslips/bankslip", method = RequestMethod.PUT)
		public BankSlip updateBankslip(@RequestBody BankSlip bankslip) {
			System.out.println(bankslip);
			return bankSlipServiceInterface.updatebankslipbyslipstatus(bankslip);
		}

}
 