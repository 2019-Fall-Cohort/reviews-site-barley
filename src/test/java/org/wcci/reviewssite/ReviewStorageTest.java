package org.wcci.reviewssite;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class ReviewStorageTest {
	
	@Test 
	public void shouldInstantiate() {
		ReviewStorage underTestReviewStorage= new ReviewStorage(); 
	}
	@Test
	public void shouldAddReview() { 
		ReviewStorage underTestReviewStorage= new ReviewStorage();
		Review testReview = new Review("text", new Beer());
		underTestReviewStorage.add(testReview);	
		assertEquals("text", testReview.getReviewText());
	}
	}

