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
    	BrewingCompany brewery2 = new BrewingCompany("Hoof Hearted");
    	BrewingCompany brewery3 = new BrewingCompany("Seventh Son");
    	BrewingCompany brewery4 = new BrewingCompany("Columbus");
    	BrewingCompany brewery5 = new BrewingCompany("Elevator");
    	BrewingCompany brewery6 = new BrewingCompany("Land-Grant");
    	BrewingCompany brewery7 = new BrewingCompany("Platform");
    	brewingRepo.save(brewery);
    	brewingRepo.save(brewery1);
    	brewingRepo.save(brewery2);
    	brewingRepo.save(brewery3);
    	brewingRepo.save(brewery4);
    	brewingRepo.save(brewery5);
    	brewingRepo.save(brewery6);
    	brewingRepo.save(brewery7);
    	
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
