package mapper;

import database.Informations;
import dto.InformationsDto;

public class InformationsMapper {

    public static Informations mapInformationsDtoToInformations(Informations dto){
        Informations inf = new Informations();
        inf.getCode();
        inf.getBrands();
        inf.getProduct_name();
        inf.getCategories();
        inf.getCountries();
        inf.getStores();
        inf.getPurchase_places();

        return inf;
    }
}
