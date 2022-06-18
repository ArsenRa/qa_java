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

    Feline feline = Mockito.mock(Feline.class);
    //Lion lion = Mockito.mock(Lion.class);

    @Before
    public void init(){
        MockitoAnnotations.initMocks(this);
    }

    @Test(expected = Exception.class)
    public void lionSexHaveExceptionTest() throws Exception {
        Lion lion = new Lion(" ", feline);
        lion.doesHaveMane();
    }

    @Test
    public void isLionHaveManeTrueTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        boolean expectedHasMane = true;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

    @Test
    public void isLionHaveManeFalseTest() throws Exception {
        Lion lion = new Lion("Самка", feline);
        boolean expectedHasMane = false;
        boolean actualHasMane = lion.doesHaveMane();
        assertEquals(expectedHasMane, actualHasMane);
    }

    @Test
    public void getLionDoNotHaveKittensTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int expectedGetKittens = 0;
        int actualGetKittens = lion.getKittens();

        assertEquals(expectedGetKittens, actualGetKittens);
    }

    @Test
    public void getLionEatMeatTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        Mockito.when(feline.getFood("Хищник")).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        List<String> actualEatMeat = lion.getFood();
        assertEquals(expectedEatMeat, actualEatMeat);
    }

    @Test
    public void shouldCheckKittensLionTest() throws Exception {
        Lion lion = new Lion("Самец", feline);
        int actual = lion.getKittens();
        System.out.println(actual);
        assertEquals(actual,lion.getKittens());

    }

}





