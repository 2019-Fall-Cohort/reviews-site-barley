package org.wcci.reviewssite;

import java.util.Collection;
import java.util.HashMap;

public class ReviewRepo {

	private HashMap<String, Review> reviews;

	public HashMap<String, Review> getReviews() {
		return reviews;
	}


	public ReviewRepo() {
		reviews = new HashMap<>();
	}


	public void addReview(Review testReview) {
		reviews.put(testReview.getReviewId(), testReview);

	}

	public Collection<Review> retrieveAllReviews() {
		return reviews.values();
	}

}
