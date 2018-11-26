package main;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.ResourceBundle;

/**
 * 設定ファイル読み込み処理
 * 
 * @author onesword0618
 */
public class ConfigReader {

	// メッセージプロパティを取得する
	ResourceBundle resourceBundle = ResourceBundle.getBundle("main.resources.message");

	// コンストラクタ
	ConfigReader() {

		final HashMap<String, String> messageMap = new HashMap<String, String>();
		
		// リソースハンドルから取得したものをハッシュマップに移し替え
		for (Enumeration<String> messageElements = resourceBundle.getKeys(); messageElements.hasMoreElements();) {
			String key = messageElements.nextElement().toString();
			String val = resourceBundle.getString(key);
			
			messageMap.put(key, val);
			
			System.out.println(messageMap.entrySet());
			
		}
	}

}