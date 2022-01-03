package step_definitions;

import io.cucumber.java.Before;
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

        //driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
        //Selecciona el Galaxy S6, lo adiciona al carro y se regresa al menú principal
        driver.findElement(By.linkText("Samsung galaxy s6")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.findElement(By.id("nava")).click();
        //driver.manage().timeouts().implicitlyWait(5000, TimeUnit.SECONDS);

        //Selecciona el Galaxy S7, lo adiciona al carro y se regresa al menú principal
        driver.findElement(By.linkText("Samsung galaxy s7")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.findElement(By.id("nava")).click();

        //Selecciona laSony VAIO i7, la adiciona al carro y se regresa al menú principal
        driver.findElement(By.linkText("Sony vaio i7")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.findElement(By.id("nava")).click();
    }

      @Then("Confirmacion Productos Adicionados")
    public void confirmacion_productos_adicionados() throws InterruptedException {
          //Revisa el carro
          driver.findElement(By.partialLinkText("Cart")).click();
          Thread.sleep(1000);
          driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
          int TotalConfirmados = Integer.parseInt(driver.findElement(By.xpath("//*[@id=\"totalp\"]")).getText());
          // Si el total en el carrito es menos de 1,950 significa que se agregaron todos los productos.
          // s6 360 s7 800, Vaio 790
          Assert.assertEquals(TotalConfirmados , 1950);
    }
//    @After
//    public void tearDown(){
//        driver.close();
//    }
}
