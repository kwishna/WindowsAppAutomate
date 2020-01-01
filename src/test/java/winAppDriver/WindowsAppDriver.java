package winAppDriver;

import io.appium.java_client.windows.WindowsDriver;
import io.appium.java_client.windows.WindowsElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * For Automating Windows Applications.
 *
 * Must Have 'Windows Application Driver' Installed (.msi File). Can Be Found At The Below Provided Link.
 * https://github.com/Microsoft/WinAppDriver/releases
 * For Inspecting Windows Application : WinAppDriver UI Recorder (Can Be Downloaded From The Above Link)
 *
 * Import Appium Library From Maven Repo. (Nodes JS appium Server Not Required.)
 *
 * We Will Start WinAppDriver Server. Can Be Found At Location : "C:\Program Files (x86)\Windows Application Driver"
 * as 'WinAppDriver.exe'. (On Installing Windows Application Driver, As Mentioned Above).
 *
 * Once The WinAppDriver Is Started : Following Message Is Printed On Conole.
 * Windows Application Driver listening for requests at: http://127.0.0.1:4723/
 *
 * It Can Be Started As The Below Mentioned Way As-Well.
 * WinAppDriver.exe 4727
 * WinAppDriver.exe 10.0.0.10 4725
 * WinAppDriver.exe 10.0.0.10 4723/wd/hub
 * Note: You must run WinAppDriver.exe as administrator to listen to a different IP address and port.
 *
 */
public class WindowsAppDriver {

	private static WindowsDriver<WindowsElement> winDriver = null;
	public static final String URL = "http://127.0.0.1:4723/";

	public static void main(String[] args) throws MalformedURLException {

		DesiredCapabilities caps = new DesiredCapabilities();
		caps.setCapability("app", "C:\\Program Files\\Notepad++\\notepad++.exe");
		caps.setCapability("ms:experimental-webdriver", true);
		caps.setCapability("ms:waitForAppLaunch", "10");

		winDriver = new WindowsDriver<>(new URL(URL), caps);
		winDriver.close();

	}
}
