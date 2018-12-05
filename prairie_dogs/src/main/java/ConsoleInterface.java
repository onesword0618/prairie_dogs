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
 * 家計簿アプリケーションで利用するメッセージを提供するインターフェイス<br>
 * <p>
 * このインターフェイスを実装するクラスはメッセージ出力の機能を有する<br>
 * 分類は以下の3つ<br>
 * 共通：システム上で横断して利用するメッセージ集<br>
 * 管理：マスタデータの操作で利用するメッセージ集<br>
 * 入力：家計簿入力操作で利用するメッセージ集<br>
 * </p>
 * 
 * @author onesword0618
 *
 */
public interface ConsoleInterface {
	/**
	 * メッセージ出力<br>
	 *<p>
	 * メッセージ出力処理を行う
	 *</p>
	 *
	 * @return メッセージ
	 */
	public abstract String getMessege();

}
