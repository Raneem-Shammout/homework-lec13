import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class solution {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.edge.driver", "G:\\edge driver\\msedgedriver.exe");

		WebDriver driver = new EdgeDriver();

		driver.get("http://127.0.0.1:5500/index.html");

		driver.manage().window().maximize();

		List<WebElement> theStudents = driver.findElements(By.tagName("option"));
		
		int numberOfStudentsBefore = theStudents.size();
		System.out.println("number before the remove process = " +numberOfStudentsBefore);

//		..... remove odd numbers ....

		for (int i = 0; i < theStudents.size(); i++) {

			if (i % 2 != 0) {

				theStudents.get(i).click();

				System.err.println("sorry i will remove " + theStudents.get(i).getText());
				driver.findElement(By.id("remove")).click();

			} else {

				System.out.println(" i will keep " + theStudents.get(i).getText());
			}

		}

		List<WebElement> numberOfStudentsAfter = driver.findElements(By.tagName("option"));
		System.out.println("number after the remove process = "+numberOfStudentsAfter.size());
	}

	{


	}

}
