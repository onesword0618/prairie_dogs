package jp.gushed;

import java.io.IOException;

public class Core {

	public static void main(String[] args) {

		getCall();
		
		LogPropertiesMaker lpm = new LogPropertiesMaker();
		
		lpm.createMsg();
		
		Log lg = new Log();
		
		lg.getLog();

		try {
			//TODO enum定数クラスを生成しておく？
			String propertiesName = "message.properties";
			
			PropertiesReader.getInstance(propertiesName).getResource(GuideMessageCnst.openingGuidMessage.getMessage());
			
		} catch (IOException e) {
			System.out.println("呼び出し失敗");
		}
	}

	public static String getCall() {
		return "Call Class OK";

	};
}
