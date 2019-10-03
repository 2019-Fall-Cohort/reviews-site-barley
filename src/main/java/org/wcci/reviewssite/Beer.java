package org.wcci.reviewssite;

//	This class should be renamed to something like 'beer' or 'single beer'
//  Then consider refactoring the fields in light of said renaming.

public class Beer {
	
	private String beerName;
	private String style;
	private String brewery;
	private String imageUrl;
	private double userRating;
	private String reviewId;
	private String userDescription;
	
	public Beer(String beerName, String style, String imageUrl, String brewery, 
			double userRating, String reviewId, String userDescription) {
		
		this.beerName   = beerName;
		this.style      = style;
		this.imageUrl   = imageUrl;
		this.brewery	= brewery;
		this.userRating = userRating;
		this.reviewId   = reviewId;
		this.userDescription = userDescription;
		
	}

	public String getBeerName() {
		return beerName;
	}

	public String getBeerStyle() {
		return style;
	}

	public String getBrewery() {
		return brewery;
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
	
	@Override 
	public String toString() {
		return beerName;
	}

}
