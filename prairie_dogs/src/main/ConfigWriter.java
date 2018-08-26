package main;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class ConfigWriter {
	public static void main(String[] args) {
		
		// TODO ここの処理機能は再検討してからメイン機能へ統合する
		try (FileOutputStream f = new FileOutputStream("conf.txt");
				BufferedOutputStream outPut = new BufferedOutputStream(f)) {
			Properties properties = new Properties();
			properties.setProperty("sound", "off");
			properties.store(outPut, "onが有効でoffが無効です。");
		} catch (Exception e) {
			e.getStackTrace();
		}
	}
}
