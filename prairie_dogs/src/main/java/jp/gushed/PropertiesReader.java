package jp.gushed;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * プロパティファイル読込<br>
 * <p>
 * 指定されたプロパティファイルを読込、プロパティファイルに格納された値を利用する
 * 
 * @author onesword0618
 *
 */
public class PropertiesReader implements ResourcesReaderInterface {

	// リソースファイルのディレクトリパス
	private static String RESOURCES_DIR_PATHS = "src/main/resources/";

	// プロパティリストが見つからない場合のデフォルト値
	private static String NONE = "NONE";

	// プロパティクラスのインスタンスを生成
	private static Properties properties = new Properties();

	// このクラスのインスタンスを生成
	private static PropertiesReader propertiesReader = new PropertiesReader();

	// デフォルトコンストラクタの生成
	private PropertiesReader() {
	}

	/**
	 * PropertiesReaderのインスタンスを生成する
	 * 
	 * @param propertiesName プロパティファイル名
	 * @return
	 * @throws IOException
	 */
	public static PropertiesReader getInstance(String propertiesName) throws IOException {

		return createPropertiesReader(propertiesName);
	}

	/**
	 * プロパティファイル生成
	 * <p>
	 * 引数で渡されたプロパティファイル名から、ファイルパスを合成し、存在すれば、その中身を取得する<br>
	 * 
	 * @throws IOException 対象ファイルに問題が起こった場合
	 * @param propertiesFile ファイル名
	 * @return プロパティファイルに格納している値
	 */
	private static PropertiesReader createPropertiesReader(String propertiesFile) throws IOException {

		// ファイルパスを合成
		String resourcesFilePath = RESOURCES_DIR_PATHS + propertiesFile;

		// リソースファイルの存在チェック
		try {
			isResourceFile(resourcesFilePath);
			// 存在しない場合
		} catch (IOException io) {
			// エラー詳細を取得する
			io.getStackTrace();
		}
		return PropertiesReader.propertiesReader;
	}

	// プロパティファイルの存在チェック
	private static boolean isResourceFile(String resourcesFilePath) throws IOException {

		BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(resourcesFilePath));

		try {
			properties.load(bufferedReader);
		} catch (IOException io) {
			// TODO メッセージクラス：「読込に失敗しました。」
			System.out.println(String.format("読込に失敗しました", bufferedReader));
			return false;
		}
		return true;
	}

	/**
	 * リソース取得確認
	 * <p>
	 * プロパティのキー値を渡して合致する設定値を取得する
	 * </p>
	 * 
	 * @param key 設定値に紐付いている値
	 * @return リソースに格納している設定値
	 */
	@Override
	public String getResource(String key) {

		return properties.getProperty(key, NONE);
	}
}
