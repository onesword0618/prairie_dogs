package jp.gushed;

/**
 * <h1>リソースファイル読込インターフェース</h1><br>
 * <p>
 * リソースファイルの読込処理を提供するインターフェイス<br>
 * <p>
 * このインターフェイスを実装するクラスはリソースファイルの読込処理の機能を有する<br>
 * 読込対象は以下の２つを想定<br>
 * プロパティ、CSV<br>
 * 
 * @version 0.0.1
 * @author onesword0618
 * 
 */
public interface ResourcesReaderInterface {

	/**
	 * リソースファイル読込<br>
	 * <p>
	 * ファイル名を渡してその中身のデータを取得する<br>
	 * 
	 * @param searchValue 検索値
	 * @return リソースの中身を取得
	 */
	public abstract String getResource(String searchValue);

}
