package main.java;

import java.io.File;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.StandardCharsets;
import java.nio.file.DirectoryStream;
import java.nio.file.FileSystem;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Properties;
import java.util.ResourceBundle;
import java.util.stream.Stream;

/**
 * 設定ファイル読み込み処理
 * 
 * @author onesword0618
 */
public class ConfigReader implements ConfigReaderInterface {

	// カレントディレクトリを取得する
	private String dir = System.getProperty("user.dir");
	
	private String resources = "//main//java//resources";
	
	private String fileName = "message.properties";
	
	private Properties pp = new Properties();

	// コンストラクタ
	ConfigReader() {

		try {
			
			Path file = Paths.get(dir + resources);
			
			//Files.list(file).forEach(System.out::println);
			
			//Stream<Path> files = Files.list(Paths.get(dir));
			
			System.out.println(file);
			
			//Path path = Paths.get();
			
		} catch (Exception e) {
			System.out.println("nothing");
		}
	}

	public String getProperty(String key) {

		return pp.getProperty(key);

	}
}
