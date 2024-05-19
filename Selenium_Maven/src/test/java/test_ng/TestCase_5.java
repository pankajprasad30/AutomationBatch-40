/*package test_ng;

public class TestCase_5 {

	@BeforeMethod
	public void launch_browser()
	{
		System.out.println("Launch");
	}

	@Test
	public void testcase1()
	{
		System.out.println("1");
	}
	@Test
	public void testcase2()
	{
		System.out.println("2");
	}

	@AfterMethod
	public void close_browser()
	{
		System.out.println("Quit");

	}

GroTechMinds 7:54
ChromeDriver driver;
	@BeforeMethod
	public void launch_browser()
	{
		 driver=new ChromeDriver();
		driver.get("https://www.google.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	}
	@Test
	public void testcase1()
	{
	WebElement serach=			driver.findElement(By.name("q"));
	serach.sendKeys("Sachin");

	}
	@Test
	public void testcase2()
	{
	WebElement serach=			driver.findElement(By.name("q"));
	serach.sendKeys("Modi 2024");

	}
	@AfterMethod
	public void close_browser() throws InterruptedException
	{
		Thread.sleep(2000);
		driver.quit();

	}
}*/
