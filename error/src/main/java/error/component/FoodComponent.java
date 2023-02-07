package error.component;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@RequestMapping("/share")
public class FoodComponent {
	public FoodComponent() {
		System.out.println("Created foodcomponent");
	}

	@PostMapping
	public String onSend(@RequestParam String foodname, @RequestParam String type, @RequestParam int quantity,
			@RequestParam double price) {
		System.out.println("Running the onSend");
		System.out.println("foodname: " + foodname);
		System.out.println("type:  " + type);
		System.out.println("Quantity: " + quantity);
		System.out.println("Price: " + price);
		return "Food.jsp";
	}
}
