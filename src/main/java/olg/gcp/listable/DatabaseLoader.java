package olg.gcp.listable;

import olg.gcp.listable.model.House;
import olg.gcp.listable.repository.HouseRepository;
import olg.gcp.listable.model.ImageUrl;
import olg.gcp.listable.repository.ImageUrlRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

    private final HouseRepository houseRepo;
    private final ImageUrlRepository imageRepo;
    @Autowired
    public DatabaseLoader(HouseRepository houseRepo, ImageUrlRepository  imageRepo) {
        
        this.houseRepo = houseRepo;
        this.imageRepo = imageRepo;
    }

    @Override
    public void run(String... strings) throws Exception {
        House saved = null;
        saved = this.houseRepo.save(new House("5 Privet Dr." ));

        saved = this.houseRepo.save(new House("720 Paper St." ));
        saved.getPictures().add(this.imageRepo.save(new ImageUrl("`https://images.unsplash.com/photo-55555")));
        saved.getPictures().add(this.imageRepo.save(new ImageUrl("`https://images.unsplash.com/photo-15151")));
        saved.getPictures().add(this.imageRepo.save(new ImageUrl("`https://images.unsplash.com/photo-50105")));
        this.houseRepo.save(saved);
        saved = this.houseRepo.save(new House("Apt. 56B, Whitehaven Mansions" ));
        saved = this.houseRepo.save(new House("124 Conch Street, Bikini Bottom" ));
        saved = this.houseRepo.save(new House("Mulholland Drive, Los Angeles, CA" ));
        saved.getPictures().add(this.imageRepo.save(new ImageUrl("`https://images.unsplash.com/photo-99999")));
        saved.getPictures().add(this.imageRepo.save(new ImageUrl("`https://images.unsplash.com/photo-90909")));
    }
}