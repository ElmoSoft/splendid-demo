package net.elmosoft.steps;

import io.qameta.allure.Step;
import net.elmosoft.pages.MobileMainPage;

public class MobileSteps {
    @Step("Make succesfull login")
    public void doLogin() {
        MobileMainPage mainPage = new MobileMainPage();
        mainPage.checkPage();
        mainPage.doLogin();
    }
}
