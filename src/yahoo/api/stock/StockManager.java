package yahoo.api.stock;

import java.io.IOException;
import java.math.BigDecimal;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.quotes.stock.StockQuote;

public class StockManager {
	private Stock stock;
	private StockQuote stockQuote;
	private BigDecimal stockPrice;
	
	
	public StockManager(String stockTicker) throws IOException
	{
		stock = YahooFinance.get(stockTicker);
		stockQuote = stock.getQuote();
		
	}
	
	public void subscribeToPrice()
	{
		
	}
	
	
	
	public  StockQuote getStockQuote() {
		return stockQuote;
	}
	
	public Stock getStock() {
		return stock;
	}
}
