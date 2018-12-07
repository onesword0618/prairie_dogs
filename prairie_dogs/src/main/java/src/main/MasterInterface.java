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
 * 家計簿アプリケーションで利用する管理マスタに提供するインターフェイス<br>
 * <p>
 * このインターフェイスを実装するクラスは管理マスタの基本機能を有する<br>
 * 基本機能とは下記の４つ<br>
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
	 * 新規で項目名の登録を行う
	 * 
	 * </p>
	 * 
	 * @param name マスタの登録項目名
	 */
	void regist(String name);

	/**
	 * マスタの更新<br>
	 * <p>
	 * 既存の項目名に対して更新を行う
	 * 
	 * </p>
	 * 
	 * @param name マスタの更新項目名
	 */
	void update(String name);

	/**
	 * マスタの削除<br>
	 * <p>
	 * 既存の項目名に対して削除を行う
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
	 * マスタに対して項目名が存在するか検索を行い、存在しなければfalseを返却する
	 * 
	 * @param name
	 * @return 検索結果の名前
	 */
	static boolean isSearch(String name) {

		return false;
	}

}
