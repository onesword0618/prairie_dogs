package main;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 
 * @author onesword0618
 *
 */

public class CheckRegex {
	/**
	 * 正規表現：一文字が数値以外
	 * 
	 * @param str 対象文字列
	 * @return true: 数値以外である
	 */
	public static boolean checkChar(String str) {

		// 判定するパターンを生成
		// 半角数字以外であるか
		Pattern pattern = Pattern.compile("\\D");
		Matcher matcher = pattern.matcher(str);

		return matcher.find();

	}
	
	/**
	 * 正規表現：数値
	 * 
	 * @param str 対象文字列
	 * @return true: 数値である
	 */
	public static boolean checkNumber(String str) {

		// 判定するパターンを生成
		// 数値であるか
		Pattern pattern = Pattern.compile("^[0-9]*$");
		Matcher matcher = pattern.matcher(str);

		return matcher.find();
	}
	
	/**
	 * 正規表現：平仮名
	 * 
	 * @param str 対象文字列
	 * @return true: 数値である
	 */
	public static boolean checkHiragana(String str) {

		// 判定するパターンを生成
		// 平仮名であるか
		Pattern pattern = Pattern.compile("\\p{InHiragana}");
		Matcher matcher = pattern.matcher(str);

		return matcher.find();
	}
}
