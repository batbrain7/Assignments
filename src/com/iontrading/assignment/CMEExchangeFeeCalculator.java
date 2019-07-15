package com.iontrading.assignment;

public class CMEExchangeFeeCalculator extends FeeCalculator {

	@Override
	double calculateFees(Trade trade) {
		// TODO Auto-generated method stub
		
		trade.setFees(2);
		return trade.getFees();
	}
}
