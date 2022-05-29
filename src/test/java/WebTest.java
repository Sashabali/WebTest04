import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebTest {

    @Test
    public void testMenuStartTitle () {

        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Welcome to 99 Bottles of Beer";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuBrowseLanguages = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/abc.html']")
        );

        menuBrowseLanguages.click();

        WebElement menuStart = driver.findElement(By.xpath(
                "//body/div[@id='wrap']/div[@id='navigation']/ul[@id='menu']/li/a[@href='/']")
        );

        menuStart.click();

        WebElement h2 = driver.findElement(By.xpath("//body/div[@id='wrap']/div[@id='main']/h2"));
        String actualResult = h2.getText();
        Assert.assertEquals(actualResult,expectedResult);
    }

    @Test
    public void testRightCornerTitle () {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "99 Bottles of Beer";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement rightCorner = driver.findElement(By.xpath("//body/div/div[@id='header']/h1"));
        String actualResult = rightCorner.getText();

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();

    }
@Test
    public void testLastItem () {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "SUBMIT NEW LANGUAGE";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath(
                "//body/div/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']"));
        String actualResult = menuSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult,expectedResult);
        driver.quit();
    }

    @Test
    public void testMenuSubmitNewLanguage () {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Submit New Language";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement menuSubmitNewLanguage = driver.findElement(By.xpath(
                "//body/div/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']"));

        menuSubmitNewLanguage.click();

        WebElement paragraphSubmitNewLanguage = driver.findElement(By.xpath("//body/div/div[@id='main']/h2"));

        String actualResult = paragraphSubmitNewLanguage.getText();

        Assert.assertEquals(actualResult,expectedResult);
        driver.quit();
    }

    @Test

    public void testSubmenu09 () {
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/abc.html";
        String expectedResult = "0-9";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement subMenu09 = driver.findElement(By.xpath("//body/div/div[@id='navigation']/ul[@id='submenu']/li/a[@href='0.html']"));

        String actualResult = subMenu09.getText();

        Assert.assertEquals(actualResult,expectedResult);
        driver.quit();
    }

    @Test
    public void testTeamInfoOliver (){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Oliver Schade";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement subMenuTeam = driver.findElement(By.xpath(
                "//body/div/div[@id='navigation']/ul[@id='submenu']/li/a[@href='team.html']"));
        subMenuTeam.click();

        WebElement teamOliverSchade = driver.findElement(By.xpath("//body/div/div[@id='main']/h3[text()='Oliver Schade']"));
        String actualResult = teamOliverSchade.getText();

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }
    @Test
    public void testTeamInfoGregor (){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Gregor Scheithauer";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement subMenuTeam = driver.findElement(By.xpath(
                "//body/div/div[@id='navigation']/ul[@id='submenu']/li/a[@href='team.html']"));
        subMenuTeam.click();

        WebElement teamGregorScheithauer = driver.findElement(By.xpath(
                "//body/div/div[@id='main']/h3[text()='Gregor Scheithauer']"));
        String actualResult = teamGregorScheithauer.getText();

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }

    @Test
    public void testTeamInfoStefan (){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/";
        String expectedResult = "Stefan Scheler";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement subMenuTeam = driver.findElement(By.xpath(
                "//body/div/div[@id='navigation']/ul[@id='submenu']/li/a[@href='team.html']"));
        subMenuTeam.click();

        WebElement teamStefanScheler = driver.findElement(By.xpath(
                "//body/div/div[@id='main']/h3[text()='Stefan Scheler']"));
        String actualResult = teamStefanScheler.getText();

        Assert.assertEquals(actualResult,expectedResult);

        driver.quit();
    }
@Test
    public void testSubmitLanguageError (){
        String chromeDriver = "webdriver.chrome.driver";
        String driverPath = "/Applications/ChromeDriver/chromedriver";
        String url = "http://www.99-bottles-of-beer.net/submitnewlanguage.html";
        String expectedResult = "Error: Precondition failed - Incomplete Input.";

        System.setProperty(chromeDriver,driverPath);
        WebDriver driver = new ChromeDriver();

        driver.get(url);

        WebElement submitLanguage = driver.findElement(By.xpath(
                "//body/div/div[@id='navigation']/ul[@id='menu']/li/a[@href='/submitnewlanguage.html']")
        );
        submitLanguage.click();

        WebElement pressSubmit = driver.findElement(By.xpath(
                "//body/div/div[@id='main']/form/p/input[@type='submit']")
        );
        pressSubmit.click();

        WebElement returnError = driver.findElement(By.xpath("//body/div/div[@id='main']/p"));
        String actualResult = returnError.getText();

        Assert.assertEquals(actualResult, expectedResult);

        driver.quit();
    }
    }
