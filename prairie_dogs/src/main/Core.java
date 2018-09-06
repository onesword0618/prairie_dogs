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

		// 開始案内文
		callStartMessege();
		
		// 計算実行
		execCalculation();
		
	}

	private static void execCalculation() {

		boolean isContinue = true;

		int calcResult = 0;
		int nextInputCalc = 0;

		// java.util.Scanner
		// https://docs.oracle.com/javase/jp/10/docs/api/java/util/Scanner.html
		Scanner scanner = new Scanner(System.in);
	
		// ユーザの判断で計算処理が終わるか判定する
		while (isContinue) {

			// 計算方式の選択
			int selectCalculationMethod = inputScannerNumber(scanner);

			// 計算値入力
			// TODO 入力値の検査を行う
			System.out.println(Message.inputGuidFirstArgument.getMessege());
			int firstArgument = inputScannerNumber(scanner);
			System.out.println(Message.inputGuidSecondArgument.getMessege());
			int secondArgument = inputScannerNumber(scanner);

			// 計算処理の呼び出し
			CalculatorMode calculatorMode = new CalculatorMode();
			calcResult = calculatorMode.selectMode(selectCalculationMethod, firstArgument, secondArgument);

			// 継続確認案内
			callContinueQuestionMessege();

			// ユーザ判断で計算処理継続
			int inputContinue = inputScannerNumber(scanner);

			// 計算を終了する場合
			if (inputContinue == 0) {
				isContinue = false;
				System.out.println(Message.guidFinish.getMessege());
			}

			// 計算処理を継続する場合は前回の計算結果と合算する
			nextInputCalc = nextInputCalc + calcResult;

			exportCsvWriter(nextInputCalc);

			scanner.close();
		}
	}

	private static void callContinueQuestionMessege() {
		/*
		 * 案内表示文 コンソール画面に計算処理の継続を求める
		 */
		System.out.println(Message.isContinue.getMessege());
		System.out.println(Message.selectIsContinue.getMessege());
	}

	private static void callStartMessege() {
		// java.lang.System
		// https://docs.oracle.com/javase/jp/10/docs/api/java/lang/System.html
		System.out.println(Message.guid.getMessege());
		System.out.println(Message.selectCalcMode.getMessege());
	}

	private static int inputScannerNumber(Scanner scanner) {

		// 数値の入力をコンソールから受け取る
		return scanner.nextInt();
	}

	private static void exportCsvWriter(int sumCalculate) {

		// CSV出力を行う
		CsvWriter cw = new CsvWriter();
		cw.init(sumCalculate);
	}
	
}
