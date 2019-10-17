package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReviewStorage {
		@Autowired
		BeerRepository beerRepo;
		@Autowired
		private ReviewRepository reviewRepo;

		public void add(Review review) {
			beerRepo.save(review.getBeer());
			reviewRepo.save(review);
		}
	}



