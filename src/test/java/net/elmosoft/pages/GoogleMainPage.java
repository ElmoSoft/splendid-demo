package net.elmosoft.pages;

import java.util.List;
import net.elmosoft.splendid.driver.annotation.FindBy;
import net.elmosoft.splendid.driver.element.BrowserElement;
import net.elmosoft.splendid.driver.page.Page;
import net.elmosoft.splendid.driver.page.PageFactory;
import org.openqa.selenium.Keys;

public class GoogleMainPage extends Page {

    @FindBy(xpath = "//*[@alt='Google']")
    private BrowserElement logo;

    @FindBy(xpath="//input[@name='q']")
    private BrowserElement searchField;

    @FindBy(xpath="//input[@name='btnK']")
    private List<BrowserElement> searchBtn;

    public GoogleMainPage() {
        super();
    }

    public GoogleMainPage openPage() {
        driver.get("https://www.google.com");
        return PageFactory.initElements(driver, GoogleMainPage.class);
    }

    @Override
    public void checkPage() {
        waitForPageIsLoaded();
        logo.waitForElementDisplayed(TEN_SECONDS_WAIT);
    }

    @Override
    public void waitForPageIsLoaded() {
        driver.waitForPageLoad();
    }


    public void doSearch(String searchPhrase) {
        searchField.type(searchPhrase);
        searchField.getWebElement().sendKeys(Keys.ENTER);
    }
}
