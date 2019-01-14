package model;

import java.util.ArrayList;
import java.util.List;

public class ProduktRepository {

    public List<Produkt> getAllItems() {

        List <Produkt> produkts = new ArrayList<Produkt>();

        produkts.add(new Produkt(0,"Staubsauger",355));
        produkts.add(new Produkt(1,"Fernseher",650));
        produkts.add(new Produkt(2,"Handy",850));
        produkts.add(new Produkt(3,"Kühlschrank",1439));

        return produkts;
    }
}
