package step_definitions;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class DeleteProduct {

    private WebDriver driver;

    @Before
    public void setUp(){

    }

    @Given("Abrir NavegadorParaBorrar")
    public void abrir_navegador_para_borrar() {
        System.setProperty("webdriver.chrome.driver" , "src/test/resources/drivers/windows/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.navigate().to ("https://www.demoblaze.com/index.html");
    }

    @When("Seleccionar producto y agregarlo al carrito")
    public void seleccionar_producto_y_agregarlo_al_carrito() throws InterruptedException {

        //Selecciona laSony VAIO i7, la adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Sony vaio i7")).click();
        // driver.findElement(By.xpath("//*[@id=\"tbodyid\"]/div[8]/div/div/h4/a")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.findElement(By.id("nava")).click();
        Thread.sleep(500);
        //driver.switchTo().alert().accept();

        //Selecciona el Galaxy S7, lo adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Samsung galaxy s7")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.switchTo().alert().accept();
        driver.findElement(By.id("nava")).click();
        Thread.sleep(500);

        //Selecciona el Galaxy S6, lo adiciona al carro y se regresa al menú principal
        driver.findElement(By.partialLinkText("Samsung galaxy s6")).click();
        driver.findElement(By.partialLinkText("Add to cart")).click();
        //driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        //driver.switchTo().alert().accept();
        driver.findElement(By.id("nava")).click();
        Thread.sleep(500);
    }

    @When("Borrar Producto")
    public void borrar_producto() throws InterruptedException {
         driver.findElement(By.partialLinkText("Cart")).click();

        // Borrar uno de los productos
        driver.findElement(By.xpath("//*[@id='tbodyid']/tr[1]/td[4]/a")).click();
        Thread.sleep(2000);
    }

    @Then("Confirmacion de Borrado de Producto")
    public void confirmacion_de_borrado_de_producto() {

        driver.manage().timeouts().implicitlyWait(300, TimeUnit.SECONDS);
        String Total = String.valueOf(driver.findElement(By.xpath("//*[@id=\"totalp\"]")).getText());
        // Si el total en el carrito es menos de 1,950  significa que se borró un item
        // s6 360 s7 800, Vaio 790
        Assert.assertNotEquals(Total , "1950");
    }
}
