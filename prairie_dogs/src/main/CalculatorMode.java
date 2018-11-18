package main;

/**
 * 計算モード選択
 * 
 * @author onesword0618
 */
public class CalculatorMode {

	/**
	 * 計算方法のメッセージ出力<br>
	 * 
	 * @param mode
	 */
	public int selectModeMessage(int mode) {

		// 入力された値によって分岐処理
		switch (mode) {
		// 計算方法：加算
		case 0:
			System.out.println(Message.prcsPluss.getMessege());
			break;
		// 計算方法：減算
		case 1:
			System.out.println(Message.prcsMinus.getMessege());
			break;
		// 計算方法：乗算
		case 2:
			System.out.println(Message.prcsMultiply.getMessege());
			break;
		// 計算方法：除算
		case 3:
			System.out.println(Message.prcsDivided.getMessege());
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
	public Object callCalculator(int mode, int first, int second) {

		Calculator calc = new Calculator();

		switch (mode) {
		case 0:
			return calc.plus(first, second);
		case 1:
			return calc.minus(first, second);
		case 2:
			return calc.mult(first, second);
		case 3:
			return calc.div(first, second);
		}
		return mode;
	}
}