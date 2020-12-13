package database;

import javax.persistence.*;

@Entity
public class Informations {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ADD_CODE")
    private long code;
    @Column(name = "ADD_BRANDS")
    private String brands;
    @Column(name = "ADD_PRODUCT_NAME")
    private String product_name;
    @Column(name = "ADD_CATEGORIES")
    private String categories;
    @Column(name = "ADD_COUNTRIES")
    private String countries;
    @Column(name = "ADD_STORE")
    private String stores;
    @Column(name = "ADD_PURCHASE_PLACES")
    private String purchase_places;

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public String getBrands() {
        return brands;
    }

    public void setBrands(String brands) {
        this.brands = brands;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getCategories() {
        return categories;
    }

    public void setCategories(String categories) {
        this.categories = categories;
    }

    public String getCountries() {
        return countries;
    }

    public void setCountries(String countries) {
        this.countries = countries;
    }

    public String getStores() {
        return stores;
    }

    public void setStores(String stores) {
        this.stores = stores;
    }

    public String getPurchase_places(String purchase_places) {
        return this.purchase_places;
    }



}
