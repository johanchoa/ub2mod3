package step_definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.Alert;

import java.util.concurrent.TimeUnit;

public class LogInSteps {

    private WebDriver driver;

    @Before
    public void setUp(){

    }

    @Given("Abrir Navegador LogIn")
    public void abrirNavegadorLogIn() {

        System.setProperty("webdriver.chrome.driver" , "src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("Seleccionar LogIn Buttom")
    public void seleccionar_log_in_buttom() {


        driver.navigate().to ("https://www.demoblaze.com/index.html");
        driver.findElement(By.id("login2")).click();


    }
    @When("Ingresar usuario y clave")
    public void ingresar_usuario_y_clave() {

        String password = "123456";
        String user = "johanchoconta";

        driver.findElement(By.id("loginusername")).sendKeys(user);
        driver.findElement(By.id("loginpassword")).sendKeys(password);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }
    @And("Click LogIn")
    public void click_log_in() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.cssSelector("#logInModal > div > div > div.modal-footer > button.btn.btn-primary")).click();
        Thread.sleep(5000);

    }
    @Then("Confirmacion Usuario Logeado")
    public void confirmacion_usuario_logeado () {

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        String nameuser = String.valueOf(driver.findElement(By.xpath("//*[@id=\'nameofuser\']")).getText());

        Assert.assertEquals(nameuser, "Welcome johanchoconta");


        }

//    @After
//    public void tearDown( ){ driver.quit();}
}
