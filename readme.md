## Amazon Demo Test Project
#### Scenario:
>Go to https://www.amazon.com.tr/ <br>
>Check if Amazon website is opened <br>
>Search for "Macbook Pro" <br>
>Click first element in Search Results Page <br>
>Product Overview Page opened <br>
>Product's price, name, cpu type are written to a txt file


### Run Tests
```
mvn clean test
```
### Allure Reports
```
mvn allure:serve
```

#### Dependencies
- Selenium 4.4.0
- Allure Report 2.19.0
- WebDriverManager 5.3.0
- TestNg 7.6.1


#### Implementation Details

##### DriverOptions class

- Driver options methods are set in this class. Browser capabilities are defined. 

##### DriverManager class

- setDriver method takes browserName parameter from testNG xml file. Tests will be started in selected browser. 
For this case just 2 of browsers are added. This method can be
expandable for other needs like selenium grid or selenoid etc.
- terminateBrowser method does driver's quit action 

##### TestListener class
- Listener class implements listener interface and overrides
methods for tests

##### FileService class

- writeToFile method takes text string to write text to a file
- readFromFile method prints txt file

##### BaseTest class

- BaseTest extends DriverManager class for methods and webdriver instance
- BeforeTest annotation is used for test methods. Before the test methods
this method is working. Driver is initialized before all test methods.
This initializeBrowser method is taking parameter from testNg xml file.
If tests are started without xml file, default ChromeDriver is initialized.
- AfterTest annotation is used for test methods. This method
terminates browser after all test methods

##### BasePage class

- To avoid repetition some page actions are implemented in this class.
- PageFactory is used to take WebElements, By class is not used for this project.
@FindBy annotations are used to take web elements in page object classes
- Page Object classes are extends BasePage class and page's actions are implemented
in these classes. Steps are written for reports.

##### AmazonSearchTest class

- Listener annotation is added to test class
- Test description is written for reports
- Scenario is in searchItemOnAmazonTest method
- After the scenario is done, productData will be taken from Product Overview page.
Product data is written to text file
