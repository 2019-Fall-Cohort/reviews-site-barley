package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewStorage {
		@Autowired
		BeerRepository beerRepo;
		@Autowired
		private ReviewRepository reviewRepo;

		public Review findReview(Long id) {
			return reviewRepo.findById(id).get();
		}

		public Iterable<Review> findAllTheReviews() {
			return reviewRepo.findAll();
		}

		public void add(Review review) {
			beerRepo.save(review.getBeer());
			reviewRepo.save(review);
		}
	}



