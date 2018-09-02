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

		// CSVのタイトルも決めてもらったほうがわかりやすい？
		// 一律こちらで決めたほうがわかりやすいかもしれない
		
		// CSVの見出しを作成
		// TODO 何の項目を入れるべきか決めていない。
		String[] namelist = { "計算結果", "B", "C" };

		// 内容は一旦持ち出し予定
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
			// 環境依存を抜け出せるように変更しておく。
			// Linuxでは動くか、他の環境は一切不明
			// windowsは多分動かない
			String userHome = System.getProperty("user.home").toString();

			// 一旦、決め打ちで作成
			// ディレクトリがなかった場合はどうするかは未確定
			// Java側で提供されているAPIがあるのか、他のコマンドを載せて起動させるようにするのかは不明。
			FileWriter fileWriter = new FileWriter(userHome + "/bin/Sample.csv", false);
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

			// ヘッダーの指定
			// TODO DBでいうところのカラムに当たるところ何を表示させよう。
			printWriter.print("順番");
			printWriter.print(",");
			printWriter.print("計算結果");
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