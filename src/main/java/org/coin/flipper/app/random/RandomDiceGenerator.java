package org.coin.flipper.app.random;

import java.security.SecureRandom;
import java.util.stream.IntStream;

/**
 * The Class RandomDiceGenerator.
 */
public class RandomDiceGenerator {

	/** The secure random. */
	private SecureRandom secureRandom;
	
	
	
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
		double next = IntStream.range(0, 100).parallel().mapToDouble(i -> secureRandom.nextDouble()).average().getAsDouble();
		return next >=  0.5 ? 1 : 0;
	}
	

}
