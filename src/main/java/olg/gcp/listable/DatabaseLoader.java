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


        String url1 = "https://lh3.googleusercontent.com/Yzit0ZCppO2TQfXqlenOVw8rRL1GoQadelx5gmuDrViQyrdRkE75XPByU6vqLMcQ6pCzvAzMhGCJHaRdcYenYW8Gf41v_w=s200-c";
        String url2 = "https://lh3.googleusercontent.com/i0X_4Qx4WMq6k5vHwUnXjuiKVSEBDPMpvIS02YcbpLGI3OLWZwG861TDTgnN401c1HwZwgzbmZc3T98-I2mC-S9LB7XwUg=s200-c";
        String url3 = "https://lh3.googleusercontent.com/eBPsqo1Lt7hML9y9hIkeXH50hra41fiOZ7Hf65ZT4ltDvnVdO1UuC_CWfmztsH_vgjQJNI2XOO7FVDv7nhjm2RmFvJCh=s200-c";

        House saved = null;
        saved = this.houseRepo.save(new House("5 Privet Dr."));
//        saved.getPictures().add(this.imageRepo.save(new ImageUrl(url1)));
//        saved.getPictures().add(this.imageRepo.save(new ImageUrl(url2)));
//        saved.getPictures().add(this.imageRepo.save(new ImageUrl(url3)));
//        this.houseRepo.save(saved);

        this.houseRepo.save(new House("720 Paper St."));
        this.houseRepo.save(new House("Apt. 56B, Whitehaven Mansions"));
        this.houseRepo.save(new House("124 Conch Street, Bikini Bottom"));
        this.houseRepo.save(new House("42 Wallaby Way, Sydney"));

    }
}
