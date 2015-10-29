package org.coin.flipper.app;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class CoinFlipper {

	public static final Integer DEFAULT_RUNS = 6;
	
	private Integer runs = DEFAULT_RUNS;
	
	private StringBuilder result;
	
	private List<Dice> dices;

	public CoinFlipper() {
		this.result = new StringBuilder("");
		initDices();
	}

	public CoinFlipper(Integer runs) {
		this();
		this.runs = runs;
	}

	public void tosses() {
		this.result.delete(0, this.result.length());
		IntStream.range(0, runs).forEach( i -> tos() );
	}

	public void tos() {
		dices.stream().forEach( dice -> dice.tos() );
		this.result.append(dices.stream().mapToInt(Dice::weight).sum());
	}

	public String result() {
		return result.toString();
	}

	public String flipResult() {
		return result.reverse().toString();
	}

	private void initDices() {
		this.dices = new ArrayList<>();
		IntStream.range(0, 3).forEach( i -> this.dices.add(new Dice()) );
	}

}
