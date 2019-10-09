package org.wcci.reviewssite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Beer {

	@Id
	@GeneratedValue
	private String beerName;
	private String style;
	private Long reviewId;
	private double userRating;
	private String imageUrl;
	private String userDescription;
	@OneToMany (mappedBy = "beer") 
	private List <Review> reviews;
	
	@ManyToOne
	private BrewingCompany brewery;

	
	public Beer(String beerName, String style, String imageUrl, BrewingCompany brewery, double userRating, Long reviewId,
			String userDescription) {

		this.beerName = beerName;
		this.style = style;
		this.imageUrl = imageUrl;
		this.brewery = brewery;
		this.userRating = userRating;
		this.reviewId = reviewId;
		this.userDescription = userDescription;

	}

	public String getBeerName() {
		return beerName;
	}

	public String getBeerStyle() {
		return style;
	}

	public BrewingCompany getBrewery() {
		return brewery;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public double getUserRating() {
		return userRating;
	}

	public Long getReviewId() {
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
