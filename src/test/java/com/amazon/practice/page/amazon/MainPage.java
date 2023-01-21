package com.amazon.practice.page.amazon;

import com.amazon.practice.page.BasePage;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends BasePage {
    static String PAGE_URL ="https://www.amazon.com.tr";
    @FindBy(id = "twotabsearchtextbox")
    private WebElement searchTextBoxElement;

    @FindBy(id = "nav-logo-sprites")
    private WebElement navLogoAmazonElement;

    @FindBy(id = "nav-search-submit-button")
    private WebElement navSearchTextBoxElement;

    @FindBy(id = "sp-cc-accept")
    private WebElement acceptCookiesButton;


    public MainPage(WebDriver driver) {
        super(driver);
    }

    @Step("Go to Amazon page")
    public void getAmazonPage(){
        getPage(PAGE_URL);
    }

    @Step("Accepting cookies")
    public void acceptCookies(){
        click(acceptCookiesButton);
    }

    @Step("Search item {0} in Amazon")
    public void search(String searchText){
        setText(searchTextBoxElement, searchText);
        click(navSearchTextBoxElement);

    }


    @Step("Verify Amazon page is opened")
    public boolean isAmazonMainPageOpened(){
        return isElementDisplayed(navLogoAmazonElement);
    }


    /**
     *
     * @return
     * Amazon.com.tr: Elektronik, bilgisayar, akıllı telefon, kitap, oyuncak, yapı market, ev, mutfak, oyun konsolları ürünleri ve daha fazlası için internet alışveriş sitesi
     */

    public String getAmazonPageTitle(){
        return getPageTitle();
    }


}
