package net.elmosoft.pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.iOSXCUITFindBy;
import net.elmosoft.splendid.driver.element.MobileElement;
import net.elmosoft.splendid.driver.page.Page;

public class MobileMainPage extends Page {

    @AndroidFindBy(accessibility = "test")
    @iOSXCUITFindBy(accessibility = "signin")
    private MobileElement loginBtn;

    @AndroidFindBy(accessibility = "username")
    @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeTextField[`label == \"username\"`]")
    private MobileElement username;

    @AndroidFindBy(accessibility = "password")
    @iOSXCUITFindBy(iOSClassChain="**/XCUIElementTypeOther[`label == \"password\"`][1]")
    private MobileElement password;

    @AndroidFindBy(accessibility = "validateBtn")
    @iOSXCUITFindBy(accessibility="login")
    private MobileElement validateBtn;

    public MobileMainPage() {
        super();
    }

    @Override
    public void checkPage() {
        loginBtn.waitForElementDisplayed(THIRTY_SECONDS_WAIT);
    }

    @Override
    public void waitForPageIsLoaded() {
    }


    public void doLogin() {
        loginBtn.click();
        username.type("test name");
        password.type("testpasswprd");
        validateBtn.click();
    }
}
