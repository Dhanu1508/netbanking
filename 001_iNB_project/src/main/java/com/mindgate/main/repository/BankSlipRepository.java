package com.mindgate.main.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.mindgate.main.domain.BankSlip;
@Repository
public class BankSlipRepository implements BankSlipRepositoryInterface{
	@Autowired
	private JdbcTemplate jdbctemplate;
	
	
	private final static String INSERT_NEW_BANKSLIP = "insert into bank_slip (account_id,cheque_no,cheque_date,payer_bank,payer_account_id,amount,slip_status)values(?,?,?,?,?,?,?)";
	private final static String UPDATE_EXISTING_BANKSLIP = "update bank_slip set slip_status=? where cheque_no=?";
	private final static String DELETE_EXISTING_BANKSLIP = "delete from bank_slip  where cheque_no=?";
	private final static String SELECT_ALL_BANKSLIP ="select * from bank_slip";
	private final static String SELECT_ONE_BANKSLIP ="select * from bank_slip where cheque_no=?";

	@Override
	public boolean addnewbankslip(BankSlip bankslip) {
		System.out.println(bankslip);
		System.out.println("add");
		Object[] parameters = {bankslip.getAccountid(),bankslip.getChequeno(),bankslip.getChequedate(),bankslip.getPayerbank(),
				bankslip.getPayeraccountid(),bankslip.getAmount(),bankslip.getSlipstatus()};
		jdbctemplate.update(INSERT_NEW_BANKSLIP,parameters);
		return true;
	}

	@Override
	public BankSlip updatebankslipbyslipstatus(BankSlip bankslip) {
		Object[] parameters = {bankslip.getSlipstatus(),bankslip.getChequeno()};
		 
		int count = jdbctemplate.update(UPDATE_EXISTING_BANKSLIP,parameters );
		if (count > 0) {

			return getbankslipbychequeno(bankslip.getChequeno());
		}

		return null;
	}
		
	@Override
	public BankSlip getbankslipbychequeno(String chequeno) {
		BankSlipRowMapper bankSlipRowMapper = new BankSlipRowMapper();
		BankSlip bankslip =jdbctemplate.queryForObject(SELECT_ONE_BANKSLIP, bankSlipRowMapper, chequeno);
		return bankslip;
	}

	@Override
	public boolean deletebankslip(String chequeno) {
		int count = jdbctemplate.update(DELETE_EXISTING_BANKSLIP,chequeno);
		if (count > 0) {

			return true;
		} else {
			return false;
		}

	}
	

	@Override
	public List<BankSlip> getallbankslip() {
		System.out.println("Bank slip");
		BankSlipRowMapper bankSlipRowMapper = new BankSlipRowMapper();
		 return jdbctemplate.query(SELECT_ALL_BANKSLIP , bankSlipRowMapper);
	}
	
	
}
