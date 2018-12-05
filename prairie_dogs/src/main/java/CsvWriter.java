package main.java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;

/**
 * CSV出力処理<br>
 * 
 * @author onesword0618
 */
public class CsvWriter {

	/**
	 * CSV出力処理<br>
	 * CSVファイルを作成して出力する
	 * 
	 * @param computation 計算結果
	 * @param csvName     CSVの見出し
	 * 
	 */
	public void exportCsv(int computation) {

		//SystemConfig sys = new SystemConfig();

		LocalDateTime ldt = LocalDateTime.now();

		try {
			// 出力場所を指定
			// ユーザディレクトリを取得
			FileWriter fileWriter = new FileWriter("/bin/Caluc.csv", true);
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

			// ヘッダーの指定
			// TODO ラベルを作成する
			printWriter.print("出力時刻");
			printWriter.print(",");
			printWriter.println("計算結果");

			// 内容セット
			printWriter.print(ldt);
			printWriter.print(",");
			printWriter.println(computation);

			// ファイルクローズ、この時点テキスト作成
			printWriter.close();

			//System.out.println(Message.exportCsv.getMessege());

		} catch (

		IOException e) {
			e.printStackTrace();
		}
	}
}