package com.iontrading.assignment;

public class LMEExchangeFeeCalculator extends FeeCalculator {

	@Override
	double calculateFees(Trade trade) {
		// TODO Auto-generated method stub
		trade.setFees(10);
		return trade.getFees();
	}
}
