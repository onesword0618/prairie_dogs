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

		/*
		 * ★ライブラリ：java.util.Scanner
		 * 
		 * @see https://docs.oracle.com/javase/jp/10/docs/api/java/util/Scanner.html
		 */
		Scanner stdIn = new Scanner(System.in);

		boolean isContinue = true;

		// ユーザの判断で計算処理が終わるか判定する
		while (isContinue) {

			/*
			 * 案内表示文 コンソール画面に計算モードを選択する
			 */
			System.out.println("計算モードを選んでください");
			System.out.println("0:加算 1:減算 2:乗算　3:除算");

			// TODO 入力時に数値以外を入力したらエラーメッセージを出力するように変更する。

			// 入力モードを選択させる
			int inputSelectMode = stdIn.nextInt();

			/*
			 * 計算値を投入する 小数は考慮しない 家計簿に小数って...?
			 */
			System.out.println("第１引数を入力してください");
			int firstArgument = stdIn.nextInt();
			System.out.println("第２引数を入力してください");
			int secondArgument = stdIn.nextInt();

			// 入力値で計算処理を呼び出す
			CalculatorMode calculatorMode = new CalculatorMode();
			calculatorMode.selectMode(inputSelectMode, firstArgument, secondArgument);

			System.out.println("計算処理を終了しますか。");
			System.out.println("0:YES 1:NO");

			int inputContinue = stdIn.nextInt();

			if (inputContinue == 0) {
				
				// 繰り返し処理の継続判定処理
				isContinue = false;
				System.out.println("計算処理は終了しました。計算結果はCSVに出力されています");
			}
		}
		// テキスト・スキャナを閉じる。
		stdIn.close();
	}
}