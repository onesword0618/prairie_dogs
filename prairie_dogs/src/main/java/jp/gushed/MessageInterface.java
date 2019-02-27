package jp.gushed;

/**
 * <h1>メッセージインターフェース</h1><br>
 * <p>
 * 家計簿アプリケーション内で利用するメッセージを提供するインターフェイス<br>
 * <p>
 * このインターフェイスを実装するクラスはメッセージ出力機能を実装する<br>
 * 
 * @version 0.0.1
 * @author onesword0618
 * 
 */
public interface MessageInterface {

	/**
	 * メッセージ取得<br>
	 * <p>
	 * メッセージを取得する<br>
	 * 
	 * @return メッセージ
	 */
	public abstract String getMessage();
}
