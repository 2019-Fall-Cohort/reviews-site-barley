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
	
	@PostMapping("/add")
	public String addReview(String reviewText, Long reviewID, Beer beer){
			reviews.add(new Review(reviewText, reviewID, beer));
			return "redirect:/reviews";
	}
}
