package jp.gushed;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;
import org.junit.Test;

public class PropertiesReaderTest {

	@Test
	public void G01の取得確認() {

		// 期待値
		String expected = "家計簿アプリケーションへようこそ";
		String actual = null;
		// SetUp -初期化
		try {
			// Exercise -実行
			actual = PropertiesReader.getInstance("message.properties").getResource("G01");
		} catch (Exception e) {
			fail("呼び出し失敗");
		}
		// Verify -検証
		assertThat(actual, is(expected));
	}
}
