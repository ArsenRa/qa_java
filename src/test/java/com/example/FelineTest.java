package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;
import com.example.*;

import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {

    @Mock
    Feline feline;

    @Test
    public void felineGetFoodTest() throws Exception{
        //Act
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));
        //Assert
        assertEquals(List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));

    }

    @Test
    public void felineEatMeatTest() throws Exception {
        Feline feline = new Feline();
        List<String> expected = List.of("Животные", "Птицы", "Рыба");
        assertEquals(expected, feline.eatMeat() );
    }

    @Test
    public void felineGetFamilyCorrectValueTest() {
        Feline feline = new Feline();
        String expectedFamily = "Кошачьи";
        assertEquals(expectedFamily,feline.getFamily());

    }

    @Test
    public void getFelineKittensCountRetrunCorrectValueTest ()  {
        //Act
        Mockito.when(feline.getKittens()).thenReturn(1);
        //Assert
        assertEquals(1,feline.getKittens());
    }

    @Test
    public void getFelineKittensRetrunCorrectValueTest () {
        int kittensCount = 1;
        int expected = kittensCount;
        //Act
        Mockito.when(feline.getKittens()).thenReturn(kittensCount);
        //Assert
        assertEquals(1,feline.getKittens());
    }

    @Test
    public void shouldCheckCountKittensFelineTest() throws Exception {
        Feline feline = new Feline();
        int actual = feline.getKittens();
        System.out.println(actual);
        assertEquals(actual,feline.getKittens());

    }

}
