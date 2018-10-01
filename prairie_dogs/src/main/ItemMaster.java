package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.StringTokenizer;

/**
 * 品目マスタ<br>
 * 
 * 品目の登録、更新、削除を行う<br>
 * 
 * @author onesword0618
 *
 */
public class ItemMaster implements MasterInterface {

	/**
	 * 品目マスタの主要機能<br>
	 * 
	 * 品目マスタの主要機能を取り扱う<br>
	 * 
	 */
	public void mainPrcs() {

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

		regist(str);

	}

	/**
	 * CSVファイルの初回読込<br>
	 * 
	 * 指定されたディレクトリにあるCSVを読み込む<br>
	 * 存在しない場合は、新規に作成する。<br>
	 * 
	 */
	private static List<String> readInitCsvFile() {
		SystemConfig sys = new SystemConfig();

		// 対象のディレクトリを取得する。
		File resourcesFile = new File(sys.getUserHomePath() + "src/prairie/prairie_dogs/src/main/resources");

		// 対象のディレクトリがない場合
		if (!resourcesFile.exists()) {
			// 対象のディレクトリを作成する
			resourcesFile.mkdir();

		}
		
		// 品目マスタのリソースファイルを取得する
		File resourcesFileCsvFile = new File(resourcesFile + "Item.csv");
		
		// 対象のリソースファイルがない場合
		if(!resourcesFileCsvFile.exists()) {
			// 対象のファイルを作成する
			resourcesFileCsvFile.mkdir();
			
		}
		
		// 読込処理の実行
		try {

			// 対象のファイルを読み込む
			BufferedReader bufferedReader = new BufferedReader(new FileReader(resourcesFileCsvFile));

			// 該当のリソースの中身が空っぽかどうか
			
			// 読み込んだファイルを１行ずつ処理する
			String line;
			StringTokenizer token;

			//　分割して取り出す
			while ((line = bufferedReader.readLine()) != null) {
				// 区切り文字","で分割する
				token = new StringTokenizer(line, ",");

				// 分割した文字を画面出力する
				while (token.hasMoreTokens()) {
					System.out.println(token.nextToken());
				}
				System.out.println("**********");
			}

			// 終了処理
			bufferedReader.close();

		} catch (IOException e) {
			e.printStackTrace();
		}
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
	 * {@inheritDoc}
	 * <p>
	 * 品目の登録機能<br>
	 * 品目の情報を登録する<br>
	 * </p>
	 * 
	 * @param name 項目名
	 */
	public void regist(String name) {

		// 妥当な名前かどうかの確認
		// 特殊文字が利用されていないこと
		if (!isInputName(name)) {

			System.out.println(Message.inspection.getMessege());

		}

		// 読み込んだCSVファイルから検索して同じ品目が登録されていないかを確認する。

		// 取得した品目を表示
		createItemMessage(name);

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
	public void update(String name) {

	}

	/**
	 * 品目の削除機能<br>
	 * 品目の情報を削除する<br>
	 * 
	 * @param str
	 * @return
	 */
	public void delete(String name) {

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
