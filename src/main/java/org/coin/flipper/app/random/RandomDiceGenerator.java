package org.coin.flipper.app.random;

/**
 * The Class RandomDiceGenerator.
 */
public class RandomDiceGenerator {
	
	/** The last value. */
	private int lastValue = 0;

	/**
	 * Next.
	 *
	 * @return the int
	 */
	public int next() {
		double random = Math.random();
		if(random > 0.5 && lastValue == 1){
			lastValue = 0;
		}else{
			lastValue = 1;
		}
		return lastValue;
	}

}
