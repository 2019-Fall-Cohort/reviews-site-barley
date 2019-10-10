package org.wcci.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/beers")

public class BeerController {
	@Resource
	BeerCave beers;
	
	@GetMapping("")
	public String getBeers(Model model) {
		model.addAttribute("beers", beers.findAllTheBeers());
		return "beers";
	}
	
	@RequestMapping("/{id}")
	public String getBeer(@PathVariable ("id") long id, Model model) {
		model.addAttribute("beer",beers.findBeer(id));
		return "beers";
	}
	
	@PostMapping("/add")
	public String addBeer(String beerName, String style, String imageUrl, BrewingCompany brewery, double userRating, Long reviewId,
			String userDescription) {
			beers.add(new Beer(beerName, style, imageUrl, brewery, userRating, reviewId, userDescription));
			return "redirect:/beers";
	}


}
