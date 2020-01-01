package winium;

import org.openqa.selenium.MutableCapabilities;
import org.openqa.selenium.winium.DesktopOptions;
import org.openqa.selenium.winium.WiniumDriver;
import org.openqa.selenium.winium.WiniumDriverService;
import java.io.File;
import java.io.IOException;
import java.net.URL;

/**
 *
 * // NOT WORKING ...
 *
 * Download Winium Desktop Driver
 * https://github.com/2gis/Winium.Desktop/releases
 *
 * Add Winium Java Library From Maven
 */
public class WiniumWinDriver {

	public static void main(String[] args) throws IOException {

		DesktopOptions ops = new DesktopOptions();
		ops.setApplicationPath("C:\\Program Files\\Notepad++\\notepad++.exe");

//		WiniumDriverService service = new WiniumDriverService.Builder()
//				.usingDriverExecutable(new File("E:\\Winium.Desktop.Driver.exe"))
//				.usingAnyFreePort()
//				.withVerbose(true)
//				.withSilent(false)
//				.buildDesktopService();
//
//		service.start();

		WiniumDriver driver = new WiniumDriver(new URL("https://localhost:9999"), ops);
		driver.close();

//		service.stop();
	}

	// NOT WORKING
}
