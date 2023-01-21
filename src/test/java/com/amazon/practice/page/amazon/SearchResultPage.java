package com.amazon.practice.page.amazon;

import com.amazon.practice.page.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SearchResultPage extends BasePage {

    @FindBy(xpath = "//*[@id=\"search\"]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[1]/span/a")
    private WebElement firstComputerElement;






    public SearchResultPage(WebDriver driver) {
        super(driver);
    }

    public void goToProductOverView(){
        click(firstComputerElement);
    }


    public String getComputerInfo(){
        return getText(firstComputerElement);
    }




}
