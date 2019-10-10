package org.wcci.reviewssite;


import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/companies")
public class BrewingCompanyController {

	@Resource
	BrewingCompanyStorage companies;
	
	@GetMapping("")
	public String getCompanies(Model model) {
		model.addAttribute("companies", companies.findAllTheCompanies());
		return "companies";
	}
	
	@RequestMapping("/{id}")
	public String getCompany(@PathVariable ("id") long id, Model model) {
		model.addAttribute("company", companies.findBrewingCompany(id));
		return "company";
	}
	
}
