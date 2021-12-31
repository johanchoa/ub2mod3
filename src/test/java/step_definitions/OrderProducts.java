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
public class OrderProducts {

    private WebDriver driver;

    @Before
    public void setUp(){

    }

    @Given("Abrir NavegadorOrden")
    public void abrir_navegador_orden() {
        System.setProperty("webdriver.chrome.driver" , "src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to ("https://www.demoblaze.com/index.html");
    }
    @When("Seleccionar productos y agregarlos al carrito para realizar la compra")
    public void seleccionar_productos_y_agregarlos_al_carrito_para_realizar_la_compra() {
        //Selecciona el Galaxy S6, lo adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Samsung galaxy s6")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.switchTo().alert().accept();
        driver.findElement(By.id("nava")).click();

        //Selecciona el Galaxy S7, lo adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Samsung galaxy s7")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("nava")).click();

        //Selecciona laSony VAIO i7, la adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Sony vaio i7")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        // Visitar el carro
        driver.findElement(By.partialLinkText("Cart")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }

    @When("Solicitar la orden")
    public void solicitar_la_orden() {
        String Name  = "Alfonso Gutierrez";
        String Country = "Mexico";
        String City = "Ciudad de Mexico";
        String CreditCard = "90306374521782";
        String Month = "December";
        String Year = "2021";

        // Da clic en Place Order
        driver.findElement(By.xpath("//*[@id=\"page-wrapper\"]/div/div[2]/button")).click();

        // Llena cada uno de los campos para registrar la orden
        driver.findElement(By.id("name")).sendKeys(Name);
        driver.findElement(By.id("country")).sendKeys(Country);
        driver.findElement(By.id("city")).sendKeys(City);
        driver.findElement(By.id("card")).sendKeys(CreditCard);
        driver.findElement(By.id("month")).sendKeys(Month);
        driver.findElement(By.id("year")).sendKeys(Year);

        // Ejecuta la orden de Compra
        driver.findElement(By.xpath("//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")).click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
    @Then("Confirmacion de productos ordenados")
    public void confirmacion_de_productos_ordenados() {

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        String OrdenCompletada = String.valueOf(driver.findElement(By.xpath("/html/body/div[10]/h2")).getText());
        //Valida que se haya realizado la orden
        Assert.assertEquals(OrdenCompletada, "Thank you for your purchase!");
    }
//    @After
//    public void tearDown(){
//        driver.close();
//    }
}
