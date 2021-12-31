package page_objects;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;



public class  HomePage {

    private WebDriver driver;
    @FindBy(how = How.ID,using ="signin2")
    WebElement signUpButtom;

    public HomePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void doASearch(String word){
        signUpButtom.sendKeys(word + Keys.ENTER);
    }
}
