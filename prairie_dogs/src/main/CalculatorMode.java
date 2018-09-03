package main;

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

		// 入力された値によって分岐処理
		switch (mode) {
		// 計算方法：加算
		case 0:
			computation = calc.pluss(firstArgument, secondArgument);
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
		return computation;
	}
}