package jp.gushed;

import java.nio.file.Path;

/**
 * <h1>入力値形式検査</h1><br>
 * <p>
 * 入力値についての形式、妥当性、必須項目の確認処理を集めたクラス<br>
 * 
 * @version 0.0.1
 * @author onesword0618
 *
 */
public class InputValueFormat {

	public static InputValueFormat getInstance() {
		return new InputValueFormat();
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
