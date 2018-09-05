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

		// 計算処理
		calculateProcess();
	}

	private static void calculateProcess() {

		boolean isContinue = true;

		int calcResult = 0;
		int nextInputCalc = 0;

		// java.util.Scanner
		// https://docs.oracle.com/javase/jp/10/docs/api/java/util/Scanner.html
		Scanner stdIn = new Scanner(System.in);

		// ユーザの判断で計算処理が終わるか判定する
		while (isContinue) {

			// java.lang.System
			// https://docs.oracle.com/javase/jp/10/docs/api/java/lang/System.html
			System.out.println(Message.guid.getMessege());
			System.out.println(Message.selectCalcMode.getMessege());

			// TODO 入力時に数値以外を入力したらエラーメッセージを出力するように変更する。
			/*
			 * 案内表示文 コンソール画面に計算モードを選択する
			 */
			int inputSelectMode = getInputScnnerNumber(stdIn);

			// 計算値を投入する 小数は考慮しない 家計簿に小数って...?
			// TODO 入力値の検査を行う
			System.out.println(Message.inputGuidFirstArgument.getMessege());
			int firstArgument = getInputScnnerNumber(stdIn);
			System.out.println(Message.inputGuidSecondArgument.getMessege());
			int secondArgument = getInputScnnerNumber(stdIn);

			// 計算処理の呼び出し
			CalculatorMode calculatorMode = new CalculatorMode();
			calcResult = calculatorMode.selectMode(inputSelectMode, firstArgument, secondArgument);

			/*
			 * 案内表示文 コンソール画面に計算処理の継続を求める
			 */
			System.out.println(Message.isContinue.getMessege());
			System.out.println(Message.selectIsContinue.getMessege());

			// ユーザ判断で計算処理継続
			int inputContinue = getInputScnnerNumber(stdIn);

			// 計算を終了する場合
			if (inputContinue == 0) {
				isContinue = false;
				System.out.println(Message.guidFinish.getMessege());
			}

			// 計算処理を継続する場合は前回の計算結果と合算する
			nextInputCalc = nextInputCalc + calcResult;

			exportCsvWriter(nextInputCalc);

			stdIn.close();
		}
	}

	private static int getInputScnnerNumber(Scanner stdIn) {

		// 数値の入力をコンソールから受け取る
		return stdIn.nextInt();
	}

	private static void exportCsvWriter(int sum) {

		// CSV出力を行う
		CsvWriter cw = new CsvWriter();
		cw.init(sum);
	}
}
