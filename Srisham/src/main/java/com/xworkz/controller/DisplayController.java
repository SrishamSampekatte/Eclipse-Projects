package com.xworkz.controller;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.xworkz.dto.BeverageDTO;
import com.xworkz.dto.ChatDTO;
import com.xworkz.dto.EducationDTO;
import com.xworkz.dto.FamilyDTO;
import com.xworkz.dto.MobileDTO;

@Component
@RequestMapping("/")
public class DisplayController {
	@GetMapping("/email")
	public String onEmail(Model model) {
		System.out.println("Running Email");
		model.addAttribute("myemail", "srishamsm6@gmail.com");
		return "index.jsp";
	}

	@GetMapping("/mobile")
	public String onMobile(Model model) {
		System.out.println("Running Mobile");
		model.addAttribute("myMobile", "8277738399");
		return "index.jsp";
	}

	@GetMapping("/adhar")
	public String onAdhar(Model model) {
		System.out.println("Running Adhar");
		model.addAttribute("myAdhar", "8981 5357 0854");
		return "index.jsp";
	}

	@GetMapping("/age")
	public String onAge(Model model) {
		System.out.println("Running Age");
		model.addAttribute("myAge", "24");
		return "index.jsp";
	}

	@GetMapping("/dob")
	public String onDateOfBirth(Model model) {
		System.out.println("Running Date of Birth");
		model.addAttribute("myBirth", LocalDate.of(1947, 8, 6));
		return "index.jsp";
	}

	@GetMapping("/salery")
	public String onSalery(Model model) {
		System.out.println("Running Dezired Salery");
		model.addAttribute("mySalary", "100000001");
		return "index.jsp";
	}

	@GetMapping("/bestFriends")
	public String onFriends(Model model) {
		System.out.println("Running Friends ");
		List<String> ref = new ArrayList<String>();
		ref.add("One");
		ref.add("Two");
		model.addAttribute("priends", ref);
		return "index.jsp";
	}

	@GetMapping("/visitedPlaces")
	public String onPlaces(Model model) {
		System.out.println("Running Places ");
		List<String> ref = new ArrayList<String>();
		ref.add("Bheemana Samudra");
		ref.add("Kodachadri");
		ref.add("Sampekatte");
		model.addAttribute("places", ref);
		return "index.jsp";
	}

	@GetMapping("/skillSet")
	public String onSkillSet(Model model) {
		System.out.println("Running Skill Set ");
		List<String> ref = new ArrayList<String>();
		ref.add("Java");
		ref.add("My Sql");
		ref.add("HTML");
		model.addAttribute("skills", ref);
		return "index.jsp";
	}

	@GetMapping("/edu")
	public String onModel(Model model) {
		System.out.println("Running Education ");
		EducationDTO dto = new EducationDTO();
		dto.setAnganvadi(false);
		dto.setPrimary("g h ps  Mathikai");
		dto.setSecondary("SMPS");
		dto.setDegree("P E S ");
		dto.setUniversity("VTU");
		dto.setAnganvadiPercentage(0);
		dto.setPrimaryPercentage(87.6);
		dto.setSecondaryPercentage(79.8);
		dto.setDegreePercentage(6.7);
		model.addAttribute("education", dto);
		return "index.jsp";
	}

	@GetMapping("/family")
	public String onFamily(Model model) {
		System.out.println("Running Family");
		FamilyDTO dto = new FamilyDTO();
		dto.setFamilyName("Sri Sunka ");
		dto.setLocation("Sampekatte");
		dto.setGrandFather("Laxminarayanappa");
		dto.setGrandMother("Saraswatamma");
		dto.setFatheName("Prakash");
		dto.setMotherName("Sangeetha");
		dto.setFamMembers(28);
		dto.setNoOfSiblings(2);
		dto.setFatherProfession("Farmer");
		dto.setJointFamily(true);
		model.addAttribute("family", dto);
		return "index.jsp";

	}

	@GetMapping("/mobilePhone")
	public String onMobilePhone(Model model) {
		System.out.println("Running Mobile");
		MobileDTO dto = new MobileDTO();
		dto.setBrand("Apple");
		dto.setModel("Iphone 14");
		dto.setColor("White");
		dto.setOperatingSystem("Ios");
		dto.setPrice(150000);
		model.addAttribute("mobile", dto);
		return "index.jsp";
	}

	@GetMapping("/masala")
	public String onChat(Model model) {
		System.out.println("Running Chat");
		ChatDTO dto5 = new ChatDTO();
		dto5.setChatName("pani puri");
		dto5.setChatPrice(5000);
		dto5.setNoOfPlates(500);
		dto5.setOwnerName("somone");
		dto5.setId(451);
		dto5.setChatShopName("venky shop");
		dto5.setChatShopPH(7892225217d);
		dto5.setNoOfEmployee(500);
		dto5.setChatGSTNo("saCzxvcz5xv43zxv");
		dto5.setChatShopLocation("bangalore");
		model.addAttribute("spicy", dto5);
		return "index.jsp";
	}

	@GetMapping("/beverage")
	public String onBeverage(Model model) {
		System.out.println("running Beverage");
		BeverageDTO dto2 = new BeverageDTO();
		dto2.setBeverageName("applejuice");
		dto2.setBeveragePrice(500);
		dto2.setNoOfbeverage(50);
		dto2.setOwnerName("Srisham");
		dto2.setBeverageId(123);
		dto2.setBeverageShopName("dove shop");
		dto2.setBeverageShopPH(789222527);
		dto2.setBeverageShopLocation("bangalore");
		model.addAttribute("juice", dto2);
		return "index.jsp";

	}
}
