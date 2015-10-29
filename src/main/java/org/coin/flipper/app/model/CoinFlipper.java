package org.coin.flipper.app.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

/**
 * The Class CoinFlipper.
 */
public class CoinFlipper {

	/** The Constant DEFAULT_RUNS. */
	public static final Integer DEFAULT_RUNS = 6;
	
	/** The runs. */
	private Integer runs = DEFAULT_RUNS;
	
	/** The result. */
	private StringBuilder result;
	
	/** The dices. */
	private List<Dice> dices;

	/**
	 * Instantiates a new coin flipper.
	 */
	public CoinFlipper() {
		this.result = new StringBuilder("");
		initDices();
	}

	/**
	 * Instantiates a new coin flipper.
	 *
	 * @param runs the runs
	 */
	public CoinFlipper(Integer runs) {
		this();
		this.runs = runs;
	}

	/**
	 * Tosses.
	 */
	public void tosses() {
		this.result.delete(0, this.result.length());
		IntStream.range(0, runs).forEach( i -> tos() );
	}

	/**
	 * Tos.
	 */
	public void tos() {
		dices.stream().forEach( dice -> dice.tos() );
		this.result.append(dices.stream().mapToInt(Dice::weight).sum());
	}

	/**
	 * Result.
	 *
	 * @return the string
	 */
	public String result() {
		return result.toString();
	}

	/**
	 * Flip result.
	 *
	 * @return the string
	 */
	public String flipResult() {
		return result.reverse().toString();
	}

	/**
	 * Inits the dices.
	 */
	private void initDices() {
		this.dices = new ArrayList<>();
		IntStream.range(0, 3).forEach( i -> this.dices.add(new Dice()) );
	}

}
