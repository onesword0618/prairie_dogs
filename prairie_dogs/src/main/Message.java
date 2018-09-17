package main;

/**
 * メッセージのenum定数
 * 
 * @author onesword0618
 *
 */
public enum Message {

	/**
	 * 計算モードを選んでください
	 */
	openingGuid("計算モードを選んでください")
	
	/**
	 * 第１引数の整数を入力してください
	 */
	,inputGuidFirstArgument("第１引数の整数を入力してください")
	
	/**
	 * 第２引数の整数を入力してください
	 */
	,inputGuidSecondArgument("第２引数の整数を入力してください")
	
	/**
	 * 計算方式選択 <br>
	 * 0:加算/ 1:減算/ 2:乗算/ 3:除算
	 */
	
	,selectCalcMode(
			"0:加算 "
			+ "/ 1:減算 "
			+ "/ 2:乗算 "
			+ "/ 3:除算"
			)
	
	,isContinue("計算処理を終了しますか")
	
	,selectIsContinue("0:YES / 1:NO")
	
	,guidFInishCalc("計算処理を終了しますか")
	
	,guidFinish("計算処理は終了しました")
	
	,inspection("整数以外の入力値を検知しました。整数を入力してください。")
	
	,reInput("再入力してください")
	
	,prcsPluss("選択した計算処理方法は加算です")
	;
	
	private final String msg;
	
	private Message(String msg) {
		this.msg = msg;
	}
	
	public String getMessege() {
		return this.msg;
	}
}
