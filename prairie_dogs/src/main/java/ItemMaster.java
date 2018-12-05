package main.java;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;

/**
 * 品目マスタ<br>
 * 
 * 品目の登録、更新、削除、検索を行う<br>
 * 
 * @author onesword0618
 *
 */
public class ItemMaster implements MasterInterface {

	/**
	 * 品目マスタの主要処理<br>
	 * 
	 * 品目マスタの主要機能を取り扱う<br>
	 * 
	 * 品目マスタの処理を順次呼び出していく<br>
	 * 
	 * @throws IOException
	 * 
	 */
	public void read() throws Exception {
		
		//System.out.println(Message.openingGuid.getMessege());
		
	}
	// 品目マスタCSVファイル読込
	// 使用者側で品目を編集することができるようにするため
	// 中身がない場合とあった場合を考慮にいれること
	// リソースファイル読込
	// 番号
	// 登録日付
	// 品目名

	// 読込内容をコンソールで出力
	// 件数
	// 番号
	// 品目名一覧

	// 1 登録処理
	// 品目名重複チェック
	// CSVファイルへ書き込み
	// 登録結果を一覧出力

	// 2 検索処理
	// 品目名の存在チェック
	// 検索結果をコンソールに出力

	// 3 更新処理
	// 品目名の存在チェック
	// 上書き入力する品目重複チェック
	// 更新結果をコンソール出力

	// 4 削除処理
	// 品目名の存在チェック
	// 削除確認
	// CSVファイルからの消込
	// 削除結果のコンソール出力

	/**
	 * 初期処理<br>
	 * 
	 * 品目マスタで処理を行うリソースファイルを読み込む<br>
	 * {@link Properties}
	 * 
	 * @return
	 */
	private List<String> init() throws IOException {

		// 設定ファイル読込
		InputStream stream = ItemMaster.class.getClassLoader().getResourceAsStream("init.properties");

		InputStreamReader isr = new InputStreamReader(stream, "UTF-8");

		BufferedReader br = new BufferedReader(isr);

		Properties prop = new Properties();

		prop.load(br);

		System.out.println(prop.getProperty("config"));

		return null;
	}

	/**
	 * CSVファイルに品目名を登録する
	 * 
	 * CSVファイルに存在しない品目名を新規で登録を行う
	 * 
	 */
	public void regist(String name) {

	}

	/**
	 * CSVファイルにある品目名を更新する
	 * 
	 * CSVファイルに存在している品目名を別名のCSVファイルに存在しない名前で更新処理を行う
	 * 
	 */
	public void update(String name) {

	}

	/**
	 * CSVファイルにある品目名を削除する<br>
	 * 
	 * CSVファイルに存在している品目名をCSVファイルから削除処理を行う
	 * 
	 */
	public void delete(String name) {

	}

	/**
	 * CSVファイルに品目名が含まれているか検索する<br>
	 * 
	 * CSVファイルに含まれているか検索する
	 * 
	 * @param name
	 * @return
	 */
	public boolean isSearch(String name) {
		return false;

	}
}
