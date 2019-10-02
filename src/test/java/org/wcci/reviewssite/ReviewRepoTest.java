package org.wcci.reviewssite;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReviewRepoTest {
	@Test 
	public void shouldInstantiate() {
		ReviewRepo underTest= new ReviewRepo(); 
	}
	@Test
	public void shouldAddReview() { 
		ReviewRepo underTest= new ReviewRepo();
		Review testReview= new Review("Id","String","String",5,"String","String");
		underTest.addReview(testReview);
		assertTrue(underTest.getReviews().containsKey("Id"));
	}

}
