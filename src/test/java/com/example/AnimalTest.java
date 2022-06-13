package com.example;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class AnimalTest {
    @Mock
    Animal animal;
    Predator predator = Mockito.mock(Predator.class);



    @Test
    public void animalGetFamilyShouldReturnTest () {
        Mockito.when(animal.getFamily()).thenReturn("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи");
        Assert.assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи" , animal.getFamily());

    }

}

