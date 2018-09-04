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

		// java.util.Scanner
		// https://docs.oracle.com/javase/jp/10/docs/api/java/util/Scanner.html
		Scanner stdIn = new Scanner(System.in);

		// スキャナーをリセットする。
		stdIn.reset();

		boolean isContinue = true;

		int calcResult = 0;
		int nextInputCalc = 0;

		// ユーザの判断で計算処理が終わるか判定する
		while (isContinue) {

			/*
			 * 案内表示文 コンソール画面に計算モードを選択する
			 */
			// java.lang.System
			// https://docs.oracle.com/javase/jp/10/docs/api/java/lang/System.html
			System.out.println("計算モードを選んでください");
			System.out.println("0:加算 / 1:減算 / 2:乗算 / 3:除算");

			// TODO 入力時に数値以外を入力したらエラーメッセージを出力するように変更する。
			/*
			 * 案内表示文 コンソール画面に計算モードを選択する
			 */
			int inputSelectMode = stdIn.nextInt();

			// 計算値を投入する 小数は考慮しない 家計簿に小数って...?
			// TODO 入力値の検査を行う
			System.out.println("第１引数の整数を入力してください");
			int firstArgument = stdIn.nextInt();
			System.out.println("第２引数の整数を入力してください");
			int secondArgument = stdIn.nextInt();

			// 計算処理の呼び出し
			CalculatorMode calculatorMode = new CalculatorMode();
			calcResult = calculatorMode.selectMode(inputSelectMode, firstArgument, secondArgument);

			/*
			 * 案内表示文 コンソール画面に計算処理の継続を求める
			 */
			System.out.println("計算処理を終了しますか");
			System.out.println("0:YES / 1:NO");

			// ユーザ判断で計算処理継続
			int inputContinue = stdIn.nextInt();

			// 計算を終了する場合
			if (inputContinue == 0) {

				isContinue = false;
				System.out.println("計算処理は終了しました");
			}

			// 計算処理を継続する場合は前回の計算結果と合算する
			nextInputCalc = nextInputCalc + calcResult;
			
			// CSV出力を行う
			CsvWriter cw = new CsvWriter();
			cw.init(nextInputCalc);
		}
		// テキスト・スキャナを閉じる。
		stdIn.close();
	}
}