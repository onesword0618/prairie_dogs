package jp.gushed;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class PropertiesReaderTest {

	@Test
	public void G01の取得確認() {

		// 期待値
		String expected = "家計簿アプリケーションへようこそ";
		
		// SetUp -初期化
		String actual = null;
		
		try {
			// Exercise -実行
			actual = PropertiesReader.getInstance("message.properties").getMessage("G01");
		} catch (Exception e) {
			fail("呼び出し失敗");
		}
		// Verify -検証
		assertThat(actual, is(expected));
	}
	
	@Test
	public void test用リソース読込() {

		// 期待値
		String expected = "家計簿アプリケーションへようこそ";
		
		// SetUp -初期化
		String actual = null;
		
		
		try {
			// Exercise -実行
			actual = PropertiesReader.getInstance("messageTestIsOK.properties").getMessage("G01");
		} catch (Exception e) {
			fail("呼び出し失敗");
		}
		// Verify -検証
		assertThat(actual, is(expected));
	}
}
