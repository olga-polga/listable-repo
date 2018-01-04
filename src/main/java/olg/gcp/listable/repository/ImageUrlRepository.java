package olg.gcp.listable.repository;

import olg.gcp.listable.model.ImageUrl;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(collectionResourceRel = "pictures", path = "pictures")
public interface ImageUrlRepository extends CrudRepository<ImageUrl, Long> {

}
