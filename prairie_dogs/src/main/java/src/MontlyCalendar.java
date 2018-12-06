package main;

import java.util.Calendar;

/**
 * カレンダー出力処理
 * 
 * @author onesword0618
 */
public class MontlyCalendar {
	/**
	 * 年
	 */
	private int year;

	/**
	 * 月
	 */
	private int month;

	/**
	 * カレンダー表生成
	 */
	private int[][] calendarMatrix = new int[6][7];

	/**
	 * 初日
	 */
	private int startDay = 0;

	/**
	 * 月末日
	 */
	private int lastDay = 0;

	/**
	 * カレンダー表オブジェクト生成
	 * 
	 * @param year
	 * @param month
	 */
	public MontlyCalendar(int year, int month) {
		this.year = year;
		this.month = month;
		createMontlyCalender();
	}

	/**
	 * メイン処理
	 * 
	 * @author onesword0618
	 */
	public static void main(String[] args) {
		int currentYear = Calendar.getInstance().get(Calendar.YEAR);
		for (int month = 1; month <= 12; month++) {
			System.out.println(currentYear + "年" + month + "月");
			System.out.println(new MontlyCalendar(currentYear, month));
		}
	}

	/**
	 * カレンダー表作成
	 */
	private void createMontlyCalender() {
		// インスタンス生成
		Calendar calendar = Calendar.getInstance();
		calendar.clear();

		// 初日を取得
		calendar.set(year, month - 1, 1);
		startDay = calendar.get(calendar.getFirstDayOfWeek());

		// 月末日を取得
		// TODO 処理方法は再検討中
		calendar.add(calendar.MONTH, 1);
		calendar.add(calendar.DATE, -1);
		lastDay = calendar.get(calendar.DATE);

		// カレンダー表作成
		int row = 0;
		// 何曜日スタート設定
		int column = startDay - 1;
		for (int date = 1; date <= lastDay; date++) {
			// 月末日分、表が増加
			calendarMatrix[row][column] = date;
			if (column == 6) {
				row++;
				column = 0;
			} else {
				column++;
			}
		}
	}

	/**
	 * カレンダー機能利用
	 */
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		loop: for (int i = 0; i < calendarMatrix.length; i++) {
			for (int j = 0; j < calendarMatrix[i].length; j++) {
				int day = calendarMatrix[i][j];

				if (day == 0) {
					if (i != 0) {
						break loop;
					}
					sb.append("   ");
				} else if (day < 10) {
					sb.append("").append(day);
				} else {
					sb.append("").append(day);
				}
			}
			sb.append("\r\n");
		}
		return sb.toString();
	}
}
