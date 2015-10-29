package org.coin.flipper.app;

public class CoinFlipper {

	private Integer runs;
	private String result;

	public CoinFlipper(Integer runs) {
		this.runs = runs;
	}

	public void tosses() {
		// TODO Auto-generated method stub
		
	}

	public String result() {
		return result;
	}

	public String flipResult() {
		return new StringBuilder(result).reverse().toString();
	}

}
