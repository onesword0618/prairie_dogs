package jp.gushed;

/**
 * 入力値不整合確認
 * <p>
 * 入力値についての不整合確認処理で扱う処理を集めたクラス
 * 
 * 
 * @author onesword0618
 *
 */
public class ValueInputVerify {

	
	public static ValueInputVerify getInstance() {
		return new ValueInputVerify();
	}
	
	/**
	 * 引数のパラメタが空かを判定する
	 * @param inputValue
	 * @return
	 */
	public boolean isEmpty(String inputValue) {
		
		return inputValue.isEmpty();
	}
	
	//public boolean isType(String TypeFile) {
		//return TypeFile.matches()
	//}
}
