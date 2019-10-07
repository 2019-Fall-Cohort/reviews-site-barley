package org.wcci.reviewssite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReviewStorageTest {
	@Test 
	public void shouldInstantiate() {
		ReviewStorage underTest= new ReviewStorage(); 
	}
	@Test
	public void shouldAddReview() { 
		ReviewStorage underTest= new ReviewStorage();
		Beer testReview= new Beer("Id","String","String", "brewery", 5, 12345L,"String");
		underTest.addReview(testReview);
		assertTrue(underTest.getReviews().containsKey(testReview.getReviewId()));
	}
	@Test
	public void shouldFindAllReviews() {
		ReviewStorage underTest= new ReviewStorage();
		Beer testReview= new Beer("Id1","String","String","brewery",5, 1L,"String");
		Beer testReview2 = new Beer("Id2","String","String","brewery",5, 2L,"String");
		Beer testReview3 = new Beer("Id3","String","String","brewery",5, 3L,"String");
		Beer testReview4 = new Beer("Id4","String","String","brewery",5, 4L,"String");
		
		underTest.addReview(testReview);
		underTest.addReview(testReview2);
		underTest.addReview(testReview3);
		underTest.addReview(testReview4);
		
		assertThat(underTest.retrieveAllReviews(), containsInAnyOrder(testReview, testReview2, testReview3, testReview4));
	}

	@Test
	public void canRetrieveSingleReviewObjectByID() {
		ReviewStorage underTest= new ReviewStorage();
		Beer testReview1 = new Beer("Cheetah",   "Lager",  "url", "Rhinegeist", 5, 1L, "Yum yum");
		Beer testReview2 = new Beer("Bud Light", "Pee pee","url", "Anheiser Busch", 4, 2L, "barf");
		underTest.addReview(testReview1);
		underTest.addReview(testReview2);
		Beer expectedReview = underTest.retrieveReviewByID(testReview2.getReviewId());
		assertEquals(expectedReview, testReview2);
	}
}
