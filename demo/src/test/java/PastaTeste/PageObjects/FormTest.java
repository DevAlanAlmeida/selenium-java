    package PastaTeste.PageObjects;

    import org.openqa.selenium.WebDriver;
    import org.openqa.selenium.chrome.ChromeDriver;
    import org.testng.Assert;
    import org.testng.annotations.AfterTest;
    import org.testng.annotations.BeforeTest;
    import org.testng.annotations.Test;

    public class FormTest {

        private WebDriver navegador;
        private FormPage formPage;

        @BeforeTest
        public void setUp() {
            navegador = new ChromeDriver();
            navegador.get("https://the-internet.herokuapp.com/login");
            formPage = new FormPage(navegador);
        }

        @Test
        public void testeFormulario() {
            formPage.setUsername("tomsmith");
            formPage.setPassword("SuperSecretPassword!");
            formPage.clickLoginButton();

            String textoEsperado = "You logged into a secure area!";
            boolean textoEncontrado = formPage.isLoginSuccessful(textoEsperado);

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
