package jp.gushed;

/**
 * <h1>基底メッセージ</h1><br>
 * <p>
 * システムを運用する上で必要なメッセージのEnum定数クラス<br>
 * 
 * @version 0.0.1
 * @author onesword0618
 * 
 */
public enum BaseMessageCnst implements MessageInterface{
	/**
	 * パラメタの値がありません
	 */
	notFindParams("パラメタの値がありません")

	/**
	 * 正しい拡張子のファイル名ではありません
	 */
	, notCorrectTypeFile("正しい拡張子のファイルではありません")

	/**
	 * 対象のリソースファイルは読み込むことができません
	 */
	, canNotReadTargetResourceFiles("対象のリソースファイルは読み込むことができません");

	private final String msg;

	private BaseMessageCnst(String msg) {
		this.msg = msg;
	}

	/**
	 * メッセージを出力する<br>
	 * <p>
	 * @return メッセージ
	 */
	public String getMessage() {
		return msg;
	}
}