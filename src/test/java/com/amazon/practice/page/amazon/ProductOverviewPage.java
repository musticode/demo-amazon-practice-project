package com.amazon.practice.page.amazon;

import com.amazon.practice.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductOverviewPage extends BasePage {

    @FindBy(id = "productOverview_feature_div")
    private WebElement productOverviewLocator;

    @FindBy(id = "corePrice_feature_div")
    private WebElement productPriceElement;

    @FindBy(xpath = "//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[2]/td[2]")
    private WebElement productNameTableElement;

    @FindBy(xpath = "//*[@id=\"poExpander\"]/div[1]/div/table/tbody/tr[5]/td[2]")
    private WebElement productCpuTypeTableElement;


    public ProductOverviewPage(WebDriver driver) {
        super(driver);
    }

    public String getProductDetails(){

        return "Price: " + getText(productPriceElement)
                + "\nProduct Name: "+ getText(productNameTableElement)
                + "\nProduct CPU Type: "+ getText(productCpuTypeTableElement);
    }







}
