import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

    @Test
    void abrirNavegador() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://www.google.com");

        System.out.println("Título: " + driver.getTitle());

        driver.quit();
    }
}