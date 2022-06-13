package com.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.*;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class LionTest  {


    Predator predator = Mockito.mock(Predator.class);
    Feline feline = Mockito.mock(Feline.class);
    Lion lion = Mockito.mock(Lion.class);
    Animal animal = Mockito.mock(Animal.class);

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = Exception.class)
    public void lionSexHaveExceptionTest() throws Exception {
        Lion lion = new Lion(" ");
        lion.doesHaveMane();
    }

    @Test(expected = AssertionError.class)
    public void exceptionMessageErrorTest() throws AssertionError {
        try {
            Lion lion = new Lion(" ");
            Assert.fail("Expected AssertionError");
        }
        catch (Exception thrown) {
            Assert.assertNotEquals("Используйте допустимые значения пола животного - самец или самка", thrown.getMessage());
        }
    }

    @Test
    public void isLionHaveManeTruTest() throws Exception {
        Lion lion = new Lion("Самец");
        boolean expectedHasMane = true;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

    @Test
    public void isLionHaveManeFalseTest() throws Exception {
        Lion lion = new Lion("Самка");
        boolean expectedHasMane = false;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

    @Test
    public void getLionDoNotHaveKittensTest() throws Exception {

        int expectedGetKittens = 0;
        int actualGetKittens = lion.getKittens();

        assertEquals(expectedGetKittens, actualGetKittens);
    }

    @Test
    public void getLionEatMeatTest() throws Exception {
        Lion lion = new Lion("Самец");
        //Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

}





