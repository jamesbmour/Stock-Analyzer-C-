package yahoo.api.stock;

import java.math.BigDecimal;

public interface DataHandler {
	 public void onData(String stockName, BigDecimal stockPrice);
}
