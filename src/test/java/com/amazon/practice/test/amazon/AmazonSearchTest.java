package com.amazon.practice.test.amazon;

import com.amazon.practice.listener.TestListener;
import com.amazon.practice.page.amazon.MainPage;
import com.amazon.practice.page.amazon.ProductOverviewPage;
import com.amazon.practice.page.amazon.SearchResultPage;
import com.amazon.practice.test.BaseTest;
import com.amazon.practice.util.FileService;
import io.qameta.allure.Description;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;


@Listeners({TestListener.class})
public class AmazonSearchTest extends BaseTest {

    MainPage mainPage;
    SearchResultPage searchResultPage;
    ProductOverviewPage productOverviewPage;

    @Test
    @Description("Search Macbook item in Amazon")
    public void searchItemOnAmazonTest() throws InterruptedException {

        mainPage = new MainPage(driver);
        searchResultPage = new SearchResultPage(driver);
        productOverviewPage = new ProductOverviewPage(driver);


        mainPage.getAmazonPage();
        mainPage.acceptCookies();

        Assert.assertEquals(
                mainPage.isAmazonMainPageOpened(),
                true,
                "Main page is not opened"
        );

        mainPage.search("Macbook Pro");

        searchResultPage.goToProductOverView();

        String productData = productOverviewPage.getProductDetails();


        FileService.getInstance().writeToFile(productData);



    }

}
