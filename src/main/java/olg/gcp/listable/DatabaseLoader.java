package olg.gcp.listable;

import olg.gcp.listable.model.House;
import olg.gcp.listable.repository.HouseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final HouseRepository repository;

    @Autowired
    public DatabaseLoader(HouseRepository repository) {
        this.repository = repository;
    }

    @Override
    public void run(String... strings) throws Exception {
        this.repository.save(new House("5 Privet Dr." ));
        this.repository.save(new House("32 Windsor Gardens" ));
        this.repository.save(new House("186 Fleet Street" ));
        this.repository.save(new House("720 Paper St." ));
        this.repository.save(new House("Apt. 56B, Whitehaven Mansions" ));
        this.repository.save(new House("124 Conch Street, Bikini Bottom" ));
        this.repository.save(new House("Mulholland Drive, Los Angeles, CA" ));
    }
}