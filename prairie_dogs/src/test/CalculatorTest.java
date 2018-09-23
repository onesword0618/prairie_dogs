package test;

import static org.junit.Assert.assertThat;
import static org.hamcrest.CoreMatchers.is;

import org.junit.Test;

import main.Calculator;

public class CalculatorTest {

	@Test
	public void 引数１と引数２で加算することができる() {
		// SetUp -初期化
		Calculator calc = new Calculator();
		int expected = 3;
		// Exercise -実行
		int actual = calc.pluss(1, 2);
		// Verify -検証
		assertThat(actual, is(expected));
	}

	@Test
	public void 引数１と引数２で減算することができる() {
		// SetUp -初期化
		Calculator calc = new Calculator();
		int expected = 1;
		// Exercise -実行
		int actual = calc.minus(2, 1);
		// Verify -検証
		assertThat(actual, is(expected));
	}

	@Test
	public void 引数１と引数２で乗算することができる() {
		// SetUp -初期化
		Calculator calc = new Calculator();
		int expected = 2;
		// Exercise -実行
		int actual = calc.multiply(2, 1);
		// Verify -検証
		assertThat(actual, is(expected));
	}

	@Test
	public void 引数１と引数２で除算することができる() {
		// SetUp -初期化
		Calculator calc = new Calculator();
		int expected = 2;
		// Exercise -実行x
		int actual = calc.divided(6, 3);
		// Verify -検証
		assertThat(actual, is(expected));
	}
}