import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LoginTest {

    @Test
    void loginCorrecto() {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-features=PasswordLeakDetection");

        WebDriver driver = new ChromeDriver(options);

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        String mensaje = driver.findElement(By.id("flash")).getText();

        assertEquals(
                "You logged into a secure area!\n×",
                mensaje
        );

        driver.quit();
    }

    @Test
    void loginContrasenaIncorrecta() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username"))
                .sendKeys("tomsmith");

        driver.findElement(By.id("password"))
                .sendKeys("contraseñaIncorrecta");

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        String mensaje = driver.findElement(By.id("flash")).getText();

        assertEquals(
                "Your password is invalid!\n×",
                mensaje
        );

        driver.quit();
    }

    @Test
    void loginUsuarioIncorrecto() {

        WebDriver driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/login");

        driver.findElement(By.id("username"))
                .sendKeys("usuarioIncorrecto");

        driver.findElement(By.id("password"))
                .sendKeys("SuperSecretPassword!");

        driver.findElement(By.cssSelector("button[type='submit']"))
                .click();

        String mensaje = driver.findElement(By.id("flash")).getText();

        assertEquals(
                "Your username is invalid!\n×",
                mensaje
        );

        driver.quit();
    }
}