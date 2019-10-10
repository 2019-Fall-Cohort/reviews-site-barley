package org.wcci.reviewssite;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Entity
public class BrewingCompany {
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private String backgroundURL;
	
	@OneToMany(mappedBy = "brewery")
	private List<Beer> beers;
	
	public BrewingCompany() {}
	
	public BrewingCompany(String name) {
		this.name = name;
	
	}
	public String getName() {
		return name;
	}

	public List<Beer> getBeers() {
		return beers;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString(){
		return name;
	}
	public String getBackgroundURL() {
		return backgroundURL;
	}
	
}
