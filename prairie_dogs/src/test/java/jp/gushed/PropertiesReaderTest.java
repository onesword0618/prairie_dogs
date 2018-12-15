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
			PropertiesReader g01 = new PropertiesReader();
			// Exercise -実行
			actual = g01.readResource("G01");
		} catch (Exception e) {
			fail("呼び出し失敗");
		}
		// Verify -検証
		assertThat(actual, is(expected));
	}

	@Test
	public void G02の取得確認() {

		// 期待値
		String expected = "どの機能を呼び出しますか？";
		String actual = null;
		// SetUp -初期化
		try {
			PropertiesReader g02 = new PropertiesReader();
			// Exercise -実行
			actual = g02.readResource("G02");
		} catch (Exception e) {
			fail("呼び出し失敗");
		}
		// Verify -検証
		assertThat(actual, is(expected));

	}
	
	@Test
	public void G03の取得確認() {

		// 期待値
		String expected = "管理機能を呼び出す";
		String actual = null;
		// SetUp -初期化
		try {
			PropertiesReader g03 = new PropertiesReader();
			// Exercise -実行
			actual = g03.readResource("G03");
		} catch (Exception e) {
			fail("呼び出し失敗");
		}
		// Verify -検証
		assertThat(actual, is(expected));

	}
	
	@Test
	public void G04の取得確認() {

		// 期待値
		String expected = "記帳機能を呼び出す";
		String actual = null;
		// SetUp -初期化
		try {
			PropertiesReader g04 = new PropertiesReader();
			// Exercise -実行
			actual = g04.readResource("G04");
		} catch (Exception e) {
			fail("呼び出し失敗");
		}
		// Verify -検証
		assertThat(actual, is(expected));

	}
	
	@Test
	public void M01の取得確認() {

		// 期待値
		String expected = "管理機能";
		String actual = null;
		// SetUp -初期化
		try {
			PropertiesReader m01 = new PropertiesReader();
			// Exercise -実行
			actual = m01.readResource("M01");
		} catch (Exception e) {
			fail("呼び出し失敗");
		}
		// Verify -検証
		assertThat(actual, is(expected));

	}
}
