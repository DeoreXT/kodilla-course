package com.kodilla.stream.world;

import org.junit.Assert;
import org.junit.Test;

import java.math.BigDecimal;

public class WorldTestSuite {
    @Test
    public void testGetPeopleQuantity() {
        //Given
        Country india = new Country(BigDecimal.valueOf(1339000000));
        Country china = new Country(BigDecimal.valueOf(1386000000));
        Country thailand = new Country(BigDecimal.valueOf(64040000));
        Country poland = new Country(BigDecimal.valueOf(37970000));
        Country germany = new Country(BigDecimal.valueOf(82790000));
        Country france = new Country(BigDecimal.valueOf(67120000));
        Country vatican = new Country(BigDecimal.valueOf(1000));
        Country usa = new Country(BigDecimal.valueOf(325700000));
        Country canada = new Country(BigDecimal.valueOf(36710000));

        Continent asia = new Continent();
        Continent europe = new Continent();
        Continent america = new Continent();

        asia.addCountry(india);
        asia.addCountry(china);
        asia.addCountry(thailand);
        europe.addCountry(poland);
        europe.addCountry(germany);
        europe.addCountry(france);
        europe.addCountry(vatican);
        america.addCountry(usa);
        america.addCountry(canada);

        World world = new World();

        world.addContinent(asia);
        world.addContinent(europe;
        world.addContinent(america);

        //When
        BigDecimal result = world.getPeopleQuantity();
        boolean result = true;
        //Then
        Assert.assertArrayEquals(true, result);
    }
}
