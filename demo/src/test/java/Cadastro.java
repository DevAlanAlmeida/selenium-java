import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class Cadastro {

    private WebDriver navegador;

    @BeforeMethod
    public void setUp(){
        navegador = new ChromeDriver(); // abre o navegador 
        navegador.get("https://automationexercise.com/login"); // entra no site
    }

    @Test
    public void chromeTest(){
        // criar pré-cadastro 
        WebElement loginParaCriarUsuario = navegador.findElement(By.className("signup-form"));
        // preencher campo name
        loginParaCriarUsuario.findElement(By.name("name")).sendKeys("Alan");
        // preencher campo email
        loginParaCriarUsuario.findElement(By.name("email")).sendKeys("alantestee@gmail.com");
        // clicar no botão signup
        navegador.findElement(By.xpath("/html/body/section/div/div/div[3]/div/form/button")).click();

        //Localiza o formulário de cadastro pela ID.
        WebElement cadastro = navegador.findElement(By.id("form"));


        // preenchendo o formulario
        cadastro.findElement(By.id("id_gender1")).click();
        cadastro.findElement(By.id("password")).sendKeys("123456");
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[1]/div/select/option[12]")).click();
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[2]/div/select/option[10]")).click();
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/div[5]/div/div[3]/div/select/option[23]")).click();
        cadastro.findElement(By.id("newsletter")).click();
        cadastro.findElement(By.id("optin")).click();
        cadastro.findElement(By.id("first_name")).sendKeys("Alan");
        cadastro.findElement(By.id("last_name")).sendKeys("Almeida");
        cadastro.findElement(By.id("address1")).sendKeys("Rua da Agua");
        cadastro.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/p[6]/select/option[2]")).click();
        cadastro.findElement(By.id("state")).sendKeys("CE");
        cadastro.findElement(By.id("city")).sendKeys("Quixis");
        cadastro.findElement(By.id("zipcode")).sendKeys("63800000");
        cadastro.findElement(By.id("mobile_number")).sendKeys("8855558555");

        //saindo do formulario 
        navegador.findElement(By.xpath("/html/body/section/div/div/div/div[1]/form/button")).click();

        

    }

    //@AfterMethod
    public void tearDown(){
        navegador.quit();
    }
}
