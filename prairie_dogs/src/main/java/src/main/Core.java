/**
 * Copyright © 2018<br>
 * 
 * TM:gush
 * ---
 * 人に対してワクワクを与える価値が提供できるように生きています。
 * ---
 * @author Kenichi.I
 */
package main;

import java.util.Scanner;

/**
 * 中心機能
 * 
 * @author onesword0618
 */
public class Core {

	/**
	 * メイン処理
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// システムファイルを読込
		readSystemConfig();
		// 結果は他クラスが保持
		// メッセージファイルを読込
		readMessageUtils();
		// 結果は他クラスが保持
		// 商品リストを読込
		// 結果は他クラスが保持
		// 開始案内文を表示
		// メッセージはて定数クラスから
		// 商品リストの中身を整形してコンソールに出力
		
		// IOExceptionSS
		// 案内文表示
		// 管理モードかカレンダーモードかは選択肢によって決定
		// 設定項目表示
		
		
	}

	/**
	 * 計算実行<br>
	 * 
	 */
	private static void execCalculation() {

		boolean isContinue = true;

		int calculatorResult = 0;
		int nextInputCalculator = 0;

		// テキストスキャナーを生成
		Scanner scanner = new Scanner(System.in);

		// ユーザの判断で計算処理が終わるか判定する
		while (isContinue) {

			int firstArgument = 0;
			int secondArgument = 0;

			// 計算処理方式のメッセージを出力
			CalculatorMode calculatorMode = new CalculatorMode();
			int selectMode = calculatorMode.selectModeMessage(inputScannerNumber(scanner));

			// 計算値入力
			System.out.println(Message.inputGuidFirstArgument.getMessege());
			firstArgument = inputScannerNumber(scanner);
			System.out.println(Message.inputGuidSecondArgument.getMessege());
			secondArgument = inputScannerNumber(scanner);

			// 計算処理
			calculatorMode.callCalculator(selectMode, firstArgument, secondArgument);

			//callContinueQuestionMessege();

			int inputContinue = inputScannerNumber(scanner);

			// 計算を終了する場合
			if (inputContinue == 0) {
				isContinue = false;
				System.out.println(Message.guidFinish.getMessege());
			}

			// 計算処理を継続する場合は前回の計算結果と合算する
			nextInputCalculator = nextInputCalculator + calculatorResult;

			// CSV出力
			exportCsvWriter(nextInputCalculator);
		}

		// テキスト・スキャナーを閉じる。
		scanner.close();
	}

	/**
	 * 整数値検査
	 * 
	 * @param scanner コンソールからの入力値
	 * @return int : 整数値
	 */
	private static int inputScannerNumber(Scanner scanner) {

		boolean isContinue = true;

		String checkInputScannerNumber = null;

		while (isContinue) {
			// 入力をコンソールから受け取る
			checkInputScannerNumber = scanner.nextLine();

			if (!CheckRegex.checkNumber(checkInputScannerNumber)) {
				System.out.println(Message.inspection.getMessege());
				System.out.println(Message.reInput.getMessege());
				continue;
			}
			break;
		}
		// 入力値を返却する
		return Integer.parseInt(checkInputScannerNumber);
	}

	/**
	 * CSV出力
	 * 
	 * @param sumCalculate : 計算処理された合計値
	 */
	private static void exportCsvWriter(int sumCalculate) {

		// CSV出力を行う
		CsvWriter cw = new CsvWriter();
		cw.exportCsv(sumCalculate);
	}


	/**
	 * システム設定ファイル読込
	 * system.properties
	 * 
	 */
	private static void readSystemConfig() {
		
	}
	
	/**
	 * メッセージリソース読込
	 * メッセージファイルを読む
	 * 
	 */
	private static void readMessageUtils() {
		
		
		
	}
}
