package main;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

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

		callStartMessege();

		execCalculation();

	}

	/**
	 * 開始案内文表示
	 */
	private static void callStartMessege() {
		System.out.println(Message.openingGuid.getMessege());
		System.out.println(Message.selectCalcMode.getMessege());
	}

	/**
	 * 計算実行
	 */
	private static void execCalculation() {

		boolean isContinue = true;

		int calcResult = 0;
		int nextInputCalc = 0;

		Scanner scanner = new Scanner(System.in);

		// ユーザの判断で計算処理が終わるか判定する
		while (isContinue) {

			int selectCalculationMethod = 0;
			int firstArgument = 0;
			int secondArgument = 0;

			// 計算方式の選択
			selectCalculationMethod = inputScannerNumber(scanner);

			// 計算値入力
			System.out.println(Message.inputGuidFirstArgument.getMessege());
			firstArgument = inputScannerNumber(scanner);
			System.out.println(Message.inputGuidSecondArgument.getMessege());
			secondArgument = inputScannerNumber(scanner);

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

		}

		scanner.close();
	}

	private static void callContinueQuestionMessege() {
		/*
		 * 案内表示文 コンソール画面に計算処理の継続を求める
		 */
		System.out.println(Message.isContinue.getMessege());
		System.out.println(Message.selectIsContinue.getMessege());
	}

	private static int inputScannerNumber(Scanner scanner) {

		boolean isContinue = true;

		String checkInputScannerNumber = null;

		while (isContinue) {
			// 入力をコンソールから受け取る
			checkInputScannerNumber = scanner.nextLine();

			if (!checkNumber(checkInputScannerNumber)) {
				System.out.println("整数以外の入力値を検知しました。整数を入力してください。");
				System.out.println("再入力してください");
				continue;
			}
			break;
		}
		int inputScannerNumber = Integer.parseInt(checkInputScannerNumber);

		return inputScannerNumber;
	}

	private static void exportCsvWriter(int sumCalculate) {

		// CSV出力を行う
		CsvWriter cw = new CsvWriter();
		cw.init(sumCalculate);
	}

	private static boolean checkNumber(String str) {

		// 判定するパターンを生成
		// 数値であるか
		Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher matcher = pattern.matcher(str);

		return matcher.find();
	}

}
