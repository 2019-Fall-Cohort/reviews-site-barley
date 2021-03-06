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
	private Long id;
	private String beerName;
	private String style;
	private double userRating;
	private String userDescription;
	
	@OneToMany (mappedBy = "beer") 
	private List <Review> reviews;
	
	@ManyToOne 
	private BrewingCompany brewery;

	
	public List<Review> getReviews() {
		return reviews;
	}
	public Beer(String beerName, String style, BrewingCompany brewery, double userRating, 
			String userDescription) {

		this.beerName = beerName;
		this.style = style;
		this.brewery = brewery;
		this.userRating = userRating;
		this.userDescription = userDescription;

	}
	public Beer() {}
	
	public String getBeerName() {
		return beerName;
	}

	public String getStyle() {
		return style;
	}

	public BrewingCompany getBrewery() {
		return brewery;
	}

	public double getUserRating() {
		return userRating;
	}

	public Long getId() {
		return id;
	}

	public String getUserDescription() {
		return userDescription;
	}

	@Override
	public String toString() {
		return beerName;
	}

}
