package com.example;

import com.example.Animal;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;

@RunWith(Parameterized.class)
public class AnimalGetFamilyTest {

    Animal animal = Mockito.mock(Animal.class);

    private final String animalType;

    private final List<String> expected;

    public AnimalGetFamilyTest(String animalType, List<String> expected){
        this.animalType = animalType;
        this.expected = expected;
    }

    @Parameterized.Parameters
    public static Object[] getResult() {
        return new Object[][] {
                {"Травоядное", List.of("Трава","Различные растения")},
                {"Хищник", List.of("Животные", "Птицы", "Рыба")},
                {"Тест", List.of("")}
        };
    }

    @Test(expected = Exception.class)
    public void animalGetFamilyExeptionTest() throws Exception {
        Animal animal = new Animal();
        List<String> actual = animal.getFood(animalType);
        verify(actual);
        assertEquals(expected,actual);
    }

   @Test
   public void animalGetFamilyShouldReturnTest() {

       Animal animal = new Animal();
       String actual = animal.getFamily();
       assertEquals("Существует несколько семейств: заячьи, беличьи, мышиные, кошачьи, псовые, медвежьи, куньи", actual);
   }

}
