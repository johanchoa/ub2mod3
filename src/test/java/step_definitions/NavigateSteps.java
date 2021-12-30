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

public class NavigateSteps {

    private WebDriver driver;

    @Before
    public void setUp(){

    }

    @Given("Abrir Navegador en Home")
    public void abrir_navegador_en_home() {

        System.setProperty("webdriver.chrome.driver" , "src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to ("https://www.demoblaze.com/index.html");

    }

    @And("Seleccionar Categoria Phones")
    public void seleccionar_categoria_phones() {

        driver.findElement(By.xpath("//*[contains(text(),'Phones')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @And("Validar items Categoria Phones")
    public void validar_items_categoria_phones() {

        String CategoryPhones = String.valueOf(driver.findElement(By.xpath("//*[@id=\'tbodyid\']/div[1]/div/div/h4/a")).getText());

        Assert.assertEquals(CategoryPhones, "Samsung galaxy s6");
    }



    @And("Seleccionar Categoria Laptops")
    public void seleccionar_categoria_laptops() {

        driver.findElement(By.xpath("//*[contains(text(),'Laptops')]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @And("Validar items Categoria Laptops")
    public void validar_items_categoria_laptops() {



        String CategoryLaptops = String.valueOf(driver.findElement(By.xpath("//*[contains(text(),'Sony vaio i5')]")).getText());
        Assert.assertEquals(CategoryLaptops, "Sony vaio i5");

    }

    @When("Seleccionar Categoria Monitors")
    public void seleccionar_categoria_monitors() {

        driver.findElement(By.xpath("//*[contains(text(),'Monitors')]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

    }

    @Then("Validar items Categoria Monitors")
    public void validar_items_categoria_monitors() {

        String CategoryMonitors = String.valueOf(driver.findElement(By.xpath("//*[contains(text(),'Apple monitor 24')]")).getText());

        Assert.assertEquals(CategoryMonitors, "Apple monitor 24");

    }



}
