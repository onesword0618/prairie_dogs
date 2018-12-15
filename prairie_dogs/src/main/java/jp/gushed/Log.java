package jp.gushed;

import java.util.logging.Logger;

public class Log {

	Log(){
		
	};
	
	
	public void getLog() {
		
		final Logger logger = Logger.getLogger("Log");
		logger.info("Logging Now");
	}
	
}
