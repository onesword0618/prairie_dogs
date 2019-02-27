package jp.gushed;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <h1>CSVファイル読込</h1><br>
 * <p>
 * 外部リソース(*.csv)の読込処理の責務を負う<br>
 * 指定したリソースのパスを読込、その中身を取得する<br>
 * 指定したリソース、パスに不備があるときは例外を送出する<br>
 * 
 * @version 0.0.1
 * @author onesword0618
 * 
 */
public class CsvReader {

	/**
	 * CSVファイルの読込処理<br>
	 * 
	 * CsvReaderのインスタンス<br>
	 * 引数で渡されたCSVファイルを元に読込処理を実行する<br>
	 * 
	 * @param csvFileName CSVファイル名
	 * @exception IOException 引数のCSVファイル名に不備があった場合
	 */
	private CsvReader(String csvFileName) {
		// 引数で渡したファイル名でファイルパスを探す
		String filePath = CsvReader.class.getClassLoader().getResource(csvFileName).getPath();
		try {
			loadCsv(filePath);
		} catch (IOException e) {
			System.out.println("csvFileName" + "の処理に問題が起こりました");
			e.printStackTrace();
		}
	}

	/**
	 * CSVファイルの読込処理実行<br>
	 * 
	 * @param filePath ファイルパス
	 * @throws IOException
	 */
	private static void loadCsv(String filePath) throws IOException {
		if(InputValueFormat.getInstance().isEmpty(filePath)) {
			System.out.println(BaseMessageCnst.notFindParams);
		};

		// ストリーム形式で読込処理を行う
		try (Stream<String> Csvlines = Files.lines(Paths.get(filePath))) {
			List<List<String>> values = Csvlines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
			System.out.println(Arrays.toString(values.toArray()));

			List<String> names = new ArrayList<String>();
			List<Integer> ages = new ArrayList<Integer>();
			for (List<String> value : values) {
				names.add(value.get(0));

				ages.add(Integer.parseInt(value.get(1)));
			}
			String[] name_ary = names.toArray(new String[names.size()]);
			int[] age_ary = ages.stream().mapToInt(Integer::intValue).toArray();

			System.out.println(Arrays.toString(name_ary));
			System.out.println(Arrays.toString(age_ary));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	/**
	 * CsvReaderのインスタンス生成<br>
	 * 当クラスのインスタンスを取得する際に呼び出す<p>
	 * 
	 * @param value
	 * @return 生成したインスタンス
	 */
	public static CsvReader getInstance(String value) {

		return new CsvReader(value);
	}
	
	/**
	 * Csvレコードの読み出し<br>
	 * 指定したリソースのファイルの中身をListの形式で保持する
	 * 
	 * @return
	 */
	public List<String> readCsvFile() {
		
		// TODO CSVファイルの形式チェック
		// TODO 中身の有無チェック
		// TODO カンマ確認
		// TODO 特殊文字の確認
		// Listに紐付ける　データをDTO形式にしてそれをリストで補遺する
		
		return null;
		
	}
	
}
