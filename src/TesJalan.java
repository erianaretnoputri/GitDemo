import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class TesJalan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        System.out.println("Test Jalan");
        System.out.println("Test Jalan ke 2");
        System.out.println("Test Jalan ke 3");
	}
	
	public static void IOApps() {
		// TODO Auto-generated method stub
		System.out.println("IOSApp");
	}


}
