import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Browser {

    public static void main(String[] args) {
        /**
         * 1. Download chrome driver file
         * 2. Help application to know where is the driver file
         * 3. Create chromeDriver Object
         * 4. Open a website in Chrome browser
         * */
        String chromeDriverPath = "C:\\Users\\Jamal\\IdeaProjects\\Browser\\drivers\\chromedriver.exe";
        System.setProperty("webdriver.chrome.driver", chromeDriverPath);
        WebDriver chromeDriver = new ChromeDriver();
        String url = "https://www.google.com/gmail";
        chromeDriver.get(url);
        //chromeDriver.close();

    }

}