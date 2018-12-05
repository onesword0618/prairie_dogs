package main.java;

public interface ConfigReaderInterface {
	
	/**
	 * プロパティ値の取得
	 * 
	 * @param key
	 * @return key値に紐付いたvalue値
	 */
	public abstract String getProperty(final String key);

}
