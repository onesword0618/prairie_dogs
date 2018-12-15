package jp.gushed;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesReader implements ResourcesReaderInterface {

	private static String resourcesPaths = "src/main/resources/";

	private static String propertiesPaths = "message.properties";

	private static Properties properties = new Properties();
	
	// コンストラクタ
	PropertiesReader() throws IOException {

		String propertiesResourcesPaths = resourcesPaths + propertiesPaths;

		BufferedReader bf = Files.newBufferedReader(Paths.get(propertiesResourcesPaths), StandardCharsets.UTF_8);

		try {

			properties.load(bf);
		} catch (IOException e) {
			System.out.println(String.format("読込に失敗した", bf));
		}
	}
	
	/**
	 * メッセージ取得
	 * <p>
	 * プロパティのキー値を渡して合致するリソースを取得する
	 * </p>
	 * @param key
	 * @return
	 */
	@Override
	public String readResource(String key) {
	
		return properties.getProperty(key);
	}
}
