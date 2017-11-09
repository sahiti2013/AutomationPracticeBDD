/*
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

import java.util.concurrent.TimeUnit;

public class StepDefinitionsForAddingToCart {
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
   */
/* @After
    public void closeBrowser() {
        driver.close();
    }*//*


    @Given("^user on HomePage$")
    public void user_on_homepage()  {
        {
            Assert.assertTrue(driver.getTitle().equalsIgnoreCase("My Store"));
        }
    }

    @When("^he enters text as \"([^\"]*)\" in search box$")
    public void he_enters_text_as_something_in_search_box(String strArg1)  {
        driver.findElement(By.cssSelector("#search_query_top")).sendKeys("dresses");

    }
    @And("^clicks search button$")
    public void clicks_search_button() {
        driver.findElement(By.xpath("//button[@name='submit_search']")).click();

    }
    @Then("^user should see dresses displayed on the page$")
    public void user_should_see_dresses_displayed_on_the_page()  {
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        driver.findElement(By.xpath("//span[@class='lighter']")).isDisplayed();
    }

    @When("^user clicks Add To Cart button$")
    public void user_clicks_add_to_cart_button()  {
        ((JavascriptExecutor)driver).executeScript("scroll(0,400)");
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[1]/div/div[2]/div[2]/a[1]/span")).click();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }
    @And("^Clicks Continue Shopping$")
    public void clicks_continue_shopping()  {
        //driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

        //driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/span/span")).click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        driver.findElement(By.xpath("//span[@title='Continue shopping']")).click();

    }

    @And("^again Clicks Add To Cart button$")
    public void again_clicks_add_to_cart_button() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/ul/li[2]/div/div[2]/div[2]/a[1]/span")).click();

    }

    @And("^Clicks Proceed To checkout button$")
    public void clicks_proceed_to_checkout_button()  {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        driver.findElement(By.xpath("//*[@id=\"layer_cart\"]/div[1]/div[2]/div[4]/a/span")).click();

    }

    @Then("^user should see Summary of the items added successfully$")
    public void user_should_see_summary_of_the_items_added_successfully() {
        driver.findElement(By.cssSelector("#cart_title")).isDisplayed();

    }





}


*/
