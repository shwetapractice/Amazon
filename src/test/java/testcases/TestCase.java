package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

public class TestCase extends LaunchTest{
	
	
	@Test
	public void testcase1() throws InterruptedException
	{
		tstpg.test_1();
		driver.navigate().back();
	}
	
	@Test
	public void testcase2()
	{
		tstpg.test_2();
	}
	
	@Test
	public void testcase3() throws IOException
	{
		tstpg.test_3();
		driver.navigate().back();
	}
	
	@Test
	public void testcase4() throws IOException
	{
		tstpg.test_4();
		driver.navigate().back();
	}

}
