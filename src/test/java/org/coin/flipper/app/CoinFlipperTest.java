package org.coin.flipper.app;

import static org.junit.Assert.*;

import org.junit.Test;

public class CoinFlipperTest {
	
	@Test
	public void testCoinFlipperSuccess(){
		Integer runs = 6;
		CoinFlipper flipper = new CoinFlipper(runs);
		flipper.tosses();
		String result = flipper.result();
		String flippedResult = flipper.flipResult();
		assertNotNull(result);
		assertNotNull(flippedResult);
		assertFalse(result.isEmpty());
		assertFalse(flippedResult.isEmpty());
	}

}
