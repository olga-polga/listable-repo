package olg.gcp.listable.repository;

import olg.gcp.listable.model.House;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

@RepositoryRestResource(collectionResourceRel = "houses", path = "houses")
public interface HouseRepository  extends CrudRepository<House, Long> {

}
