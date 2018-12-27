package jp.gushed;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * プロパティファイル読込<br>
 * <p>
 * 
 * 指定されたプロパティファイルを読込、プロパティファイルに格納された値を返却する。
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
	 * PropertiesReaderのインスタンスを生成する<br>
	 * <p>
	 * 
	 * プロパティファイル名を引数に渡して該当ディレクトリに存在するかチェック。<br>
	 * trueの場合：PropertiesReaderのインスタンスを生成する<br>
	 * falseの場合：入出力エラー
	 * 
	 * @param propertiesName プロパティファイル名
	 * @return プロパティファイル
	 * @throws IOException 渡されたプロパティファイル名がなかったらエラー
	 */
	public static PropertiesReader getInstance(String propertiesName) throws IOException {

		return createPropertiesReader(propertiesName);
	}

	/**
	 * プロパティファイル生成
	 * <p>
	 * 
	 * 引数で渡されたプロパティファイル名から、ファイルパスを合成し、存在すれば、その中身を取得する<br>
	 * 読み込めない場合は、入出力エラー
	 * 
	 * @param propertiesFile プロパティファイル名
	 * @return PropertiesReaderのインスタンス
	 * @throws IOException
	 */
	private static PropertiesReader createPropertiesReader(String propertiesFileName) throws IOException {

		// ファイルパスを合成
		String resourcesFilePath = RESOURCES_DIR_PATHS + propertiesFileName;

		// プロパティファイルの存在チェック
		try {
			isResourceFile(resourcesFilePath);
			// 存在しない場合
		} catch (IOException io) {
			io.getStackTrace();
		}
		// インスタンスを返却
		return PropertiesReader.propertiesReader;

	}

	/**
	 * プロパティファイルの存在チェック
	 * <p>
	 * 
	 * 引数で渡されたパスにプロパティファイルが存在するかを評価する<br>
	 * <li>trueの場合:読み込まれたプロパティファイルが返却される</li>
	 * 
	 * <li>falseの場合:入出力エラー</li>
	 * <p>
	 * 
	 * @param resourcesFilePath
	 * @return
	 * @throws IOException
	 */
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
	 * 
	 * 引数のkey値を評価して合致する設定値を返却する<br>
	 * 渡された引数が存在しない場合はデフォルト値を返却する<br>
	 * <p>
	 * 
	 * @param key 設定値に紐付いている値
	 * @return リソースに格納している設定値
	 */
	@Override
	public String getResource(String key) {

		return properties.getProperty(key, NONE);
	}
}
