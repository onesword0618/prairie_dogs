package jp.gushed;

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
