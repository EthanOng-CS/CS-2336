
public class hw_9dot2 {

	public static void main(String[] args) {
		// Create a Stock object with the stock  
		// symbol ORCL, the name Oracle Corporation
		Stock stock = new Stock("ORCL", "Oracle Corporation");
		stock.prevClosingPrice = 34.5;
		stock.currPrice = 34.35;

		// Display the price-change percentage
		System.out.println("Stock Name: " + stock.name);
		System.out.println("Stock Symbol: " + stock.symbol);
		System.out.printf("Price-Change Percentage: %.2f%%\n", stock.getChangePercent());
	}
}

class Stock {
	String symbol;                 // Stock symbol
	String name;                   // Stock name
	double prevClosingPrice;   // Stock price for  previous day
	double currPrice;		   // Stock price for  current time

	// Construct a stock with a specified symbol and name
	Stock(String newSymbol, String newName) {
		symbol = newSymbol;
		name = newName;
	}

	// Return the percentage changed 
	double getChangePercent() {
		return ((currPrice - prevClosingPrice) / prevClosingPrice) * 100;
	}
}