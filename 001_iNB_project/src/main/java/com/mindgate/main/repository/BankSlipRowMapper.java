package com.mindgate.main.repository;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;

import com.mindgate.main.domain.BankSlip;


public class BankSlipRowMapper implements RowMapper<BankSlip>{

	@Override
	public BankSlip mapRow(ResultSet rs, int rowNum) throws SQLException {
		String slipdate = rs.getString("slip_date");
		String accountid = rs.getString("account_id");
		String chequeno = rs.getString("cheque_no");
		String chequedate = rs.getString("cheque_date");
		String payerbank = rs.getString("payer_bank");
		String payeraccountid = rs.getString("payer_account_id");
		int amount = rs.getInt("amount");
		String slipstatus = rs.getString("slip_status");
		
		BankSlip bankSlip = new BankSlip(slipdate,accountid,chequeno, chequedate,payerbank,payeraccountid,amount,slipstatus);
		
		
		return bankSlip;
	}
}
