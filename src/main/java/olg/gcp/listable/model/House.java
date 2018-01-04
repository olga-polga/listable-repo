package olg.gcp.listable.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
public class House {

    @Id
    @GeneratedValue
    private long id;
    private String address;

    public House() {
    }

    public House(String address) {
        this.address = address;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    /**
     * Spring Data REST API follows HATEOAS and won't expose
     * the object's id in JSON representation. @TODO ?
     */
    @JsonProperty ("id")
    private Long houseId;


    public Long getHouseId() {
        return id;
    }
    @OneToMany()
    private List<ImageUrl> pictures = new ArrayList<>();

    public List<ImageUrl> getPictures() {
        return pictures;
    }
}

