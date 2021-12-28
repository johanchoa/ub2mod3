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


import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;


import javax.naming.directory.SearchResult;

import java.util.concurrent.TimeUnit;

import static  org.assertj.core.api.Assertions.assertThat;

public class SignUpSteps {

    private WebDriver driver;

    @Before
    public void setUp(){

    }

    @Given("Abrir Navegador")
    public void abrirNavegador() {

        System.setProperty("webdriver.chrome.driver" , "src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @And("Seleccionar SignUp Buttom")
    public void seleccionarSignUpButtom() {

        driver.navigate().to ("https://www.demoblaze.com/index.html");
        driver.findElement(By.id("signin2")).click();

        
    }

    @When("Crear usuario y clave")
    public void crearUsuarioYClave() {

        driver.findElement(By.id("sign-username")).sendKeys("Demo319003");
        driver.findElement(By.id("sign-password")).sendKeys("ClaveDemo");
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        
    }

    @And("Click SignUp")
    public void clickSignUp() throws InterruptedException {

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        driver.findElement(By.xpath("//*[@id=\'signInModal\']/div/div/div[3]/button[2]")).click();
        Thread.sleep(5000);

    }
    @Then("Confirmacion Usuario Creado")
    public void confirmacionUsuarioCreado() {

        Alert alert = driver.switchTo().alert();
        String alertText = alert.getText();

        Assert.assertEquals(alertText, "Sign up successful.");

        alert.accept();

//        return alertText;
    }

    @After
    public void tearDown( ){
        driver.quit();
    }

}
