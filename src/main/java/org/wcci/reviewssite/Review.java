package org.wcci.reviewssite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private String reviewText;
	private Long reviewId;
	private Beer beer;
	
	public Review(String reviewText, Long reviewID, Beer beer) {

		this.reviewText = reviewText;
		this.reviewId = reviewID;
		this.beer = beer;

	}
	
	
	public String getReview() {
		return reviewText;
	}
	public Long getReviewId() {
		return reviewId;
	}
	public Beer getBeer() {
		return beer;
	}

}
