package jp.gushed;

/**
 * 家計簿アプリケーションで利用するメッセージを提供するインターフェイス<br>
 * <p>
 * このインターフェイスを実装するクラスはメッセージ出力機能を有する<br>
 * 
 * @author onesword0618
 *
 */
public interface MessageInterface {

	/**
	 * メッセージ出力<br>
	 * <p>
	 * 
	 * @return メッセージ
	 */
	public abstract String getMessage();

}
