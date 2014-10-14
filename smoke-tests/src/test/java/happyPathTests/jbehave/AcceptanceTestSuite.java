package happyPathTests.jbehave;

import happyPathTests.utils.WebDriverConfigurer;
import net.thucydides.jbehave.ThucydidesJUnitStories;

public class AcceptanceTestSuite extends ThucydidesJUnitStories {
	
	public AcceptanceTestSuite() {
		
	WebDriverConfigurer.configureDrivers();
	
	}
}