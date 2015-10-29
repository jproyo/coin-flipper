package org.coin.flipper.app.model;

import static org.junit.Assert.*;

import java.util.regex.Pattern;

import org.coin.flipper.app.model.CoinFlipper;
import org.junit.Before;
import org.junit.Test;

public class CoinFlipperTest {
	
	private Integer runs = 6;
	private CoinFlipper target;
	
	@Before
	public void setup(){		
		target = new CoinFlipper(runs);
	}
	
	@Test
	public void testCoinFlipperSuccess(){
		target.tosses();
		String result = target.result();
		assertNotNull(result);
		assertFalse(result.isEmpty());
		String flippedResult = target.flipResult();
		assertNotNull(flippedResult);
		assertFalse(flippedResult.isEmpty());
		assertTrue(Pattern.matches(String.format("[6-9]{%s}",runs), flippedResult));
		assertEquals(flippedResult, new StringBuilder(result).reverse().toString());
	}
	
	@Test
	public void testCoinFlipperSuccessMoreThanOneTosses(){
		target.tosses();
		String result = target.result();
		assertNotNull(result);
		assertFalse(result.isEmpty());
		String flippedResult = target.flipResult();
		assertNotNull(flippedResult);
		assertFalse(flippedResult.isEmpty());
		assertTrue(Pattern.matches(String.format("[6-9]{%s}",runs), flippedResult));
		assertEquals(flippedResult, new StringBuilder(result).reverse().toString());

		target.tosses();
		String resultSecond = target.result();
		assertNotNull(resultSecond);
		assertFalse(resultSecond.isEmpty());
		String flippedResultSecond = target.flipResult();
		assertNotNull(flippedResultSecond);
		assertFalse(flippedResultSecond.isEmpty());
		assertTrue(Pattern.matches(String.format("[6-9]{%s}",runs), flippedResultSecond));
		assertEquals(flippedResultSecond, new StringBuilder(resultSecond).reverse().toString());
		
		assertNotEquals(flippedResult, flippedResultSecond);
	}

}
