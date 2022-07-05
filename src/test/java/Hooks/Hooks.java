package Hooks;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Hooks {

    @After
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            File scrFile = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.FILE);
            try {
                String date = new SimpleDateFormat("yyyy_MM_dd_HH_mm_ss").format(new Date());
                FileUtils.copyFile(scrFile, new File("C:/hata/"+date+"_Error.jpg"));
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
