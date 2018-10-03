/**
 * Copyright © 2018
 * 
 * TM:gush 
 * ---
 * 世界の隅っこで人に対してワクワクを与える価値が提供できるように生きています。
 * ---
 */
package main;

/**
 * 家計簿アプリケーションで利用する管理マスタのための基本インターフェイス<br>
 * <p>
 * このインターフェイスを実装するクラスはマスタ系の基本機能を有する<br>
 * 登録、更新、削除、検索を実装する。<br>
 * </p>
 * 
 * @author onesword0618
 *
 */
public interface MasterInterface {

	/**
	 * マスタの登録<br>
	 * <p>
	 * 登録を行う
	 * 
	 * </p>
	 * 
	 * @param name マスタの登録項目名
	 */
	void regist(String name);

	/**
	 * マスタの更新<br>
	 * <p>
	 * 更新を行う
	 * 
	 * </p>
	 * 
	 * @param name マスタの更新項目名
	 */
	void update(String name);

	/**
	 * マスタの削除<br>
	 * <p>
	 * 削除を行う
	 * 
	 * </p>
	 * 
	 * @param name マスタの削除項目名
	 */
	void delete(String name);

	/**
	 * マスタの検索<br>
	 * <p>
	 * マスタの検索を行う
	 * 
	 * @param name
	 * @return 検索結果の名前
	 */
	static boolean search(String name) {

		return false;
	}

}
