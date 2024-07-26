import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class ExercicioPraticoSemana13 {

    private WebDriver navegador;

    @Test
    public void testeFormulario() {
        navegador = new ChromeDriver();
        navegador.get("https://the-internet.herokuapp.com/login");

        navegador.findElement(By.name("username")).sendKeys("tomsmith");
        navegador.findElement(By.name("password")).sendKeys("SuperSecretPassword!");

        navegador.findElement(By.xpath("/html/body/div[2]/div/div/form/button/i")).click();


        // funcao que usei 
        String pageSource = navegador.getPageSource();
        String textoEsperado = "You logged into a secure area!";
        boolean textoEncontrado = pageSource.contains(textoEsperado);

        Assert.assertTrue(textoEncontrado, "O texto esperado não está presente no código fonte da página!");

        if (!textoEncontrado) {
            System.out.println("O texto esperado não está presente");
        }
    }

    @AfterTest
    public void tearDown() {
        if (navegador != null) {
            navegador.quit();
        }
    }
}
