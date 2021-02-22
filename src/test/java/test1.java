
    import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;


    public class test1 {
        WebDriver browser;

        @Test
        public void Step1() {


            final String binPath = String.format("%s/bin/chromedriver.exe", System.getProperty("user.dir"));
            System.setProperty("webdriver.chrome.driver", binPath);
            browser = new ChromeDriver();
            browser.get("https://partners.autodoc.eu/en/signup");
        }
        @AfterTest
        public void quit() {
            browser.quit();
        }
    }


