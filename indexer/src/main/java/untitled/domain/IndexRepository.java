package untitled.domain;

import untitled.domain.*;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel="indices", path="indices")
public interface IndexRepository extends PagingAndSortingRepository<Index, Long>{

}
