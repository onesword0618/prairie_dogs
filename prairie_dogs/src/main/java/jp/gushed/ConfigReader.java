package jp.gushed;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

/**
 * <h1>プロパティファイル読込</h1><br>
 * <p>
 * 外部リソース(プロパティファイル)の読込<br>
 * 指定されたプロパティファイルを読込、渡されたkey値に対するメッセージを返却する<br>
 * 
 * @version 0.0.1
 * @author onesword0618
 *
 */
public class ConfigReader {

	// key値が見つからない場合のデフォルト値
	private static String NO_MESSAGE = "E01";

	// Propertiesのインスタンス生成
	private static Properties properties = new Properties();

	/**
	 * プロパティ情報の読込処理<br>
	 * <p>
	 * 引数で渡されたプロパティファイル名を元に読込処理を実行する<br>
	 * <p>
	 * 
	 * @param propertiesFileName プロパティファイル名
	 * @exception IOException 引数のプロパティファイル名に不備があった場合、入出力エラー
	 * 
	 */
	private ConfigReader(String propertiesFileName) {

		// ファイルパスを取得する
		String filePath = ConfigReader.class.getClassLoader().getResource(propertiesFileName).getPath();
		// 引数に不整合が合った場合は入出力エラーを出力する
		try {
			loadProperties(filePath);
		} catch (IOException e) {
			// TODO 下記のメッセージの引数との合成方法及び出力方法は検討する
			System.out.println("propertiesFileName" + "の処理に問題が起こりました");
			e.printStackTrace();
		}
	}

	/**
	 * プロパティファイルの読込実行<br>
	 * <p>
	 * 引数で渡されたプロパティファイル名でリソースディレクトリパスを合成する<br>
	 * 対象が読込可能な状態ならば、その中身を取得する<br>
	 * 読み込めない場合は、入出力エラーをthrowsする<br>
	 * 
	 * @param propertiesFileName プロパティファイル名
	 * @throws IOException
	 * 
	 */
	private static void loadProperties(String filePath) throws IOException {

		// 引数が空かどうかを判定
		if (InputValueFormat.getInstance().isEmpty(filePath)) {
			System.out.println(BaseMessageCnst.notFindParams);
		}
		;

		// ストリーム形式で読み込んでいる
		BufferedReader bufferedReader = Files.newBufferedReader(Paths.get(filePath));
		// 実際に読み込んでいるメソッド、このあとハッシュマップ形式でメモリ上に格納されている
		properties.load(bufferedReader);

	}

	/**
	 * PropertiesReaderのインスタンス生成<br>
	 * <p>
	 * プロパティファイル名を渡してPropertiesReaderのインスタンス生成を行う<br>
	 * <p>
	 * 
	 * @see PropertiesReader(String propertiesFileName)
	 * @param propertiesName プロパティファイル名
	 * @return PropertiesReaderのインスタンス
	 */
	public static ConfigReader getInstance(String propertiesFileName) {

		return new ConfigReader(propertiesFileName);

	}

	/**
	 * リソース取得確認<br>
	 * <p>
	 * 
	 * 引数のkey値を評価して合致する設定値を返却する<br>
	 * 渡された引数が存在しない場合はデフォルト値を返却する<br>
	 * <p>
	 * 
	 * @param key 設定値に紐付いている値
	 * @return リソースに格納している設定値
	 */
	public String getMessage(String key) {

		return properties.getProperty(key, NO_MESSAGE);
	}
}
