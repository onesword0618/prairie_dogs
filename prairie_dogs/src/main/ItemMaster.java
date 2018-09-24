package main;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;

/**
 * 品目マスタ<br>
 * 品目の登録、更新、削除を行う<br>
 * 
 * @author onesword0618
 *
 */
public class ItemMaster {

	/**
	 * 品目マスタの主要機能<br>
	 * 
	 * 品目マスタの主要機能を取り扱う<br>
	 * 
	 */
	public static void MainProcs() {

		// 核の機能
		// 品目の更新
		// 品目の削除
		// 品目の検索

		// サブ機能
		// CSVの出力
		// CSVの読込
		// コンソールに操作結果の出力
		
		String str = null;

		readInitCsvFile();

		registItem(str);

	}

	/**
	 * CSVファイルの初回読込<br>
	 * 
	 * 指定されたディレクトリにあるCSVを読み込む<br>
	 * 存在しない場合は、新規に作成する。<br>
	 * 
	 */
	private static List<String> readInitCsvFile() {

		// TODO クラス生成時に呼ばれるようにして中のメソッドで呼ぶとき一度読み込んだファイルで対応するようにしたい。
		// try ~catch で取得する
		// ディレクトリのパスを取得
		
		InputStream is = ClassLoader.getSystemResourceAsStream("subres/Item.csv");
		
		BufferedReader br = new BufferedReader(new InputStreamReader(is));

		// CSVが存在しているか確認

		// 該当のCSVファイルが存在しない場合は新規でCSVファイルを作成
		// 同じディレクトリに複数の機能で利用するCSVファイルの集合体が配置される予定

		// 読み込んだCSVファイルをマップ方式かリスト方式で持つようにするか要相談
		// 現段階で持っている情報
		// ヘッダー情報
		// マスター情報
		// 品目管理番号
		// 品目名
		// 品目概要
		// 登録日
		// 更新日

		// 読み込んだCSV情報
		return null;
	}

	/**
	 * 品目の登録機能<br>
	 * 品目の情報を登録する<br>
	 * 
	 * @param itemName
	 */
	private static void registItem(String itemName) {

		// 妥当な名前かどうかの確認
		// 特殊文字が利用されていないこと
		if (!isInputName(itemName)) {

			System.out.println(Message.inspection.getMessege());

		}

		// 読み込んだCSVファイルから検索して同じ品目が登録されていないかを確認する。

		// 取得した品目を表示
		createItemMessage(itemName);

		// 現在の品目の登録状況を表示するためにCSVを読み込む
		// 表示する

		// 登録するかの是非の問い合わせ
		// OKなら品目用のCSVに登録処理を行う

		// メッセージ：登録処理が完了しました。現在は以下のような登録状況です
		// 登録処理が終わったCSVの内容を表示する

	}

	/**
	 * 品目の更新機能<br>
	 * 品目の情報を更新する<br>
	 * 
	 * @param itemName
	 * @return
	 */
	private static void updateItem(String itemName) {
		
	}
	
	/**
	 * 品目の削除機能<br>
	 * 品目の情報を削除する<br>
	 * 
	 * @param str
	 * @return
	 */
	private static void deleteItem(String itemName) {
		
	}
	
	// 存在チェックは読込時に行っている想定
	// 引数のチェック処理
	private static boolean isInputName(String str) {

		return str.matches("^[0-9]*$");

	}

	private static String createItemMessage(String str) {

		return "あなたが選択した品目は" + str + "ですね";

	}



}
