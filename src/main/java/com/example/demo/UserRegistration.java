package com.example.demo;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

class Food {
	private String name;
	private boolean isFruit;

	public Food(String name, boolean isFruit) {
		this.name = name;
		this.isFruit = isFruit;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isFruit() {
		return isFruit;
	}

	public void setFruit(boolean isFruit) {
		this.isFruit = isFruit;
	}

}
@Controller
public class UserRegistration {
	// this array is for demo only
	List<Food> foods = Arrays.asList(
			new Food("Orange", true),
			new Food("Potato", false),
			new Food("Cauli", false),
			new Food("Grapes", true)
			);
	
	@GetMapping("/login")
	public String getLoginPage(Model model) {
		model.addAttribute("name", "Nepathya College");
		model.addAttribute("foods", foods);
		return "Login.html";
	}
}
