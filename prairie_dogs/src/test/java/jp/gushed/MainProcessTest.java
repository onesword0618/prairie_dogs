package jp.gushed;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import org.junit.Test;

public class MainProcessTest {

	@Test
	public void 基幹クラスの呼び出し確認() {
		// SetUp	-初期化
		// メインクラスの呼び出しなので今回は初期化は不要
		// 期待値
		String expected = "Call Class OK";
		// Exercise -実行
		String actual = MainProcess.getCall();
		// Verify -検証
		assertThat(actual, is(expected));
	}

}
