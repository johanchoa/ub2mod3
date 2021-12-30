package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class SelectProducts {

    private WebDriver driver;

    @Before
    public void setUp(){

    }

    @Given("Abrir NavegadorP")
    public void abrirNavegadorP() {
        System.setProperty("webdriver.chrome.driver" , "src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to ("https://www.demoblaze.com/index.html");

    } @When("Seleccionar productos y agregarlos al carrito")
    public void seleccionar_productos() {
        //Selecciona el Galaxy S6, lo adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Samsung galaxy s6")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.findElement(By.id("nava")).click();

        //Selecciona el Galaxy S7, lo adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Samsung galaxy s7")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.findElement(By.id("nava")).click();

        //Selecciona laSony VAIO i7, la adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Sony vaio i7")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.findElement(By.id("nava")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

      @Then("Confirmacion Productos Adicionados")
    public void confirmacion_productos_adicionados() {
       //Revisa el carro
        driver.findElement(By.partialLinkText("Cart")).click();
          String Total = String.valueOf(driver.findElement(By.xpath("//*[@id='totalp']")).getText());
          Assert.assertEquals(Total,"1950");

    }
//    @After
//    public void tearDown(){
//        driver.close();
//    }
}
