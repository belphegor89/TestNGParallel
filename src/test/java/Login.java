import Pages.HomePage;
import Utils.BaseTest;
import org.testng.annotations.Test;

/**
 * Created by yzosin on 20-Sep-17.
 */
public class Login extends BaseTest {

    @Test
    public void login() throws Exception {
        HomePage home = HomePage.Instance;
        home.open();
        home.clickLogin();
    }
}