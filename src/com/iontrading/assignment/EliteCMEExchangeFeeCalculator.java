package com.iontrading.assignment;

public class EliteCMEExchangeFeeCalculator extends FeeCalculator {

	@Override
	double calculateFees(Trade trade) {
		// TODO Auto-generated method stub
		trade.setFees(1.2);
		return trade.getFees();
	}

}
