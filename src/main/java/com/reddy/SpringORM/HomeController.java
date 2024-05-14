package com.reddy.SpringORM;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
	
	@Autowired
	AnimalDAO animalDao;
	
	@RequestMapping("/")
	public String home() {
		return "index";
	}
	
	@GetMapping("getAnimals")
	public String getAnimals(Model m) {
		m.addAttribute("res",animalDao.getAnimals());
		return "result";
	}
	
	@PostMapping("addAnimal")
	public String addAnimal(@ModelAttribute("res") Animal an) {
		animalDao.addAnimal(an);
		return "result";
	}
	
	@GetMapping("getAnimal")
	public String getAnimal(@RequestParam("aid") int id, Model m) {
		m.addAttribute("res", animalDao.getAnimal(id));
		return "result";
	}
	


}
