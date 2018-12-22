import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class tfn_autofill {
    public static void main(String[] args) {
        //System.out.println("Hello");
        String TfnURL = "TFN_FORM_URL_will_be_here";

        System.setProperty("webdriver.gecko.driver", //webdriver.gecko.driver, instead chrome driver
                "path_to_file\\geckodriver.exe");   // Set Fire fox Driver class path
        WebDriver driver = new FirefoxDriver(); //Create a instance of FireFox Driver

        driver.manage().deleteAllCookies();

        driver.get(TfnURL); //Navigate to an url

        try {
            Thread.sleep(2000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        driver.findElement(By.id("EmployeeFirstName")).sendKeys("Md."); //element chosen by id
        driver.findElement(By.id("EmployeeMiddleName")).sendKeys("Alvee");
        driver.findElement(By.id("EmployeeLastName")).sendKeys("Noor");
        driver.findElement(By.id("EmployeeStartDate")).sendKeys("09/05/2018");


        Select dropdown1 = new Select(driver.findElement(By.id("EmployeeDateOfBirthDay"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown1.selectByVisibleText("13");

        Select dropdown2 = new Select(driver.findElement(By.id("EmployeeDateOfBirthMonth"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown2.selectByVisibleText("October");

        Select dropdown3 = new Select(driver.findElement(By.id("EmployeeDateOfBirthYear"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown3.selectByVisibleText("1990");

        driver.findElement(By.id("EmployeePositionTitle")).sendKeys("APM");
        //driver.findElement(By.className("personal-details-block")).click();
        //driver.findElement(By.id("EmployeeGenderMale")).click();
        WebElement oCheckBox = driver.findElement(By.cssSelector("input[value='Male']"));
        oCheckBox.click();

        /* WebElement dateWidget = driver.findElement(By.id("EmployeeStartDate"));
        List<WebElement> columns = dateWidget.findElements(By.tagName("td"));
        for (WebElement cell: columns) {
            //Select 13th Date
            if (cell.getText().equals("13")) {
                cell.findElement(By.linkText("13")).click();
                break;
            }
        }
        */

        driver.findElement(By.id("EmployeeAddressLine1")).sendKeys("Mohakhali DOHS");
        driver.findElement(By.id("EmployeeAddressLine2")).sendKeys("South Paikpara");
        driver.findElement(By.id("EmployeeSuburb")).sendKeys("Mohakhali");
        driver.findElement(By.id("EmployeeState")).sendKeys("Dhaka");
        driver.findElement(By.id("EmployeePostcode")).sendKeys("1216");
        driver.findElement(By.id("EmployeeHomePhone")).sendKeys("123123123");
        driver.findElement(By.id("EmployeeMobile")).sendKeys("123123123");
        driver.findElement(By.id("EmployeeEmailAddress")).sendKeys("alvee.bit@gmail.com");

        //driver.findElement(By.id("EmployeeWorkingWithChildrenYes")).click();

        WebElement oRadio = driver.findElement(By.cssSelector("input[value='No']"));
        oRadio.click();

        driver.findElement(By.id("EmployeeReferenceNumber")).sendKeys("123a123a");
        driver.findElement(By.id("EmployeeEmployeeTaxFileNo")).sendKeys("123123123");   // Employeee Details Section
        driver.findElement(By.id("EmployeeEmployeeTaxFileNo")).sendKeys("123123123");

        driver.findElement(By.id("EmployeeAreYouAustralianCitizenYes")).click(); //select radio of citizenship
        driver.findElement(By.id("EmployeeAreYouPermanentResidentYes")).click();

        driver.findElement(By.id("EmployeeExpiryDate")).sendKeys("09/05/2018");

        driver.findElement(By.id("EmployeeHaveWorkingVisaYes")).click();

        driver.findElement(By.id("EmployeeBankFinancialInstitute")).sendKeys("q");   // Bank Details Section
        driver.findElement(By.id("EmployeeBSB")).sendKeys("q");
        driver.findElement(By.id("EmployeeAccountNumber")).sendKeys("q");
        driver.findElement(By.id("EmployeeAccountName")).sendKeys("q");

        driver.findElement(By.id("EmployeeFoundName")).sendKeys("q");   // SuperAnnuation Section
        driver.findElement(By.id("EmployeeMemberNo")).sendKeys("q");
        driver.findElement(By.id("EmployeeFoundAddress")).sendKeys("q");
        driver.findElement(By.id("EmployeeSpinUsiNumber")).sendKeys("q");
        driver.findElement(By.id("EmployeeFundPhoneNo")).sendKeys("q");

        driver.findElement(By.id("EmployeeNextOfKin")).sendKeys("q");   // SuperAnnuation Section
        driver.findElement(By.id("EmployeeRelationship")).sendKeys("q");
        driver.findElement(By.id("EmployeeECDAddressLine1")).sendKeys("q");
        driver.findElement(By.id("EmployeeECDAddressLine2")).sendKeys("q");
        driver.findElement(By.id("EmployeeECDSuburb")).sendKeys("q");
        driver.findElement(By.id("EmployeeECDState")).sendKeys("q");
        driver.findElement(By.id("EmployeeECDPostcode")).sendKeys("q");
        driver.findElement(By.id("EmployeeECD1Mobile")).sendKeys("123123123");
        driver.findElement(By.id("Employee2ndEmergencyContactName")).sendKeys("123123123");
        driver.findElement(By.id("EmployeeECDMobile")).sendKeys("123123123");
        driver.findElement(By.id("EmployeeRelationshipDate")).sendKeys("09/05/2018");
        driver.findElement(By.id("EmployeeECDMobile")).sendKeys("123123123");

        Select dropdown_1 = new Select(driver.findElement(By.id("EmployeeDateOfBirthDay"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown_1.selectByVisibleText("20");

        driver.switchTo().frame(1);

/*        int size1 = driver.findElements(By.tagName("iframe")).size();

        for(int i=0; i<=size1; i++){
            driver.switchTo().frame(i);
            int total=driver.findElements(By.xpath(".//input[@id='EmployeeFile']")).size();
            System.out.println(total);
            driver.switchTo().defaultContent();

            //WebDriverWait wait = new WebDriverWait(driver,20);
            //wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(By.tagName("iframe")));
        }
*/

        WebElement fUpload = driver.findElement(By.xpath(".//input[@id='EmployeeFile']"));

        fUpload.sendKeys("C:\\Alvee\\BP.jpg");

        driver.switchTo().defaultContent();

        System.out.println("Hello");

        //fUpload.click();

        driver.findElement(By.id("btn-submit-employee-form")).click();

        try {
            Thread.sleep(5000);                 //1000 milliseconds is one second.
        } catch(InterruptedException ex) {
            Thread.currentThread().interrupt();
        }

        driver.findElement(By.id("EmployeeA1TFNCheckIHaveMadeASeparateApplicationEnquiryToTheTaxOfficeForANewOrExistingTFN")).click();
        driver.findElement(By.id("EmployeeA2DoYouAuthoriseNo")).click();
        driver.findElement(By.id("EmployeeA3TitleMr")).click();
        driver.findElement(By.id("EmployeeA3SurnameOrFamilyName")).sendKeys("Md. Alvee");
        driver.findElement(By.id("EmployeeA3FirstGivenName")).sendKeys("Noor");
        driver.findElement(By.id("EmployeeA3OtherGivenName")).sendKeys("Al");
        driver.findElement(By.id("EmployeeA4FamilyName")).sendKeys("Al");

        Select dropdown4 = new Select(driver.findElement(By.id("EmployeeA5DateOfBirthDay"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown4.selectByVisibleText("13");
        Select dropdown5 = new Select(driver.findElement(By.id("EmployeeA5DateOfBirthMonth"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown5.selectByVisibleText("October");
        Select dropdown6 = new Select(driver.findElement(By.id("EmployeeA5DateOfBirthYear"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown6.selectByVisibleText("1983");

        driver.findElement(By.id("EmployeeA6AddressLine1")).sendKeys("9 Yarra");
        driver.findElement(By.id("EmployeeA6AddressLine2")).sendKeys("10 Yarra");
        driver.findElement(By.id("EmployeeA6SuburbTownLocality")).sendKeys("South Yarra");
        driver.findElement(By.id("EmployeeA6StateTerritory")).sendKeys("Victoria");
        driver.findElement(By.id("EmployeeA6Postcode")).sendKeys("3141");

        driver.findElement(By.id("EmployeeA7OnWhatBasisAreYouPaidFullTimeEmployment")).click();
        driver.findElement(By.id("EmployeeA8Question1No")).click();
        driver.findElement(By.id("EmployeeA9Question2No")).click();
        driver.findElement(By.id("EmployeeA10Question3No")).click();
        driver.findElement(By.id("EmployeeA11Question4No")).click();
        driver.findElement(By.id("EmployeeA12Question5aNo")).click();
        driver.findElement(By.id("EmployeeA12Question5bNo")).click();
        driver.findElement(By.id("EmployeeA13Question6No")).click();

        driver.findElement(By.id("EmployeeA14Declaration")).click();

        Select dropdown7 = new Select(driver.findElement(By.id("EmployeeA14DateDay"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown7.selectByVisibleText("13");
        Select dropdown8 = new Select(driver.findElement(By.id("EmployeeA14DateMonth"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown8.selectByVisibleText("October");
        Select dropdown9 = new Select(driver.findElement(By.id("EmployeeA14DateYear"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown9.selectByVisibleText("2017");

        driver.switchTo().frame(2);

        WebElement fUpload2 = driver.findElement(By.xpath(".//input[@id='EmployeeFile']"));

        fUpload2.sendKeys("C:\\Alvee\\BP.jpg");

        driver.switchTo().defaultContent();

        driver.findElement(By.id("EmployeeB1BranchNumber")).sendKeys("1");

        Select dropdown10 = new Select(driver.findElement(By.id("EmployeeB1DateABNDay"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown10.selectByVisibleText("13");
        Select dropdown11 = new Select(driver.findElement(By.id("EmployeeB1DateABNMonth"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown11.selectByVisibleText("October");
        Select dropdown12 = new Select(driver.findElement(By.id("EmployeeB1DateABNYear"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown12.selectByVisibleText("2017");

        driver.findElement(By.id("EmployeeB4IfYouHave")).click();

        driver.findElement(By.id("EmployeeB5ContactPerson")).sendKeys("Alvee");
        driver.findElement(By.id("EmployeeB5ContactNumber")).sendKeys("123123123");

        driver.switchTo().frame(3);

        WebElement fUpload3 = driver.findElement(By.xpath(".//input[@id='EmployeeFile']"));

        fUpload3.sendKeys("C:\\Alvee\\BP.jpg");

        driver.switchTo().defaultContent();

        Select dropdown13 = new Select(driver.findElement(By.id("EmployeeB5DateDay"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown13.selectByVisibleText("13");
        Select dropdown14 = new Select(driver.findElement(By.id("EmployeeB5DateMonth"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown14.selectByVisibleText("October");
        Select dropdown15 = new Select(driver.findElement(By.id("EmployeeB5DateYear"))); //important => import org.openqa.selenium.support.ui.Select;
        dropdown15.selectByVisibleText("2017");

        driver.findElement(By.xpath(".//button[@type='submit']")).click();

        driver.manage().deleteAllCookies();
        //driver.close();

    }
}
