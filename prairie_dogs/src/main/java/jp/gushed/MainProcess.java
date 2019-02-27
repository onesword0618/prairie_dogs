package jp.gushed;

/**
 * <h1>メインクラス</h1><br>
 * <p>
 * @version 0.0.1
 * @author onesword0618
 *
 */
public class MainProcess {

	public static void main(String[] args) {

		String csvFile = "test.csv";
		
		System.out.println(CsvReader.getInstance(csvFile));
		
		//LogPropertiesMaker lpm = new LogPropertiesMaker();
		
		//lpm.createMsg();
		
		//Log lg = new Log();
		
		//lg.getLog();

		//TODO enum定数クラスを生成しておく？
		
		String propertiesName = "message.properties";
		
		System.out.println(ConfigReader.getInstance(propertiesName).getMessage(GuideMessageCnst.openingGuidMessage.getMessage()));
		
		getCall();
	}
	
	// 疎通確認
	public static String getCall() {
		return "Call Class OK";

	};
}
