package main;

/**
 * 品目マスタ<br>
 * 品目を扱う<br>
 * 
 * @author onesword0618
 *
 */
public class ItemMaster {

	/**
	 * 品目マスタの主要機能<br>
	 * 品目マスタの主要機能を取り扱う<br>
	 */
	public static void ItemMasterMain() {

		String str = null;
		
		registItem(str);
	}
	
	/**
	 * CSVファイルの読込
	 * 
	 * @param itemName
	 */
	// 存在チェック
	// 読込作業
	// 読込結果の表示
	
	
	/*
	 * 品目の登録機能<br>
	 */
	private static void registItem(String itemName) {
		
		// 存在チェックは読込時に行っている想定
		// 引数のチェック処理
		// 妥当な名前かどうかの確認
		// 特殊文字が利用されていないこと
		
		// 取得した品目を表示
		System.out.print(itemName);
		
		
		
	}
	
	// 核の機能
	// 品目の登録
	// 品目の更新
	// 品目の削除
	// 品目の検索
	
	// サブ機能
		// CSVの出力
		// CSVの読込
		// コンソールに操作結果の出力
		
}
