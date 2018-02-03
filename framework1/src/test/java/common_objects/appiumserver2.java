package common_objects;

import java.io.IOException;

public class appiumserver2 {
	
	
	public void startServer() {
		try {
			Runtime.getRuntime().exec("/bin/bash /appium --address 127.0.0.1 ");
			Thread.sleep(10000);
		} catch (IOException | InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public void stopServer() {
		Runtime runtime = Runtime.getRuntime();
		try {
			runtime.exec("/bin/bash /kill node");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		appiumserver2 appiumServer = new appiumserver2();
		appiumServer.startServer();
 
		appiumServer.stopServer();
	}
}


