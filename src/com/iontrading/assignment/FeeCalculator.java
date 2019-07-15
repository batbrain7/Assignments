package com.iontrading.assignment;
public abstract class FeeCalculator {
	
	public final void validate(Trade trade) {
		
		if (trade.getQuantity() < 1000 && trade.getQuantity() >= 0)
		{
			double fees = calculateFees(trade);
			trade.setFees(fees);
		} else {
			System.out.println("Trade not passed as the quantity is  : " + trade.getQuantity());
		}
	}
	
	abstract double calculateFees(Trade trade);
	
}
