package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;

public class SearchTests extends BaseTest{

	@Test
	@Description("Find 'MacBook' in the search field")
	@Severity(SeverityLevel.NORMAL)
	public void tc01_searchForMacBook() {
		mainPage.searchForProduct("MacBook");
		//Validation
		String expected = "Search - MacBook";
		String actual = mainPage.searchMacbookLable();
		Assert.assertEquals(actual, expected);
	}

	@Test
	@Description("Find 'Iphone' in the search field")
	@Severity(SeverityLevel.NORMAL)
	public void tc02_searchForIphone() {
		mainPage.searchForProduct("Iphone");
		//Validation
		String expected = "Search - Iphone";
		String actual = mainPage.searchIphoneLable();
		Assert.assertEquals(actual, expected);
	}

	@Test
	@Description("Find 'Sony' in search field")
	@Severity(SeverityLevel.NORMAL)
	public void tc03_searchForSony() {
		mainPage.searchForProduct("Sony");
		//Validation
		String expected = "Search - Sony";
		String  actual = mainPage.searchSonyLable();
		Assert.assertEquals(actual, expected);
	}

	@Test
	@Description("Search for random latters and simbols")
	@Severity(SeverityLevel.NORMAL)
	public void tc04_searchForRandomLatters() {
		mainPage.searchForProduct("kajfgshjfghjsgf#$%^&((");
		//Validation
		String expected = "Search - kajfgshjfghjsgf#$%^&((";
		String actual = mainPage.searchRandomText();
		Assert.assertEquals(actual, expected);
	}
}
