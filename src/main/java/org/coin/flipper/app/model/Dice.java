package org.coin.flipper.app.model;

import org.coin.flipper.app.random.RandomDiceGenerator;

/**
 * The Class Dice.
 */
public class Dice {
	
	/** The status. */
	private DiceSide status = DiceSide.head;
	
	/** The random generator. */
	private RandomDiceGenerator randomGenerator;
	
	/**
	 * Instantiates a new dice.
	 */
	public Dice() {
		this.randomGenerator = new RandomDiceGenerator();
	}
	
	/**
	 * Tos.
	 */
	public void tos(){
		this.status = DiceSide.values()[randomGenerator.next()];
	}
	
	/**
	 * Weight.
	 *
	 * @return the integer
	 */
	public Integer weight(){
		switch(this.status){
			case head:
				return 2;
			case tail: 
				return 3;
			default: break;
		}
		return -1;
	}
	
	/**
	 * The Enum DiceSide.
	 */
	public enum DiceSide {
		
		/** The head. */
		head, 
		/** The tail. */
		tail;
	}

}
