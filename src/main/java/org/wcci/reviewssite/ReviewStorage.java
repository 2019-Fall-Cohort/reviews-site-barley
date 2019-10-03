package org.wcci.reviewssite;

// This is a repository site--implying the use of databases.

import java.util.Collection;
import java.util.HashMap;

public class ReviewStorage {

	
	private HashMap<String, Beer> reviews;

	
	public HashMap<String, Beer> getReviews() {
		return reviews;
	}

	public ReviewStorage() {
		reviews = new HashMap<>();
	}

	public void addReview(Beer testReview) {
		reviews.put(testReview.getReviewId(), testReview);
	}

	public Collection<Beer> retrieveAllReviews() {
		return reviews.values();
	}

	public Beer retrieveReviewByID(String reviewId) { 
		return reviews.get(reviewId);
	}

}
