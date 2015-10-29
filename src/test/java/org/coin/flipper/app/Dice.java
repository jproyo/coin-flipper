package org.coin.flipper.app;

/**
 * The Class Dice.
 */
public class Dice {
	
	/** The status. */
	private DiceSide status = DiceSide.head;
	
	public void tos(){
		this.status = DiceSide.tail;
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
