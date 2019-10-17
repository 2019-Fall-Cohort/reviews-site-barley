package org.wcci.reviewssite;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

import java.util.List;

import org.junit.Test;

public class BeerTest {

	@Test
	public void canGetBeerName() {
		BrewingCompany brewery = null;
		Beer underTest = new Beer("beer", "lager", brewery, 4, "good");
		String expectedName = underTest.getBeerName();
		String expectedStyle = underTest.getStyle();
		double expectedRating = underTest.getUserRating();
		List<Review> expectedId = underTest.getReviews();
		BrewingCompany expectedBrewery = underTest.getBrewery();
		String expectedDescription = underTest.getUserDescription();
		assertEquals(expectedName, "beer");
		assertEquals(expectedStyle, "lager");
		assertEquals(expectedBrewery, brewery);
		assertEquals(expectedRating, 4, .001); 
		assertEquals(expectedDescription, "good");

	}
}
