import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * 自动化测试
 * https://www.cnblogs.com/wmjone/p/9565596.html
 */
public class WebDriverUseChrome {

    public static void main(String args[]){
        // 设置浏览器驱动，需要使用对应浏览器版本驱动
        System.setProperty("webdriver.chrome.driver", WebDriverUseChrome.class.getClassLoader().getResource("chromedriver.exe").getPath());
        WebDriver driver = new ChromeDriver();
        try {
            Thread.sleep(10000);
            driver.get("https://www.baidu.com");
            driver.getTitle();
            WebElement wd =  driver.findElement(By.id("kw"));
            WebElement login = driver.findElement(By.id("su"));
            wd.sendKeys("webdriver");
            login.click();
            Thread.sleep(10000);
            //得到浏览器的标题
            System.out.println(driver.getTitle());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //关闭浏览器 下面是关闭所有标签页，还有一个代码是 driver.close();, 关闭当前标签页
        driver.quit();
    }

}