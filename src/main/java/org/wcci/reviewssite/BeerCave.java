package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


	@Service
public class BeerCave {
		@Autowired
		BeerRepository beerRepo;
		@Autowired
		private BrewingCompanyRepository breweryRepo;

	
	public Beer findBeer(Long id) {
		return beerRepo.findById(id).get();
	}
	
	public Iterable<Beer> findAllTheBooks() {
		return beerRepo.findAll();
	}
	
	public void add(Beer beer) {
		breweryRepo.save(beer.getBrewery());
		beerRepo.save(beer);
	}
}
