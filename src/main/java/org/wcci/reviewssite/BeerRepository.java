package org.wcci.reviewssite;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository

public interface BeerRepository extends CrudRepository <Beer, Long>{
	

}
