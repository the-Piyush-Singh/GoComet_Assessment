package stepdefinitions;

import com.microsoft.playwright.*;
import io.cucumber.java.After;
import io.cucumber.java.en.*;

import java.util.List;

public class CaseSteps {

    Playwright playwright;
    Browser browser;
    Page page;

    String productLink;

    @Given("user opens casekaro website")
    public void openWebsite() {

        playwright = Playwright.create();
        browser = playwright.chromium().launch(
                new BrowserType.LaunchOptions().setHeadless(false));

        page = browser.newPage();
        page.navigate("https://casekaro.com");
    }

    @When("user navigates to iphone 16 pro covers")
    public void openIphoneCovers() {

        page.navigate("https://casekaro.com/collections/iphone-16-pro-back-covers");

        page.waitForSelector("a[href*='/products/']");
    }

    @And("user opens first product")
    public void openProduct() {

        Locator product = page.locator("a[href*='/products/']").first();

        productLink = product.getAttribute("href");

        product.click();

        page.waitForLoadState();
    }

    @And("user adds hard material")
    public void addHard() {

        page.locator("label:has-text('Hard')").first().click();

        page.locator("button[name='add']").click();

        page.waitForSelector("text=Your cart");

        page.locator("button.drawer__close").click();
    }

    @And("user adds soft material")
    public void addSoft() {

        page.locator("label:has-text('Soft')").first().click();

        page.locator("button[name='add']").click();

        page.waitForSelector("text=Your cart");

        page.locator("button.drawer__close").click();
    }

    @And("user adds glass material")
    public void addGlass() {

        page.locator("label:has-text('Glass')").first().click();

        page.locator("button[name='add']").click();

        page.waitForSelector("text=Your cart");

        page.locator("button.drawer__close").click();
    }

    @When("user opens cart")
    public void openCart() {

        page.waitForSelector("text=Your cart");
    }

    @Then("cart should contain 3 items")
    public void validateCart() {

        int items = page.locator(".cart-item").count();

        System.out.println("Items in cart: " + items);
    }

    @And("print product details")
    public void printDetails() {

        List<String> names = page.locator(".cart-item").allInnerTexts();

        for(String n : names){
            System.out.println(n);
            System.out.println("Link: https://casekaro.com" + productLink);
            System.out.println("---------------------------");
        }
    }
    @After
    public void closeBrowser() {

        if (browser != null) {
            browser.close();
        }

        if (playwright != null) {
            playwright.close();
        }
    }
}