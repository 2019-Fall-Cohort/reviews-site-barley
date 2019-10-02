package org.wcci.reviewssite;

import java.util.HashMap;

public class ReviewRepo {

	private HashMap<String, Review> reviews;

	public ReviewRepo() {
		reviews = new HashMap<>();
	}

	public void addReview(Review testReview) {
		reviews.put(testReview.getReviewId(), testReview);

	}

	public HashMap<String, Review> getReviews() {
		return reviews;
	}

}
