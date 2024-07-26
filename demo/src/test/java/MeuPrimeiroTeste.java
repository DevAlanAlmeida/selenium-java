import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MeuPrimeiroTeste {
    @Test
    public void chromeTest(){
        WebDriver navegador = new ChromeDriver(); // abre o navegador 
        navegador.get("https://automationexercise.com/login"); // entra no site 
    }
    
}
