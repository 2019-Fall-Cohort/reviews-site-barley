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
	
	@Resource
	BeerCave beers;
	
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
	
	@PostMapping("/add")
	public String addBeer(String beerName, String style, double userRating, String userDescription, Long companyId) {
		BrewingCompany company = companies.findBrewingCompany(companyId);
		beers.add(new Beer(beerName, style, company, userRating, userDescription));
		
		return "redirect:/companies/" + companyId;
	}

	
}
