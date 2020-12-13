package mapper;

import database.Informations;
import dto.InformationsDto;

public class InformationsMapper {

    public static Informations mapInformationsDtoToInformations(InformationsDto dto){
        Informations inf = new Informations();
        inf.setCode(dto.getCode());
        inf.setBrands(dto.getBrands());
        inf.setProduct_name(dto.getProduct_name());
        inf.setCategories(dto.getCategories());
        inf.setCountries(dto.getCountries());
        inf.setStores(dto.getStores());
        inf.getPurchase_places(dto.getPurchase_places());

        return inf;
    }
}
