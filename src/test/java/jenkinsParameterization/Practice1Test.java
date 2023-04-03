package jenkinsParameterization;

import org.testng.annotations.Test;

public class Practice1Test {

	@Test
	public void demoTest() {
		System.out.println(System.getProperty("browser"));
	}
}
