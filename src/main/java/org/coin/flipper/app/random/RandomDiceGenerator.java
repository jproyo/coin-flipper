package org.coin.flipper.app.random;

import java.security.SecureRandom;

/**
 * The Class RandomDiceGenerator.
 */
public class RandomDiceGenerator {

	/** The secure random. */
	private SecureRandom secureRandom;

	/** The last value. */
	private int lastValue = 0;
	
	
	
	/**
	 * Instantiates a new random dice generator.
	 */
	public RandomDiceGenerator() {
		secureRandom = new SecureRandom();
	}
	/**
	 * Next.
	 *
	 * @return the int
	 */
	public int next() {
		double next = secureRandom.nextDouble();
		int possible = 0;
		if(next >= 0.5) possible = 1;
		if(lastValue != possible){
			lastValue = possible;
		}else{
			if(lastValue == 0)lastValue = 1;
			if(lastValue == 1)lastValue = 0;
		}
		return lastValue; 
	}
	

}
