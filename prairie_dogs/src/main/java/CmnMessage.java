package main.java;

/**
 * メッセージのenum定数
 * 
 * @author onesword0618
 *
 */
public enum CmnMessage implements ConsoleInterface {

	/**
	 * 計算モードを選んでください
	 */
	openingGuid("I01")
	
	/**
	 * 第１引数の整数を入力してください
	 */
	,inputGuidFirstArgument("I02")
	
	/**
	 * 第２引数の整数を入力してください
	 */
	,inputGuidSecondArgument("I03")
	
	/**
	 * 計算方式選択 <br>
	 * 0:加算/ 1:減算/ 2:乗算/ 3:除算
	 */
	,selectCalcMode("I04")
	
	
	,isContinue("I05")
	
	,selectIsContinue("I06")
	
	,guidFInishCalc("計算処理を終了しますか")
	
	,guidFinish("計算処理は終了しました")
	
	,inspection("整数以外の入力値を検知しました。整数を入力してください。")
	
	,reInput("再入力してください")
	
	,prcsPluss("選択した計算処理方法は加算です")
	
	,prcsMinus("選択した計算処理方法は減算です")
	
	,prcsMultiply("選択した計算処理方法は乗算です")
	
	,prcsDivided("選択した計算処理方法は除算です")
	
	,exportCsv("CSVを出力しました。")
	;
	
	private final String msg;
	
	private CmnMessage(String msg) {		
		this.msg = msg;
	}
	
	public String getMessege() {
		
		return this.msg;
	}
}
