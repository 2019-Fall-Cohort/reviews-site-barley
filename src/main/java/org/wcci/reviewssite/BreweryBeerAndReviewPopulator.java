package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BreweryBeerAndReviewPopulator implements CommandLineRunner{

	@Autowired
	private ReviewRepository reviewRepo;
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
    							4, 3L, "good");
    	Beer beer2 = new Beer ("Five","Pale Ale", "https://tinyurl.com/y6ndeolw", brewery1, 
    							4, 4L, "good");
    	beerRepo.save(beer1);
    	beerRepo.save(beer2);
    	
    	Review review1 = new Review("Eminently drinkable.", 1L,	beer1);
    	Review review2 = new Review("Positively potable, I presume.", 2L,	beer2);
    	reviewRepo.save(review1);
    	reviewRepo.save(review2);
    }     
}
