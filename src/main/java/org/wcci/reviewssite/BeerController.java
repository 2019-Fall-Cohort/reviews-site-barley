package org.wcci.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/beers")

public class BeerController {
	@Resource
	ReviewStorage beers;
	
//	@GetMapping("/")
//	public String getBeers(Model model) {
//		model.addAttribute("beers", beers.findAlltheBeers());
//		return "beers";
//	}
	

	


}
