package com.kodilla.patterns.builder.bigmac;

import org.junit.Assert;
import org.junit.Test;

public class BigmacTestSuite {
    @Test
    public void testBigmacNew() {
        //Given
        Bigmac bigmac = new Bigmac.BigmacBuilder()
                .bun("Sesamme")
                .burgers(2)
                .sauce("hot")
                .ingredient("onion")
                .ingredient("bacon")
                .ingredient("bacon")
                .ingredient("bacon")
                .build();
        System.out.println(bigmac);

        //When
        int howManyIngredients = bigmac.getIngredients().size();
        int howManyBurgers = bigmac.getBurgers();

        //Then
        Assert.assertEquals(4, howManyIngredients);
        Assert.assertEquals(2, howManyBurgers);
    }
}
