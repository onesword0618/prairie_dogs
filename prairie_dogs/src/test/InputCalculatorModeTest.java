package test;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

import org.junit.Test;

import main.InputCalculatorMode;

public class InputCalculatorModeTest {

	@Test
	public void 引数１の加算方法で引数2と引数3を加算することができる() {
		// SetUp -初期化
		InputCalculatorMode inputCalc = new InputCalculatorMode();
		int expected = 3;
		// Exercise -実行
		int actual = inputCalc.selectMode(0, 1, 2);
		// Verify -検証
		assertThat(actual, is(expected));
	}

	@Test
	public void 引数１の減算方法で引数２と引数３を減算することができる() {
		// SetUp -初期化
		InputCalculatorMode inputCalc = new InputCalculatorMode();
		int expected = 1;
		// Exercise -実行
		int actual = inputCalc.selectMode(1, 2, 1);
		// Verify -検証
		assertThat(actual, is(expected));
	}

	@Test
	public void 引数１の乗算方法で引数２と引数３を乗算することができる() {
		// SetUp -初期化
		InputCalculatorMode inputCalc = new InputCalculatorMode();
		int expected = 6;
		// Exercise -実行
		int actual = inputCalc.selectMode(2, 3, 2);
		// Verify -検証
		assertThat(actual, is(expected));
	}

	@Test
	public void 引数１の除算方法で引数２と引数３を除算することができる() {
		// SetUp -初期化
		InputCalculatorMode inputCalc = new InputCalculatorMode();
		int expected = 2;
		// Exercise -実行
		int actual = inputCalc.selectMode(3, 6, 3);
		// Verify -検証
		assertThat(actual, is(expected));
	}
}
