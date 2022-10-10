import org.openqa.selenium.WebDriver;

public class ChromeDriver {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver",
                "C:\\QA Bootcamp2022\\Jars and drivers\\Selenium\\Drivers\\chromedriver.exe");
        WebDriver wb = new org.openqa.selenium.chrome.ChromeDriver();
        wb.get("www.demoblaze.com");


    }
}
