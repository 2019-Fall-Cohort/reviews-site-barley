package org.wcci.reviewssite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@Id
	@GeneratedValue
	private Long reviewId;
	private String reviewText;
	@ManyToOne
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
