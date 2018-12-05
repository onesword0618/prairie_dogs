/**
 * Copyright © 2018<br>
 * 
 * TM:gush
 * ---
 * 人に対してワクワクを与える価値が提供できるように生きています。
 * ---
 */
package main.java;

/**
 * 家計簿アプリケーションで利用する演算処理を提供するインターフェイス<br>
 * <p>
 * このインターフェイスを実装するクラスは演算処理の機能を有する<br>
 * 基本機能とは下記の４つ<br>
 * 加算、減算、乗算、除算を実装する。<br>
 * </p>
 * 
 * @author onesword0618
 *
 */
public interface CalcOperatorInterface {

	/**
	 * 加算処理<br>
	 * <p>
	 * 整数の加算処理を行う
	 * <p>
	 * 
	 * @param arg1 第１引数
	 * @param arg2 第２引数
	 * @return 計算結果
	 */
	public abstract Object plus(Object arg1, Object arg2);

	/**
	 * 減算処理<br>
	 * <p>
	 * 整数の減算処理を行う
	 * <p>
	 * 
	 * @param arg1 第１引数
	 * @param arg2 第２引数
	 * @return 計算結果
	 */
	public abstract Object minus(Object arg1, Object arg2);

	/**
	 * 乗算処理<br>
	 * <p>
	 * 整数の乗算処理を行う
	 * <p>
	 * 
	 * @param arg1 第１引数
	 * @param arg2 第２引数
	 * @return 計算結果
	 */
	public abstract Object mult(Object arg1, Object arg2);
	
	/**
	 * 除算処理<br>
	 * <p>
	 * 整数の除算処理を行う
	 * <p>
	 * 
	 * @param arg1 第１引数
	 * @param arg2 第２引数
	 * @return 計算結果
	 */
	public abstract Object div(Object arg1, Object arg2);
	
}
