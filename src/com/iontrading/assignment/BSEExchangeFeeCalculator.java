package com.iontrading.assignment;

public class BSEExchangeFeeCalculator extends FeeCalculator {

	@Override
	double calculateFees(Trade trade) {
		// TODO Auto-generated method stub
		if (trade.getQuantity() <= 100) {
			trade.setFees(0.2*trade.getQuantity());
		} else {
			trade.setFees(0.18*trade.getQuantity());
		}
		return trade.getFees();
	}

}
