package com.iontrading.assignment;
import java.util.HashMap;

public class SaveTrades {
	public void saveTrade(Trade trade, HashMap<Integer, Trade> map) {
		map.put(trade.getId(), trade);
	}
}
