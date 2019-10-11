package org.wcci.reviewssite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BreweryBeerAndReviewPopulator implements CommandLineRunner{

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
    							4, 1L, "good");
    	Beer beer2 = new Beer ("Five","Pale Ale", "https://tinyurl.com/y6ndeolw", brewery1, 
    							4, 2L, "good");
    	Beer beer3 = new Beer ("CultRider","Black Double IPA", "https://tinyurl.com/y6ndeolw", brewery2, 
								4, 5L, "good");
    	Beer beer4 = new Beer ("Scientist","IPA", "https://tinyurl.com/y6ndeolw", brewery3, 
								4, 6L, "good");
    	Beer beer5 = new Beer ("Columbus IPA","IPA", "https://tinyurl.com/y6ndeolw", brewery4, 
								4, 7L, "good");
    	Beer beer6 = new Beer ("Uptown","Pilsner", "https://tinyurl.com/y6ndeolw", brewery5, 
								4, 8L, "good");
    	Beer beer7 = new Beer ("Urban Sombrero","Mexican Lager", "https://tinyurl.com/y6ndeolw", brewery6, 
								4, 9L, "good");
    	Beer beer8 = new Beer ("Speed Merchant","White IPA", "https://tinyurl.com/y6ndeolw", brewery7, 
								4, 10L, "good");
    	beerRepo.save(beer1);
    	beerRepo.save(beer2);
    	beerRepo.save(beer3);
    	beerRepo.save(beer4);
    	beerRepo.save(beer5);
    	beerRepo.save(beer6);
    	beerRepo.save(beer7);
    	beerRepo.save(beer8);
    	
    }     
}
