package PastaTeste.PageObjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormPage {
    private WebDriver navegador;

    private By usernameField = By.name("username");
    private By passwordField = By.name("password");
    private By loginButton = By.xpath("/html/body/div[2]/div/div/form/button/i");
    
    public FormPage(WebDriver navegador) {
        this.navegador = navegador;
    }

    public void setUsername(String username) {
        navegador.findElement(usernameField).sendKeys(username);
    }

    public void setPassword(String password) {
        navegador.findElement(passwordField).sendKeys(password);
    }

    public void clickLoginButton() {
        navegador.findElement(loginButton).click();
    }

    public boolean isLoginSuccessful(String expectedMessage) {
        String pageSource = navegador.getPageSource();
        return pageSource.contains(expectedMessage);
    }
}
