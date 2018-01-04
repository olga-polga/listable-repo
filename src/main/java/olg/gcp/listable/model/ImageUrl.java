package olg.gcp.listable.model;

import javax.persistence.*;

@Entity
public class ImageUrl {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String url;




    public ImageUrl() {
    }
    public ImageUrl(String url) {
        this.url = url;
    }


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }


}
