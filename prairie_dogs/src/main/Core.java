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
		 * 案内表示文 コンソール画面に計算モードを選択する
		 */
		System.out.println("計算モードを選んでください");
		System.out.println("0:加算 1:減算 2:乗算　3:除算");

		Scanner stdIn = new Scanner(System.in);

		int inputMode = stdIn.nextInt();

		System.out.println("第１引数を入力してください");
		int a = stdIn.nextInt();
		System.out.println("第２引数を入力してください");
		int b = stdIn.nextInt();

		InputCalculatorMode inputCalc = new InputCalculatorMode();

		inputCalc.selectMode(inputMode, a, b);

		stdIn.close();
	}
}
