package org.coin.flipper.app;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

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
		assertTrue(Pattern.matches(String.format("[6-9]{%s}",runs), flippedResult));
		assertEquals(flippedResult, new StringBuilder(result).reverse().toString());

		flipper.tosses();
		String resultSecond = flipper.result();
		assertNotNull(resultSecond);
		assertFalse(resultSecond.isEmpty());
		String flippedResultSecond = flipper.flipResult();
		assertNotNull(flippedResultSecond);
		assertFalse(flippedResultSecond.isEmpty());
		assertTrue(Pattern.matches(String.format("[6-9]{%s}",runs), flippedResultSecond));
		assertEquals(flippedResultSecond, new StringBuilder(resultSecond).reverse().toString());
		
		assertNotEquals(flippedResult, flippedResultSecond);
	}

}
