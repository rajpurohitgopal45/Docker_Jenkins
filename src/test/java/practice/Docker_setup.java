package practice;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class Docker_setup {
	
	@BeforeTest
	public void start_docker() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start start_docker.bat");
		Thread.sleep(40000);
	}
	
	@AfterTest
	public void stop_docker() throws IOException, InterruptedException {
		Runtime.getRuntime().exec("cmd /c start stop_docker.bat");
		Thread.sleep(20000);
		Runtime.getRuntime().exec("taskkill /f /im cmd.exe");
	}
}
