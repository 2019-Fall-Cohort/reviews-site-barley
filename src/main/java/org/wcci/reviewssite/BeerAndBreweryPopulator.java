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
    	
    	BrewingCompany brewery = new BrewingCompany("Wolf's Ridge");
    	BrewingCompany brewery1 = new BrewingCompany("North High Brewing");
    	brewingRepo.save(brewery);
    	brewingRepo.save(brewery1);
    	
    	Beer beer1 = new Beer ("Buchenrauch","Smoked Exotic", "https://tinyurl.com/y6ndeolw", brewery, 
    							4, 12345L, "good");
    	Beer beer2 = new Beer ("Five","Pale Ale", "https://tinyurl.com/y6ndeolw", brewery1, 
    							4, 12345L, "good");
    	
    	beerRepo.save(beer1);
    	beerRepo.save(beer2);
    }     
}
