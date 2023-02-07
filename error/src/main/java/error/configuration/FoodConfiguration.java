package error.configuration;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("error")
public class FoodConfiguration {
	public FoodConfiguration() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}
}
