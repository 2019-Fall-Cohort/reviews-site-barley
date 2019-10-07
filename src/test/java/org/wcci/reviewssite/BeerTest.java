package org.wcci.reviewssite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import org.junit.Test;

public class BeerTest {
	
@Test
public void canGetBeerName(){
	Beer underTest = new Beer("beer", 
							  "lager",
							  "https://tinyurl.com/y6ndeolw", 
							  "dog's ridge", 
							  4, 
							  12345L, 
							  "good");
	String expectedName = underTest.getBeerName();
	String expectedStyle = underTest.getBeerStyle();
	String expectedUrl = underTest.getImageUrl();
	double expectedRating = underTest.getUserRating();
	long expectedId = underTest.getReviewId();
	String expectedDescription = underTest.getUserDescription();
	assertEquals (expectedName, "beer");
	assertEquals (expectedStyle, "lager");
	assertEquals (expectedUrl, "https://tinyurl.com/y6ndeolw");
	assertEquals (expectedRating, 4, .001); //last parameter is delta
	assertEquals (expectedId, 12345L);
	assertEquals (expectedDescription, "good");
	
	
	
}
}
