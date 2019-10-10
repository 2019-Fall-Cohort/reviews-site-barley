package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BrewingCompanyStorage {

	@Autowired
	BeerRepository beerRepo;
	@Autowired
	private BrewingCompanyRepository companyRepo;

	public BrewingCompany findBrewingCompany(Long id) {
		return companyRepo.findById(id).get();
	}

	public Iterable<BrewingCompany> findAllTheCompanies() {
		return companyRepo.findAll();
	}

	public void add(BrewingCompany brewingCompany) {
		companyRepo.save(brewingCompany);
	}
}
