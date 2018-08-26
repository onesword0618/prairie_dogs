package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 計算モード選択
 * 
 * @author onesword0618
 */
public class CalculatorMode {

	/**
	 * 計算方法の選択処理
	 * 
	 * @param mode
	 * @param firstArgument
	 * @param secondArgument
	 * @return 選択した計算方法の計算結果
	 */
	public int selectMode(int mode, int firstArgument, int secondArgument) {

		int computation = 0;

		Calculator calc = new Calculator();

		switch (mode) {
		// 計算方法：加算
		case 0:
			computation = calc.pluss(secondArgument, secondArgument);
			break;
		// 計算方法：減算
		case 1:
			computation = calc.minus(firstArgument, secondArgument);
			break;
		// 計算方法：乗算
		case 2:
			computation = calc.multiply(firstArgument, secondArgument);
			break;
		// 計算方法：除算
		case 3:
			computation = calc.divided(firstArgument, secondArgument);
			break;
		}

		// TODO 複数の計算結果を格納する予定?
		// https://docs.oracle.com/javase/jp/10/docs/api/java/util/ArrayList.html
		List<Integer> computationList = new ArrayList<>();

		computationList.add(computation);

		CsvWriter csvWriter = new CsvWriter();

		csvWriter.init(computationList);

		System.out.println(computation);
		return computation;
	}
}
