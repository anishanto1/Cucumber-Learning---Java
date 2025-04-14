package hooks;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Thanos_Hook {

	@Before(order=1)
	public void beforesnaping() {
		System.out.println("Thanos collecting every infinity stones" );
	}
	
	@After(order=1)
	public void aftersnaping() {
		System.out.println("Thanos taking rest in garden" );	
	}
	
	@Before(order=0)
	public void before() {
		System.out.println("Thanos was borned" );
	}		
		@After(order=0)
		public void after() {
			System.out.println("Thor Entry" );
	
}
}