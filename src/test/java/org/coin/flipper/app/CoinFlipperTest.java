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
		assertNotNull(result);
		assertFalse(result.isEmpty());
		String flippedResult = flipper.flipResult();
		assertNotNull(flippedResult);
		assertFalse(flippedResult.isEmpty());
	}

}
