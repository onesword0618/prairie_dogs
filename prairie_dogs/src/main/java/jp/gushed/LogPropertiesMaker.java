package jp.gushed;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.logging.LogManager;
import java.util.logging.Logger;

/**
 * ログファイル出力
 * 
 * @version 0.0.1
 * @author onesword0618
 *
 */
public class LogPropertiesMaker {

	protected static final String LOGGING_PROPERTIES_DATA = "handlers=java.util.logging.ConsoleHandler\n"
			+ ".level=INFO\n" + "java.util.logging.ConsoleHandler.level=INFO\n" + "java.util.logging.SimpleFormatter";

	static {

		final Logger logger = Logger.getLogger("Log");
		InputStream inStream = null;
		try {
			inStream = new ByteArrayInputStream(LOGGING_PROPERTIES_DATA.getBytes(StandardCharsets.UTF_8));

			try {
				LogManager.getLogManager().readConfiguration(inStream);
				logger.config("ログ設定: LogManageを設定しました。");
			} catch (IOException e) {

				logger.warning("ログ設定: LogManager設定の際に例外が発生しました" + e.toString());
			}
		} catch (Exception e) {
			logger.severe("ログ設定: UTF-8エンコーディングがサポートされておりません" + e.toString());
		} finally {
			try {
				if (inStream != null)
					inStream.close();
			} catch (IOException e) {
				logger.warning("ログ設定：ログ設定プロパティファイルのストリームクローズ時に例外が発生しました" + e.toString());
			}
		}

	}

	public void createMsg() {
		final Logger log = Logger.getLogger("Log");

		log.info("寒いでござる");
	}
}
