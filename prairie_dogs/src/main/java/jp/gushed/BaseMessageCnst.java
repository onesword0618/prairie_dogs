package jp.gushed;

public enum BaseMessageCnst {
	// パラメタの値がありません
	notFindParams("パラメタの値がありません")
	
	// 正しい拡張子のファイル名ではありません
	,notCorrectTypeFile("正しい拡張子のファイルではありません")
	
	// 対象のリソースファイルは読み込むことができません
	,canNotReadTargetResourceFiles("対象のリソースファイルは読み込むことができません")
	
	// 記帳機能を呼び出す
	,openingSelectLog("G04")
	;
	
	private final String msg;
	
	private BaseMessageCnst(String msg) {
		this.msg = msg;
	}
	
	/**
	 * メッセージを出力する
	 */

	public String getMessage() {
		return msg;
	}
}
