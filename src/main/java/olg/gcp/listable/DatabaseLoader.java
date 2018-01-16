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
        String url1 = "https://www.googleapis.com/download/storage/v1/b/listable-bucket/o/ddd2.jpg-2018-01-15-172432523?generation=1516037072356148&alt=media";
        String url2 = "https://www.googleapis.com/download/storage/v1/b/listable-bucket/o/ddd3.jpg-2018-01-15-171429542?generation=1516036471079669&alt=media";
        String url3 = "https://www.googleapis.com/download/storage/v1/b/listable-bucket/o/ddd1.jpg-2018-01-15-172444641?generation=1516037084415125&alt=media";

        House saved = null;
        saved = this.houseRepo.save(new House("5 Privet Dr."));
        saved.getPictures().add(this.imageRepo.save(new ImageUrl(url1)));
        saved.getPictures().add(this.imageRepo.save(new ImageUrl(url2)));
        saved.getPictures().add(this.imageRepo.save(new ImageUrl(url3)));
        this.houseRepo.save(saved);

        this.houseRepo.save(new House("720 Paper St."));
        this.houseRepo.save(new House("Apt. 56B, Whitehaven Mansions"));
        this.houseRepo.save(new House("124 Conch Street, Bikini Bottom"));
        this.houseRepo.save(new House("Mulholland Drive, Los Angeles, CA"));

    }
}
