package jp.gushed;

/**
 * アプリケーションで利用するリソースファイルの読込処理を提供するインターフェイス
 * <p>
 * このインターフェイスを実装するクラスはリソースファイルの読込処理の機能を有する<br>
 * 読み込む対象は以下の２つ
 * プロパティ、CSV
 * </p>
 * 
 * @author onesword0618
 */
public interface ResourcesReaderInterface {
	
	/**
	 * リソースファイル読込<br>
	 * <p>
	 * 対象のリソースファイルを読み込む
	 * </p>
	 * 
	 * @return
	 */
	public abstract String readResource(String key);
	
}
