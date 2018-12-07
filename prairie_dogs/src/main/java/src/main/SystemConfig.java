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

/**
 * システムの設定値の共有クラス
 * 
 * @author onesword0618
 *
 */
public class SystemConfig {

	// システムパスを取得する
	public String getUserHomePath() {

		// TODO OSの種類によって変更できるようにするか
		// おいてある場所を特定してから同じ場所に吐き出せるようにするかは考えないと行けないけど

		// 出力先のパスを出力する
		// Linuxのホームディレクトリのパスを格納している。
		String userHome = System.getProperty("user.home").toString();
		return userHome;
	}
}
