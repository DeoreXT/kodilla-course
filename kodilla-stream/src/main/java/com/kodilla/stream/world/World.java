package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public final class World {
    private final List<Continent> continents;

    public World() {
        continents = new ArrayList();
    }

    public void addContinent(Continent continent) {
        this.continents.add(continent);
    }


    public BigDecimal getPeopleQuantity() {

        //return continents.stream()
        //        .flatMap(countries -> countries.getCountries().stream())
        //        .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));


        return continents.stream()
                .flatMap(getCountries -> getCoutries().stream())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum = sum.add(current));
    }
}
