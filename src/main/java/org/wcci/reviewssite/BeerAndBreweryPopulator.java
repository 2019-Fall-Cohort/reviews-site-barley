package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BeerAndBreweryPopulator implements CommandLineRunner{

	@Autowired
	private BeerRepository beerRepo;
	@Autowired
	private BrewingCompanyRepository brewingRepo;
    @Override
    public void run(String... args) throws Exception {
    	//Line 17 is incomplete as of 10:28 10/09/2019
    	BrewingCompany brewery = new BrewingCompany("Cathy Sierra Nevada")
    }     
}
