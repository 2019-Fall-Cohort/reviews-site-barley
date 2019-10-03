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
		Beer testReview= new Beer("Id","String","String",5,"String","String");
		underTest.addReview(testReview);
		assertTrue(underTest.getReviews().containsKey(testReview.getReviewId()));
	}
	@Test
	public void shouldFindAllReviews() {
		ReviewStorage underTest= new ReviewStorage();
		Beer testReview= new Beer("Id1","String","String",5,"1","String");
		Beer testReview2 = new Beer("Id2","String","String",5,"2","String");
		Beer testReview3 = new Beer("Id3","String","String",5,"3","String");
		Beer testReview4 = new Beer("Id4","String","String",5,"4","String");
		
		underTest.addReview(testReview);
		underTest.addReview(testReview2);
		underTest.addReview(testReview3);
		underTest.addReview(testReview4);
		
		assertThat(underTest.retrieveAllReviews(), containsInAnyOrder(testReview, testReview2, testReview3, testReview4));
	}

	@Test
	public void canRetrieveSingleReviewObjectByID() {
		ReviewStorage underTest= new ReviewStorage();
		Beer testReview1 = new Beer("Cheetah",   "Lager",  "url", 5, "1", "Yum yum");
		Beer testReview2 = new Beer("Bud Light", "Pee pee","url", 4, "2", "barf");
		underTest.addReview(testReview1);
		underTest.addReview(testReview2);
		Beer expectedReview = underTest.retrieveReviewByID(testReview2.getReviewId());
		assertEquals(expectedReview, testReview2);
	}
}
