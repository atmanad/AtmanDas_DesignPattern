package adapter_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.atman.task_DesignPattern.Client;

public class OtherEmployee {
	private static Logger Logger = LogManager.getLogger(Client.class);
	public void doEmployee(String str) {
		Logger.info(str);
	}
}
