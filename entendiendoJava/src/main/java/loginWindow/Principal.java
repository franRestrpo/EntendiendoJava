package loginWindow;

import java.awt.EventQueue;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Principal {
	/**
	 * Launch the application.
	 */
	static final Logger slf4jLogger = LoggerFactory.getLogger(Principal.class);
	public static void main(String[] args) {
		   slf4jLogger.trace("Hello World!");

	        String name = "Abhijit";
	        slf4jLogger.debug("Hi, {}", name);
	        slf4jLogger.info("Welcome to the HelloWorld example of Logback.");
	        slf4jLogger.warn("Dummy warning message.");
	        slf4jLogger.error("Dummy error message.");
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginWindows frame = new LoginWindows();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

}
