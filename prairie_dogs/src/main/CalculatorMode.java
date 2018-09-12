package main;

/**
 * 計算モード選択
 * 
 * @author onesword0618
 */
public class CalculatorMode {

	/**
	 * 計算方法のメッセージ出力
	 * 
	 * @param mode
	 */
	// TODO メッセージをEnum定数にする
	public int selectModeMessage(int mode) {

		// 入力された値によって分岐処理
		switch (mode) {
		// 計算方法：加算
		case 0:
			System.out.println("選択した計算処理方法は加算です");
			break;
		// 計算方法：減算
		case 1:
			System.out.println("選択した計算処理方法は減算です");
			break;
		// 計算方法：乗算
		case 2:
			System.out.println("選択した計算処理方法は乗算です");
			break;
		// 計算方法：除算
		case 3:
			System.out.println("選択した計算処理方法は除算です");
			break;
		}
		return mode;
	}

	/**
	 * 計算処理の実行<br>
	 * 
	 * @param mode
	 * @param first
	 * @param second
	 * @return
	 */
	public int callCalculator(int mode, int first, int second) {

		Calculator calc = new Calculator();

		switch (mode) {
		case 0:
			return calc.pluss(first, second);
		case 1:
			return calc.minus(first, second);
		case 2:
			return calc.multiply(first, second);
		case 3:
			return calc.multiply(first, second);
		}
		return mode;
	}
}