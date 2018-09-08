package main;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.security.Timestamp;
import java.time.LocalDateTime;
import java.util.Date;

/**
 * CSV出力処理
 * 
 * @author onesword0618
 */
public class CsvWriter {

	/**
	 * CSV出力準備
	 * 
	 * @param computation
	 */
	public void init(int computation) {

		// CSVの見出しを作成
		// TODO 何の項目を入れるべきか決めていない。
		LocalDateTime ldt = LocalDateTime.now();

		// 内容は一旦持ち出し予定
		exportCsv(computation, ldt);
	}

	/**
	 * CSV出力処理
	 * 
	 * @param computation 計算結果
	 * @param csvName CSVの見出し
	 * 
	 */
	public static void exportCsv(int computation, LocalDateTime ldt) {

		SystemConfig sys = new SystemConfig();
		
		// TODO この処理も検討してからメイン機能へ統合する
		try {
			// 出力場所を指定
			// ユーザディレクトリを取得
			// https://docs.oracle.com/javase/jp/10/docs/api/java/io/FileWriter.html
			FileWriter fileWriter = new FileWriter(sys.getUserHomePath() + "/bin/Caluc.csv", true);
			// https://docs.oracle.com/javase/jp/10/docs/api/java/io/PrintWriter.html
			// https://docs.oracle.com/javase/jp/10/docs/api/java/io/BufferedWriter.html
			PrintWriter printWriter = new PrintWriter(new BufferedWriter(fileWriter));

			// ヘッダーの指定
			// TODO DBでいうところのカラムに当たるところ何を表示させよう。
			printWriter.print("出力時刻");
			printWriter.print(",");
			printWriter.println("計算結果");

			// 内容セット
			printWriter.print(ldt);
			printWriter.print(",");
			printWriter.println(computation);
			

			// ファイルクローズ、この時点テキスト作成
			printWriter.close();

			System.out.println("CSVを出力しました。");

		}catch(

	IOException e)
	{
		e.printStackTrace();
	}
}}