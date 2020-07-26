package state_pattern;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.atman.task_DesignPattern.Client;


public class Vibration implements MobileAlertState {

	private static Logger Logger = LogManager.getLogger(Client.class);
	public void alert(AlertStateContext ctx) {
		// TODO Auto-generated method stub
		Logger.info("Vibration........");
		
	}


    
   
}
