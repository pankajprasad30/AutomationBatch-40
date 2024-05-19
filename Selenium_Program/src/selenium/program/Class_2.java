/*package selenium.program;

public class Class_2 {

	public static void main(String[] args) {
		/ChromeDriver driver=new 	ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		WebElement search=	driver.findElement(By.name("q"));
		search.sendKeys("bangalore");
		Thread.sleep(4000);
		List<WebElement> a1=		driver.findElements(By.xpath("//div[@class='OBMEnb']/ul/li"));
		
		int count=	a1.size();
		System.out.println(count);
		
		a1.get(count-4).click();
		
			TakesScreenshot t1=					driver;
		File source=			t1.getScreenshotAs(OutputType.FILE);
		File destination=new File("E:\\MKTProject\\Selenium_program\\src\\Batch40\\sunmoon.png");
		FileHandler.copy(source, destination);

	}

}*/
