package org.wcci.reviewssite;

public class Review {
	
	private String beerName;
	private String beerStyle;
	private String imageUrl;
	private double userRating;
	private String reviewId;
	private String userDescription;
	
	public Review(String beerName, String beerStyle, String imageUrl, 
			double userRating, String reviewId, String userDescription) {
		
		this.beerName = beerName;
		this.beerStyle = beerStyle;
		this.imageUrl = imageUrl;
		this.userRating = userRating;
		this.reviewId = reviewId;
		this.userDescription = userDescription;
		
	}

	public String getBeerName() {
		return beerName;
	}

	public String getBeerStyle() {
		return beerStyle;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public double getUserRating() {
		return userRating;
	}

	public String getReviewId() {
		return reviewId;
	}

	public String getUserDescription() {
		return userDescription;
	}
	
	

}
