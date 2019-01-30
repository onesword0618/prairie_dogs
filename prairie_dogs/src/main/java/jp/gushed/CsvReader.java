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
 * <h1>CSV読込</h1>
 * <p>
 * <h2>目的：外部リソース(CSVファイル)の読込</h2><br>
 * <p>
 * 指定されたファイル名を読込、中身を取得する<br>
 * <p>
 * 
 * @author onesword0618
 *
 */
public class CsvReader {

	/**
	 * <h2>CSVファイルの読込処理<h2>
	 * <p>
	 * 引数で渡されたCSVファイルを元に読込処理を実行する<br>
	 * <p>
	 * 
	 * @param csvFileName CSVファイル名
	 * @exception IOException 引数のCSVファイル名に不備があった場合、入出力エラー
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
	 * <h2>CSVファイルの読込実行</h2>
	 * <p>
	 * @param filePath ファイル名
	 * @throws IOException
	 */
	private static void loadCsv(String filePath) throws IOException {
		if(
		VerifyInputValue.getInstance().isEmpty(filePath)) {
			System.out.println(BaseMessageCnst.notFindParams);
		};

		// ストリーム形式で読込処理を行う
		try (Stream<String> lines = Files.lines(Paths.get(filePath))) {
			List<List<String>> values = lines.map(line -> Arrays.asList(line.split(","))).collect(Collectors.toList());
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
	 * <h2>CsvReaderのインスタンス生成</h2><br>
	 * <p>
	 * 
	 * @param value
	 * @return
	 */
	public static CsvReader getInstance(String value) {

		return new CsvReader(value);
	}
}
