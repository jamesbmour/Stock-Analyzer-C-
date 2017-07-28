package yahoo.api.stock;

import java.io.IOException;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;

public class StockSubscriptionManager extends Thread
{
	private final Stock stock;
	private final DataHandler dataHandler;
	public StockSubscriptionManager(Stock yahooStock, DataHandler dataHandler) {
		stock = yahooStock;
		this.dataHandler = dataHandler;		
	}
		
	
	
	
}
