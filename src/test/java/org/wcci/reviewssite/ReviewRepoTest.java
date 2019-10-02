package org.wcci.reviewssite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
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
		assertTrue(underTest.getReviews().containsKey(testReview.getReviewId()));
	}
	@Test
	public void shouldFindAllReviews() {
		ReviewRepo underTest= new ReviewRepo();
		Review testReview= new Review("Id1","String","String",5,"1","String");
		Review testReview2 = new Review("Id2","String","String",5,"2","String");
		Review testReview3 = new Review("Id3","String","String",5,"3","String");
		Review testReview4 = new Review("Id4","String","String",5,"4","String");
		
		underTest.addReview(testReview);
		underTest.addReview(testReview2);
		underTest.addReview(testReview3);
		underTest.addReview(testReview4);
		
		assertThat(underTest.retrieveAllReviews(), containsInAnyOrder(testReview, testReview2, testReview3, testReview4));
	}

	@Test
	public void canRetrieveSingleReviewObjectByID() {
		ReviewRepo underTest= new ReviewRepo();
		Review testReview1 = new Review("Cheetah",   "Lager",  "url", 5, "1", "Yum yum");
		Review testReview2 = new Review("Bud Light", "Pee pee","url", 4, "2", "barf");
		underTest.addReview(testReview1);
		underTest.addReview(testReview2);
		Review expectedReview = underTest.retrieveReviewByID(testReview2.getReviewId());
		assertEquals(expectedReview, testReview2);
	}
}
