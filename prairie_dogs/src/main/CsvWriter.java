package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * CSV出力処理
 * 
 * @author onesword0618
 */
public class CsvWriter {

	/**
	 * CSV出力準備
	 * 
	 * @param rsltList
	 */
	public void init(List<Integer> rsltList) {

		String[] namelist = { "計算結果", "B", "C" };

		exportCsv(rsltList, namelist);
	}

	/**
	 * CSV出力処理
	 * 
	 * @param intList
	 * @param strList https://docs.oracle.com/javase/jp/10/docs/api/java/io/BufferedWriter.html
	 * 
	 */
	public static void exportCsv(List<Integer> intList, String[] strList) {

		// TODO この処理も検討してからメイン機能へ統合する
		try {
			// 出力場所を指定
			// ユーザディレクトリを取得
			String userHome = System.getProperty("user.home").toString();

			FileWriter fileWriter = new FileWriter(userHome + "/bin/Sample.csv", false);
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

			// ヘッダーの指定
			printWriter.print("順番");
			printWriter.print(",");
			printWriter.print("名前");
			printWriter.println();

			// 内容セット
			for (int i = 0; i < intList.size(); i++) {
				printWriter.print(strList[i]);
				printWriter.print(",");
				printWriter.print(intList.get(i).intValue());
				printWriter.println();
			}

			// ファイルクローズ
			printWriter.close();

			System.out.println("Output CSV");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}