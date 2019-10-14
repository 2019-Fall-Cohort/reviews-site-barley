package org.wcci.reviewssite;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/reviews")
public class ReviewController {

	@Resource
	ReviewStorage reviews;
	@Resource 
	BeerCave  beers; 
	@GetMapping("")
	public String getReviews(Model model) {
	model.addAttribute("reviews", reviews.findAllTheReviews());
		return "reviews";
	}
	
	@RequestMapping("/{id}")
	public String getReview(@PathVariable ("id") long id, Model model) {
		model.addAttribute("review", reviews.findReview(id));
		return "reviews";
	}
	
	@PostMapping("/addReview")
	public String addReview(String reviewText, Long beerId){
			Beer beer= beers.findBeer(beerId);
			reviews.add(new Review(reviewText, beer));
			return "redirect:/reviews";
	}
}
