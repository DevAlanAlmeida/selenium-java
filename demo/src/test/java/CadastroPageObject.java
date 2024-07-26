import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import pages.PreCadastro;
import suporte.Web;

class CadastroPageObjetc {

    private WebDriver navegador;

    @BeforeMethod
    public void setUp(){
        navegador = Web.creatChrome();
    }

    @Test
    public void cadastro(){
        new PreCadastro(navegador)
        .login("testePaginaPreCadastro")
        .email("testeemail@gmail");
    }
    
    //@AfterMethod
    public void tearDown(){
        navegador.quit();
    }
}