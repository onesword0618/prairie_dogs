package main;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.nio.file.Paths;
import java.util.Properties;

public class ConfigWriter {
	public static void main(String[] args) {
		
		// TODO ここの処理機能は再検討してからメイン機能へ統合する
		String userHome = System.getProperty("user.home").toString();
		
		try (FileOutputStream f = new FileOutputStream(Paths.get(userHome) + "/bin/conf.csv");
				BufferedOutputStream outPut = new BufferedOutputStream(f)) {
			Properties properties = new Properties();
			properties.setProperty("sound", "off");
			properties.store(outPut, "onが有効でoffが無効です。");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
