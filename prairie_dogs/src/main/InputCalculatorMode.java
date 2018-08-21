package main;

import java.util.ArrayList;
import java.util.List;

/**
 * 計算モード選択
 * 
 * @author onesword0618
 */
public class InputCalculatorMode {

	/**
	 * 計算方法の選択処理
	 * 
	 * @param mode
	 * @param a
	 * @param b
	 * @return 選択した計算方法の計算結果
	 */
	public int selectMode(int mode, int a, int b) {

		int rslt = 0;

		Calculator calc = new Calculator();

		switch (mode) {
		// 計算方法：加算
		case 0:
			rslt = calc.pluss(a, b);
			break;
		// 計算方法：減算
		case 1:
			rslt = calc.minus(a, b);
			break;
		// 計算方法：乗算
		case 2:
			rslt = calc.multiply(a, b);
			break;
		// 計算方法：除算
		case 3:
			rslt = calc.divided(a, b);
			break;
		}

		System.out.println(rslt);

		List<Integer> rsltList = new ArrayList<>();
		
		rsltList.add(rslt);
		
		CsvWriter csvWriter = new CsvWriter();
		
		csvWriter.init(rsltList);
		
		return rslt;
	}
}
