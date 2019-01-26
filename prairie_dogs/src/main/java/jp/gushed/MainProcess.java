package jp.gushed;

public class MainProcess {

	public static void main(String[] args) {

		//LogPropertiesMaker lpm = new LogPropertiesMaker();
		
		//lpm.createMsg();
		
		//Log lg = new Log();
		
		//lg.getLog();

		//TODO enum定数クラスを生成しておく？
		String propertiesName = "message.properties";
		
		//System.out.println((PropertiesReader.getInstance(propertiesName).getMessage(GuideMessageCnst.openingGuidMessage.getMessage())));
		
		getCall();
	}
	
	// 疎通確認
	public static String getCall() {
		return "Call Class OK";

	};
}
