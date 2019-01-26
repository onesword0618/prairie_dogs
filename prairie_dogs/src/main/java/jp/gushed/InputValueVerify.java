package jp.gushed;

import java.nio.file.Path;

/**
 * 入力値不整合確認
 * <p>
 * 入力値についての不整合確認処理で扱う処理を集めたクラス<br>
 * <p>
 * 
 * @author onesword0618
 *
 */
public class InputValueVerify {

	
	public static InputValueVerify getInstance() {
		return new InputValueVerify();
	}
	
	/**
	 * 引数のパラメタが空かを判定する
	 * @param inputValue
	 * @return
	 */
	public boolean isEmpty(String inputValue) {
		
		return inputValue.isEmpty();
	}
	
	/**
	 * 引数のパラメタの拡張子がプロパティかどうかを判定する
	 * 
	 * @param typeFile
	 * @return
	 */
	public boolean isType(String typeFile) {
		return typeFile.matches("*.properties");
	}

	public boolean isEmpty(Path filePath) {
		// TODO Auto-generated method stub
		return false;
	}
}
