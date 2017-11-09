import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class StepDefRegistration {
    static WebDriver driver;
    String baseURL = "http://automationpractice.com";

    //precondtion for test scenario
    //open the browser and open the baseURL
    @Before
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get(baseURL);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    //post condition for test scenario
    //close the browser
    @After
   public void closeBrowser() {
        driver.close();
   }
    @Given("^user on Home page$")
    public void user_on_home_page()  {

            Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My Store"));
    }

    @When("^user click the SignIn button in home page$")
    public void user_click_the_signin_button_in_home_page()  {
        driver.findElement(By.cssSelector(".login")).click();
    }
    @And("^enters a valid email as \"([^\"]*)\"$")
    public void enters_a_valid_email_as_something(String strArg1)  {
        driver.findElement(By.id("email_create")).sendKeys(strArg1);
    }
    @And("^clicks Create An Account button$")
    public void clicks_create_an_account_button()  {
        driver.findElement(By.id("SubmitCreate")).click();
    }
    @Then("^user will be on Register page$")
    public void user_will_be_on_register_page()  {
        driver.findElement(By.xpath("//*[text()='Create an account']")).isDisplayed();
    }

    @When("^user have clicked on MRS tiltle$")
    public void user_have_clicked_on_mrs_tiltle()  {
        driver.findElement(By.id("id_gender2")).click();
    }



    @And("^user have entered a First Name as \"([^\"]*)\"$")
    public void user_have_entered_a_first_name_as_something(String strArg1)  {
        driver.findElement(By.id("customer_firstname")).sendKeys(strArg1);
    }

    @And("^user have entered a Last Name as \"([^\"]*)\"$")
    public void user_have_entered_a_last_name_as_something(String strArg1)  {
        driver.findElement(By.id("customer_lastname")).sendKeys(strArg1);
    }

    @And("^user have entered a Email \"([^\"]*)\"$")
    public void user_have_entered_a_email_something(String strArg1)  {
        driver.findElement(By.id("email")).clear();
        driver.findElement(By.id("email")).sendKeys(strArg1);
    }

    @And("^user have entered a Password as \"([^\"]*)\"$")
    public void user_have_entered_a_password_as_something(String strArg1)  {
        driver.findElement(By.id("passwd")).sendKeys(strArg1);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^user have selected Date Of Birth \"([^\"]*)\" \"([^\"]*)\" \"([^\"]*)\"$")
    public void user_have_selected_date_of_birth_something_something_something(String strArg1, String strArg2, String strArg3)  {
        Select select=new Select(driver.findElement(By.id("days")));
        select.selectByValue(strArg1);
        Select select1=new Select(driver.findElement(By.id("months")));
        select1.selectByValue(strArg2);
        Select select3=new Select(driver.findElement(By.id("years")));
        select3.selectByValue(strArg3);
    }

    @And("^in YOUR ADDRESS section user have entered First Name as \"([^\"]*)\"$")
    public void in_your_address_section_user_have_entered_first_name_as_something(String strArg1)  {
        ((JavascriptExecutor)driver).executeScript("scroll(0,800)");
        driver.findElement(By.id("firstname")).clear();
        driver.findElement(By.id("firstname")).sendKeys(strArg1);
    }

    @And("^user have entered a Last name in address as \"([^\"]*)\"$")
    public void user_have_entered_a_last_name_in_address_as_something(String strArg1) {
        driver.findElement(By.id("lastname")).clear();
        driver.findElement(By.id("lastname")).sendKeys(strArg1);
    }

    @And("^user have entered a Address as \"([^\"]*)\"$")
    public void user_have_entered_a_address_as_something(String strArg1)  {
        driver.findElement(By.id("address1")).sendKeys(strArg1);
    }

    @And("^user have entered a City \"([^\"]*)\"$")
    public void user_have_entered_a_city_something(String strArg1)  {
        driver.findElement(By.id("city")).sendKeys(strArg1);
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^user have selected a state \"([^\"]*)\"$")
    public void user_have_selected_a_state_something(String strArg1)  {
        Select select4=new Select(driver.findElement(By.id("id_state")));
        select4.selectByValue(strArg1);
    }

    @And("^user have entered a Zip/PostalCode \"([^\"]*)\"$")
    public void user_have_entered_a_zippostalcode_something(String strArg1)  {
        driver.findElement(By.id("postcode")).sendKeys(strArg1);
    }

    @And("^user have selected a Country \"([^\"]*)\"$")
    public void user_have_selected_a_country_something(String strArg1)  {
        Select select2=new Select(driver.findElement(By.id("id_country")));
        select2.selectByVisibleText(strArg1);
    }

    @And("^user have entered a Additional Information \"([^\"]*)\"$")
    public void user_have_entered_a_additional_information_something(String strArg1) {
        driver.findElement(By.id("other")).sendKeys(strArg1);
    }

    @And("^user have entered a Home Phone \"([^\"]*)\"$")
    public void user_have_entered_a_home_phone_something(String strArg1)  {
        driver.findElement(By.id("phone")).sendKeys(strArg1);
    }

    @And("^user have entered a Mobile Phone as \"([^\"]*)\"$")
    public void user_have_entered_a_mobile_phone_as_something(String strArg1){
        driver.findElement(By.id("phone_mobile")).sendKeys(strArg1);
    }

    @And("^user have entered in Assign an address alias for future reference text box as \"([^\"]*)\"$")
    public void user_have_entered_in_assign_an_address_alias_for_future_reference_text_box_as_something(String strArg1){
        driver.findElement(By.id("alias")).clear();
        driver.findElement(By.id("alias")).sendKeys(strArg1);
    }

    @And("^user clicks on the Register button$")
    public void user_clicks_on_the_register_button(){
        driver.findElement(By.id("submitAccount")).click();
    }
    @Then("^user account created successfully$")
    public void user_account_created_successfully()  {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/p")).isDisplayed();

    }
}



