import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class CriarPreCadastro {
    @Test
    public void chromeTest(){
        WebDriver navegador = new ChromeDriver(); // abre o navegador 
        navegador.get("https://automationexercise.com/login"); // entra no site
        
        //criar pre cadastro 
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));

        //preencher campo name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("Alan");

        //preencher campo email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("alanteste@gmail.com");
        
        //clicar no botao signup
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        navegador.quit();

    }
}
