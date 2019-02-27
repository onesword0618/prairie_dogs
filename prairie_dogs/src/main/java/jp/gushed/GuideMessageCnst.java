package jp.gushed;

/**
 * <h1>共通メッセージ</h1><br>
 * <p>
 * 管理機能と記帳機能で共通として使用されるメッセージを格納する<br>
 * 
 * @version 0.0.1
 * @author onesword0618
 *
 */
public enum GuideMessageCnst implements MessageInterface {

	// 家計簿アプリケーションへようこそ
	openingGuidMessage("G01")
	
	// どの機能を呼び出しますか？
	,openingGuidCallUnit("G02")
	
	// 管理機能を呼び出す
	,openingSelectMng("G03")
	
	// 記帳機能を呼び出す
	,openingSelectLog("G04")
	;
	
	private final String msg;
	
	private GuideMessageCnst(String msg) {
		this.msg = msg;
	}
	
	/**
	 * メッセージを出力する
	 */
	@Override
	public String getMessage() {
		return msg;
	}
}
