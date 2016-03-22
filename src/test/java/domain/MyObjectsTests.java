package domain;

import infra.JacksonFive;
import org.junit.Test;

import java.util.UUID;

import static org.junit.Assert.assertNotNull;

/**
 * @author Claudio E. de Oliveira on 21/03/16.
 */
public class MyObjectsTests {
    
    @Test
    public void writeCarAsString(){
        Car car = new Car(UUID.randomUUID().toString(),new Door("65 cm"));
        String carInJson = JacksonFive.toJson(car);
        assertNotNull(carInJson);
    }

    @Test
    public void writeMotorcycleAsString(){
        Motorcycle motorcycle = new Motorcycle(UUID.randomUUID().toString(),new Tire("100 Kg"));
        String motorcycleInJson = JacksonFive.toJson(motorcycle);
        assertNotNull(motorcycle);
    }

    @Test
    public void writeMotorcycleAsObject(){
        Motorcycle motorcycle = new Motorcycle(UUID.randomUUID().toString(),new Tire("100 Kg"));
        String motorcycleInJson = JacksonFive.toJson(motorcycle);
        assertNotNull(motorcycle);
        Motorcycle motorcycleRead = JacksonFive.toObject(motorcycleInJson, Motorcycle.class);
        assertNotNull(motorcycleRead);
    }
    
}
