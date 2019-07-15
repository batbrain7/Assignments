package com.iontrading.assignment;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        FeeCalculator feeCalculator;
        Trade trade;
        SaveTrades saveTrades = new SaveTrades();
        PrintTrades printTrades = new PrintTrades();
        Client client;
        Contract contract;
        int id;
        HashMap<Integer, Trade> map = new HashMap<Integer, Trade>();

        // loop starts
        while (true) {
            System.out.println("Enter the Trade ID : ");
            id = sc.nextInt();
            if (id < 0) {
                break;
            }
            System.out.println("Enter the Client id and Account type : ");
            client = new Client(sc.nextInt(), sc.next());
            System.out.println("Enter the Contract id and Exchange : ");
            contract = new Contract(sc.nextInt(), sc.next());
            System.out.println("Enter the verb : ");
            String verb = sc.next();
            System.out.println("Enter the quantity : ");
            int quantity = sc.nextInt();


            trade = new Trade(id, client, contract, verb, quantity);
            if (trade.getContract().getExchange().equalsIgnoreCase("LME")) {
                feeCalculator = new LMEExchangeFeeCalculator();
            } else if (trade.getContract().getExchange().equalsIgnoreCase("CME")) {
                if (trade.getClient().getType().equalsIgnoreCase("ELITE")) {
                    feeCalculator = new EliteCMEExchangeFeeCalculator();
                } else {
                    feeCalculator = new CMEExchangeFeeCalculator();
                }
            } else if (trade.getContract().getExchange().equalsIgnoreCase("BSE")) {
                feeCalculator = new BSEExchangeFeeCalculator();
            } else {
                feeCalculator = null;
            }

            if (feeCalculator != null)
                feeCalculator.validate(trade);

            System.out.println("The fees of the trade is : " + trade.getFees());

            saveTrades.saveTrade(trade, map);
            printTrades.printMap(map);

            System.out.println("Enter a new trade :");

        }
    }
}
