package practice;

import java.net.MalformedURLException;
import java.net.URL;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class Docker_Chrome {
	@Test
	public void chrome() throws MalformedURLException, InterruptedException {
		
		DesiredCapabilities cap = DesiredCapabilities.chrome();
	//	cap.setPlatform(Platform.LINUX);
	//	cap.setVersion("");
		RemoteWebDriver driver = new RemoteWebDriver(new URL("http://192.168.99.100:4444/wd/hub"),cap);	
		driver.get("https://www.guru99.com");
		System.out.println("welcome chrome to docker and jenkins");
	//	Thread.sleep(5000);
		driver.close();
	}
}
