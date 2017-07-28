package yahoo.api.stock;

import static org.junit.Assert.*;

import java.io.IOException;
import java.math.BigDecimal;
import java.net.URL;
import java.util.Calendar;
import java.net.HttpURLConnection;
import java.io.BufferedReader;
import java.io.InputStreamReader;

import org.junit.Test;

import yahoofinance.Stock;
import yahoofinance.YahooFinance;
import yahoofinance.histquotes.Interval;
import yahoofinance.quotes.fx.FxQuote;
import yahoofinance.quotes.fx.FxSymbols;
import yahoofinance.quotes.stock.StockQuote;

public class ApiTester {

	@Test
	public void test() throws IOException {
		System.out.println("Stock");
		
		// Need to have proxy off to run
		// Single stock
		Stock appl = YahooFinance.get("AAPL");
		StockQuote sq = appl.getQuote();
		 
		BigDecimal price = appl.getQuote().getPrice();
		BigDecimal change = appl.getQuote().getChangeInPercent();
		BigDecimal peg = appl.getStats().getPeg();
		BigDecimal dividend = appl.getDividend().getAnnualYieldPercent();
		
		System.out.println(sq);
		
		appl.print();
		System.out.println("Symbol: "+ sq.getSymbol());
		System.out.println("Price: " + sq.getPrice());
		System.out.println("Date: " + sq.getLastTradeTime().getTime() );
		
		StockManager aapl = new StockManager("AAPL");
		
		DataHandler handler = new DataHandler() {
			
			public void onData(String stockName, BigDecimal stockPrice) {
				// TODO Auto-generated method stub
				
			}
		};
		
	

		
	}

}
