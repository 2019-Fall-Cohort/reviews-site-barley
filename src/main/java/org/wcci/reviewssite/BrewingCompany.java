package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service

public class BrewingCompany {
	@Autowired
	BeerRepository beerRepo;
	@Autowired
	private BrewingCompanyRepository brewingRepo;

	public Iterable<Beer> findAlltheBeers() {
		return beerRepo.findAll();
	}

}
