package net.elmosoft.mobile_tests;

import com.google.inject.Inject;
import net.elmosoft.steps.MobileSteps;
import io.qameta.allure.Epic;
import io.qameta.allure.Feature;
import net.elmosoft.splendid.service.runner.SuiteListener;
import net.elmosoft.splendid.test.BaseSplendidTest;
import org.testng.annotations.Guice;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import org.uncommons.reportng.HTMLReporter;

@Listeners({ SuiteListener.class, HTMLReporter.class })
@Epic("Mobile Demo Tests")
@Feature("Demo Tab")
@Guice
public class MobileDemoTest extends BaseSplendidTest {

	@Inject
	private MobileSteps steps;

	@Test(description = "Do login")
	public void doExampleLogin() {
		steps.doLogin();
	}
}
