package main;

/**
 * 演算処理<br>
 * 
 * @author onesword0618
 */
public class Calculator implements CalcOperatorInterface {
	
	// コンストラクタ
	public Calculator() {

	}

	@Override
	public Object plus(Object arg1, Object arg2) {
		
		return toInteger(arg1) + toInteger(arg2);
	}

	@Override
	public Object minus(Object arg1, Object arg2) {
			
		return toInteger(arg1) - toInteger(arg2);
	}

	@Override
	public Object mult(Object arg1, Object arg2) {
		
		return toInteger(arg1) * toInteger(arg2);
	}

	@Override
	public Object div(Object arg1, Object arg2) {

		return toInteger(arg1) / toInteger(arg2);
	}
	
	/**
	 * 型変換メソッド
	 * Object →　Integer　に型変換を行うメソッド
	 * 
	 * @param arg Object型の引数
	 * @return　Integer型の返却値
	 */
	private int toInteger(Object arg) {
		
		return Integer.parseInt(arg.toString());
	}
}
