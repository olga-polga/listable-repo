package olg.gcp.listable.repository;

import olg.gcp.listable.model.House;
import org.springframework.data.repository.CrudRepository;

public interface HouseRepository  extends CrudRepository<House, Long> {

}
