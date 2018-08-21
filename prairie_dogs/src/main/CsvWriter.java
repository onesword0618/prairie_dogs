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
	 * @param strList
	 */
	public static void exportCsv(List<Integer> intList, String[] strList) {

		try {
			// 出力場所を指定
			// ユーザディレクトリを取得
			String userHome = System.getProperty("user.home").toString();
			
			FileWriter f = new FileWriter(userHome + "/bin/Sample.csv", false);
			PrintWriter p = new PrintWriter(new BufferedWriter(f));

			// ヘッダーの指定
			p.print("順番");
			p.print(",");
			p.print("名前");
			p.println();

			// 内容セット
			for (int i = 0; i < intList.size(); i++) {
				p.print(strList[i]);
				p.print(",");
				p.print(intList.get(i).intValue());
				p.println();
			}

			// ファイルクローズ
			p.close();

			System.out.println("Output CSV");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}